package cn.com.ponycloud.ponybills.modules.system.service;

import cn.com.ponycloud.ponybills.modules.system.domain.LoginUser;
import cn.com.ponycloud.ponybills.modules.system.domain.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author: pony
 */
public interface SysUserService extends IService<SysUser>{

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 结果
     */
    SysUser selectSysUserByUsername(String username);

    /**
     * 校验用户名是否唯一
     * @param username 用户名
     * @return 结果
     */
    boolean checkUsernameUnique(String username);

    /**
     * 新增用户
     * @param sysUser 用户信息
     */
    void insert(SysUser sysUser);

    /**
     * 登录操作
     * @param loginUser 用户信息
     * @return 结果
     */
    String doLogin(LoginUser loginUser);
}