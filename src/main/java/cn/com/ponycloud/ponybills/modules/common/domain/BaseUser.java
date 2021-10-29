package cn.com.ponycloud.ponybills.modules.common.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author: pony
 * @date: 2021-09-21 23:14:00
 */
public class BaseUser extends BaseDomain {

    /*用户唯一标识*/
    private String uid;

    /*用户名*/
    @NotBlank(message = "用户名不能为空")
    private String username;

    /*昵称*/
    @NotBlank(message = "昵称不能为空")
    private String nickName;

    /*手机号码*/
    private String phone;

    /*邮箱*/
    @Email(message = "邮箱不能为空")
    private String email;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("uid", uid)
                .append("username", username)
                .append("nickName", nickName)
                .append("phone", phone)
                .append("email", email)
                .toString();
    }
}