package pio.daw.GarciaGonzalo.encriptador;
import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceGarciaGonzalo {
	 private BasicPasswordEncryptor passwordEncryptor;

	    public PwServiceGarciaGonzalo() {
	        this.passwordEncryptor = new BasicPasswordEncryptor();
	    }

	    public String encriptarContrasena(String contrasena) {
	        return passwordEncryptor.encryptPassword(contrasena);
	    }

	    public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
	        return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	    }
	}

