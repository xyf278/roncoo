package roncoo.education.service.impl;

import roncoo.education.entity.Course;
import roncoo.education.dao.CourseDao;
import roncoo.education.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程信息(Course)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 17:02:01
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Course queryById(Long id) {
        return this.courseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Course> queryAllByLimit(int offset, int limit) {
        return this.courseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course insert(Course course) {
        this.courseDao.insert(course);
        return course;
    }


    /**
     * 通过实体作为筛选条件查询
     *
     * @param course 实例对象
     * @return 对象列表
     */
    public List<Course> queryAll(Course course){
        return courseDao.queryAll(course);
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseDao.update(course);
        return this.queryById(course.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseDao.deleteById(id) > 0;
    }
}