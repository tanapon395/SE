package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Tranfer {

    /**
     */
    private String ordertransfer;

    /**
     */
    @ManyToOne
    private Product product;

    /**
     */
    private Integer amount;

    /**
     */
    @ManyToOne
    private Warehouse warehouse;

    /**
     */
    @ManyToOne
    private WarehouseDest warehousedest;

    /**
     */
    @ManyToOne
    private Employee employee;
}
