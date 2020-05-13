package roncoo.education.service.impl;

import roncoo.education.entity.LecturerProfit;
import roncoo.education.dao.LecturerProfitDao;
import roncoo.education.service.LecturerProfitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讲师提现日志表(LecturerProfit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 15:44:20
 */
@Service("lecturerProfitService")
public class LecturerProfitServiceImpl implements LecturerProfitService {
    @Resource
    private LecturerProfitDao lecturerProfitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LecturerProfit queryById(Long id) {
        return this.lecturerProfitDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LecturerProfit> queryAllByLimit(int offset, int limit) {
        return this.lecturerProfitDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<LecturerProfit> queryAll(LecturerProfit lecturerProfit) {
        return lecturerProfitDao.queryAll(lecturerProfit);
    }

    /**
     * 新增数据
     *
     * @param lecturerProfit 实例对象
     * @return 实例对象
     */
    @Override
    public LecturerProfit insert(LecturerProfit lecturerProfit) {
        this.lecturerProfitDao.insert(lecturerProfit);
        return lecturerProfit;
    }

    /**
     * 修改数据
     *
     * @param lecturerProfit 实例对象
     * @return 实例对象
     */
    @Override
    public LecturerProfit update(LecturerProfit lecturerProfit) {
        this.lecturerProfitDao.update(lecturerProfit);
        return this.queryById(lecturerProfit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.lecturerProfitDao.deleteById(id) > 0;
    }
}