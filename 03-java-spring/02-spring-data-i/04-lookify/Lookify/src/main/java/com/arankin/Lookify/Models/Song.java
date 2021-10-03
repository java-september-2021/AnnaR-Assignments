package com.arankin.Lookify.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;


@Entity  //This entity relates to a database
@Table(name="songs")
public class Song {
	
	
	@Id //Means the primary key will be auto-generated.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
	@NotNull
    private String title; 

	@NotNull
    @Size(min = 2, max = 50)
    private String artist;
   
	@NotNull
    private int rating; 
    

    @Column(updatable=false) //This is to ensure data is not updated every time the object is created    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
   
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
    //----------------------    
    //Constructors
    //----------------------    
    public Song() {
        
    }

	public Song(String title, String artist,int rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}
	
    //----------------------
    //Getters and Setters
    //----------------------	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}    	

}//class Song
