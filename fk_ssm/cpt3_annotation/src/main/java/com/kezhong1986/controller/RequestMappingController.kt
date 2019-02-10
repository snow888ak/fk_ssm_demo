package com.kezhong1986.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


/**
 * 测试RequestMapping注解的相关属性
 */
@RequestMapping("/reqM")
@Controller
class RequestMappingController {


    /**
     * 测试params属性，get请求，需要在url中带上参数
     */
    @RequestMapping(value = ["/params"], params = ["version=1"])
    fun params() : String = "index"

}