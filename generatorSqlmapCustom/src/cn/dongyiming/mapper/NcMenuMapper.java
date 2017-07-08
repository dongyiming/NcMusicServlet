package cn.dongyiming.mapper;

import cn.dongyiming.pojo.NcMenu;
import cn.dongyiming.pojo.NcMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}