
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class CalcController {
    
    private CalcModel m_model;
    private CalcView m_view;
    
    CalcController(CalcModel model, CalcView view){
        m_model = model;
        m_view = view;
        
        view.addMultiplyListener(new MultiplyListener());
        view.addClearListener(new ClearListener());
        
        
    }
    
    class MultiplyListener implements ActionListener{
        public void ActionPerformed(ActionEvent e)
        {
            String userInput = "";
            try{
                userInput = m_view.getUserInput();
                m_model.multiplyBy(userInput);
                m_view.setTotal(m_model.getValue());
            }catch(NumberFormatException nfex){
                
                m_view.showError("Bad Input: '"+ userInput + "'");
                
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            m_model.reset();
            m_view.reset();
        }
    }
    
}
