package cn.im.service;

import cn.dongyiming.pojo.NcSong;

public interface SongService {

	public NcSong getSongById(int id);
	public int deleteSongById(int id);
}
