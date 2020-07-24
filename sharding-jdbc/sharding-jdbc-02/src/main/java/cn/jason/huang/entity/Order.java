package cn.jason.huang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/21 16:51
 **/
@Data
@Accessors(chain = true)
@TableName("atguigu_order")
public class Order {

    private Long orderId;
    private Double price;
    private Long userId;
    private String status;
}
