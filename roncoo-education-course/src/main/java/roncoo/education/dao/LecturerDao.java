package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.Lecturer;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 讲师信息(Lecturer)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 16:37:21
 */
@Mapper
public interface LecturerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Lecturer queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Lecturer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lecturer 实例对象
     * @return 对象列表
     */
    List<Lecturer> queryAll(Lecturer lecturer);

    /**
     * 新增数据
     *
     * @param lecturer 实例对象
     * @return 影响行数
     */
    int insert(Lecturer lecturer);

    /**
     * 修改数据
     *
     * @param lecturer 实例对象
     * @return 影响行数
     */
    int update(Lecturer lecturer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}