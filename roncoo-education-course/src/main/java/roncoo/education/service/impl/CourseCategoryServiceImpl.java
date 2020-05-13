package roncoo.education.service.impl;

import roncoo.education.entity.CourseCategory;
import roncoo.education.dao.CourseCategoryDao;
import roncoo.education.service.CourseCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程分类(CourseCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 17:24:36
 */
@Service("courseCategoryService")
public class CourseCategoryServiceImpl implements CourseCategoryService {
    @Resource
    private CourseCategoryDao courseCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseCategory queryById(Long id) {
        return this.courseCategoryDao.queryById(id);
    }

    @Override
    public List<CourseCategory> queryAll(CourseCategory courseCategory) {
        return courseCategoryDao.queryAll(courseCategory);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseCategory> queryAllByLimit(int offset, int limit) {
        return this.courseCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseCategory 实例对象
     * @return 实例对象
     */
    @Override
    public CourseCategory insert(CourseCategory courseCategory) {
        this.courseCategoryDao.insert(courseCategory);
        return courseCategory;
    }

    /**
     * 修改数据
     *
     * @param courseCategory 实例对象
     * @return 实例对象
     */
    @Override
    public CourseCategory update(CourseCategory courseCategory) {
        this.courseCategoryDao.update(courseCategory);
        return this.queryById(courseCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseCategoryDao.deleteById(id) > 0;
    }
}