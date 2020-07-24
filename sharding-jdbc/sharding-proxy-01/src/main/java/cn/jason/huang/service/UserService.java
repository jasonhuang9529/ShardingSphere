package cn.jason.huang.service;

import cn.jason.huang.entity.User;
import cn.jason.huang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/23 10:03
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list(){
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

    @Transactional
    public void add(User user){
        userMapper.insert(user);
    }

}
