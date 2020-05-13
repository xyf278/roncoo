package roncoo.education.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import roncoo.education.entity.OrderInfo;
import roncoo.education.service.OrderInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单信息表(OrderInfo)表控制层
 *
 * @author makejava
 * @since 2020-05-13 21:27:34
 */
@RestController
@Api(tags = "订单信息管理接口")
@RequestMapping("orderInfo")
public class OrderInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value = "根据id查询订单信息")
    @ResponseBody
    public OrderInfo selectOne(Long id) {
        return this.orderInfoService.queryById(id);
    }

    @PostMapping("queryAll")
    @ApiOperation(value = "根据条件查询订单信息")
    public String queryAll(@RequestBody OrderInfo orderInfo){
        return orderInfoService.queryAll(orderInfo).toString();
    }
    @PostMapping("addOrderInfo")
    @ApiOperation(value = "新增订单信息")
    @ResponseBody
    public String addOrderInfo(@RequestBody OrderInfo orderInfo){
        OrderInfo orderInfo1=orderInfoService.insert(orderInfo);
        if(orderInfo1!=null){
            return "添加成功!";
        }else {
            return "添加失败!";
        }
    }
    @PostMapping("deleteOrderInfo")
    @ApiOperation(value = "删除订单信息")
    @ApiImplicitParam(value = "订单id",required = true,name = "id",dataType = "int")
    @ResponseBody
    public String deleteOrderInfo(int id){
       Boolean status=orderInfoService.deleteById(Long.valueOf(id));
        if(status){
            return "删除成功!";
        }else {
            return "删除失败!";
        }
    }
    @ApiOperation(value = "分页查询",notes = "根据页数和每页显示的数量查询")
    @PostMapping("selectAllByLimit")
    @ApiImplicitParams({@ApiImplicitParam(name = "offset",dataType = "int",required = true,value = "当前页"),
            @ApiImplicitParam(name = "limit",dataType = "int",required = true,value = "每页显示的记录数")})
    @ResponseBody
    public String selectAllByLimit(int offset,int limit){
        return orderInfoService.queryAllByLimit(offset,limit).toString();
    }
}