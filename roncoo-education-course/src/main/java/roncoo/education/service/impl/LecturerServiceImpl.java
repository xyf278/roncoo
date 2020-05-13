package roncoo.education.service.impl;

import roncoo.education.entity.Lecturer;
import roncoo.education.dao.LecturerDao;
import roncoo.education.service.LecturerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讲师信息(Lecturer)表服务实现类
 *
 * @author makejava
 * @since 2020-05-11 16:37:20
 */
@Service("lecturerService")
public class LecturerServiceImpl implements LecturerService {
    @Resource
    private LecturerDao lecturerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Lecturer queryById(Long id) {
        return this.lecturerDao.queryById(id);
    }

    /*
    根据实体类进行条件查询
     */
    @Override
    public List<Lecturer> queryAll(Lecturer lecturer){
        return this.lecturerDao.queryAll(lecturer);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Lecturer> queryAllByLimit(int offset, int limit) {
        return this.lecturerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param lecturer 实例对象
     * @return 实例对象
     */
    @Override
    public Lecturer insert(Lecturer lecturer) {
        this.lecturerDao.insert(lecturer);
        return lecturer;
    }

    /**
     * 修改数据
     *
     * @param lecturer 实例对象
     * @return 实例对象
     */
    @Override
    public Lecturer update(Lecturer lecturer) {
        this.lecturerDao.update(lecturer);
        return this.queryById(lecturer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.lecturerDao.deleteById(id) > 0;
    }
}