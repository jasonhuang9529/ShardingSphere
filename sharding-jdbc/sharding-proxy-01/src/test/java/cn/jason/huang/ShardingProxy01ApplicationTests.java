package cn.jason.huang;

import cn.jason.huang.entity.Department;
import cn.jason.huang.entity.User;
import cn.jason.huang.service.DeptService;
import cn.jason.huang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingProxy01ApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private UserService userService;

	@Autowired
	private DeptService deptService;

	@Test
	public void contextLoads() {
		System.out.println(dataSource);
	}

	/**
	 * 测试 sharding-proxy 的事务
	 * 分片规划：
	 * user --- ds1
	 * dept --- ds2
	 */

	@Test
	public void testAddUser(){
		User user = new User();
		user.setName("Tom").setGender("male").setEmail("tom@163.com");
		userService.add(user);
	}

	@Test
	public void testAddDept(){
		Department dept = new Department();
		dept.setDname("市场部");
		deptService.add(dept);
	}

}
