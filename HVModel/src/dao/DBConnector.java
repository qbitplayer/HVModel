package dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import model.Mascota;
import model.Person;

public class DBConnector  extends DBManager implements HVServices{

	
	
	
	// Miquel 
	@Override
	public void insert(Person owner, Mascota mascota) {

		
	}

	// Jordi 
	@Override
	public void remove(Mascota mascota) {
		// TODO Auto-generated method stub
		
	}

	//Jordi //Luis
	
	
	@Override
	public void remove(Person owner) {		
		connect();
			EntityManager entiManager = getEntityManager();		
			entiManager.getTransaction().begin();						
			Person  recovered = entiManager.find(Person.class, owner.getId());
			entiManager.remove(recovered);
			entiManager.getTransaction().commit();			
		close();		
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
		connect();
		HashSet<Mascota> pet = new HashSet<Mascota>();
		pet.add( this.getEntityManager().find(Mascota.class, idPerson));
		close();
		return pet;
	}

	//Dorian 
	@Override
	public HashSet<Person> selectAllPerson() { 
		//connect();
		//	HashSet<Person> list = new HashSet<>(selectAll(Person.class));
		//close();
		return null;//list;
	}

	//Dorian 
	@Override
	public HashSet<Mascota> selectAllMascota() {
		// TODO Auto-generated method stub
		return null;
	}

}
