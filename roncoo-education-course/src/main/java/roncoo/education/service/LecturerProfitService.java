package roncoo.education.service;

import roncoo.education.entity.LecturerProfit;
import java.util.List;

/**
 * 讲师提现日志表(LecturerProfit)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 15:44:20
 */
public interface LecturerProfitService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LecturerProfit queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LecturerProfit> queryAllByLimit(int offset, int limit);

    List<LecturerProfit> queryAll(LecturerProfit lecturerProfit);

    /**
     * 新增数据
     *
     * @param lecturerProfit 实例对象
     * @return 实例对象
     */
    LecturerProfit insert(LecturerProfit lecturerProfit);

    /**
     * 修改数据
     *
     * @param lecturerProfit 实例对象
     * @return 实例对象
     */
    LecturerProfit update(LecturerProfit lecturerProfit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}