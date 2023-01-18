package com.salesaplication2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesaplication2.entity.Lead;
import com.salesaplication2.repository.LeadRepository;
@Service
public class LeadServicesImpl implements LeadServices {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public List<Lead> getDataFromDatabase() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public void storeData(Lead lead) {
		// TODO Auto-generated method stub
		leadRepo.save(lead);
	}

	@Override
	public void deleteOneData(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
	}

	@Override
	public Lead getAllId(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		if( findById.isPresent()) {
			 Lead lead = findById.get();
			 return lead;
		}
		return null;
	}


}
