package cn.dongyiming.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dongyiming.mapper.NcSongMapper;
import cn.dongyiming.pojo.NcSong;
import cn.im.service.SongService;

@Service
public class SongServiceImpl implements SongService {

	@Resource
	private NcSongMapper songMapper;
	
	@Override
	public NcSong getSongById(int id) {
		
		NcSong ncSong = songMapper.selectByPrimaryKey(id);
		return ncSong;
	}

	@Override
	public int deleteSongById(int id) {
		int c = songMapper.deleteByPrimaryKey(id);
		System.out.println("delte count:"+c);
		return 0;
	}

}
