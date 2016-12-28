package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class BillImport {

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ProductImport> list = new HashSet<ProductImport>();
}
