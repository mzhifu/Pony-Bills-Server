package cn.com.ponycloud.ponybills.modules.system.service.impl;

import cn.com.ponycloud.ponybills.modules.system.domain.LoginUser;
import cn.com.ponycloud.ponybills.modules.system.domain.SysUser;
import cn.com.ponycloud.ponybills.modules.system.mapper.SysUserMapper;
import cn.com.ponycloud.ponybills.modules.system.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: pony
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectSysUserByUsername(String username) {
        return sysUserMapper.selectSysUserByUsername(username);
    }

    @Override
    public boolean checkUsernameUnique(String username) {
        return sysUserMapper.checkUsernameUnique(username) > 0;
    }

    @Override
    public void insert(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public String doLogin(LoginUser loginUser) {
        SysUser sysUser = this.selectSysUserByUsername(loginUser.getUsername());

        return null;
    }
}