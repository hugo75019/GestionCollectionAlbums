package com.example.GestionCollectionAlbums.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionCollectionAlbums.model.Album;
import com.example.GestionCollectionAlbums.services.AlbumService;

@RestController

public class AlbumRestController {
	
	@Autowired
	private AlbumService service;
	
	@GetMapping("/AlbumList")
	public  List<Album> getAlbumList(){
		List<Album> albums = new ArrayList<Album>();
		albums = service.getalbumList();
		return albums;
	}
	
}
