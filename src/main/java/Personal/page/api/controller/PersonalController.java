package Personal.page.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Personal.page.api.personal.DatosRegistroPersonal;
import Personal.page.api.personal.Personal;
import Personal.page.api.personal.PersonalRepository;

@RestController
@RequestMapping("/personal")
public class PersonalController {
	
	@Autowired
	private PersonalRepository personalrepository;
	
	@PostMapping
	public void RegistrarPersonal(@RequestBody DatosRegistroPersonal datosregistropersonal) {
		
		System.out.println("El request llego correctamente");
		System.out.println(datosregistropersonal);
		personalrepository.save(new Personal(datosregistropersonal));
		
	}
	
}
