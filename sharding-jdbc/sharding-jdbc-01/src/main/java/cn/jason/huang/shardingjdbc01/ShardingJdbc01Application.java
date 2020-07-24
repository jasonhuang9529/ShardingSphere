package cn.jason.huang.shardingjdbc01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("cn.jason.huang.shardingjdbc01.mapper")
public class ShardingJdbc01Application {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbc01Application.class, args);
	}

}
