package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.CourseAudit;
import roncoo.education.entity.vo.CourseAuditVO;
import roncoo.education.service.CourseAuditService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 课程信息-审核(CourseAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-13 19:55:02
 */
@RestController
@RequestMapping("courseAudit")
@Api(tags = "课程审核管理接口")
public class CourseAuditController {
    /**
     * 服务对象
     */
    @Resource
    private CourseAuditService courseAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询课程审核信息")
    @ApiImplicitParam(value = "课程id",name = "id",required = true,dataType = "int")
    @GetMapping("selectOne")
    public CourseAudit selectOne(Long id) {
        return this.courseAuditService.queryById(id);
    }

    @ApiOperation(value = "根据条件查询课程审核信息",notes = "根据课程名称，状态，是否收费，上下架，审核状态查询")
    @PostMapping("/queryAll")
    public String queryAll(@RequestBody CourseAudit courseAudit){
       return courseAuditService.queryAll(courseAudit).toString();
    }
    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectAllByLimit(int offset,int limit){
        return courseAuditService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加待审核的课程")
    @PostMapping("addCourseAudit")
    public String addCourseAudit(@RequestBody CourseAudit courseAudit){
        String status="";
        try {
            CourseAudit courseAudit1=courseAuditService.insert(courseAudit);
            if(courseAudit1!=null){
                status="添加成功！";
            }else {
                status="添加失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
    @ApiOperation(value = "修改待审核的课程信息",notes = "修改待审核的课程信息")
    @PostMapping("/updateCourseAudit")
    public String updateCourseAudit(@RequestBody CourseAudit courseAudit){
        String status="";
        try {
            CourseAudit courseAudit1=courseAuditService.update(courseAudit);
            if(courseAudit1!=null){
                status="修改成功！";
            }else {
                status="修改失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
    @ApiOperation(value = "审核课程是否通过",notes = "如果审核状态为待审核，则可以审核，需要管理员权限")
    @PostMapping("updateStatus")
    public String updateStatus(@RequestBody CourseAuditVO courseAudit){
        String status="";
        try {
            int a=courseAuditService.updateAudit_status(courseAudit);
            if(a>0){
                status="修改成功！";
            }else {
                status="修改失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }

}