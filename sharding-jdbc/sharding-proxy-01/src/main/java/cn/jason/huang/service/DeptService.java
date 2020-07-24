package cn.jason.huang.service;

import cn.jason.huang.entity.Department;
import cn.jason.huang.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/23 10:11
 **/
@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Department> list(){
        return  deptMapper.selectList(null);
    }

    @Transactional
    public void add(Department dept){
        deptMapper.insert(dept);
//        int i = 10 / 0;
    }
}
