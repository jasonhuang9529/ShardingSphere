package cn.jason.huang.shardingjdbc01.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * DESC: 字典表（公共表）对应的实体类
 *
 * @author: huangxinquan
 * DATE: 2020/7/20 9:50
 **/
@TableName("t_udict")
@Data
public class Udict {

    private Long dictid;
    private String ustatus;
    private String uvalue;
}
