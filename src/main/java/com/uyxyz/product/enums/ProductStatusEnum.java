package com.uyxyz.product.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架") ;

    private Integer code ;
    private String name ;

    ProductStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
