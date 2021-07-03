package com.astonm.springbootdemo.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Astonm
 * @Date 2021/7/3
 * @Description:
 **/

@Api(tags = "Hello后台")
@RestController
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello接口", httpMethod = "GET")
    public void hello(){
        System.out.println("hello!");
    }

    @GetMapping("/getId")
    @ApiOperation(value = "获取id接口", httpMethod = "GET")
    public void getId(@RequestParam("id") int id){
        System.out.println("你的id是：" + id);
    }

}
