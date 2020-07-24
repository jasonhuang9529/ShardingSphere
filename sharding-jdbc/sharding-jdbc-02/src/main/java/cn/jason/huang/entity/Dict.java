package cn.jason.huang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/22 15:43
 **/
@Data
@Accessors(chain = true)
@TableName("dict")
public class Dict {

    private Long id;
    private String type;
    private String code;
    private String value;
}
