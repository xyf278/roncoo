package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.Course;
import roncoo.education.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 课程信息(Course)表控制层
 *
 * @author makejava
 * @since 2020-05-13 17:02:01
 */
@RestController
@Api(tags = "课程管理接口")
@RequestMapping("course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据课程id查询课程")
    @ApiImplicitParam(value = "课程id",required = true,name = "id",dataType = "int")
    @GetMapping("selectOne")
    public Course selectOne(Long id) {
        return this.courseService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectAllByLimit(int offset,int limit){
        return courseService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "根据多个条件查询课程列表")
    @PostMapping("/selectAll")
    public String selectALl(@RequestBody Course course){
        return courseService.queryAll(course).toString();
    }
    @ApiOperation(value = "课程上下架和状态修改")
    @PostMapping(value = "/updateCourse")
    public String updateCourse(@RequestBody Course course){
        String status="";
       try {
           Course course1=courseService.update(course);
           if(course1!=null){
               status="修改成功!";
           }else {
               status="修改失败！";
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       return status;
    } @ApiOperation(value = "新增课程信息")
    @PostMapping(value = "/addCourse")
    public String addCourse(@RequestBody Course course){
        String status="";
       try {
           Course course1=courseService.insert(course);
           if(course1!=null){
               status="添加成功!";
           }else {
               status="添加失败！";
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       return status;
    }
}