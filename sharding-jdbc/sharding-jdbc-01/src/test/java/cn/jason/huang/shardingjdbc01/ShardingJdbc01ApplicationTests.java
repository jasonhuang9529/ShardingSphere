package cn.jason.huang.shardingjdbc01;

import cn.jason.huang.shardingjdbc01.entity.Course;
import cn.jason.huang.shardingjdbc01.entity.Order;
import cn.jason.huang.shardingjdbc01.entity.Udict;
import cn.jason.huang.shardingjdbc01.entity.User;
import cn.jason.huang.shardingjdbc01.mapper.OrderMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbc01ApplicationTests {

	//注入 mapper
//	@Autowired
//	private CourseMapper courseMapper;
//
//	@Autowired
//	private UserMapper userMapper;
//
//	@Autowired
//	private UdictMapper udictMapper;

	@Autowired
	private OrderMapper orderMapper;

//	/**
//	 * 添加操作
//	 */
//	@Test
//	public void testAddCourse() {
//
//		for (int i = 1; i <= 10; i++) {
//			Course course = new Course();
//			course.setCname("java" + i);
//			course.setUserId(100L);
//			course.setCstatus("Normal" + i);
//
//			courseMapper.insert(course);
//		}
//	}
//
//	/**
//	 * 查询
//	 */
//	@Test
//	public void testFindSource(){
//		//条件构造器
//		QueryWrapper<Course> wrapper = new QueryWrapper<>();
//		wrapper.eq("cid", 490886611085557760L);
//		Course course = courseMapper.selectOne(wrapper);
//
//		System.out.println(course);
//	}
//
//	/************************** 测试水平分库 *****************************/
//
//	// 测试添加
//	@Test
//	public void addCourseDB(){
//		Course course = new Course();
//		course.setCname("shardingSphere11");
//		course.setUserId(111L);
//		course.setCstatus("Normal111");
//
//		courseMapper.insert(course);
//	}
//
//	// 测试查询
//	@Test
//	public void findCourseDB(){
//		QueryWrapper<Course> wrapper = new QueryWrapper<>();
//		wrapper.eq("user_id",100L);
//		wrapper.eq("cid", 490907493262688257L);
//
//		Course course = courseMapper.selectOne(wrapper);
//
//		System.out.println(course);
//	}
//
//	/************************** 测试水平分库 *****************************/
//
//
//
//	/************************** 测试垂直分库 *****************************/
//	//添加
//	@Test
//	public void testAddUser(){
//		User user = new User();
//		user.setUsername("Tom");
//		user.setUstatus("a");
//
//		//user.setUserId(1001L);
//
//		userMapper.insert(user);
//	}
//
//	//查询
//	@Test
//	public void testQueryUser1(){
//		QueryWrapper<User> wrapper = new QueryWrapper<>();
//		wrapper.eq("user_id",1285091130001657857L);
//
//		User user = userMapper.selectOne(wrapper);
//
//		System.out.println(user);
//	}
//
//	@Test
//	public void testQueryUser2(){
//		User user = userMapper.selectById(490926093151240193L);
//		System.out.println(user);
//	}
//
//	/************************** 测试垂直分库 *****************************/
//
//
//
//	/************************** 测试操作公共表 ****************/
//	//添加
//	@Test
//	public void testAddDict(){
//		Udict udict = new Udict();
//		udict.setUstatus("a");
//		udict.setUvalue("已启用");
//
//		udictMapper.insert(udict);
//	}
//
//	//删除
//	@Test
//	public void deleteDict(){
//		QueryWrapper<Udict> wrapper = new QueryWrapper<>();
//		wrapper.eq("dictid",491911402617831425L);
//		udictMapper.delete(wrapper);
//	}
//
//	/************************** 测试操作公共表 ****************/


	/******************** 测试 sharding-proxy **************************/
	//查询
	@Test
	public void testQueryOrder(){
		QueryWrapper<Order> wrapper = new QueryWrapper<>();
		wrapper.eq("order_id",11L);
		Order order = orderMapper.selectOne(wrapper);

		System.out.println(order);
	}

}
