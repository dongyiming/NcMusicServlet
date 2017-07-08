package cn.im.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dongyiming.pojo.NcMenu;
import cn.im.service.MenuService;

/**
 * 
 * @desc : 歌单的操作
 * @author : dongyiming
 * @data : 2017年7月7日
 * @version : v1.0
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "/getMenuByType", method = RequestMethod.GET)
	public @ResponseBody List<NcMenu> getMenuByType(int type, int startIndex, int pageCount) {
		// List<NcMenu> selectByType =
		// menuService.selectByType(pager.getStartRecord(), pager.getPageSize(),
		// type);
		List<NcMenu> selectByType = menuService.selectByType(startIndex, pageCount, type);
		return selectByType;
	}

	/**
	 * 通过名字模糊查询歌单
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/getMenuByName", method = RequestMethod.GET)
	public @ResponseBody List<NcMenu> getMenuByName(String name) {

		List<NcMenu> selectByName = menuService.selectByName(name);
		return selectByName;
	}

	/**
	 * 获取所有
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<NcMenu> getAll() {

		List<NcMenu> selectByName = menuService.selectAll();
		return selectByName;
	}

	/**
	 * 添加歌单
	 * 
	 * @param ncMenu
	 */
	@RequestMapping(value = "/addMenu", method = RequestMethod.POST)
	public void insert(@RequestBody NcMenu ncMenu) {

		menuService.insert(ncMenu);
	}

}
