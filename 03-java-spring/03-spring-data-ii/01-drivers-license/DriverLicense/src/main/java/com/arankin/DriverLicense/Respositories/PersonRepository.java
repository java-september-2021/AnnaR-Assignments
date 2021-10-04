package com.arankin.DriverLicense.Respositories;

import com.arankin.DriverLicense.Models.Person;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long>{
		List<Person> findAll();

		@Query(value="SELECT per.* FROM persons per LEFT OUTER JOIN licenses l ON per.id = l.person_id WHERE l.id IS NULL", nativeQuery=true)
		List<Person> peopleWithNoLicense();	
	
}//PersonRepository
