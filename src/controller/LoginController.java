package controller;


import view.SistemaView;
import view.LoginView;
import model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ArquivoModel;
import model.SistemaModel;

/**
 *
 * @author Jonas Zacari
 */
public class LoginController {
    private LoginView view;
    private LoginModel model;
    
    public LoginController(LoginView view, LoginModel model){
        this.model = model;
        this.view = view;
        this.view.getEntrar().addActionListener(new verificarListener(this.view));
    }
    // Açao que é adicionada no botao entrar do view.
    class verificarListener implements ActionListener{
        LoginView view;
        verificarListener(LoginView view){
            this.view = view;
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.setAvisoEmail(" ");
            view.setAvisoSenha(" ");
            int res = model.verificar(this.view);
            if(res == 1){
                view.dispose();
                 
                SistemaView view = new SistemaView();
                SistemaModel model = new SistemaModel();
                ArquivoModel arquivo = new ArquivoModel();
                SistemaController controller = new SistemaController(view,model,arquivo);
                view.setVisible(true);
              
            }else if(view.getEmailUsu().isEmpty() || view.getSenhaUsu().isEmpty()){
                if(view.getEmailUsu().isEmpty()){
                    view.setAvisoEmail("Email vazio!");
                }
                if(view.getSenhaUsu().isEmpty()){
                    view.setAvisoSenha("Senha vazia!");
                }  
            }
            else{
              JOptionPane.showMessageDialog(null, "Senha ou Email incorretos");   
            }
        }
    }
    
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginModel model = new LoginModel();
        LoginController control = new LoginController(view,model);
        view.setVisible(true);
    }
}