package cn.dongyiming.mapper;

import cn.dongyiming.pojo.NcSong;
import cn.dongyiming.pojo.NcSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcSongMapper {
    int countByExample(NcSongExample example);

    int deleteByExample(NcSongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NcSong record);

    int insertSelective(NcSong record);

    List<NcSong> selectByExample(NcSongExample example);

    NcSong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NcSong record, @Param("example") NcSongExample example);

    int updateByExample(@Param("record") NcSong record, @Param("example") NcSongExample example);

    int updateByPrimaryKeySelective(NcSong record);

    int updateByPrimaryKey(NcSong record);
}