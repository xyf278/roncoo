package roncoo.education.dao2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import roncoo.education.entity.Role;
import roncoo.education.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    User loaderUserByName(@Param(value = "username") String username);
    List<Role> getUserRolesByUid(Integer id);
}
