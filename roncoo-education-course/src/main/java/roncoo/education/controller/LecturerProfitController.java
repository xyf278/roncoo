package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.LecturerProfit;
import roncoo.education.service.LecturerProfitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 讲师提现日志表(LecturerProfit)表控制层
 *
 * @author makejava
 * @since 2020-05-13 15:44:20
 */
@RestController
@Api(tags = "讲师分润列表管理接口")
@RequestMapping("lecturerProfit")
public class LecturerProfitController {
    /**
     * 服务对象
     */
    @Resource
    private LecturerProfitService lecturerProfitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "",notes = "根据id查询分润信息")
    @ApiImplicitParam(value = "分润id",name = "id",type = "int",required = true)
    @GetMapping("selectOne")
    public LecturerProfit selectOne(Long id) {
        return this.lecturerProfitService.queryById(id);
    }

    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String getAllByLimit(@RequestParam int offset,@RequestParam int limit) {
        return lecturerProfitService.queryAllByLimit(offset,limit).toString();
    }
    @ApiOperation(value = "添加分润信息",notes = "添加讲师分润信息")
    @PostMapping("addRole")
    @ResponseBody
    public String addRole(@RequestBody LecturerProfit lecturerAudit){
        String eex="";
        try{
            LecturerProfit lecturerAudit1=lecturerProfitService.insert(lecturerAudit);
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
    @ApiOperation(value = "查询分润列表信息",notes = "根据实体类的字段进行详细查询")
    @PostMapping("/selctAllByLecture")
    @ResponseBody
    public String queryAll(@ModelAttribute LecturerProfit lecturer) {
        return lecturerProfitService.queryAll(lecturer).toString();
    }

    @ApiOperation(value = "修改分润打款信息",notes = "审核分润信息的打款状态")
    @PostMapping("updateRole")
    @ResponseBody
    public String updateRole(@ModelAttribute LecturerProfit sysRole){
        LecturerProfit sysRole1=lecturerProfitService.update(sysRole);
        if ((sysRole1!=null)){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }
}