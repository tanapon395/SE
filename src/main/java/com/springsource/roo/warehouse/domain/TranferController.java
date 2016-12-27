package com.springsource.roo.warehouse.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tranfers")
@Controller
@RooWebScaffold(path = "tranfers", formBackingObject = Tranfer.class)
public class TranferController {
}
