package Familia;

public abstract class Familia {
 
 
	protected int numLibroDeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
 
	public Familia() {
 
		this.numLibroDeFamilia = 5684;
		this.direccion = "La Granja";
		this.poblacion = "Seseña";
		this.provincia = "Toledo";
 
	}
 
	public int getNumLibroDeFamilia() {
		return numLibroDeFamilia;
	}
 
	public void setNumLibroDeFamilia(int numLibroDeFamilia) {
		this.numLibroDeFamilia = numLibroDeFamilia;
	}
 
	public String getDireccion() {
		return direccion;
	}
 
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 
	public String getPoblacion() {
		return poblacion;
	}
 
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
 
	public String getProvincia() {
		return provincia;
	}
 
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
 
	public void mostrarInfoGeneral() {
		System.out.println("El libro de familia es: " + this.getNumLibroDeFamilia()
				+ " con direccion en: " + this.getDireccion() + " y la poblacion es:    "
				+ this.getPoblacion() + "    provincia de:   " + this.getProvincia());
 
	}
 

 
	public abstract float imc();
 
}