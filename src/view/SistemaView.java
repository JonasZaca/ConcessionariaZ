package view;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Jonas Zacari
 */
public class SistemaView extends javax.swing.JFrame {

    public SistemaView() {
        initComponents();
        this.setLocationRelativeTo(null); // Centralizar a tela.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cxCarros = new javax.swing.JTabbedPane();
        frameEntrada = new javax.swing.JInternalFrame();
        lblEntradaCliente = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txPlaca = new javax.swing.JTextField();
        txTel = new javax.swing.JTextField();
        btVerificarEntrada = new javax.swing.JButton();
        avisoNome = new javax.swing.JLabel();
        avisoCpf = new javax.swing.JLabel();
        avisoPlaca = new javax.swing.JLabel();
        avisoTel = new javax.swing.JLabel();
        frameSaida = new javax.swing.JInternalFrame();
        lblSaidaCliente = new javax.swing.JLabel();
        lblPlacaSaida = new javax.swing.JLabel();
        txPlacaSaida = new javax.swing.JTextField();
        btVerificarSaida = new javax.swing.JButton();
        avisoPlacaSaida = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblInfoCarros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuInfo = new javax.swing.JMenuItem();
        Deslogar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        lblTitulo.setText("ConcessionáriaFAST");

        cxCarros.setBackground(new java.awt.Color(124, 172, 200));
        cxCarros.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        frameEntrada.setBackground(new java.awt.Color(124, 172, 200));
        frameEntrada.setBorder(null);
        frameEntrada.setVisible(true);

        lblEntradaCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEntradaCliente.setText("Entrada de Veiculo");

        lblNome.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblNome.setText("Tipo");

        lblCPF.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblCPF.setText("Modelo");

        lblPlaca.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblPlaca.setText("Placa");

        lblTel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblTel.setText("Chassis");

        btVerificarEntrada.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btVerificarEntrada.setText("Cadastrar");

        avisoNome.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avisoNome.setForeground(new java.awt.Color(255, 51, 51));

        avisoCpf.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avisoCpf.setForeground(new java.awt.Color(255, 51, 51));

        avisoPlaca.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avisoPlaca.setForeground(new java.awt.Color(255, 51, 51));

        avisoTel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avisoTel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout frameEntradaLayout = new javax.swing.GroupLayout(frameEntrada.getContentPane());
        frameEntrada.getContentPane().setLayout(frameEntradaLayout);
        frameEntradaLayout.setHorizontalGroup(
            frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEntradaLayout.createSequentialGroup()
                .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEntradaLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblEntradaCliente))
                    .addGroup(frameEntradaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frameEntradaLayout.createSequentialGroup()
                                .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF)
                                    .addComponent(lblPlaca)
                                    .addComponent(lblTel))
                                .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameEntradaLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEntradaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameEntradaLayout.createSequentialGroup()
                                .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(avisoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(avisoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(avisoTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avisoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(frameEntradaLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btVerificarEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameEntradaLayout.setVerticalGroup(
            frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEntradaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblEntradaCliente)
                .addGap(18, 18, 18)
                .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEntradaLayout.createSequentialGroup()
                        .addComponent(avisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avisoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(avisoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(avisoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameEntradaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(btVerificarEntrada)
                .addGap(25, 25, 25))
        );

        cxCarros.addTab("Entrada", frameEntrada);

        frameSaida.setBackground(new java.awt.Color(124, 172, 200));
        frameSaida.setBorder(null);
        frameSaida.setVisible(true);

        lblSaidaCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaidaCliente.setText("Venda de Veiculo");

        lblPlacaSaida.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblPlacaSaida.setText("Placa");

        btVerificarSaida.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btVerificarSaida.setText("Finalizar Venda");
        btVerificarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarSaidaActionPerformed(evt);
            }
        });

        avisoPlacaSaida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        avisoPlacaSaida.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout frameSaidaLayout = new javax.swing.GroupLayout(frameSaida.getContentPane());
        frameSaida.getContentPane().setLayout(frameSaidaLayout);
        frameSaidaLayout.setHorizontalGroup(
            frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSaidaLayout.createSequentialGroup()
                .addGroup(frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSaidaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPlacaSaida)
                        .addGap(18, 18, 18)
                        .addComponent(txPlacaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avisoPlacaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameSaidaLayout.createSequentialGroup()
                        .addGroup(frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameSaidaLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(lblSaidaCliente))
                            .addGroup(frameSaidaLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(btVerificarSaida)))
                        .addGap(0, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frameSaidaLayout.setVerticalGroup(
            frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSaidaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblSaidaCliente)
                .addGap(31, 31, 31)
                .addGroup(frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frameSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txPlacaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(avisoPlacaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPlacaSaida))
                .addGap(43, 43, 43)
                .addComponent(btVerificarSaida)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        cxCarros.addTab("Vender", frameSaida);

        jInternalFrame1.setBackground(new java.awt.Color(124, 172, 200));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);

        lblInfoCarros.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblInfoCarros.setText("Veiculos Cadastrados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblInfoCarros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        cxCarros.addTab("Estoque", jInternalFrame1);

        jMenuBar1.setBackground(new java.awt.Color(124, 172, 200));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jMenuInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuInfo.setBackground(new java.awt.Color(153, 204, 0));
        jMenuInfo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuInfo.setText("Info. Projeto");
        jMenu1.add(jMenuInfo);

        Deslogar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        Deslogar.setBackground(new java.awt.Color(153, 204, 0));
        Deslogar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Deslogar.setText("Deslogar");
        jMenu1.add(Deslogar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cxCarros)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(cxCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerificarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVerificarSaidaActionPerformed


    public String getTxTel() {
        return txTel.getText();
    }

    public String getTxtCPF() {
        return txtCPF.getText();
    }

    public String getTxNome() {
        return txNome.getText();
    }

    public String getTxPlaca() {
        return txPlaca.getText();
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public JButton getBtVerificarSaida() {
        return btVerificarSaida;
    }

    public String getTxPlacaSaida() {
        return txPlacaSaida.getText();
    }

    public JLabel getAvisoCpf() {
        return avisoCpf;
    }

    public void setAvisoCpf(String avisoCpf) {
        this.avisoCpf.setText(avisoCpf);
    }

    public JLabel getAvisoNome() {
        return avisoNome;
    }

    public void setAvisoNome(String avisoNome) {
        this.avisoNome.setText(avisoNome);
    }

    public JLabel getAvisoPlaca() {
        return avisoPlaca;
    }

    public void setAvisoPlaca(String avisoPlaca) {
        this.avisoPlaca.setText(avisoPlaca);
    }

    public JLabel getAvisoTel() {
        return avisoTel;
    }

    public void setAvisoTel(String avisoTel) {
        this.avisoTel.setText(avisoTel);
    }

    public JLabel getAvisoPlacaSaida() {
        return avisoPlacaSaida;
    }

    public void setAvisoPlacaSaida(String avisoPlacaSaida) {
        this.avisoPlacaSaida.setText(avisoPlacaSaida);
    }

    public JMenuItem getDeslogar() {
        return Deslogar;
    }

    public JMenuItem getjMenuInfo() {
        return jMenuInfo;
    }

    public JButton getBtVerificarEntrada() {
        return btVerificarEntrada;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Deslogar;
    private javax.swing.JLabel avisoCpf;
    private javax.swing.JLabel avisoNome;
    private javax.swing.JLabel avisoPlaca;
    private javax.swing.JLabel avisoPlacaSaida;
    private javax.swing.JLabel avisoTel;
    private javax.swing.JButton btVerificarEntrada;
    private javax.swing.JButton btVerificarSaida;
    private javax.swing.JTabbedPane cxCarros;
    private javax.swing.JInternalFrame frameEntrada;
    private javax.swing.JInternalFrame frameSaida;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEntradaCliente;
    private javax.swing.JLabel lblInfoCarros;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPlacaSaida;
    private javax.swing.JLabel lblSaidaCliente;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txPlaca;
    private javax.swing.JTextField txPlacaSaida;
    private javax.swing.JTextField txTel;
    private javax.swing.JTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
