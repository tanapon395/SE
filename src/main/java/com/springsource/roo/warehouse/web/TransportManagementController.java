package com.springsource.roo.warehouse.web;
import com.springsource.roo.warehouse.domain.TransportManagement;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/transportmanagements")
@Controller
@RooWebScaffold(path = "transportmanagements", formBackingObject = TransportManagement.class)
public class TransportManagementController {
}
