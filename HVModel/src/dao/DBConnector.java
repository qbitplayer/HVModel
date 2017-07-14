package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.Mascota;
import model.Person;

public class DBConnector  extends DBManager implements HVServices{

	
	
	
	// Miquel 
	@Override
	public void insert(Person owner, Mascota mascota) {
		// TODO Auto-generated method stub
	}

	// Jordi 
	@Override
	public void remove(Mascota mascota) {
		// TODO Auto-generated method stub
		
	}

	//Jordi //Luis
	@Override
	public void remove(Person owner) {
		// TODO Auto-generated method stub
		
	}

	//Toni 
	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	//Toni //Eduar 
	@Override
	public void update(Mascota mascota) {
		// TODO Auto-generated method stub
		
	}

	//Eduard 
	@Override
	public HashSet<Person> findLikeByOwnerName(String strLike) {
		// TODO Auto-generated method stub
		return null;
	}

	//Luis 
	@Override
	public HashSet<Mascota> findMascota(int idPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	//Dorian 
	@Override
	public HashSet<Person> selectAllPerson() {
		HashSet<Person> list =null;				 	
		connect();		
			list = new HashSet<Person>(selectAll(Person.class));			
		close();	
		return list;
	}

	//Dorian 
	@Override
	public HashSet<Mascota> selectAllMascota() {
		HashSet<Mascota> list =null;		
			
		connect();		
			list = new HashSet<Mascota>(selectAll(Mascota.class));			
		close();	
		return list;
	}

}
