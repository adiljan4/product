package com.uyxyz.product.dataobj;




import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class ProductCategory {

    //类目编码
    @Id
    @GeneratedValue
    private Integer categoryId ;
    //类目名称
    private String categoryName ;
    //类目类型
    private Integer categoryType ;
    //创建时间
    private Date createTime ;
    //更新时间
    private Date updateTime ;

}
