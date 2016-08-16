package javafx_adm_sql;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author <Gabriel Mello de Oliveira
 */

public class FXMLDocumentController implements Initializable
{   
    @FXML private Label Nome_BD;
    
    @FXML private Button Executar;
    
    @FXML private TextArea Codigo;
    
    @FXML
    private void Executar_SQL(ActionEvent event)
    {
        //Confere se o código SQL é válido
        if(Codigo.getSelectedText() == "SELECT * FROM Tabela")
        {
            
        }    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
