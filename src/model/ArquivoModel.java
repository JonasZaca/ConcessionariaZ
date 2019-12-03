
package model;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ArquivoModel {
    
    public void lerArquivo(SistemaModel sistModel){
        
        try{
            FileReader leitor = new FileReader("Info-veiculos.txt");
            BufferedReader ler = new BufferedReader(leitor);
            
            String linha = ler.readLine(), palavra[] = new String[6];
            int i = 0;
            while(!linha.equals("--")){
                for(int j = 0; j<6; j++){
                    palavra = linha.split(" ");
                }
                sistModel.adicionar(palavra[0], palavra[1], palavra[2], palavra[3], palavra[4], palavra[5]);
                linha = ler.readLine();
            }
            ler.close();
            leitor.close();
        }
        catch(IOException erro){
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA NO ARQUIVO!!");
        }
    }
    public void escreverArquivo(SistemaModel sistModel){
        try{
            FileOutputStream arquivo = new FileOutputStream("Info-veiculos.txt");
            PrintWriter escrever = new PrintWriter(arquivo);
            for(int i=0; i < sistModel.getListaClientes().size(); i++){
                escrever.print(sistModel.getListaClientes().get(i).getPlaca() + " ");
                escrever.print(sistModel.getListaClientes().get(i).getCpf() + " ");
                escrever.print(sistModel.getListaClientes().get(i).getTel() + " ");
                escrever.print(sistModel.getListaClientes().get(i).getData() + " ");
                escrever.print(sistModel.getListaClientes().get(i).getHora() + " ");
                escrever.println(sistModel.getListaClientes().get(i).getNome());
            }
            escrever.print("--");
            escrever.close();
            arquivo.close();
        }
        catch(IOException erro){
            JOptionPane.showMessageDialog(null, "ERRO DE ESCRITA NO ARQUIVO!!");
        }
    }  
}
