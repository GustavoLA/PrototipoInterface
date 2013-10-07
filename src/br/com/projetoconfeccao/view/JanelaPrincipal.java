/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoconfeccao.view;

/**
 *
 * @author gustavo_lourenco
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelBiotipo = new javax.swing.JPanel();
        btUsuario = new javax.swing.JButton();
        btTipoFisico = new javax.swing.JButton();
        btMedida = new javax.swing.JButton();
        btColecao = new javax.swing.JButton();
        btCategoriaColecao = new javax.swing.JButton();
        painelEstoque = new javax.swing.JPanel();
        btEntrada = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btMateriaPrima = new javax.swing.JButton();
        btCategoriaMateriaPrima = new javax.swing.JButton();
        painelFinanceiro = new javax.swing.JPanel();
        btNotaFiscal = new javax.swing.JButton();
        painelPcp = new javax.swing.JPanel();
        brFornecedor = new javax.swing.JButton();
        btTransportadora = new javax.swing.JButton();
        btConserto = new javax.swing.JButton();
        painelRh = new javax.swing.JPanel();
        brFuncionario = new javax.swing.JButton();
        btFerias = new javax.swing.JButton();
        btCurriculo = new javax.swing.JButton();
        btVagas = new javax.swing.JButton();
        btTreinamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btEndereco = new javax.swing.JButton();
        btPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setLayout(new java.awt.GridLayout(6, 1));

        painelBiotipo.setBackground(new java.awt.Color(255, 255, 255));
        painelBiotipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biotipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        painelBiotipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btUsuario.setToolTipText("Usuário");
        btUsuario.setBorderPainted(false);
        btUsuario.setContentAreaFilled(false);
        painelBiotipo.add(btUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        btTipoFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btTipoFisico.setToolTipText("Tipo Físico");
        btTipoFisico.setBorderPainted(false);
        btTipoFisico.setContentAreaFilled(false);
        painelBiotipo.add(btTipoFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 36, -1, -1));

        btMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btMedida.setToolTipText("Medida");
        btMedida.setBorderPainted(false);
        btMedida.setContentAreaFilled(false);
        painelBiotipo.add(btMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, -1, -1));

        btColecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btColecao.setToolTipText("Coleção");
        btColecao.setBorderPainted(false);
        btColecao.setContentAreaFilled(false);
        painelBiotipo.add(btColecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 36, -1, -1));

        btCategoriaColecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btCategoriaColecao.setToolTipText("Categoria Coleção");
        btCategoriaColecao.setBorderPainted(false);
        btCategoriaColecao.setContentAreaFilled(false);
        painelBiotipo.add(btCategoriaColecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 36, -1, -1));

        painelFundo.add(painelBiotipo);

        painelEstoque.setBackground(new java.awt.Color(255, 255, 255));
        painelEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btEntrada.setToolTipText("Entrada");
        btEntrada.setBorderPainted(false);
        btEntrada.setContentAreaFilled(false);
        painelEstoque.add(btEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btProduto.setToolTipText("Produto");
        btProduto.setBorderPainted(false);
        btProduto.setContentAreaFilled(false);
        painelEstoque.add(btProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, -1, -1));

        btMateriaPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btMateriaPrima.setToolTipText("Matéria-prima");
        btMateriaPrima.setBorderPainted(false);
        btMateriaPrima.setContentAreaFilled(false);
        painelEstoque.add(btMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 36, -1, -1));

        btCategoriaMateriaPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btCategoriaMateriaPrima.setToolTipText("Categoria Matéria-prima");
        btCategoriaMateriaPrima.setBorderPainted(false);
        btCategoriaMateriaPrima.setContentAreaFilled(false);
        painelEstoque.add(btCategoriaMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 36, -1, -1));

        painelFundo.add(painelEstoque);

        painelFinanceiro.setBackground(new java.awt.Color(255, 255, 255));
        painelFinanceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Financeiro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelFinanceiro.setPreferredSize(null);
        painelFinanceiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNotaFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btNotaFiscal.setToolTipText("Nota Fiscal");
        btNotaFiscal.setBorderPainted(false);
        btNotaFiscal.setContentAreaFilled(false);
        painelFinanceiro.add(btNotaFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        painelFundo.add(painelFinanceiro);

        painelPcp.setBackground(new java.awt.Color(255, 255, 255));
        painelPcp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PCP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelPcp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        brFornecedor.setToolTipText("Fornecedor");
        brFornecedor.setBorderPainted(false);
        brFornecedor.setContentAreaFilled(false);
        brFornecedor.setPreferredSize(null);
        painelPcp.add(brFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        btTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btTransportadora.setToolTipText("Transportadora");
        btTransportadora.setBorderPainted(false);
        btTransportadora.setContentAreaFilled(false);
        btTransportadora.setPreferredSize(null);
        painelPcp.add(btTransportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, -1, -1));

        btConserto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btConserto.setToolTipText("Conserto");
        btConserto.setBorderPainted(false);
        btConserto.setContentAreaFilled(false);
        btConserto.setPreferredSize(null);
        painelPcp.add(btConserto, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 36, -1, -1));

        painelFundo.add(painelPcp);

        painelRh.setBackground(new java.awt.Color(255, 255, 255));
        painelRh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), java.awt.Color.black)); // NOI18N
        painelRh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        brFuncionario.setToolTipText("Funcionário");
        brFuncionario.setBorderPainted(false);
        brFuncionario.setContentAreaFilled(false);
        brFuncionario.setPreferredSize(null);
        painelRh.add(brFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        btFerias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btFerias.setToolTipText("Férias");
        btFerias.setBorderPainted(false);
        btFerias.setContentAreaFilled(false);
        btFerias.setPreferredSize(null);
        painelRh.add(btFerias, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, -1, -1));

        btCurriculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btCurriculo.setToolTipText("Currículo");
        btCurriculo.setBorderPainted(false);
        btCurriculo.setContentAreaFilled(false);
        btCurriculo.setPreferredSize(null);
        painelRh.add(btCurriculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 36, -1, -1));

        btVagas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btVagas.setToolTipText("Vagas");
        btVagas.setBorderPainted(false);
        btVagas.setContentAreaFilled(false);
        btVagas.setPreferredSize(null);
        painelRh.add(btVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 36, -1, -1));

        btTreinamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btTreinamento.setToolTipText("Treinamento");
        btTreinamento.setBorderPainted(false);
        btTreinamento.setContentAreaFilled(false);
        btTreinamento.setPreferredSize(null);
        painelRh.add(btTreinamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 36, -1, -1));

        painelFundo.add(painelRh);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), java.awt.Color.black)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoconfeccao/image/user.png"))); // NOI18N
        btEndereco.setToolTipText("Endereço");
        btEndereco.setBorderPainted(false);
        btEndereco.setContentAreaFilled(false);
        btEndereco.setPreferredSize(null);
        jPanel1.add(btEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        btPessoa.setText("Pessoa");
        jPanel1.add(btPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 120, 40));

        painelFundo.add(jPanel1);

        getContentPane().add(painelFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brFornecedor;
    private javax.swing.JButton brFuncionario;
    private javax.swing.JButton btCategoriaColecao;
    private javax.swing.JButton btCategoriaMateriaPrima;
    private javax.swing.JButton btColecao;
    private javax.swing.JButton btConserto;
    private javax.swing.JButton btCurriculo;
    private javax.swing.JButton btEndereco;
    private javax.swing.JButton btEntrada;
    private javax.swing.JButton btFerias;
    private javax.swing.JButton btMateriaPrima;
    private javax.swing.JButton btMedida;
    private javax.swing.JButton btNotaFiscal;
    private javax.swing.JButton btPessoa;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btTipoFisico;
    private javax.swing.JButton btTransportadora;
    private javax.swing.JButton btTreinamento;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVagas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelBiotipo;
    private javax.swing.JPanel painelEstoque;
    private javax.swing.JPanel painelFinanceiro;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelPcp;
    private javax.swing.JPanel painelRh;
    // End of variables declaration//GEN-END:variables
}