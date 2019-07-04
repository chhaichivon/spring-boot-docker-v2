package com.chhaichivon.springbootdocker;

/*
 * @author : chhai chivon on 7/4/2019.
 * Software Engineer
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        return "Hello world";
    }
}
