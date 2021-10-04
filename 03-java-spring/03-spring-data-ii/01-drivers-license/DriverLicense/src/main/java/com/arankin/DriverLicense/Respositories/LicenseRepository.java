package com.arankin.DriverLicense.Respositories;

import com.arankin.DriverLicense.Models.License;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface LicenseRepository extends CrudRepository<License, Long>{
		List<License> findAll();
	
}//LicenseRepository

