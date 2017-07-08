package cn.dongyiming.mapper;

import cn.dongyiming.pojo.NcMenuSong;
import cn.dongyiming.pojo.NcMenuSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcMenuSongMapper {
    int countByExample(NcMenuSongExample example);

    int deleteByExample(NcMenuSongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NcMenuSong record);

    int insertSelective(NcMenuSong record);

    List<NcMenuSong> selectByExample(NcMenuSongExample example);

    NcMenuSong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NcMenuSong record, @Param("example") NcMenuSongExample example);

    int updateByExample(@Param("record") NcMenuSong record, @Param("example") NcMenuSongExample example);

    int updateByPrimaryKeySelective(NcMenuSong record);

    int updateByPrimaryKey(NcMenuSong record);
}