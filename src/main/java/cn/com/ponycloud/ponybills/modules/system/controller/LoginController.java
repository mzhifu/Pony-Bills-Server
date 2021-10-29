package cn.com.ponycloud.ponybills.modules.system.controller;

import cn.com.ponycloud.ponybills.modules.system.domain.LoginUser;
import cn.com.ponycloud.ponybills.modules.system.domain.SysUser;
import cn.com.ponycloud.ponybills.modules.system.service.SysUserService;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: pony
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Resource
    private SysUserService sysUserService;

    @PostMapping("/doLogin")
    public String doLogin(@RequestBody LoginUser loginUser) {
        return sysUserService.doLogin(loginUser);
    }


    @GetMapping("/isLogin/{username}")
    public String isLogin(@PathVariable("username") String username) {
        Integer a = null;
        String s = a.toString();
        System.out.println(s);
        return username;
    }

    @GetMapping("/error")
    public void testError() {
        throw new RuntimeException("测试报错！");
    }
}