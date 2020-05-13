package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.Platform;
import roncoo.education.service.PlatformService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 平台信息(Platform)表控制层
 *
 *
 * @author makejava
 * @since 2020-05-11 19:36:48
 */
@Api(tags = "平台管理接口")
@RestController
@RequestMapping("/platform")
public class PlatformController {
    /**
     * 服务对象
     */
    @Resource
    private PlatformService platformService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询平台",notes = "根据id查询平台信息")
    @ApiImplicitParam(value = "平台id",dataType = "int",required = true,name = "id")
    @PostMapping("selectOne")
    public Platform selectOne(Long id) {
        return this.platformService.queryById(id);
    }

  @ApiOperation(value = "查询平台",notes = "根据客户端名称查询平台信息")
    @ApiImplicitParam(value = "平台名称",dataType = "String",required = true,name = "clientName")
    @PostMapping("selectByName")
    public Platform selectByName(String clientName) {
        return this.platformService.queryByName(clientName);
    }


    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String getAllByLimit(@RequestParam int offset,@RequestParam int limit) {
        return platformService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加角色",notes = "添加角色信息")
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addRole(@ModelAttribute Platform platform){
        String eex="";
        try{
            Platform lecturerAudit1=platformService.insert(platform);
            if(lecturerAudit1!=null){
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
    public String updateRole(@ModelAttribute Platform platform){
        Platform sysRole1=platformService.update(platform);
        if ((sysRole1!=null)){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }
    @ApiOperation(value = "删除角色",notes = "根据id删除角色信息")
    @PostMapping("deleteRoleById")
    public String deleteRoleById(@RequestParam int id){
        Boolean a=platformService.deleteById(Long.valueOf(id));
        if(a){
            return "删除成功！";
        }else {
            return "未找到此id";
        }
    }
}