package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.CourseCategory;
import roncoo.education.service.CourseCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 课程分类(CourseCategory)表控制层
 *
 * @author makejava
 * @since 2020-05-13 17:24:36
 */
@RestController
@Api(tags = "分类管理接口")
@RequestMapping("courseCategory")
public class CourseCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CourseCategoryService courseCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据分类id查询分类列表")
    @ApiImplicitParam(value = "课程id",required = true,name = "id",dataType = "int")
    @GetMapping("selectOne")
    public CourseCategory selectOne(Long id) {
        return this.courseCategoryService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectAllByLimit(int offset,int limit){
        return courseCategoryService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "根据多个条件查询分类列表")
    @PostMapping("/selectAll")
    public String selectALl(@RequestBody CourseCategory course){
        return courseCategoryService.queryAll(course).toString();
    }
    @ApiOperation(value = "修改分类信息")
    @PostMapping(value = "/updateCourse")
    public String updateCourse(@RequestBody CourseCategory course){
        String status="";
        try {
            CourseCategory course1=courseCategoryService.update(course);
            if(course1!=null){
                status="修改成功!";
            }else {
                status="修改失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    } @ApiOperation(value = "新增分类信息")
    @PostMapping(value = "/addCourse")
    public String addCourse(@RequestBody CourseCategory course){
        String status="";
        try {
            CourseCategory course1=courseCategoryService.insert(course);
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