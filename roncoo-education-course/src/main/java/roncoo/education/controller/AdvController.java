package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.Adv;
import roncoo.education.service.AdvService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 广告信息(Adv)表控制层
 *
 * @author makejava
 * @since 2020-05-13 21:13:13
 */
@RestController
@RequestMapping("adv")
@Api(tags = "广告管理接口")
public class AdvController {
    /**
     * 服务对象
     */
    @Resource
    private AdvService advService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询广告信息")
    @GetMapping("selectOne")
    public Adv selectOne(Integer id) {
        return this.advService.queryById(id);
    }
    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectAllByLimit(int offset,int limit){
        return advService.queryAllByLimit(offset,limit).toString();
    }

    @ApiOperation(value = "新增广告信息")
    @PostMapping("addAdv")
    public String addAdv(@RequestBody Adv adv){
        String status = "";
        try {
            Adv adv1 = advService.insert(adv);
            if (adv1 != null) {
                status = "添加成功!";
            } else {
                status = "添加失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
    @ApiOperation(value = "根据id删除广告信息")
    @ApiImplicitParam(required = true,name = "id",value = "广告id",dataType = "int")
    @PostMapping("deleteAdv")
    public String deleteAdv(int id){
        String status = "";
        try {
            Boolean success = advService.deleteById(id);
            if (success) {
                status = "删除成功!";
            } else {
                status = "删除失败！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}