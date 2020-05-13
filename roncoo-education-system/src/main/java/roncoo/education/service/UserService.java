package roncoo.education.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import roncoo.education.dao2.UserMapper;
import roncoo.education.entity.Role;
import roncoo.education.entity.User;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user=userMapper.loaderUserByName(userName);
        if(user==null){
            throw new UsernameNotFoundException("账户不存在");
        }
        user.setRoles(userMapper.getUserRolesByUid(user.getId()));
        return user;
    }
    public List<Role> getUserById(Integer id){
        return userMapper.getUserRolesByUid(id);
    }

}
