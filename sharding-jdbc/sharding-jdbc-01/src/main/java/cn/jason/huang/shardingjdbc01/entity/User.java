package cn.jason.huang.shardingjdbc01.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * DESC: User 实体类
 *
 * @author: huangxinquan
 * DATE: 2020/7/17 16:17
 **/
@Data
@TableName("t_user")  //指定对应的表
public class User {

    @TableId
    private Long userId;
    private String username;
    private String ustatus;
}
