package com.example.GestionCollectionAlbums.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Album {
	@Id
	private int id;
	private String artist;
	private String title;
	private int price;
	private String type;
	private String genre;
	
	

	public Album() {
	}
	
	public Album(int id, String artist, String title, int price, String type, String genre) {
		super();
		this.id = id;
		this.artist = artist;
		this.title = title;
		this.price = price;
		this.type = type;
		this.genre = genre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
