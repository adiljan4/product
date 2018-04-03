package com.uyxyz.product.utils;

import com.uyxyz.product.vo.ResultVO;

public class ResultVOUtils {

    public final static ResultVO success(Object object){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMsg("成功!");

        return resultVO ;
    }

}
