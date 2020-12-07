package com.example.GestionCollectionAlbums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GestionCollectionAlbums.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
