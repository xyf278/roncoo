package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.Platform;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 平台信息(Platform)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 19:36:52
 */
@Mapper
public interface PlatformDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Platform queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Platform> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param platform 实例对象
     * @return 对象列表
     */
    List<Platform> queryAll(Platform platform);

    /**
     * 新增数据
     *
     * @param platform 实例对象
     * @return 影响行数
     */
    int insert(Platform platform);

    /**
     * 修改数据
     *
     * @param platform 实例对象
     * @return 影响行数
     */
    int update(Platform platform);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    Platform queryByName(String clientName);
}