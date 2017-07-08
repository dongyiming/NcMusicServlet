package cn.dongyiming.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dongyiming.mapper.NcMenuMapper;
import cn.dongyiming.pojo.NcMenu;
import cn.im.service.MenuService;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Resource
	NcMenuMapper menuMapper;

	@Override
	public List<NcMenu> selectByType(int startRecord, int pageSize, int menuType) {

		return menuMapper.selectByType(startRecord, pageSize, menuType);
	}

	@Override
	public List<NcMenu> selectByName(String name) {
		return menuMapper.selectByName(name);
	}

	@Override
	public List<NcMenu> selectAll() {
		// TODO Auto-generated method stub
		return menuMapper.selectAll();
	}

	@Override
	public void insert(NcMenu ncMenu) {

		menuMapper.insert(ncMenu);
	}

}
