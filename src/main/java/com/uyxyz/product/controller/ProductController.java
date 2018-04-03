package com.uyxyz.product.controller;

import com.uyxyz.product.dataobj.ProductCategory;
import com.uyxyz.product.dataobj.ProductInfo;
import com.uyxyz.product.service.ProductCategoryService;
import com.uyxyz.product.service.ProductService;
import com.uyxyz.product.utils.ResultVOUtils;
import com.uyxyz.product.vo.ProductInfoVO;
import com.uyxyz.product.vo.ProductVO;
import com.uyxyz.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService ;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){

        //1 获取所有商品的名称
        List<ProductInfo> productInfoList =  productService.finAllUP();
        //2.获取类目编码
        List<Integer> categoryTypeList = productInfoList.stream().
                map(ProductInfo::getCategoryType).collect(Collectors.toList());

        //3.获取类目对应的信息
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList) ;

        //4.构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        //遍历类目
        for (ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO() ;
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            //遍历 Foods
            for (ProductInfo productInfo: productInfoList){
                //类目一样的赋值
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtils.success(productVOList);
    }

}
