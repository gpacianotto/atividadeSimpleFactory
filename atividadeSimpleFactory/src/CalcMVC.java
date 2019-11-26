/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class CalcMVC {
    
    public static void main(String[] args){
        
        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        CalcController a = new CalcController(model,view);
        
        view.setVisible(true);
        
    }
    
}
