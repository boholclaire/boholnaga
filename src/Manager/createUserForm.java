/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author clair
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    public boolean duplicateCheck(){
     dbConnect dbc = new dbConnect();
       try{
           String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText()+ "'OR u_email ='" + em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
              String email =resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                }
               String username =resultSet.getString("u_username");
                if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!!");
                    un.setText("");
                }
                 return true;
            }else{  
                return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
           
   }
}

public boolean updateCheck() {
   dbConnect dbc = new dbConnect();
       try{
           String query = "SELECT * FROM tbl_user  WHERE (u_username = '" + un.getText()+ "'OR u_email ='" + em.getText()+ "')AND user_id !='"+userID.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                String email =resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                }
                String username =resultSet.getString("u_username");
                if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!!");
                    un.setText("");
                }
                 return true;
            }else{  
                return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
           
   }
    }
 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        ty = new javax.swing.JComboBox<>();
        em = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();
        userID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 189, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 0, -1));

        add1.setBackground(new java.awt.Color(230, 189, 230));
        add1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(102, 102, 102));
        add1.setText("Add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 40));

        cancel.setBackground(new java.awt.Color(230, 189, 230));
        cancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 102, 102));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 40));

        ty.setBackground(new java.awt.Color(204, 204, 204));
        ty.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ty.setForeground(new java.awt.Color(102, 102, 102));
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Nurse" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        jPanel1.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 190, 30));

        em.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 190, 30));

        fn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 190, 30));

        ln.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 190, 30));

        un.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, 30));

        pn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 190, 30));

        us.setBackground(new java.awt.Color(204, 204, 204));
        us.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        us.setForeground(new java.awt.Color(102, 102, 102));
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 190, 30));

        userID.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        userID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userID.setEnabled(false);
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });
        jPanel1.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 190, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("User ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Firstname:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lastname:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 80, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Username:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 80, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PhoneNumber:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Type:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("User Status:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 100, 30));

        jButton1.setBackground(new java.awt.Color(230, 189, 230));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 40));

        update1.setBackground(new java.awt.Color(230, 189, 230));
        update1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        update1.setForeground(new java.awt.Color(102, 102, 102));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel1.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 40));

        jCheckBox1.setText("Show");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 60, 30));

        pass.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed

       if (fn.getText().isEmpty()   || ln.getText().isEmpty()   || em.getText().isEmpty() 
                || pn.getText().isEmpty()|| un.getText().isEmpty() || pass.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All field are required");
            }else if(pass.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
        pass.setText("");
        }else if(duplicateCheck()){
           System.out.println("Duplicate Exist");
     
         }else{
            
        
        dbConnect dbc = new dbConnect();
         if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_phoneNumber, u_type, u_username, u_password, status) "
                + "VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "',"
                + "'" + pn.getText() + "','" + ty.getSelectedItem() + "','" + un.getText() + "','" + pass.getText()+"','"+us.getSelectedItem()+"')"))
                    {
            JOptionPane.showMessageDialog(null, "Registration Successful!");
           adminUser au = new adminUser();
           au.setVisible(true);
            this.dispose();
       } else {
          JOptionPane.showMessageDialog(null, "Connection Error");

     }
        }
           
    }//GEN-LAST:event_add1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
           adminUser au = new adminUser();
             au.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
      
    }//GEN-LAST:event_fnActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

    }//GEN-LAST:event_cancelMouseClicked

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
     
           if (fn.getText().isEmpty()  || ln.getText().isEmpty()  || em.getText().isEmpty() 
                || pn.getText().isEmpty() || un.getText().isEmpty()  || pass.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All field are required");
            return;
       }
            String contactPattern = "^[0-9]{11}$"; 
         if (!pn.getText().matches(contactPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid contact number. It must be exactly 11 digits and contain numbers only.");
        pn.setText(""); 
        return;
    }
       
       String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!em.getText().matches(emailPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid email format. Please enter a valid email.");
        em.setText(""); 
        return;
    
        
        }else if(pass.getText().length()< 8){
        JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
        pass.setText("");
        }else if(updateCheck()){
           System.out.println("Duplicate Exist");
     
         }else{
        
            dbConnect dbc = new dbConnect();
            
           dbc.updateData("UPDATE tbl_user SET u_fname ='"+fn.getText()+"',u_lname='"+ln.getText()+"'"
           + ",u_email='"+em.getText()+"',u_phoneNumber ='"+pn.getText()+"',"
          + "u_password='"+pass.getText()+"',u_type ='"+ty.getSelectedItem()+"',status = '"+us.getSelectedItem()+"',"
          + "u_username ='"+un.getText()+"'WHERE user_id ='"+userID.getText()+"'");
          JOptionPane.showMessageDialog(null,"Updated Successfully!");
          adminUser au = new adminUser();
          au.setVisible(true);
          this.dispose();
   
    }                                      
    }                                        

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_update1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       boolean isSelected = jCheckBox1.isSelected();

    if (isSelected) {      
        pass.setEchoChar((char)0); 
    } else {      
        pass.setEchoChar('*'); 
    
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add1;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField pass;
    public javax.swing.JTextField pn;
    public javax.swing.JComboBox<String> ty;
    public javax.swing.JTextField un;
    public javax.swing.JButton update1;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField userID;
    // End of variables declaration//GEN-END:variables

   

   
}
