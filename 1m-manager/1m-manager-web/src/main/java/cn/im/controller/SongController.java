package cn.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dongyiming.pojo.NcSong;
import cn.im.service.SongService;

@Controller
public class SongController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("/item/{id}")
	@ResponseBody
	public NcSong getSongById(@PathVariable int id){
		
		NcSong songById = songService.getSongById(id);
		return songById;
		
		
	}
	@RequestMapping("/del/{id}")
	@ResponseBody
	public String delSongById(@PathVariable int id){
		
		 songService.deleteSongById(id);
		
		return "";
		
		
	}
}
