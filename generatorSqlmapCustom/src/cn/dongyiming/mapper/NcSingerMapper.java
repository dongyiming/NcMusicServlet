package cn.dongyiming.mapper;

import cn.dongyiming.pojo.NcSinger;
import cn.dongyiming.pojo.NcSingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcSingerMapper {
    int countByExample(NcSingerExample example);

    int deleteByExample(NcSingerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NcSinger record);

    int insertSelective(NcSinger record);

    List<NcSinger> selectByExample(NcSingerExample example);

    NcSinger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NcSinger record, @Param("example") NcSingerExample example);

    int updateByExample(@Param("record") NcSinger record, @Param("example") NcSingerExample example);

    int updateByPrimaryKeySelective(NcSinger record);

    int updateByPrimaryKey(NcSinger record);
}