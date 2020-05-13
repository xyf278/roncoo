package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.CourseCategory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 课程分类(CourseCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-13 17:24:36
 */
 @Mapper
public interface CourseCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseCategory 实例对象
     * @return 对象列表
     */
    List<CourseCategory> queryAll(CourseCategory courseCategory);

    /**
     * 新增数据
     *
     * @param courseCategory 实例对象
     * @return 影响行数
     */
    int insert(CourseCategory courseCategory);

    /**
     * 修改数据
     *
     * @param courseCategory 实例对象
     * @return 影响行数
     */
    int update(CourseCategory courseCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}