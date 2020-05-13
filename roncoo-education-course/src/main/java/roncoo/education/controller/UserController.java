package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.User;
import roncoo.education.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户基本信息(User)表控制层
 *
 * @author makejava
 * @since 2020-05-13 16:07:12
 */
@RestController
@Api(tags = "学员管理接口")
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据学员id查询学员信息")
    @ApiImplicitParam(dataType = "int",required = true,name = "id",value = "学员id")
    @GetMapping("selectOne")
    public User selectOne(Long id) {
       try{
           return this.userService.queryById(id);
       }catch (Exception e){
           e.printStackTrace();
       }
        return this.userService.queryById(id);
    }

    @ApiOperation(value = "根据条件查询学员信息")
    @PostMapping(value = "queryAll")
    @ResponseBody
    public String queryAll(@ModelAttribute User user){
        return userService.queryAll(user).toString();
    }
    @ApiOperation(value = "修改学员信息")
    @PostMapping(value = "updateUser")
    public String updateUser(@RequestBody User user){
        String status="";
       try {
           User user1=userService.update(user);
           if(user!=null){
               status="修改成功!";
           }else {
               status="修改失败！";
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       return status;
    }  @ApiOperation(value = "添加学员信息")
    @PostMapping(value = "addUser")
    public String addUser(@RequestBody User user){
        String status="";
       try {
           User user1=userService.insert(user);
           if(user!=null){
               status="添加成功!";
           }else {
               status="添加失败！";
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       return status;
    }
    @ApiOperation(value = "分页查询用户信息")
    @PostMapping(value = "selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectALlByLimit(int offset,int limit){
       try {
           return userService.queryAllByLimit(offset,limit).toString();
       }catch (Exception e){
           e.printStackTrace();
       }
        return userService.queryAllByLimit(offset,limit).toString();
    }
}