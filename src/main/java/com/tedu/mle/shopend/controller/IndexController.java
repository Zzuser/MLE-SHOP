package com.tedu.mle.shopend.controller;


import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.shopend.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author zz
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    ShopService shopService;

    @RequestMapping("indexUI")
    public String indexUI(String user, HttpSession session) {
    	System.out.println(user);
        Shop shop = shopService.selectByPhone(user);
        session.setAttribute("currentUser", shop);
        return "starter";
    }

    @RequestMapping("index")
    @ResponseBody
    public JsonResult index(HttpSession session) {
        Shop shop = (Shop) session.getAttribute("currentUser");
        return new JsonResult(shop);
    }

    @RequestMapping("doLoginUI")
    public String doLoginUI() {
        return "login";
    }

    @RequestMapping("doLogin")
    @ResponseBody
    public JsonResult doLogin(String phone, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(phone, password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return new JsonResult("登录成功");
    }
    

    @RequestMapping("reg")
    public String register(){
    	return "register";
    }
}
