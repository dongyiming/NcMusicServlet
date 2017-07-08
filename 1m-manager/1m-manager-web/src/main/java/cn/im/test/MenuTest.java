package cn.im.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dongyiming.mapper.NcMenuMapper;
import cn.dongyiming.pojo.NcMenu;

public class MenuTest {

//	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");

		NcMenuMapper menuMapper = ac.getBean(NcMenuMapper.class);
		List<NcMenu> selectByType = menuMapper.selectByType(0, 5, 2);
		System.out.println(selectByType.size());
		System.out.println(selectByType.get(0).getAuthorName());
	}
}
