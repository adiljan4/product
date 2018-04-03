package com.uyxyz.product.service.iml;

import com.uyxyz.product.dataobj.ProductCategory;
import com.uyxyz.product.repository.ProductCategoryRepository;
import com.uyxyz.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository ;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {

        return productCategoryRepository.findByCategoryTypeIn(categoryTypes);

    }
}
