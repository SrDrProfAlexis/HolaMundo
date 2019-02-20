package aplicationController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController {

    @FXML
    private TextField txt_cedula;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_direccion;

    @FXML
    private TextField txt_telefono;

    @FXML
    void aceptar() 
    {
    	
    	
    	
    }
    
    @FXML
    void cancelar() {
    	try {
    		//dirigir a otro formulario
        	FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../aplicationFxml/AppInicio.fxml"));
        	Parent root1= (Parent)fxmlLoader.load();
        	Stage stage= new Stage();
        	stage.setScene(new Scene(root1));
        	stage.show();
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
    }
    
    
    
}
    
