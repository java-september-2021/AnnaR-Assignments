package com.arankin.Lookify.Respositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arankin.Lookify.Models.*;

@Repository
public interface SongRepositories  extends CrudRepository<Song, Long>{
	
       // this method retrieves all the songs from the database
	    List<Song> findAll();
	    
	    // this method finds song with descriptions containing the search string
	    List<Song> findByTitleContaining(String title);
	    
	    // this method finds song with descriptions containing the search string
	    List<Song> findByArtistContaining(String artist);	    
	    
	    
	    // this method finds ordered by ratings
	    List<Song> findByOrderByRating();	 

}


