package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.LecturerProfit;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 讲师提现日志表(LecturerProfit)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-13 15:44:20
 */
 @Mapper
public interface LecturerProfitDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LecturerProfit queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LecturerProfit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lecturerProfit 实例对象
     * @return 对象列表
     */
    List<LecturerProfit> queryAll(LecturerProfit lecturerProfit);

    /**
     * 新增数据
     *
     * @param lecturerProfit 实例对象
     * @return 影响行数
     */
    int insert(LecturerProfit lecturerProfit);

    /**
     * 修改数据
     *
     * @param lecturerProfit 实例对象
     * @return 影响行数
     */
    int update(LecturerProfit lecturerProfit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}