package com.springsource.roo.warehouse.web;
import com.springsource.roo.warehouse.domain.WarehouseDest;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/warehousedests")
@Controller
@RooWebScaffold(path = "warehousedests", formBackingObject = WarehouseDest.class)
public class WarehouseDestController {
}
