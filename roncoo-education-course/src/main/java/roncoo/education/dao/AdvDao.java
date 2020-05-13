package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.Adv;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 广告信息(Adv)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-13 21:13:13
 */
 @Mapper
public interface AdvDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Adv queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Adv> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adv 实例对象
     * @return 对象列表
     */
    List<Adv> queryAll(Adv adv);

    /**
     * 新增数据
     *
     * @param adv 实例对象
     * @return 影响行数
     */
    int insert(Adv adv);

    /**
     * 修改数据
     *
     * @param adv 实例对象
     * @return 影响行数
     */
    int update(Adv adv);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}