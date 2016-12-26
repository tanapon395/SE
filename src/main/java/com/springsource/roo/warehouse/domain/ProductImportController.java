package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/productimports")
@Controller
@RooWebScaffold(path = "productimports", formBackingObject = ProductImport.class)
public class ProductImportController {
}
