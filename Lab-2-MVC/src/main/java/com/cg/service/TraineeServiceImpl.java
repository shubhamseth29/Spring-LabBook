package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeDAO;
import com.cg.entities.Trainee;
import com.cg.exception.TraineeAlreadyExist;
import com.cg.exception.TraineeNotFound;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService{

	private ITraineeDAO traineeDao;
	
	public ITraineeDAO getTraineeDao() {
		return traineeDao;
	}
	
	@Autowired
	public void setTraineeDao(ITraineeDAO traineeDao) {
		this.traineeDao = traineeDao;
	}

	public void addTrainee(Trainee trainee) {
		if(traineeDao.retrieveTrainee(trainee.getTraineeId())==null) {
		traineeDao.addTrainee(trainee);
		}
		else {
			throw new TraineeAlreadyExist("Trainee is already Exist with the Id :"+trainee.getTraineeId());
		}
	}

	public void deleteTrainee(Trainee trainee) {
		traineeDao.deleteTrainee(trainee);
	}

	public void updateTrainee(Trainee trainee) {
		traineeDao.updateTrainee(trainee);
		
	}

	public Trainee retrieveTrainee(int id) {
		Trainee trainee = traineeDao.retrieveTrainee(id);
		if(trainee==null) {
			throw new TraineeNotFound("No such Trainee is present with id :"+id);
		}
		return trainee;
	}

	public List<Trainee> retrieveAll() {
		List<Trainee> list = traineeDao.retrieveAll();
		return list;
	}
	public boolean loginVerify(String username,String password) {
		boolean login = traineeDao.loginVerify(username,password);
		return login;
	}


}