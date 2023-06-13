package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mitocode.model.Patient;
import com.mitocode.repo.IPatientRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {

	// @Autowired
	private final IPatientRepo repo;

	@Override
	public Patient save(Patient patient) {
		return repo.save(patient);
	}

	@Override
	public Patient update(Patient patient) {
		return repo.save(patient);
	}

	@Override
	public List<Patient> listAll() {
		return repo.findAll();
	}

	@Override
	public Patient findById(Integer id) {
		Optional<Patient> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Patient();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
