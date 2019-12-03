
package model;

public class ClienteModel {
    private String nome,cpf,placa,tel,data,hora;
    

    public ClienteModel(String placa, String cpf, String tel, String data, String hora, String nome) {
        this.placa = placa;
        this.cpf = cpf;
        this.tel = tel;
        this.data = data;
        this.hora = hora;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }  
}
