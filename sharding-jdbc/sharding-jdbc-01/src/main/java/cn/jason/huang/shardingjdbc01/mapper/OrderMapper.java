package cn.jason.huang.shardingjdbc01.mapper;

import cn.jason.huang.shardingjdbc01.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/21 10:55
 **/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
