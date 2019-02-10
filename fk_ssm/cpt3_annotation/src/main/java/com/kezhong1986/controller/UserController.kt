package com.kezhong1986.controller

import com.kezhong1986.pojo.User
import org.apache.commons.logging.LogFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UserController {

    private val log = LogFactory.getLog(this@UserController::class.java)

    @ModelAttribute
    fun userModel(loginName: String, password: String, model: Model) {
        log.info("userModel")
        val user = User(loginName, password)
        model.addAttribute("user", user)
    }

    @RequestMapping("/login1")
    fun login(model: Model): String {
        log.info("login")
        val user = model.asMap()["user"] as User
        println(user)
        user.userName = "测试"
        println("${user.userName}")
        return "index"
    }

}