package roncoo.education.service;

import roncoo.education.entity.CourseAudit;
import java.util.List;

/**
 * 课程信息-审核(CourseAudit)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 19:55:01
 */
public interface CourseAuditService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseAudit queryById(Long id);


    List<CourseAudit> queryAll(CourseAudit courseAudit);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseAudit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseAudit 实例对象
     * @return 实例对象
     */
    CourseAudit insert(CourseAudit courseAudit);

    /**
     * 修改数据
     *
     * @param courseAudit 实例对象
     * @return 实例对象
     */
    CourseAudit update(CourseAudit courseAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}