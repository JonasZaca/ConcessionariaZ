
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SistemaModel {
    private ArrayList<ClienteModel> listaClientes = new ArrayList();
    
    public int pesquisar(String placa){
        for(int i = 0;i <listaClientes.size();i++){
            if(listaClientes.get(i).getPlaca().equals(placa)){
                return i;
            }
        }
        return -1;
    }
    
    public int adicionar(String placa, String cpf, String tel, String data, String hora, String nome){
        if(pesquisar(placa) < 0){
            ClienteModel cliente = new ClienteModel(placa,cpf,tel,data,hora,nome);
            this.listaClientes.add(cliente);
            return 1;
        }
        else{
            return 0;
        }    
    }
    
    public void remover(int indice){
          listaClientes.remove(indice);
    }
    
    public DefaultTableModel AtualizarTabela(){
        DefaultTableModel tabela = new DefaultTableModel(new Object[]{"Placa","Modelo","Chassis","Data","Hora","Tipo"},0); 
        for(int i =0;i<listaClientes.size();i++){
            tabela.addRow(new Object[]{listaClientes.get(i).getPlaca(),listaClientes.get(i).getCpf(),listaClientes.get(i).getTel(), listaClientes.get(i).getData(), listaClientes.get(i).getHora(), listaClientes.get(i).getNome()});
        }
        return tabela;
    }
    public ArrayList<ClienteModel> getListaClientes() {
        return listaClientes;
    }
    
    public int cacularDivida(int pos)
    {   
        int total, d_ano, d_mes, d_dias, d_hora, d_min,aux;
        Date d = new Date();
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat hora = new SimpleDateFormat("H:mm");
        
        // Data e Hora atual
        int diaAtual = Integer.parseInt(data.format(d).substring(0, 2));
        int mesAtual = Integer.parseInt(data.format(d).substring(3, 5));
        int anoAtual = Integer.parseInt(data.format(d).substring(6, 10));
        int horaAtual = Integer.parseInt(hora.format(d).substring(0, 2));
        int minAtual = Integer.parseInt(hora.format(d).substring(3, 5));
        
        // Data e Hora que o veiculo entrou
        int diaCli = Integer.parseInt(this.listaClientes.get(pos).getData().substring(0, 2));
        int mesCli = Integer.parseInt(this.listaClientes.get(pos).getData().substring(3, 5));
        int anoCli = Integer.parseInt(this.listaClientes.get(pos).getData().substring(6, 10));
        int horaCli = Integer.parseInt(this.listaClientes.get(pos).getHora().substring(0, 2));
        int minCli = Integer.parseInt(this.listaClientes.get(pos).getHora().substring(3, 5));
        
        // Calcula a diferen�a 
	d_ano = (anoAtual - anoCli); 
	d_mes =  (mesAtual - mesCli);
	d_dias = (diaAtual - diaCli);
	d_hora = (horaAtual - horaCli);
        
        
	if(d_ano > 0) 
	{
		d_mes = (d_ano - 1) * 12 + ((12 - mesCli) + mesAtual); 	
		
		d_dias = (d_mes - 1) * 30 + ((30 - diaCli) + diaAtual);
		
		d_hora = (d_dias - 1) * 24 + ((24 - horaCli) + horaAtual);
		
		d_min = (d_hora - 1) * 60 +  ((60 - minCli) + minAtual);
	}
	else if(d_mes > 0)
	{
		d_dias = (d_mes - 1) * 30 + ((30 - diaCli) + diaAtual);
		
		d_hora = (d_dias - 1) * 24 + ((24 - horaCli) + horaAtual);
		
		d_min = (d_hora - 1) * 60 +  ((60 - minCli) + minAtual);	
	}
	else if(d_dias > 0)
	{
		d_hora = (d_dias - 1) * 24 + ((24 - horaCli) + horaAtual);
		
		d_min = (d_hora - 1) * 60 +  ((60 - minCli) + minAtual);
	}
	else if(d_hora > 0)
	{
		d_min = (d_hora - 1) * 60 +  ((60 - minCli) + minAtual);
	}
	else
	{
		d_min = (minAtual - minCli);
	}
	

	if(d_min <= 30) 
	{
		total = 4;
	}
	else if(d_min <= 60)
	{
		total = 7;
	}
	else if(d_min <= 120) 
	{
		total = 12;
	}
	else if(d_min <= 240)
	{
		total = 20;
	}
	else if(d_min <= 360)
	{
		total = 30;
	}
	else if(d_min <= 480)
	{
		total = 40;
	}
	else if(d_min <= 1440)
	{
		total = 75;
	}
	else 
	{
		aux = d_min / 1440;
		if(d_min % 1440 != 0)
		{
			total = 75 + (aux * 60);
		}
		else
		{
			total = 75 + ((aux-1) * 60);
		}	
	}
	return total;
    }
}
