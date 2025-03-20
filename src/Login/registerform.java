package Login;


import Login.loginForm;
import config.dbConnect;
import java.awt.Color;
import java.sql.PreparedStatement;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clair
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
    }

   Color hover = new Color(238,248,232);
    Color defButton= new Color(137,161,137);

    Border empty =BorderFactory.createEmptyBorder();
    
  public boolean duplicateCheck(){
        
        dbConnect dbc = new dbConnect();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
              String email= resultSet.getString("u_email");
                if(em.equals(em.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      em.setText("");
                }
               String username = resultSet.getString("u_username");
                if(un.equals(un.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      un.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    
    
        
    @SuppressWarnings("unchecke /**d")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        REGISTER = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        ty = new javax.swing.JComboBox<>();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 189, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(252, 250, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BIRTHING CENTER.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 430, 510));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 530));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 0, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 370, 30));

        REGISTER.setBackground(new java.awt.Color(230, 189, 230));
        REGISTER.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        REGISTER.setForeground(new java.awt.Color(102, 102, 102));
        REGISTER.setText("Register");
        REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTERActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 100, 40));

        CANCEL.setBackground(new java.awt.Color(230, 189, 230));
        CANCEL.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CANCEL.setForeground(new java.awt.Color(102, 102, 102));
        CANCEL.setText("Cancel");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel1.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 100, 40));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PhoneNumber:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 90, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Firstname:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lastname:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Type:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 80, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 80, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Username:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 80, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 80, 30));

        pn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 270, 30));

        un.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 270, 30));

        pass.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 270, 30));

        em.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 270, 30));

        ty.setBackground(new java.awt.Color(204, 204, 204));
        ty.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ty.setForeground(new java.awt.Color(102, 102, 102));
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Nurse", " " }));
        jPanel1.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 270, 30));

        lname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 270, 30));

        fname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
  loginForm rft = new loginForm();
     rft.setVisible(true);
     this.dispose();    }//GEN-LAST:event_CANCELActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
      String inputText = fname.getText();
    System.out.println("User entered: " + inputText);    System.out.println("User entered: " + inputText);    }//GEN-LAST:event_fnameActionPerformed

    private void REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTERActionPerformed
   
           if(fname.getText().isEmpty() || lname.getText().isEmpty() || em.getText().isEmpty() || un.getText().isEmpty() || pn.getText().isEmpty() || 
            pass.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "All fields are required!");   
           } else if(pass.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above");
            pass.setText("");
           } else if(duplicateCheck()) {
           System.out.println("Duplicate Exist!");
          } else {
    dbConnect dbc = new dbConnect();
            try {
                String password = passwordHasher.hashPassword(pass.getText()); // Hash the password
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
            }
    if(dbc.insertData("INSERT INTO tbl_users (u_fname, u_lname, u_email, u_username, u_password, u_phoneNumber, u_type, u_status) "
            + "VALUES ('" + fname.getText() + "','" + lname.getText() + "','" + em.getText() + "','" + un.getText() + "',''" + pn.getText() + "," + pass + "','" + ty.getSelectedItem() + "','Pending')"))
    {
        JOptionPane.showMessageDialog(null, "Inserted Success!");
        loginForm lfr = new loginForm();
        lfr.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Connection Error!");
    }
}

        

    }//GEN-LAST:event_REGISTERActionPerformed

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton REGISTER;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField pn;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables

    private boolean isValidEmail(String text) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    return matcher.matches();

    }

    private boolean isNumeric(String text) {
        try {
        Double.parseDouble(text);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }

    


}
    

