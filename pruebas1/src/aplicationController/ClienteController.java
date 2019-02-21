package aplicationController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
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
    
    ClienteController clco;
    
    @FXML
    void aceptar() 
    {
    	try {
    		Stage stg = new Stage();
        	FXMLLoader loader = new FXMLLoader();
        	AnchorPane root = (AnchorPane)loader.load(getClass().getResource("../aplicationFxml/Ventana.fxml").openStream());
        	VentanaController vcc = (VentanaController)loader.getController();
        	vcc.recibirCliente(clco, txt_nombre.getText(), txt_direccion.getText(), txt_cedula.getText(), txt_email.getText(), txt_telefono.getText());
        	Scene scene = new Scene(root);
        	stg.setScene(scene);
        	stg.alwaysOnTopProperty();
        	stg.initModality(Modality.APPLICATION_MODAL);
        	stg.show();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
    	
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
    
