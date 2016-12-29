package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class DefectiveProductDetection {

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> productInfo = new HashSet<Product>();

    /**
     */
    @Enumerated
    private DefectionStatus defectionStatus;

    /**
     */
    private Boolean wasSentStatus;

    /**
     */
    @NotNull
    @Column(unique = true)
    private String billID;

    /**
     */
    @ManyToOne
    private Employee employee;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date checkingDate;
}
