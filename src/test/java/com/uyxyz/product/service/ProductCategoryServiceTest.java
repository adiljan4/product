package com.uyxyz.product.service;

import com.uyxyz.product.dataobj.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {

    @Autowired
    private ProductCategoryService productCategoryService ;

    @Test
    public void findByCategoryTypeIn() {

      List<ProductCategory> list = productCategoryService.findByCategoryTypeIn(Arrays.asList(11,12));
        Assert.assertTrue(list.size() > 0);
    }
}