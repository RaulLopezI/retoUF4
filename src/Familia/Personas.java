package Familia;



public class Personas extends Familia {
 
	
 
	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;
 
	// Constructor
 
	public Personas() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0.0f;
 
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public int getEdad() {
		return edad;
	}
 
	public void setEdad(int edad) {
		this.edad = edad;
	}
 
	public String getDni() {
		return dni;
	}
 
	public void setDni(String dni) {
		this.dni = dni;
	}
 
	public String getSexo() {
		return sexo;
	}
 
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
 
	public float getPeso() {
		return peso;
	}
 
	public void setPeso(int peso) {
		this.peso = peso;
	}
 
	public float getAltura() {
		return altura;
	}
 
	public void setAltura(float altura) {
		this.altura = altura;
	}
 
 
	public void mostrarInfoPersonal() {
		System.out.println(" Me llamo " + this.getNombre() + "  tengo  " + this.getEdad() + " años" + "  mi DNI es"
				+ this.getDni() + "   ,soy " + this.getSexo() + "   mi peso es " + this.getPeso() + " KG "
				+ "    y mido " + this.getAltura() + " metros");
	}
 
	@Override
	public float imc() {
		// TODO Auto-generated method stub
		float imc;
		imc = peso / (altura * altura);
		return imc;
	}
 
}
