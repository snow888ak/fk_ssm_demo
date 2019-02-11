package com.kezhong1986.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/12 0:09
 */
@Controller
class IndexController {

    @RequestMapping("index")
    fun index(): String = "index"

}