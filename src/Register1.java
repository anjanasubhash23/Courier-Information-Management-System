/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cims;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author anjan
 */
public class Register1 extends javax.swing.JFrame {

    private static boolean isStringEmptyOrNull(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * Creates new form Register
     */
    public Register1()  {
        initComponents();
        
        
    }
    
    DataConnection Conn=null;
    
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        Name = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        emailaddress = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        adrs = new javax.swing.JTextField();
        phoneno = new javax.swing.JLabel();
        pno = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(206, 11, 190, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ADMIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 60, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 80);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(null);

        username.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        username.setText("Username :");
        jPanel2.add(username);
        username.setBounds(30, 30, 116, 29);
        username.getAccessibleContext().setAccessibleParent(jPanel1);

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel2.add(uname);
        uname.setBounds(260, 28, 196, 29);

        password.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        password.setText("Password :");
        jPanel2.add(password);
        password.setBounds(31, 68, 110, 29);
        jPanel2.add(pwd);
        pwd.setBounds(260, 72, 196, 29);

        Name.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        Name.setText("Name : ");
        jPanel2.add(Name);
        Name.setBounds(31, 112, 79, 29);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(260, 115, 196, 30);

        emailaddress.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        emailaddress.setText("Email adress : ");
        jPanel2.add(emailaddress);
        emailaddress.setBounds(31, 156, 150, 29);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(260, 157, 283, 28);

        address.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        address.setText("Address : ");
        jPanel2.add(address);
        address.setBounds(31, 209, 99, 29);
        jPanel2.add(adrs);
        adrs.setBounds(260, 203, 283, 65);

        phoneno.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        phoneno.setText("Phone Number : ");
        jPanel2.add(phoneno);
        phoneno.setBounds(30, 290, 183, 29);

        pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoActionPerformed(evt);
            }
        });
        jPanel2.add(pno);
        pno.setBounds(260, 293, 194, 29);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(260, 28, 196, 29);

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(460, 360, 110, 40);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 650, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void pnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnoActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String sql="";
      //  int s = JOptionPane.showConfirmDialog(null, "Do you really want to Save this Records");
       // System.out.println("s is"+s);
           
                 sql = "insert into admin(username,password,name,address,email,phone) "
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel address;
    private javax.swing.JTextField adrs;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailaddress;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField name;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phoneno;
    private javax.swing.JTextField pno;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
