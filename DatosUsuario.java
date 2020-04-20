
public class DatosUsuario {
public DatosUsuario() {
	
}
String usuari1="";
String password1="";
public int probarPass() {
	usuari1=Ventana1.txtUsuario.getText();
	password1=Ventana1.pss_contrasenia.getText();
	if(usuari1.equals("Iteran") && password1.equals("Polo")) {
		return 1;	
	}
	else {
		return 0;
	}
	
}
}
