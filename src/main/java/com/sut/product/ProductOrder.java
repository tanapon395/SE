package com.sut.product;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ProductOrder {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String ordernumber;

    /**
     */
    private Integer numbers;
}
