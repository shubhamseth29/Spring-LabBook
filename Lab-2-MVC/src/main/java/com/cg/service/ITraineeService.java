package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;

public interface ITraineeService {
	
	void addTrainee(Trainee trainee);
	void deleteTrainee(Trainee trainee);
	void updateTrainee(Trainee trainee);
	Trainee retrieveTrainee(int id);
	List<Trainee> retrieveAll();
	public boolean loginVerify(String username,String password);

}
