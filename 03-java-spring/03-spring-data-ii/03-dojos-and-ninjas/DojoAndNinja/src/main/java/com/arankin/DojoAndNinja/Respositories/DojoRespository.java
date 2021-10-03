package com.arankin.DojoAndNinja.Respositories;


import java.util.List;
import com.arankin.DojoAndNinja.Models.Dojo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DojoRespository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
	


}
