package com.springsource.roo.warehouse.web;
import com.springsource.roo.warehouse.domain.LotTransfer;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lottransfers")
@Controller
@RooWebScaffold(path = "lottransfers", formBackingObject = LotTransfer.class)
public class LotTransferController {
}
