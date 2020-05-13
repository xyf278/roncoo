package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.Lecturer;
import roncoo.education.service.LecturerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 讲师信息(Lecturer)表控制层
 *
 * @author makejava
 * @since 2020-05-11 16:37:21
 */
@RestController
@RequestMapping("/lecturer")
@Api(tags = "讲师管理接口")
public class LecturerController {
    /**
     * 服务对象
     */
    @Resource
    private LecturerService lecturerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询角色",notes = "根据id查询角色")
    @GetMapping("selectOne")
    @ResponseBody
    public Lecturer selectOne(Long id) {
        return this.lecturerService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
        public String getAllByLimit(@RequestParam int offset,@RequestParam int limit) {
            return lecturerService.queryAllByLimit(offset,limit).toString();
        }
    @ApiOperation(value = "添加讲师信息",notes = "添加讲师信息")
    @PostMapping("addRole")
    @ResponseBody
    public String addRole(@ModelAttribute Lecturer sysRole) throws Exception{
        String eex="";
          try{
              Lecturer lecturer=lecturerService.insert(sysRole);
              if(lecturer!=null){
                  eex="添加成功！";
              }else {
                  eex="添加失败";
              }
          }catch (Exception e){
              e.printStackTrace();
          }
          return eex;
    }
    @ApiOperation(value = "根据实体类条件查询",notes = "根据实体类的字段进行详细查询")
    @PostMapping("/selctAllByLecture")
    @ResponseBody
    public String queryAll(@ModelAttribute Lecturer lecturer) {
        return lecturerService.queryAll(lecturer).toString();
    }

    @ApiOperation(value = "修改讲师信息",notes = "修改讲师角色信息和分润")
    @PostMapping("updateRole")
    @ResponseBody
    public String updateRole(@ModelAttribute Lecturer sysRole){
        Lecturer sysRole1=lecturerService.update(sysRole);
        if ((sysRole1!=null)){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }
    @ApiOperation(value = "删除讲师",notes = "根据id删除讲师信息")
    @PostMapping("deleteRoleById")
    @ResponseBody
    public String deleteRoleById(@RequestParam int id){
        Boolean a=lecturerService.deleteById(Long.valueOf(id));
        if(a){
            return "删除成功！";
        }else {
            return "未找到此id";
        }
    }

}