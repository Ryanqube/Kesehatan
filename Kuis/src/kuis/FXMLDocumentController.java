/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Nayang Albik B
 */
public abstract class FXMLDocumentController implements Initializable {
    
   String Nama, Tinggi;
   int Berat,  berattotal, Height;
    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField berat;
    
    @FXML
    private RadioButton cewek;

    @FXML
    private ToggleGroup kk;

    @FXML
    private RadioButton laki;
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
    void hapus(ActionEvent event) {
       nama.setText("");
       tinggi.setText("");
       berat.setText("");
       hasil1.setText("");
       hasil2.setText("");
       beratideal.setText("");
    }

    @FXML
    private void lanjut(ActionEvent event) {
         int beratIdeal = 0;
         String hasil1 = null;
         String hasil2 = null;
         
        if(laki.isSelected()){     
           beratIdeal = parseInt(tinggi.getText()) - 105;
        }
         if(cewek.isSelected()){     
           beratIdeal = parseInt(tinggi.getText()) - 110;
        }
         
        beratideal.setText(""+beratIdeal);
        
        if(beratIdeal == parseInt(tinggi.getText())){
            hasil1 = "ideal";
            hasil2 = "lanjutkan";

    }
        else if(beratIdeal > parseInt(tinggi.getText())){
            hasil1 = "Overweight";
            hasil2 = "Kurangi makan";
    }
        else if(beratIdeal < parseInt(tinggi.getText())){
            hasil1 = "Underweight";
            hasil2 = "tambah makannya";
        }
        
    }
}


