
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author anjan
 */
public class Register2 extends javax.swing.JFrame {

    /**
     * Creates new form Register2
     */
    public Register2() {
        initComponents();
    }
    
    public void clear(){
    uname.setText("");
    pwd.setText("");
    name.setText("");
    email.setText("");
    adrs.setText("");
    pno.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        adrs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pno = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(87, 96, 111));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 190, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel2.setText("Username :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 30, 116, 29);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(31, 68, 110, 29);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel4.setText("Name : ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(31, 112, 79, 29);

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel5.setText("Email adress : ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(31, 156, 150, 29);

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel6.setText("Address : ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(31, 209, 99, 29);

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel2.add(uname);
        uname.setBounds(260, 28, 200, 29);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(260, 28, 196, 29);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(260, 115, 200, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(260, 157, 283, 28);

        adrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrsActionPerformed(evt);
            }
        });
        jPanel2.add(adrs);
        adrs.setBounds(260, 203, 283, 65);

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel8.setText("Phone Number : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(31, 293, 183, 29);

        pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoActionPerformed(evt);
            }
        });
        jPanel2.add(pno);
        pno.setBounds(260, 293, 194, 29);

        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        jPanel2.add(pwd);
        pwd.setBounds(260, 70, 200, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(50, 360, 110, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(250, 360, 110, 40);

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(460, 360, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 650, 430);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel7.setText("REGISTER");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(206, 11, 190, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("USER");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 50, 50, 17);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 650, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void pnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnoActionPerformed

    private void adrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrsActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String sql="";
      //  int s = JOptionPane.showConfirmDialog(null, "Do you really want to Save this Records");
       // System.out.println("s is"+s);
           
                 sql = "insert into user(username,password,name,address,email,phone) "
                  + "values ('" + uname.getText().toString() + "','"
                  + pwd.getText() + "','"  + name.getText().toString() + "','" + adrs.getText().toString() + "','" + email.getText().toString() + "','" + pno.getText().toString()+"');";      
            //    if (Register1.isStringEmptyOrNull(name.getText()) && !Register1.isStringEmptyOrNull(uname.getText())) {
         //  if (s == 0) {
            try {      
                    boolean status = dbConnection.insertRecord(sql);
                 if (status) {
                        JOptionPane.showMessageDialog(null, "One Record Save !! ");
                        submit.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Record Not Save !! ");
                        submit.setEnabled(false);
                    }
               // }
                 
              /*lse {
                    JOptionPane.showMessageDialog(null, "Name and Username Can not be Blank");
                }*/
                
               
            }
             catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Exception " + ex);
             }
       // }
                     
                

    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adrs;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField pwd;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
