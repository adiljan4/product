package com.uyxyz.product.vo;

import lombok.Data;

@Data
public class ResultVO <T> {

    //返回码
    private Integer code ;
    //返回内容
    private String msg ;
    //返回数据
    private T data ;

}
