/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Nayang Albik B
 */
public class FXMLKesehatanController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField berat;
    @FXML
    private JFXButton Proses;
    @FXML
    private JFXButton Reset;
    @FXML
    private TextArea beratideal;
    @FXML
    private TextArea hasil1;
    @FXML
    private TextArea hasil2;
    @FXML
    private RadioButton cewek;
    @FXML
    private ToggleGroup kk;
    @FXML
    private RadioButton laki;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lanjut(ActionEvent event) {
        
         int beratIdeal = 0;
         String mo = null;
         String mi = null;
         
        if(laki.isSelected()){     
           beratIdeal = parseInt(tinggi.getText()) - 105;
        }
         if(cewek.isSelected()){     
           beratIdeal = parseInt(tinggi.getText()) - 110;
        }
         
        beratideal.setText(""+beratIdeal);
        
        if(beratIdeal == parseInt(tinggi.getText())){
            mo = "ideal";
            mi = "lanjutkan";

    }
        else if(beratIdeal > parseInt(tinggi.getText())){
            mo = "Overweight";
            mi = "Kurangi makan";
    }
        else if(beratIdeal < parseInt(tinggi.getText())){
            mo = "Underweight";
            mi = "tambah makannya";
        }
        
        hasil1.setText(mo);
        hasil2.setText(mi);
    }
    
    @FXML
    private void hapus(ActionEvent event) {
         nama.setText("");
       tinggi.setText("");
       berat.setText("");
       hasil1.setText("");
       hasil2.setText("");
       beratideal.setText("");
       laki.setSelected(false);
       cewek.setSelected(false);
    }
    
}
