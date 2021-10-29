package cn.com.ponycloud.ponybills.modules.system.controller;

import cn.com.ponycloud.ponybills.modules.common.handler.exception.BizException;
import cn.com.ponycloud.ponybills.modules.system.domain.SysUser;
import cn.com.ponycloud.ponybills.modules.system.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: pony
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;


    @PostMapping("/add")
    public void addUser(@RequestBody SysUser sysUser) {
        if (sysUserService.checkUsernameUnique(sysUser.getUsername())) {
            throw new BizException("用户名重复！");
        }

        sysUserService.insert(sysUser);
    }
}