/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author ty
 */
public class warga extends javax.swing.JFrame {
private final Connection conn = new koneksi().connect();
    private DefaultTableModel tableModel;
    /**
     * Creates new form warga
     */
    public warga() {
        initComponents();
        datatable();
    }
    
     protected void aktif() {
       
        txtnama.setEnabled(true);
        txtalamat.setEnabled(true);
        txtid_warga.requestFocus();
    }
    
     protected void kosong() {
       
         txtnama.setText("");
          txtalamat.setText("");
           txtid_warga.setText("");    
    }
    
    protected void datatable() {
        Object[] Baris = {"Id Warga","Name","Gender", "Address"};
        tableModel = new DefaultTableModel(null, Baris);
        tablewarga.setModel(tableModel);
        String sql = "select * from warga order by nama asc";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id_warga = hasil.getString("id_warga");
                String nama = hasil.getString("nama");
                String jk = hasil.getString("jk");
                String alamat = hasil.getString("alamat");
                
                
                String[] data = {id_warga,nama,jk,alamat};
                tableModel.addRow(data);

            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid_warga = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        rbperempuan = new javax.swing.JRadioButton();
        rblaki = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablewarga = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id warga");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtid_warga.setBackground(new java.awt.Color(153, 153, 153));
        txtid_warga.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtid_warga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, -1));

        txtnama.setBackground(new java.awt.Color(153, 153, 153));
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));

        rbperempuan.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rbperempuan);
        rbperempuan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        rbperempuan.setForeground(new java.awt.Color(255, 255, 255));
        rbperempuan.setText("Perempuan");
        getContentPane().add(rbperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        rblaki.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(rblaki);
        rblaki.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        rblaki.setForeground(new java.awt.Color(255, 255, 255));
        rblaki.setText("Laki-Laki");
        getContentPane().add(rblaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        txtalamat.setBackground(new java.awt.Color(153, 153, 153));
        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(255, 255, 255));
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 90));

        tablewarga.setBackground(new java.awt.Color(153, 153, 153));
        tablewarga.setForeground(new java.awt.Color(255, 255, 255));
        tablewarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablewarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablewargaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablewarga);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 310, 90));

        btnsimpan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 5)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/s copy.png"))); // NOI18N
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 80, 50));

        btnubah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/e.png"))); // NOI18N
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        getContentPane().add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, 50));

        btndelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/d copy.png"))); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 70, 50));

        btnkembali.setFont(new java.awt.Font("Tempus Sans ITC", 1, 10)); // NOI18N
        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bk.png"))); // NOI18N
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 80, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 590, 230));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/w.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setText("DATA WARGA");
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 510, 70));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
String sql = "insert into warga values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtid_warga.getText());
            stat.setString(2, txtnama.getText());
            stat.setString(4, txtalamat.getText());
            if (rbperempuan.isSelected()) {
                stat.setString(3, "Perempuan");
            }
            if (rblaki.isSelected()) {
                stat.setString(3, "Laki-Laki");
            }
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtid_warga.requestFocus();
            datatable();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " + e);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
       try {
            String sql = "Update warga set nama=?,jk=?,alamat=?"
                    + " where id_warga='" + txtid_warga.getText() + "'";
            PreparedStatement stat = conn.prepareStatement(sql);
             stat.setString(1, txtnama.getText());
            stat.setString(3, txtalamat.getText());
            if (rbperempuan.isSelected()) {
                stat.setString(2, "Perempuan");
            }
            if (rblaki.isSelected()) {
                stat.setString(2, "Laki-Laki");
            }           
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            txtid_warga.requestFocus();
            datatable();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void tablewargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablewargaMouseClicked
         int bar = tablewarga.getSelectedRow();
        String a = tableModel.getValueAt(bar, 0).toString();
        String b = tableModel.getValueAt(bar, 1).toString();
        String c = tableModel.getValueAt(bar, 2).toString();
        String d = tableModel.getValueAt(bar, 3).toString();
       
        if (c.equals("Perempuan")) {
            rbperempuan.setSelected(true);
        } else {
            rblaki.setSelected(true);
        }
        
        txtid_warga.setText(a);
        
        txtnama.setText(b);
        txtalamat.setText(d);
    }//GEN-LAST:event_tablewargaMouseClicked

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
       new menu().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            String sql = "delete from warga where id_warga ='" + txtid_warga.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtid_warga.requestFocus();
                datatable();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new warga().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JTable tablewarga;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtid_warga;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
