package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import roncoo.education.bean.SysUser;
import roncoo.education.service.SysUserService;

import java.math.BigInteger;
import java.util.List;

/**
 * SysUserController:用户管理控制层
 * @author 肖宇飞
 * create 2020.5.7
 */
@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @ApiOperation(value = "查询用户",notes = "查询所有用户")
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    @ResponseBody
    public String getAllSysUser(){
        List<SysUser> list=sysUserService.getAllSysUser();
        return list.toString();
    }

    @ApiOperation(value = "根据条件查询用户",notes = "根据手机号码查询所有用户")
    @RequestMapping(value = "getAllByMobile",method = RequestMethod.POST)
    @ApiImplicitParam(name = "mobile",value = "电话号码",dataType = "BigInteger",required = true)
    @ResponseBody
    public String getAllSysUserByMobile(@RequestParam(name = "mobile")BigInteger mobile){
        List<SysUser> list=sysUserService.getAllSysUserByMobile(mobile);
        return list.toString();
    }
    @ApiOperation(value = "删除用户",notes = "根据id删除用户")
    @RequestMapping(value = "deleteSysUserById",method = RequestMethod.POST)
    @ApiImplicitParam(name = "id",value = "用户id",dataType = "Long",required = true)
    public String deleteSysUserById(@RequestParam(name = "id") Long id){
        Integer influence=sysUserService.deleteSysUserById(id);
        if(influence>0){
            return "删除成功";
        }else {
            return "您无此权限,无法删除";
        }
    }
}
