package com.xss.springboot.firstsb.controller;

import com.xss.springboot.firstsb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName MainController
 * @Description
 * @Author xushaoshuai
 * @Parameters
 * @Date 2020/6/22 7:08 下午
 * @Return
 */
@Controller
@RequestMapping("/user")
public class MainController {

    @RequestMapping("/list")
    public String list(Model model){
        User user = new User("2","许绍帅");
        model.addAttribute("user",user);
        return "list";
    }
}
