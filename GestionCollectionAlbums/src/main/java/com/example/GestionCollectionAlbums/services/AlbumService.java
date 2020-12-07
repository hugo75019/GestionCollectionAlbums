package com.example.GestionCollectionAlbums.services;

import java.util.List;

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
}
