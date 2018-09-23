package com.tedu.mle.shopend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zz
 */
@Controller
@RequestMapping("workbench")
public class WorkbenchController {

    @RequestMapping("doGetWorkbenchUI")
    public String doGetWorkbenchUI() {
        return "shopend/workbench/workbench";
    }
}
