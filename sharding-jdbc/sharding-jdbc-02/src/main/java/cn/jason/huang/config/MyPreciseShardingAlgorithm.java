package cn.jason.huang.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.Iterator;

/**
 * DESC: cn.jason.huang.config.MyPreciseShardingAlgorithm
 *
 * @author: huangxinquan
 * DATE: 2020/7/22 11:55
 **/
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    /**
     * @param availableTargetNames：配置的数据源名称
     * @param shardingValue：分片属性，包含：分片列名，逻辑表名，当前列的具体分片值
     * @return
     */
    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {

        /*
            使用枚举进行分库筛选：
                如果 user 的 gender 为 ‘male’ 则存到 m1 数据源对应的数据库
                如果 user 的 gender 为 ‘female’ 则存到 m2 数据源对应的数据库
         */
        Comparable value = shardingValue.getValue();
        String gender = value.toString();
        if("male".equals(gender)){
            return "m1";
        }else if("female".equals(gender)){
            return "m2";
        }else{
            throw new RuntimeException("分片策略错误...");
        }

    }
}
