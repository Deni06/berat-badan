
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Microsoft
 */
public class CekIdealTubuh extends javax.swing.JFrame {
    Double ti, bt, h1;
    String temp = "";
    /**
     * Creates new form CekIdealTubuh
     */
    public CekIdealTubuh() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        saran = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ideal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        cobalagi = new javax.swing.JButton();
        berat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        nama = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel13.setText("Berat     badan   ideal    anda    adalah");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 300, 200, 26);
        getContentPane().add(saran);
        saran.setBounds(10, 430, 380, 30);

        jLabel14.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel14.setText("cm");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 80, 20, 20);

        jLabel9.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel9.setText("Tinggi");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 120, 40, 26);
        getContentPane().add(tinggi);
        tinggi.setBounds(150, 120, 50, 30);

        jLabel15.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel15.setText("cm");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 120, 20, 20);

        jLabel12.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel12.setText("Berat Badan");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 210, 80, 26);
        getContentPane().add(ideal);
        ideal.setBounds(270, 300, 50, 30);

        jLabel11.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel11.setText("Kg");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 300, 20, 30);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(270, 260, 90, 23);

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(40, 260, 90, 23);

        cobalagi.setText("Coba Lagi");
        cobalagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobalagiActionPerformed(evt);
            }
        });
        getContentPane().add(cobalagi);
        cobalagi.setBounds(150, 260, 90, 23);
        getContentPane().add(berat);
        berat.setBounds(150, 160, 50, 30);

        jLabel16.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel16.setText("Hasil    Diagnosa     Kesehatan");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(120, 340, 160, 26);

        jLabel17.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel17.setText("Kg");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(210, 160, 20, 30);

        jLabel18.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel18.setText("Nama");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(60, 80, 40, 26);

        jLabel19.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel19.setText("CEK     IDEAL    TUBUH");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(130, 20, 130, 26);

        jLabel20.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jLabel20.setText("Berat Badan");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 160, 80, 26);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Perempuan");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(240, 210, 93, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Laki-laki");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(150, 210, 70, 23);
        getContentPane().add(nama);
        nama.setBounds(150, 80, 190, 30);
        getContentPane().add(hasil);
        hasil.setBounds(10, 380, 380, 30);

        setSize(new java.awt.Dimension(416, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
                System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        if (nama.getText().equals("")||tinggi.getText().equals("")||berat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data inputan harus diisi");
        }else if(jRadioButton1.isSelected()||jRadioButton2.isSelected()){
            try{
                Proses();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data inputan salah");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Jenis Kelamin belum dipilih");
        }
    }//GEN-LAST:event_hitungActionPerformed

    private void cobalagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobalagiActionPerformed
        saran.setText("");
        ideal.setText("");
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_cobalagiActionPerformed

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
            java.util.logging.Logger.getLogger(CekIdealTubuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekIdealTubuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekIdealTubuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekIdealTubuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekIdealTubuh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cobalagi;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        ti = Double.valueOf(tinggi.getText());
        bt = Double.valueOf(berat.getText());
        
        
        if (jRadioButton1.isSelected()) {
            h1 = (ti - 100) * 1;
        }else if (jRadioButton2.isSelected()) {
            h1 = (ti - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
        
        if(h1 < bt) {
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() + " , Sepertinya anda Overweight :( ");
            saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");            
        }else if(h1 > bt) {
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() + " , Sepertinya anda Underweight :( ");
            saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        }else {
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() + " , Berat badan anda sudah ideal :) ");
            saran.setText("Lanjutkan pola teratur dan gaya hidup yang sehat :) ");
            
        }
    }
}
