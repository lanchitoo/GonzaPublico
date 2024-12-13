package pio.daw.GarciaGonzalo.encriptador;

public class PwServiceGarciaGonzaloTest {
	    public static void main(String[] args) {
	        PwServiceGarciaGonzalo servicio = new PwServiceGarciaGonzalo();

	        // Contraseña a encriptar
	        String password = "miSuperPassword";
	        String passwordEncriptada = servicio.encriptarContrasena(password);

	        // Imprimimos la contraseña encriptada
	        System.out.println("Prueba de alumno Garcia");
	        System.out.println("La contraseña encriptada es: " + passwordEncriptada);

	        // Verificamos si la contraseña es válida
	        boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
	        System.out.println("La contraseña encriptada es válida: " + esValida);
	    }
	}
