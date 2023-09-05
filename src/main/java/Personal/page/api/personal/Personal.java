package Personal.page.api.personal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Personal")
@Entity(name = "Persona")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nombres;
	private String Apellidos;
	private String Direccion;
	private String Telefono;
	private String Puesto;
	private String Fecha_Contratacion;
	private String Salario;
	private String Fecha_Despido;
	
	public Personal(DatosRegistroPersonal datosregistropersonal) {
		
		this.Nombres = datosregistropersonal.Nombres();
		this.Apellidos = datosregistropersonal.Apellidos();
		this.Direccion = datosregistropersonal.Direccion();
		this.Telefono = datosregistropersonal.Telefono();
		this.Puesto = datosregistropersonal.Puesto();
		this.Fecha_Contratacion = datosregistropersonal.Fecha_Contratacion();
		this.Salario = datosregistropersonal.Salario();	
	}
	
}
