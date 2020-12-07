package com.example.GestionCollectionAlbums.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionCollectionAlbums.model.Album;
import com.example.GestionCollectionAlbums.repository.AlbumRepository;

@Service
public class AlbumService {
	@Autowired
	private AlbumRepository repo;
	
	public List<Album> getalbumList(){
		return repo.findAll();
	}
	
	public Album newAlbum(Album album) {
		return repo.save(album);
	}
	
	public Optional<Album> getAlbumById(int id) {
		
		return repo.findById(id);
	}
	
	public String deleteAlbumById(int id){
		String res;
		try {
			repo.deleteById(id);
			res = "L'album a été supprimé !";
		} catch (Exception e) {
			res = "Impossible de supprimer cet album !";
		}
		return res;
	}
}