package roncoo.education.dao;

import org.apache.ibatis.annotations.Mapper;
import roncoo.education.entity.LecturerAudit;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 讲师信息-审核(LecturerAudit)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 21:35:58
 */
 @Mapper
public interface LecturerAuditDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LecturerAudit queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LecturerAudit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lecturerAudit 实例对象
     * @return 对象列表
     */
    List<LecturerAudit> queryAll(LecturerAudit lecturerAudit);

    /**
     * 新增数据
     *
     * @param lecturerAudit 实例对象
     * @return 影响行数
     */
    int insert(LecturerAudit lecturerAudit);

    /**
     * 修改数据
     *
     * @param lecturerAudit 实例对象
     * @return 影响行数
     */
    int update(LecturerAudit lecturerAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}