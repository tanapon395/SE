package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/billimports")
@Controller
@RooWebScaffold(path = "billimports", formBackingObject = BillImport.class)
public class BillImportController {
}
