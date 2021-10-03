package com.arankin.Lookify.Controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arankin.Lookify.Services.SongServices;
import com.arankin.Lookify.Models.*;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class songController {
	
	@Autowired
	private SongServices songService;
	
	
	/*==============================*/
	// Constructor
	/*==============================*/
	public songController(SongServices songService) {
		this.songService = songService;
	}
		
	
	/*==============================*/
	// Method: index()
	/*==============================*/
	@GetMapping("/")
	public String index (Model viewModel) {	
		String  hello = "Welcome to Lookify!";

		viewModel.addAttribute("welcome", hello);
	    return "/welcome.jsp";
	 }//index
	
	
	/*==============================*/
	// Method: dashboard()
	/*==============================*/
	@GetMapping("/dashboard")
	public String dashboard(@ModelAttribute("Song") Song song, Model viewModel) {	    	
		List<Song> sList = songService.displayAll();
		viewModel.addAttribute("ListOfSongs", sList);
		return "/dashboard.jsp";	
	 }//dashboard	    
	
		
	/*==============================*/
	// Method: selectedSong()
	/*==============================*/
	 @GetMapping("/songs/{id}")
	 public String selectedSong(@PathVariable("id") Long id, Model viewModel) {
	      Song song = new Song();		    	
	      song =  songService.findSong(id);
	      viewModel.addAttribute("Song", song);    	
	      return "/selectedSong.jsp";					         
	 }//selectedSong		
	
	
	 /*==============================*/
	 //Method: addSong()
	 /*==============================*/ 	
	 @RequestMapping(value="/songs/new", method=RequestMethod.GET)
	 public String addSong( @ModelAttribute("Song") Song song,  Model viewModel) { 

		    int[] ratingList = new int[20];
		 		
	        for (int i=0; i<20; i++) {
		      ratingList[i] = i;
	         }	        
	        viewModel.addAttribute("ratingList", ratingList);
 
	       return "/new.jsp";
		
	  }//addSong
	 
	 
	 /*==============================*/
	 //Method: create()
	 /*==============================*/ 	
	 @RequestMapping(value="/songs/new", method=RequestMethod.POST)
	 public String create(@Valid @ModelAttribute("Song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/new.jsp";
	        } else {
	        	songService.addSong(song);
	            return "redirect:/dashboard";
	        }
	 }//create	 
	 
	 
	 /*==============================*/
	 //Method: searchArtistSongs()
	 /*==============================*/ 		    
	 @RequestMapping(value="/search", method=RequestMethod.GET)
	 public String searchArtistSongs(@RequestParam("artist") String artist, Model viewModel) {
		   List<Song> artistList =  songService.getArtistSongList(artist);   
	       viewModel.addAttribute("artistList", artistList);
	       viewModel.addAttribute("Artist", artist);
		   return "/searchArtistSongs.jsp";
    }//searchArtistSongs	  

	 
	 /*==============================*/
	 //Method: searchByTopTen()
	 /*==============================*/ 		    
	 @RequestMapping(value="/search/TopTen", method=RequestMethod.GET)
	 public String searchByTopTen( Model viewModel) {
		   List<Song> topTentList =  songService.getTopTen();
	
	       viewModel.addAttribute("topTentList", topTentList);
		   return "/searchTopTen.jsp";
    }//searchByTopTen
	 

	 /*==============================*/
	 //Method: remove()
	 /*==============================*/ 	
	 @RequestMapping(value="/songs/{id}/delete")
	 public String remove(@PathVariable("id") Long id) {
		 songService.removeSong(id);
	        return "redirect:/dashboard";
	  }//remove
	 
}//songController
