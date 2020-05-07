package roncoo.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roncoo.education.bean.SysUser;
import roncoo.education.dao.SysUserMapper;

import java.math.BigInteger;
import java.util.List;

@Service
public class SysUserService {
    @Autowired(required = false)
    SysUserMapper sysUserMapper;
    public List<SysUser> getAllSysUser(){
        return sysUserMapper.getAllSysUser();
    }
    public List<SysUser> getAllSysUserByMobile(BigInteger mobile){
        return sysUserMapper.getAllSysUserByMobile(mobile);
    }
    public Integer deleteSysUserById(Long id){
        return sysUserMapper.deleteSysUserById(id);
    }
}
