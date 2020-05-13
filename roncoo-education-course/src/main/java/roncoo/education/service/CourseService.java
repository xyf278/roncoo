package roncoo.education.service;

import roncoo.education.entity.Course;
import java.util.List;

/**
 * 课程信息(Course)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 17:02:01
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Course queryById(Long id);

    public List<Course> queryAll(Course course);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Course> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}