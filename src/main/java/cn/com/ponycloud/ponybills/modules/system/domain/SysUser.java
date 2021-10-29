package cn.com.ponycloud.ponybills.modules.system.domain;

import cn.com.ponycloud.ponybills.modules.common.domain.BaseUser;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author: pony
 */
@TableName("sys_user")
public class SysUser extends BaseUser {

    /**
     * 用户密码
     */
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}