package com.rev.dao;

import java.util.List;

import com.rev.beans.Bear;

public interface BearDao {
	
	public List<Bear> getBears();
	public Bear getBearById(int id);
	public Double feedBear(int bearId, int hiveId, double amt);
}