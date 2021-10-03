package com.arankin.Lookify.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.arankin.Lookify.Respositories.*;
import com.arankin.Lookify.Models.*;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class SongServices {
	
	@Autowired
	private  SongRepositories songRepos;

	public SongServices(SongRepositories songRepos) {
		this.songRepos = songRepos;
	}
	
	
	/*==============================*/
	// Method: addSong()
	/*==============================*/
	public Song addSong(Song s) {
		return songRepos.save(s);
	}//addSong
	
	
	/*==============================*/
	// Method: displayAll()
	/*==============================*/
	public List<Song> displayAll() {
		return songRepos.findAll();
	}//displayAll
	  
	
	/*=====================================*/
	// Method: getSongListByTitles() 
	/*=====================================*/
	public List<Song> getSongListByTitles(String title) {
		 return songRepos.findByTitleContaining(title);	
	}//getSongListByTitles	
	
	
	/*==========================================*/
	// Method: getArtistSongList() by Artist
	/*==========================================*/
	public List<Song> getArtistSongList(String artist) {
		 return songRepos.findByArtistContaining(artist);
	}//getArtistSongList	
		
	
	/*=====================================*/
	// Method: getTopTen() 
	/*=====================================*/
	public List<Song> getTopTen() {
		 return songRepos.findByOrderByRating();	
	}//getTopTen		
	
	
	/*==============================*/
	// Method: findSong() by id
	/*==============================*/
	public Song findSong(Long id) {
		 return songRepos.findById(id).orElse(null);
	}//findSong	
	
	
	/*==============================*/
	// Method: updateSong()
	/*==============================*/
	public Song updateSong(Song s) {
		return songRepos.save(s);
	}//updateSong	

	
	/*==============================*/
	// Method: removeSong()
	/*==============================*/
    public void  removeSong (Long id) {     		 
    	songRepos.deleteById(id);
    }//removeSong by Id 	
	
	
}//class Lookify
