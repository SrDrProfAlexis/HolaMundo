package aplicationController;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AppInicioController {

	@FXML
    private Button btn_cerrar;
	
    @FXML
    private TextField txt_Usuario;

    @FXML
    private PasswordField txt_Contrasenia;

    @FXML
    void acceder() throws IOException {    	
    	if (validarCampos())
    	{
    		if(validaAcceso()) {
    			Alert alert1 = new Alert(AlertType.INFORMATION);
    			alert1.setTitle("Inicio");
            	alert1.setHeaderText("Bienvenido");
            	alert1.setContentText("acceso confirmado");
            	alert1.showAndWait();
            	try {
            		//dirigir a otro formulario
                	FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../aplicationFxml/Cliente.fxml"));
                	Parent root1= (Parent)fxmlLoader.load();
                	Stage stage= new Stage();
                	stage.setScene(new Scene(root1));
                	stage.show();
                	
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
            	
    		}else {
    			Alert alert = new Alert(AlertType.WARNING);
    			alert.setTitle("Inicio");
            	alert.setHeaderText("Error de auntentificacion");
            	alert.setContentText("El usuario y/o contraseña son incorrectos");
            	alert.showAndWait();
    		}
    		
        	//dirigir a otro formulario
    		
    	}else {
    		Alert alert = new Alert(AlertType.WARNING);
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

