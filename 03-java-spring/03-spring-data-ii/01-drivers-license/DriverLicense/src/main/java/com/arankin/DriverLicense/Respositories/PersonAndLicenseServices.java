package com.arankin.DriverLicense.Respositories;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arankin.DriverLicense.Models.License;
import com.arankin.DriverLicense.Models.Person;
import com.arankin.DriverLicense.Respositories.*;


@Service
public class PersonAndLicenseServices {	
	
	@Autowired
	private final PersonRepository personRepos;
	
	@Autowired
	private final LicenseRepository licenseRepos;
	

	/*=====================================*/
	// Constructor
	/*=====================================*/	
	public PersonAndLicenseServices(PersonRepository p, LicenseRepository l) {
			this.personRepos = p;
			this.licenseRepos = l;
		}
	

	/*=====================================*/
	// Method: getPerson() 
	/*=====================================*/	
	public Person getPerson(Long id) {
			return personRepos.findById(id).orElse(null);
		}

		
	/*=====================================*/
	// Method: personList() 
	/*=====================================*/		
	public List<Person> personList() {
		return personRepos.findAll();
	}

	
	/*=====================================*/
	// Method: createPerson() 
	/*=====================================*/
	public Person createPerson(Person p) {
	return personRepos.save(p);
    }		

	
	/*=====================================*/
	// Method: getPeopleWithNoLicense() 
	/*=====================================*/
	public List<Person> getPeopleWithNoLicense() {
		return personRepos.peopleWithNoLicense();
	}

	
	/*=====================================*/
	// Method: createLicense() 
	/*=====================================*/
	public License createLicense(License l) {  						
		return licenseRepos.save(l);
	}

	
	/*=====================================*/
	// Method: longFormat() 
	/*=====================================*/		
	  public static String longFormat (long n, int numOfDigits) {
		    char[] zeros = new char[numOfDigits];
		    Arrays.fill(zeros, '0');
		    DecimalFormat df = new DecimalFormat(String.valueOf(zeros));
		    return df.format(n);
		  }	
}//LicenseServices
