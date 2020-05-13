package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.SysRole;
import roncoo.education.service.SysRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色信息(SysRole)表控制层
 *
 * @author makejava
 * @since 2020-05-08 22:02:24
 */
@RestController
@Api(tags = "角色管理接口")
@RequestMapping("/sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询角色",notes = "根据id查询角色")
    @GetMapping("selectOne")
    @ResponseBody
    public SysRole selectOne(Integer id) {
        return this.sysRoleService.queryById(id);
    }

    @ApiOperation(value = "根据条件查询",notes = "根据详细信息查询角色信息")
    @PostMapping("selectAll")
    @ResponseBody
    public String getAllRole(@ModelAttribute SysRole sysRole){
        return this.sysRoleService.queryAll(sysRole).toString();
    }
    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String getAllByLimit(@RequestParam int offset,@RequestParam int limit){
        return this.sysRoleService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加角色",notes = "添加角色信息")
    @PostMapping("addRole")
    @ResponseBody
    public String addRole(@ModelAttribute SysRole sysRole){
        String eex="";
        try{
            int a=sysRoleService.insert(sysRole);
            if(a>0){
                eex="添加成功！";
            }else {
                eex="添加失败";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return eex;
    }
    @ApiOperation(value = "修改角色",notes = "修改角色信息")
    @PostMapping("updateRole")
    @ResponseBody
    public String updateRole(@ModelAttribute SysRole sysRole){
        SysRole sysRole1=sysRoleService.update(sysRole);
        if ((sysRole1!=null)){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }
    @ApiOperation(value = "删除角色",notes = "根据id删除角色信息")
    @PostMapping("deleteRoleById")
    @ResponseBody
    public String deleteRoleById(@RequestParam int id){
        Boolean a=sysRoleService.deleteById(id);
            if(a){
                return "删除成功！";
            }else {
                return "未找到此id";
            }
    }

}