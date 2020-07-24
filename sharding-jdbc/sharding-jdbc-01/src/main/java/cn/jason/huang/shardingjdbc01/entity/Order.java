package cn.jason.huang.shardingjdbc01.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/21 10:54
 **/
@TableName("t_order")
@Data
public class Order {
    private Long orderId;
    private int User_id;
    private String status;
}
