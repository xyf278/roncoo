package roncoo.education.service.impl;

import roncoo.education.entity.LecturerAudit;
import roncoo.education.dao.LecturerAuditDao;
import roncoo.education.service.LecturerAuditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讲师信息-审核(LecturerAudit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-11 21:35:57
 */
@Service("lecturerAuditService")
public class LecturerAuditServiceImpl implements LecturerAuditService {
    @Resource
    private LecturerAuditDao lecturerAuditDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LecturerAudit queryById(Long id) {
        return this.lecturerAuditDao.queryById(id);
    }

    @Override
    public List<LecturerAudit> queryAll(LecturerAudit lecturerAudit) {
        return this.lecturerAuditDao.queryAll(lecturerAudit);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LecturerAudit> queryAllByLimit(int offset, int limit) {
        return this.lecturerAuditDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param lecturerAudit 实例对象
     * @return 实例对象
     */
    @Override
    public LecturerAudit insert(LecturerAudit lecturerAudit) {
        this.lecturerAuditDao.insert(lecturerAudit);
        return lecturerAudit;
    }

    /**
     * 修改数据
     *
     * @param lecturerAudit 实例对象
     * @return 实例对象
     */
    @Override
    public LecturerAudit update(LecturerAudit lecturerAudit) {
        this.lecturerAuditDao.update(lecturerAudit);
        return this.queryById(lecturerAudit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.lecturerAuditDao.deleteById(id) > 0;
    }
}