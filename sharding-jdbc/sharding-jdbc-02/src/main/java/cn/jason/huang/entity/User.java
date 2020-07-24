package cn.jason.huang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/21 17:35
 **/
@Data
@TableName("users")
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private String gender;
    private String email;
}
