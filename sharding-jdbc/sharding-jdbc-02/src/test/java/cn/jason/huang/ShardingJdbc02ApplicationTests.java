package cn.jason.huang;

import cn.jason.huang.entity.Department;
import cn.jason.huang.entity.Dict;
import cn.jason.huang.entity.Order;
import cn.jason.huang.entity.User;
import cn.jason.huang.mapper.DeptMapper;
import cn.jason.huang.mapper.DictMapper;
import cn.jason.huang.mapper.OrderMapper;
import cn.jason.huang.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbc02ApplicationTests {

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private DeptMapper deptMapper;

	@Autowired
	private DictMapper dictMapper;

	/**
	 * 测试分表
	 */
	@Test
	public void testAdd(){
		for (int i = 1; i <= 10; i++) {
			Order order = new Order();

			order.setPrice(100 * i + 100d).setStatus("aa").setUserId(10L * i + i);

			orderMapper.insert(order);
		}
	}

	/**
	 * 测试分库
	 *
	 * userId 为偶数的插入到 m1 ，为奇数的插入到 m2
	 */
	@Test
	public void testAddUser(){
		for (int i = 1; i <= 10 ; i++) {
			User user = new User();

			user.setName("name_"+i).setEmail("name"+i+"@163.com");

			userMapper.insert(user);
		}
	}

	/**
	 * 自定义分片规则
	 */
	@Test
	public void testAddUser1(){
		User user = new User();

		user.setName("zhang3").setGender("female").setEmail("zhang3@163.com");

		userMapper.insert(user);
	}

	/**
	 * 垂直分库
	 */
	@Test
	public void testAddDept(){
		Department dept = new Department();

		dept.setDname("研发部");

		deptMapper.insert(dept);

	}

	@Test
	public void testQueryUser(){
		QueryWrapper<User> wrapper = new QueryWrapper<>();
		wrapper.eq("id",1285838521243840513L);

		User user = userMapper.selectOne(wrapper);

		System.out.println(user);
	}

	@Test
	public void testQueryDept(){
		QueryWrapper<Department> wrapper = new QueryWrapper<>();
		wrapper.eq("id",1285839130172903425L);

		Department dept = deptMapper.selectOne(wrapper);

		System.out.println(dept);
	}

	/**
	 * 测试公共表
	 */
	@Test
	public void testAddDict(){
		Dict dict = new Dict();

		dict.setType("类型1").setCode("1001").setValue("程序员");

		dictMapper.insert(dict);
	}

	/**
	 * 读写分离
	 */
	@Test
	public void testAddUser2(){
		for (int i = 1; i <= 10; i++) {
			User user = new User();

			user.setName("name" + i).setGender("male").setEmail("name"+i+"@163.com");

			userMapper.insert(user);

		}
	}

	@Test
	public void testQueryUser1(){
		QueryWrapper<User> wrapper = new QueryWrapper<>();
		wrapper.eq("name","zhang3");
		User user = userMapper.selectOne(wrapper);

		System.out.println(user);
	}

}
