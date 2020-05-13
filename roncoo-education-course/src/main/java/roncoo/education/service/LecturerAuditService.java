package roncoo.education.service;

import roncoo.education.entity.LecturerAudit;
import java.util.List;

/**
 * 讲师信息-审核(LecturerAudit)表服务接口
 *
 * @author makejava
 * @since 2020-05-11 21:35:57
 */
public interface LecturerAuditService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LecturerAudit queryById(Long id);

    List<LecturerAudit> queryAll(LecturerAudit lecturerAudit);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LecturerAudit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param lecturerAudit 实例对象
     * @return 实例对象
     */
    LecturerAudit insert(LecturerAudit lecturerAudit);

    /**
     * 修改数据
     *
     * @param lecturerAudit 实例对象
     * @return 实例对象
     */
    LecturerAudit update(LecturerAudit lecturerAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}