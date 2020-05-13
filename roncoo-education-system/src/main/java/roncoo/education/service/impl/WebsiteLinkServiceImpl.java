package roncoo.education.service.impl;

import roncoo.education.entity.WebsiteLink;
import roncoo.education.dao.WebsiteLinkDao;
import roncoo.education.service.WebsiteLinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 站点友情链接(WebsiteLink)表服务实现类
 *
 * @author makejava
 * @since 2020-05-11 21:09:24
 */
@Service("websiteLinkService")
public class WebsiteLinkServiceImpl implements WebsiteLinkService {
    @Resource
    private WebsiteLinkDao websiteLinkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WebsiteLink queryById(Long id) {
        return this.websiteLinkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WebsiteLink> queryAllByLimit(int offset, int limit) {
        return this.websiteLinkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param websiteLink 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteLink insert(WebsiteLink websiteLink) {
        this.websiteLinkDao.insert(websiteLink);
        return websiteLink;
    }

    /**
     * 修改数据
     *
     * @param websiteLink 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteLink update(WebsiteLink websiteLink) {
        this.websiteLinkDao.update(websiteLink);
        return this.queryById(websiteLink.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.websiteLinkDao.deleteById(id) > 0;
    }
}