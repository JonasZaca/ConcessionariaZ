package model;

import view.LoginView;

/**
 *
 * @author Jonas Zacari
 */
public class LoginModel {
    
    public int verificar(LoginView view){
    
        if(view.getEmailUsu().equals("jonas@gmail.com") && view.getSenhaUsu().equals("123")){
            return 1;
        }
        return 0;
    }
}
