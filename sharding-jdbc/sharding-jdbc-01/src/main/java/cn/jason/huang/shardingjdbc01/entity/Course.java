package cn.jason.huang.shardingjdbc01.entity;

import lombok.Data;

/**
 * DESC: Course 实体类
 *
 * @author: huangxinquan
 * DATE: 2020/7/17 11:19
 **/
@Data
public class Course {

    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
