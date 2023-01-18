package com.salesaplication2.service;

import java.util.List;

import com.salesaplication2.entity.Lead;

public interface LeadServices {

	public List<Lead> getDataFromDatabase();

	public void storeData(Lead lead);

	public void deleteOneData(long id);

	public Lead getAllId(long id);



}
