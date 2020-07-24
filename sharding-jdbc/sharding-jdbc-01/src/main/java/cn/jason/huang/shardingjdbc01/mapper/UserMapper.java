package cn.jason.huang.shardingjdbc01.mapper;

        import cn.jason.huang.shardingjdbc01.entity.User;
        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import org.springframework.stereotype.Repository;

/**
 * DESC: User 数据操作接口
 *
 * @author: huangxinquan
 * DATE: 2020/7/17 16:18
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {
}
