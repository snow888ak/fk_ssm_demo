package com.kezhong1986.pojo

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/12 0:20
 */
data class User(val loginName: String, val password: String, var userName: String?) {
    override fun equals(other: Any?): Boolean {
        if (other !is User) {
            return false
        }
        return this.loginName == other.loginName
    }
}