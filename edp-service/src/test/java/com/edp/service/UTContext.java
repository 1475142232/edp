package com.edp.service;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

import com.edp.common.utils.UUIDUtil;
import com.edp.common.utils.ZgbLogUtil;


/**
 * <p>
 * 单元测试上下文
 * </p>
 * <p>
 * <em>不涉及任何外部环境，单元测试类必须以UT结尾。</em>
 * </p>
 * <p>
 * Mockito 测试环境。继承该类后，Mockito 的相关注解 (@Mock, @InjectMocks, ...) 就能生效
 * </p>
 * 实例： package com.bocsoft.bocebiz.ezvcp.abroadfinance;
 * <p/>
 * import com.bocsoft.bocebiz.ezvcp.abroadfinance.dao.domain.CityCriteria;
 * import com.bocsoft.bocebiz.ezvcp.abroadfinance.dao.mapper.CityMapper; import
 * com.bocsoft.bocebiz.ezvcp.abroadfinance.sample.HelloServiceImpl; import
 * org.junit.Test; import org.mockito.InjectMocks; import org.mockito.Mock;
 * <p/>
 * import static org.junit.Assert.assertEquals; import static
 * org.mockito.Matchers.any; import static org.mockito.Mockito.when;
 * <p/>
 * public class AppUT extends UTContext {
 * 
 * @InjectMocks private HelloServiceImpl helloService;
 * @Mock private CityMapper cityMapper;
 * @Test public void rtnMsg() {
 *       when(cityMapper.countByExample(any(CityCriteria.class
 *       ))).thenReturn(21); assertEquals("Hello ZionAge:21",
 *       helloService.sayHello("Zion")); } }
 */
public class UTContext {
	public UTContext() {
		MockitoAnnotations.initMocks(this);
	}

	@Before
	public void init() {

	}
}
