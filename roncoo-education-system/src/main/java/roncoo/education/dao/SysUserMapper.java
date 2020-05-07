package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import roncoo.education.bean.SysUser;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface SysUserMapper {
    List<SysUser> getAllSysUser();
    List<SysUser> getAllSysUserByMobile(@Param(value = "mobile")BigInteger mobile);
    Integer deleteSysUserById(@Param(value = "id") Long id);
}
