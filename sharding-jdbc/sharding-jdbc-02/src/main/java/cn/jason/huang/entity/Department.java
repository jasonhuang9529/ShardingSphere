package cn.jason.huang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/22 14:55
 **/
@Data
@Accessors(chain = true)
@TableName("dept")
public class Department {

    private Long id;
    private String dname;
}
