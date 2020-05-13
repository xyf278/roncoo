package roncoo.education.service;

import roncoo.education.entity.WebsiteLink;
import java.util.List;

/**
 * 站点友情链接(WebsiteLink)表服务接口
 *
 * @author makejava
 * @since 2020-05-11 21:09:24
 */
public interface WebsiteLinkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WebsiteLink queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WebsiteLink> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param websiteLink 实例对象
     * @return 实例对象
     */
    WebsiteLink insert(WebsiteLink websiteLink);

    /**
     * 修改数据
     *
     * @param websiteLink 实例对象
     * @return 实例对象
     */
    WebsiteLink update(WebsiteLink websiteLink);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}