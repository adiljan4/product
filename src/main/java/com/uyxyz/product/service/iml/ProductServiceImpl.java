package com.uyxyz.product.service.iml;

import com.uyxyz.product.dataobj.ProductInfo;
import com.uyxyz.product.enums.ProductStatusEnum;
import com.uyxyz.product.repository.ProductInfoRepository;
import com.uyxyz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> finAllUP() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
