package com.edp.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.edp.common.utils.UUIDUtil;
import com.edp.common.utils.ZgbLogUtil;


/**
 * <p>
 * 集成测试上下文
 * </p>
 * <p>
 * <em>涉及数据库连接或者其他service调用，不是单元测试，集成测试类必须以IT结尾。</em>
 * </p>
 * 所有集成测试类继承父类<code>BaseIT</code>，不再需要加载spring。 实例： package
 * com.bocsoft.bocebiz.eznla.posloan;
 * 
 * import com.bocsoft.bocebiz.eznla.posloan.sample.HelloService; import
 * org.junit.Test; import
 * org.springframework.beans.factory.annotation.Autowired;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * public class AppSqlTest extends ITContext {
 * 
 * @Autowired private HelloService helloService;
 * 
 * @Test public void rtnMsg() { assertEquals("Hello Zion",
 *       helloService.sayHello("Zion"); } }
 * @author zgy
 * @since 2014-5-28
 * @version 1.0
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/biz-*.xml"})
public class ITContext {
	@Before
	public void init() {

	}
}
