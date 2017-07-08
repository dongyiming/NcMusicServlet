package cn.dongyiming.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.dongyiming.pojo.NcMenu;
import cn.dongyiming.pojo.NcMenuExample;

public interface NcMenuMapper {
	int countByExample(NcMenuExample example);

	int deleteByExample(NcMenuExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(NcMenu record);

	int insertSelective(NcMenu record);

	List<NcMenu> selectByExample(NcMenuExample example);

	NcMenu selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") NcMenu record, @Param("example") NcMenuExample example);

	int updateByExample(@Param("record") NcMenu record, @Param("example") NcMenuExample example);

	int updateByPrimaryKeySelective(NcMenu record);

	int updateByPrimaryKey(NcMenu record);

	List<NcMenu> selectByType(@Param(value = "startRecord") Integer startRecord,
			@Param(value = "pageSize") Integer pageSize, @Param(value = "menu_type") Integer menuType);

	List<NcMenu> selectByName(@Param(value = "menu_name") String menuName);

	List<NcMenu> selectAll();
}