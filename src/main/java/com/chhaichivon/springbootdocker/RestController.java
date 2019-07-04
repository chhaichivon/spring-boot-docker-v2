package com.chhaichivon.springbootdocker;

/*
 * @author : chhai chivon on 7/4/2019.
 * Software Engineer
 */


import java.util.*;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/api")
public class RestController {

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public ResponseEntity<Map<String,Object>> list(){
        Map<String,Object> map = new HashMap<>();

        List list = new ArrayList<>();
        IntStream.rangeClosed(1, 28).forEach(value -> {
            list.add("Item  "+value);
        });
        map.put("data",list);
        map.put("status",Boolean.TRUE);
        map.put("code",200);
        return  new ResponseEntity<>(map , HttpStatus.OK);
    }
}
