package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.CourseAudit;
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


}