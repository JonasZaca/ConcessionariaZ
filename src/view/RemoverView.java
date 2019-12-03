package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import model.SistemaModel;

/**
 *
 * @author Jonas Zacari
 */
public class RemoverView extends javax.swing.JFrame {

    private int pos,divida;
    private SistemaModel modelSis;
    
    public RemoverView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void transferirInfo(int pos,SistemaModel modelSis, int divida){
        this.pos = pos;
        this.modelSis = modelSis;
        this.divida = divida;
        
        Date data = new Date();
        SimpleDateFormat dataNova = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat horaNova = new SimpleDateFormat("H:mm");
        
        lPlacaCli.setText(this.modelSis.getListaClientes().get(this.pos).getPlaca());
        lNomeCli.setText(this.modelSis.getListaClientes().get(this.pos).getNome());
        lCpfCli.setText(this.modelSis.getListaClientes().get(this.pos).getCpf());
        lTelCli.setText(this.modelSis.getListaClientes().get(this.pos).getTel());
        lEntradaCli.setText(this.modelSis.getListaClientes().get(this.pos).getData() + "   " + modelSis.getListaClientes().get(this.pos).getHora() + " hrs");
        lSaidaCli.setText(dataNova.format(data) + "   " +  horaNova.format(data) + " hrs");
        lValPagarCli.setText(Integer.toString(this.divida) + " " + "R$");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lplaca = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        LTel = new javax.swing.JLabel();
        LEntra = new javax.swing.JLabel();
        lSaida = new javax.swing.JLabel();
        lValPagar = new javax.swing.JLabel();
        lPlacaCli = new javax.swing.JLabel();
        lNomeCli = new javax.swing.JLabel();
        lCpfCli = new javax.swing.JLabel();
        lTelCli = new javax.swing.JLabel();
        lEntradaCli = new javax.swing.JLabel();
        lSaidaCli = new javax.swing.JLabel();
        lValPagarCli = new javax.swing.JLabel();
        lTitulo = new javax.swing.JLabel();
        jRemoverCli = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(273, 308));
        setMinimumSize(new java.awt.Dimension(273, 308));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Lplaca.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Lplaca.setText("Placa:");

        LNome.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LNome.setText("Tipo:");

        lCpf.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lCpf.setText("Modelo:");

        LTel.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LTel.setText("Chassis:");

        LEntra.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LEntra.setText("Entrada:");

        lSaida.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lSaida.setText("Saida:");

        lValPagar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lValPagar.setText("Comissão:");

        lPlacaCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lNomeCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lCpfCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lTelCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lEntradaCli.setBackground(new java.awt.Color(153, 204, 0));
        lEntradaCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lSaidaCli.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        lValPagarCli.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lTitulo.setText("Venda de Veiculo");

        jRemoverCli.setText("Finalizar Venda");
        jRemoverCli.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lValPagar)
                        .addGap(18, 18, 18)
                        .addComponent(lValPagarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTel)
                                    .addComponent(lCpf))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(lCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lplaca)
                                    .addComponent(LNome))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lPlacaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LEntra)
                            .addComponent(lSaida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lSaidaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lEntradaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jRemoverCli)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lplaca)
                    .addComponent(lPlacaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LTel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LEntra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lEntradaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lSaidaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lValPagar)
                    .addComponent(lValPagarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jRemoverCli)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getPos() {
        return pos;
    }

    public JButton getjRemoverCli() {
        return jRemoverCli;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LEntra;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LTel;
    private javax.swing.JLabel Lplaca;
    private javax.swing.JButton jRemoverCli;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lCpfCli;
    private javax.swing.JLabel lEntradaCli;
    private javax.swing.JLabel lNomeCli;
    private javax.swing.JLabel lPlacaCli;
    private javax.swing.JLabel lSaida;
    private javax.swing.JLabel lSaidaCli;
    private javax.swing.JLabel lTelCli;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lValPagar;
    private javax.swing.JLabel lValPagarCli;
    // End of variables declaration//GEN-END:variables
}
