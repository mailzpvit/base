package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LZP on 2018/6/17.
 */
@Controller
public class base {
    @RequestMapping(value = {"/"})
    public String getIndex(){
        return "index";
    }
}
