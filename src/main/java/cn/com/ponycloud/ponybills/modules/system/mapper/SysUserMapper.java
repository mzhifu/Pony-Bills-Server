package cn.com.ponycloud.ponybills.modules.system.mapper;

import cn.com.ponycloud.ponybills.modules.system.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author: pony
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select uid, username, nick_name, phone from sys_user where username = #{username}")
    SysUser selectSysUserByUsername(String username);

    /**
     * 校验用户名是否唯一
     * @param username 用户名
     * @return 结果
     */
    @Select("select count(1) from sys_user where username = #{username} limit 1")
    long checkUsernameUnique(String username);
}