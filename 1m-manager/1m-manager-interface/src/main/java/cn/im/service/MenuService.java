package cn.im.service;

import java.util.List;

import cn.dongyiming.pojo.NcMenu;

public interface MenuService {

	List<NcMenu> selectByType(int startRecord, int pageSize, int menuType);

	List<NcMenu> selectByName(String name);

	List<NcMenu> selectAll();
	
	void insert(NcMenu ncMenu);
}
