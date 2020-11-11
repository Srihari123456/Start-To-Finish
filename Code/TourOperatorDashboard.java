import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TourOperatorDashboard extends javax.swing.JFrame {
    public String email_id;
    public TourOperatorDashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bookingsValidate = new javax.swing.JButton();
        passwordUpdate = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TOUR OPERATOR");

        bookingsValidate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bookingsValidate.setForeground(new java.awt.Color(255, 102, 0));
        bookingsValidate.setText("Validate Bookings");
        bookingsValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingsValidateActionPerformed(evt);
            }
        });

        passwordUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordUpdate.setForeground(new java.awt.Color(255, 102, 0));
        passwordUpdate.setText("Update Password");
        passwordUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUpdateActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 102, 0));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(bookingsValidate)
                        .addGap(56, 56, 56)
                        .addComponent(passwordUpdate)
                        .addGap(65, 65, 65)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingsValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingsValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingsValidateActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
            System.out.println("Connection created");
            String sql = "update userdetails set bookingstatus = ? where bookingstatus = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,"2");
            stmt.setString(2,"1");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Validation Done");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(PassengerDetailsPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bookingsValidateActionPerformed

    private void passwordUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUpdateActionPerformed
        // TODO add your handling code here:
        UpdatePasswordPage UpdatePasswordPageone = new UpdatePasswordPage();
        UpdatePasswordPageone.email_id = email_id;
        UpdatePasswordPageone.setVisible(true);
        dispose();
    }//GEN-LAST:event_passwordUpdateActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TourOperatorDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingsValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton passwordUpdate;
    // End of variables declaration//GEN-END:variables
}
