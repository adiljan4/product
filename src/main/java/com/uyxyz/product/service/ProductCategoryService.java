package com.uyxyz.product.service;

import com.uyxyz.product.dataobj.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);

}
