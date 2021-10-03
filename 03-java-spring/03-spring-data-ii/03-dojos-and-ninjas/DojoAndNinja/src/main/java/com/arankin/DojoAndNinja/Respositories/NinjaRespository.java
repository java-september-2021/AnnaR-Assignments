package com.arankin.DojoAndNinja.Respositories;


import java.util.List;
import com.arankin.DojoAndNinja.Models.Ninja;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NinjaRespository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();

}//NinjaRespository

