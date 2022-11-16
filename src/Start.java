import Familia.Personas;

public class Start {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Personas persona1 = new Personas();
		Personas persona2 = new Personas();
		Personas persona3 = new Personas();

 		persona1.setNombre("Petra");
		persona1.setEdad(54);
		persona1.setDni("14542651P");
		persona1.setSexo("Mujer");
		persona1.setPeso(97);
		persona1.setAltura(1.64f);
 
		persona2.setNombre("Isidro");
		persona2.setEdad(57);
		persona2.setDni("14542651I");
		persona2.setSexo("Hombre");
		persona2.setPeso(94);
		persona2.setAltura(1.72f);
 
		persona3.setNombre("Raul");
		persona3.setEdad(25);
		persona3.setDni("14542651R");
		persona3.setSexo("Hombre");
		persona3.setPeso(80);
		persona3.setAltura(1.82f);
 
 
		persona1.mostrarInfoGeneral();
		persona1.mostrarInfoPersonal();
 
		System.out.println(" El IMC es " + persona1.imc());
 
		persona2.mostrarInfoGeneral();
		persona2.mostrarInfoPersonal();
 
		System.out.println(" El IMC es " + persona2.imc());
 
		persona3.mostrarInfoGeneral();
		persona3.mostrarInfoPersonal();
 
		System.out.println(" El IMC es " + persona3.imc());
 
	}
 
}