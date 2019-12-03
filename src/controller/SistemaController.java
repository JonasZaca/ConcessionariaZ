
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ArquivoModel;
import model.ClienteModel;
import model.LoginModel;
import model.SistemaModel;
import view.InfoProj;
import view.LoginView;
import view.RemoverView;
import view.SistemaView;

/**
 *
 * @author Jonas Zacari
 */
public class SistemaController {

    SistemaView view;
    SistemaModel model;
    ArquivoModel arquivo;
    RemoverView remover;
    
    public SistemaController(SistemaView view, SistemaModel model, ArquivoModel arquivo) {
        this.view = view;
        this.model = model;
        this.arquivo = arquivo;
        this.remover = new RemoverView();
        
        this.arquivo.lerArquivo(this.model);
        
        this.view.getjTable1().setModel(this.model.AtualizarTabela());
        this.view.getjMenuInfo().addActionListener(new Info());
        this.view.getDeslogar().addActionListener(new AcaoDeslogar());
        this.view.getBtVerificarEntrada().addActionListener(new AcaoEntrada(this.view, this.arquivo));
        this.view.getBtVerificarSaida().addActionListener(new Verificar(this.model, this.view, this.remover));
        this.remover.getjRemoverCli().addActionListener(new RemoverAutomovel(remover,this.model,this.view,this.arquivo));
    }
    
    class AcaoEntrada implements ActionListener{
        SistemaView view;
        ArquivoModel arquivo;
        AcaoEntrada(SistemaView view,ArquivoModel arquivo ){
            this.view = view;
            this.arquivo = arquivo;
        }
        
   
        @Override
        public void actionPerformed(ActionEvent ae) {
            int res = 2;
            Date data = new Date();
            SimpleDateFormat dataNova = new SimpleDateFormat("dd/MM/YYYY");
            SimpleDateFormat horaNova = new SimpleDateFormat("H:mm");
           
            view.setAvisoNome(" ");
            view.setAvisoPlaca(" ");
            view.setAvisoCpf(" ");
            view.setAvisoTel(" ");
            
            if(view.getTxNome().isEmpty()){
                view.setAvisoNome("Campo obrigatorio");
                res = 3;
            }
            if(view.getTxPlaca().isEmpty()){
                view.setAvisoPlaca("Campo obrigatorio");
                res = 3;
            }
            if(view.getTxtCPF().isEmpty()){
                view.setAvisoCpf("Campo obrigatorio");
                res = 3;
            }
            if(view.getTxTel().isEmpty()){
                view.setAvisoTel("Campo obrigatorio");
                res = 3;
            }
            if(res == 2){
                
                if(view.getTxNome().length() < 2){
                    JOptionPane.showMessageDialog(null, "ERRO: Campo Tipo muito curto. Minimo de 3 letras.");
                    res = 3;
                }
                if(view.getTxPlaca().length() != 8){
                    JOptionPane.showMessageDialog(null, "ERRO: Campo PLACA precisa de 8 digitos. Exemplo de Placa: KKK-7777");
                    res = 3;
                }
                if(res == 2){
                    res = model.adicionar(view.getTxPlaca(),view.getTxtCPF(), view.getTxTel(),dataNova.format(data),horaNova.format(data),view.getTxNome());
            
                    if(res != 0){
                        this.view.getjTable1().setModel(model.AtualizarTabela());
                        this.arquivo.escreverArquivo(model);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERRO: Carro com esta PLACA ja está cadastrado");
                    }
                }
            }
        }
    }
    class AcaoDeslogar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.dispose();
            LoginView view = new LoginView();
            LoginModel model = new LoginModel();
            LoginController control = new LoginController(view,model);
            view.setVisible(true);
        }
    }
    
    class Verificar implements ActionListener{
        SistemaModel model;
        SistemaView view;
        RemoverView removerView;
        Verificar(SistemaModel model, SistemaView view,RemoverView removerView){
            this.model = model;
            this.view = view;
            this.removerView = removerView;;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
           int res = 2;
           view.setAvisoPlacaSaida(" ");
           if(view.getTxPlacaSaida().isEmpty()){
               view.setAvisoPlacaSaida("Campo Obrigatorio!");
               res = 3;
           }
           if(res == 2){
                int pos = model.pesquisar(view.getTxPlacaSaida());
                if(pos >= 0){
                    int divida = this.model.cacularDivida(pos);
                    this.removerView.transferirInfo(pos, model, divida);
                    this.removerView.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null," Veiculo não encontrado!");
                }
           }
        }
    }
    
    class RemoverAutomovel implements ActionListener{
        
        SistemaModel model;
        SistemaView view;
        ArquivoModel modelArq;
        RemoverView remoView;
        RemoverAutomovel(RemoverView remoView, SistemaModel model, SistemaView view, ArquivoModel modelArq){
            this.model = model;
            this.view = view;
            this.modelArq = modelArq;
            this.remoView = remoView;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            model.remover(remoView.getPos());
            arquivo.escreverArquivo(model);
            this.view.getjTable1().setModel(model.AtualizarTabela());
            remoView.dispose();
            JOptionPane.showMessageDialog(null,"Veiculo Vendido!");
        }
    }
    
    class Info implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            InfoProj proj = new InfoProj();
            proj.setVisible(true);
        }
    }
}
