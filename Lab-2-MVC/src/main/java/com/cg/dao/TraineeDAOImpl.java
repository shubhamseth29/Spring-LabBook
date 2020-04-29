package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDAOImpl implements ITraineeDAO {
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	public void deleteTrainee(Trainee trainee) {
		entityManager.remove(entityManager.find(Trainee.class, trainee.getTraineeId()));
		
	}

	public void updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		
	}

	public Trainee retrieveTrainee(int id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		return trainee;
	}

	public List<Trainee> retrieveAll() {
		  String jql = "from Trainee";
	      TypedQuery<Trainee> query = entityManager.createQuery(jql, Trainee.class);
	      List<Trainee> list = query.getResultList();
	      return list;
	}
	
	public boolean loginVerify(String username,String password) {
		
		if(username.equals("user1") || password.equals("password")) {
			return true;
		}
	
		return false;
	}
}
