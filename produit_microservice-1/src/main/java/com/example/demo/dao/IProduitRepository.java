package com.example.demo.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Produit;

@Repository
public interface IProduitRepository extends MongoRepository<Produit, Long> {
	
	
	//public Page<Produit> produitParMC(@Param("x")String mc,Pageable p);
	public List<Produit> findByDesignation(String des);
	public Page<Produit> findByDesignation(String des, Pageable p);

	/*@Query(value="{designation:'{$regex: ?0, $options:'i'}}")
	public List<Produit> produitParMC(String designation);
	
	@Query(value="{designation:'{$regex: ?0, $options:'i'}}")
	public Page<Produit> produitParMC(String designation,Pageable p);
	
	public List<Produit> findByDesignation(String des);
	public Page<Produit> findByDesignation(String des, Pageable p);*/

}
