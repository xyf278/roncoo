package roncoo.education.service;

import roncoo.education.entity.CourseCategory;
import java.util.List;

/**
 * 课程分类(CourseCategory)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 17:24:36
 */
public interface CourseCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseCategory queryById(Long id);

    List<CourseCategory> queryAll(CourseCategory courseCategory);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseCategory 实例对象
     * @return 实例对象
     */
    CourseCategory insert(CourseCategory courseCategory);

    /**
     * 修改数据
     *
     * @param courseCategory 实例对象
     * @return 实例对象
     */
    CourseCategory update(CourseCategory courseCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}