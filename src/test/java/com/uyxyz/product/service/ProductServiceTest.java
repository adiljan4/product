package com.uyxyz.product.service;

import com.uyxyz.product.dataobj.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService ;

    @Test
    public void finAllUP() {

        List<ProductInfo> list = productService.finAllUP();
        Assert.assertTrue(list.size() > 0);
    }
}