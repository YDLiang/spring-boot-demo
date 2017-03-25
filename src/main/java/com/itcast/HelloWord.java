package com.itcast;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YDLiang on 2017/3/25.
 */
@RestController
public class HelloWord {

    @RequestMapping(value = "hellow", method = RequestMethod.GET)
    public String hellow (){

        return "hello spring boot!";
    }
}
