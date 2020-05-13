package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.WebsiteLink;
import roncoo.education.service.WebsiteLinkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站点友情链接(WebsiteLink)表控制层
 *
 * @author makejava
 * @since 2020-05-11 21:09:24
 */
@RestController
@Api(tags = "站点管理接口")
@RequestMapping("websiteLink")
public class WebsiteLinkController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteLinkService websiteLinkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询站点",notes = "根据id查询站点相关链接名称")
    @GetMapping("selectOne")
    public WebsiteLink selectOne(Long id) {
        return this.websiteLinkService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String getAllByLimit(@RequestParam int offset,@RequestParam int limit) {
        return websiteLinkService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加链接",notes = "添加相关合作链接")
    @PostMapping("addRole")
    @ResponseBody
    public String addRole(@ModelAttribute WebsiteLink websiteLink1){
        String a="";
        try {
            WebsiteLink websiteLink=websiteLinkService.insert(websiteLink1);
            if(websiteLink!=null){
                a= "添加成功！";
            }else {
                a= "添加失败";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return a;
    }
    @ApiOperation(value = "修改角色",notes = "修改角色信息")
    @PostMapping("updateRole")
    @ResponseBody
    public String updateRole(@ModelAttribute WebsiteLink sysRole){
        WebsiteLink sysRole1=websiteLinkService.update(sysRole);
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
        Boolean a=websiteLinkService.deleteById(Long.valueOf(id));
        if(a){
            return "删除成功！";
        }else {
            return "未找到此id";
        }
    }

}