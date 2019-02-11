package com.kezhong1986.controller

import com.kezhong1986.pojo.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/12 0:16
 */
@Controller
@RequestMapping("/user")
class UserController {

    val userList = mutableListOf<User>()

    @RequestMapping("/register", method = [RequestMethod.GET])
    fun registerForm(): String = "registerForm"

    @RequestMapping("/register", method = [RequestMethod.POST])
    fun register(@RequestParam("loginname") loginName: String,
                 @RequestParam("password") password: String,
                 @RequestParam("username") userName: String): String {

        val user = User(loginName, password, userName)
        if (userList.contains(user)) {
            throw Exception("用户已存在！")
        } else {
            userList.add(user)
            return "loginForm"
        }
    }

    @RequestMapping("/login", method = [RequestMethod.GET])
    fun loginForm(): String = "loginForm"

    @RequestMapping("/login", method = [RequestMethod.POST])
    fun login(@RequestParam("loginname") loginName: String,
              @RequestParam("password") password: String,
              model: Model): String {

        val user = userList.find { it.loginName == loginName } ?: throw Exception("用户不存在！")
        return if (user.password == password) {
            model.addAttribute("user", user)
            "welcome"
        } else {
            "loginForm"
        }
    }

}