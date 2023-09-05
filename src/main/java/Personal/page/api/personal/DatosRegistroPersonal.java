package Personal.page.api.personal;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPersonal(
		@NotBlank String Nombres, 
		@NotBlank String Apellidos, 
		@NotBlank String Direccion, 
		@NotBlank String Telefono, 
		@NotBlank String Puesto, 
		@NotBlank String Fecha_Contratacion, 
		@NotBlank String Salario) 
{

		
		
	}
