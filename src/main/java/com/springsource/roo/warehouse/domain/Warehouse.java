package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Warehouse {

    /**
     */
    @NotNull
    private String addresswh;

    /**
     */
    @Enumerated
    private Status status;
}