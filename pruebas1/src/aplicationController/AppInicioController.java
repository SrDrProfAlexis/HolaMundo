package aplicationController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AppInicioController {

	@FXML
    private Button btn_cerrar;
	
    @FXML
    private TextField txt_Usuario;

    @FXML
    private PasswordField txt_Contrasenia;

    @FXML
    void acceder() {
    	Alert alert = new Alert(AlertType.WARNING);
    	
    	if (validarCampos())
    	{
    		if(validaAcceso()) {
    			alert.setTitle("Inicio");
            	alert.setHeaderText("Bienvenido");
            	alert.setContentText("acceso confirmado");
            	alert.showAndWait();
    		}else {
    			alert.setTitle("Inicio");
            	alert.setHeaderText("Error de auntentificacion");
            	alert.setContentText("El usuario y/o contraseña son incorrectos");
            	alert.showAndWait();
    		}
    		
        	//dirigir a otro formulario
    	}else {
    		alert.setTitle("Inicio");
        	alert.setHeaderText("No se completaron todos los campos");
        	alert.setContentText("Uno de los campos de este formulario esta vacio");
        	alert.showAndWait();
    	}
    }

    @FXML
    void cancelar(){
    	System.exit(0);
    }
    
    private boolean validarCampos() {
    	boolean valida = false;
    	if(txt_Usuario.getText().trim().isEmpty()) {
    		valida = false;
    	}else if(txt_Contrasenia.getText().trim().isEmpty()){
    		valida = false;
    	}else {
    		valida = true;
    	}
    	return valida;
    }
    private boolean validaAcceso() {
    	boolean valida = false;
    	if(txt_Usuario.getText().equals("admin") && txt_Contrasenia.getText().equals("123"))
    		valida = true;
    	else
    		valida = false;
    	    	
    	return valida;
    }

}

