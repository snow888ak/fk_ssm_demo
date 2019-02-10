package com.kezhong1986.fk_ssm.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/10 19:51
 */
@Controller
class IndexController {

    @RequestMapping("/index")
    fun index(): String {
        return "index"
    }

}