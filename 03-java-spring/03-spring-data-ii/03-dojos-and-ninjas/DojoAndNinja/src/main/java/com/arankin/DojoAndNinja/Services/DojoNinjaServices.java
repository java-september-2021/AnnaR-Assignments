package com.arankin.DojoAndNinja.Services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.arankin.DojoAndNinja.Models.Dojo;
	import com.arankin.DojoAndNinja.Models.Ninja;

	import com.arankin.DojoAndNinja.Respositories.*;


	@Service
	public class DojoNinjaServices {
		@Autowired
		private final DojoRespository dojoRepos;
		
		@Autowired
		private final NinjaRespository ninjaRepos;

		public DojoNinjaServices (DojoRespository dojoRepos, NinjaRespository ninjaRepos) {
			this.dojoRepos = dojoRepos;
			this.ninjaRepos = ninjaRepos;
		}
		
		//--------------
		//Dojo Services
		public Dojo getDojo(Long id) {
			return dojoRepos.findById(id).orElse(null);
		}
		public List<Dojo> dojoList() {
			return dojoRepos.findAll();
		}
		
		public Dojo createDojo(Dojo dj) {
		return dojoRepos.save(dj);
	    }	
		
		//--------------
		//Ninja Services
		public Ninja getNinja(Long id) {
			return ninjaRepos.findById(id).orElse(null);
		}
		public List<Ninja> ninjaList() {
			return ninjaRepos.findAll();
		}
		
		public Ninja createNinja(Ninja nj) {
		return ninjaRepos.save(nj);
	    }	
		


	}// Dojo and Ninja Services
