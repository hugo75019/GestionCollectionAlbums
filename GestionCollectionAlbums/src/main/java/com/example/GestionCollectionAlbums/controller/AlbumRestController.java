package com.example.GestionCollectionAlbums.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionCollectionAlbums.model.Album;
import com.example.GestionCollectionAlbums.services.AlbumService;

@RestController

public class AlbumRestController {
	
	@Autowired
	private AlbumService service;
	
	@GetMapping("/AlbumList") //Affiche la liste des albums de la collection
	public  List<Album> getAlbumList(){
		List<Album> albums = new ArrayList<Album>();
		albums = service.getalbumList();
		return albums;
	}
	
	@GetMapping("/albumList/{id}") //Affiche un album selon son identifiant
	public  Album getAlbum(@PathVariable int id){
		return service.getAlbumById(id).get();
	}
	
	@PostMapping("/addAlbum") //Ajoute un nouvel album
	public Album addAlbum(@RequestBody Album album ){
		return service.newAlbum(album);
		
	}
	
	@GetMapping("/deleteAlbum/{id}") //Ajoute un nouvel album
	public String deleteAlbum(@PathVariable int id ){
		return service.deleteAlbumById(id);
	}
}
