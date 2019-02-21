package aplicationController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class VentanaController {

	@FXML
    private Label lbl_NombreCliente;

    @FXML
    private Label lbl_cedula;

    @FXML
    private Label lbl_email;

    @FXML
    private Label lbl_direccion;

    @FXML
    private Label lbl_telefono;
    
    
    ClienteController cc;
    
    public void recibirCliente(ClienteController ccc, String nombre, String dir, String ced, String email, String tel) {
    	lbl_NombreCliente.setText(nombre);
    	lbl_cedula.setText(ced);
    	lbl_direccion.setText(dir);
    	lbl_email.setText(email);
    	lbl_telefono.setText(tel);    	
    	cc=ccc;
    }
    
    
    
    
    
    @FXML
    void cargarInformacion() {
    	  	
    	    	
    }

    @FXML
    void txt_nombreCliente() {

    }

	   

}
