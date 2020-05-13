package roncoo.education.service;

import roncoo.education.entity.Platform;
import java.util.List;

/**
 * 平台信息(Platform)表服务接口
 *
 * @author makejava
 * @since 2020-05-11 19:36:48
 */
public interface PlatformService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Platform queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Platform> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param platform 实例对象
     * @return 实例对象
     */
    Platform insert(Platform platform);

    /**
     * 修改数据
     *
     * @param platform 实例对象
     * @return 实例对象
     */
    Platform update(Platform platform);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    Platform queryByName(String clientName);
}