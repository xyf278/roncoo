package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.LecturerAudit;
import roncoo.education.service.LecturerAuditService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 讲师信息-审核(LecturerAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-11 21:35:57
 */
@RestController
@RequestMapping("lecturerAudit")
@Api(tags = "讲师审核管理接口")
public class LecturerAuditController {
    /**
     * 服务对象
     */
    @Resource
    private LecturerAuditService lecturerAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询待审核的讲师",notes = "根据id查询待审核的讲师列表信息")
    @ApiImplicitParam(value = "讲师id",name = "id",required = true,dataType = "int")
    @GetMapping("selectOne")
    public LecturerAudit selectOne(Long id) {
        return this.lecturerAuditService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String getAllByLimit(@RequestParam int offset,@RequestParam int limit) {
        return lecturerAuditService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加讲师信息",notes = "添加讲师信息")
    @PostMapping("addRole")
    @ResponseBody
    public String addRole(@RequestBody LecturerAudit lecturerAudit){
        String eex="";
        try{
            LecturerAudit lecturerAudit1=lecturerAuditService.insert(lecturerAudit);
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
    @ApiOperation(value = "查询审核列表信息",notes = "根据实体类的字段进行详细查询")
    @PostMapping("/selctAllByLecture")
    @ResponseBody
    public String queryAll(@ModelAttribute LecturerAudit lecturer) {
        return lecturerAuditService.queryAll(lecturer).toString();
    }

    @ApiOperation(value = "审核讲师信息",notes = "审核讲师角色信息和分润")
    @PostMapping("updateRole")
    @ResponseBody
    public String updateRole(@ModelAttribute LecturerAudit sysRole){
        LecturerAudit sysRole1=lecturerAuditService.update(sysRole);
        if ((sysRole1!=null)){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }

}