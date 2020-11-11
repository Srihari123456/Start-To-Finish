import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PassengerDashboardPage extends javax.swing.JFrame {
    public String email_id;
    
    public PassengerDashboardPage() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordUpdate = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        food = new javax.swing.JComboBox();
        menuUpdate = new javax.swing.JButton();
        itinerary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("PASSENGER");

        passwordUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Enter Menu");

        food.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Veg", "NonVeg", "Combo" }));
        food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodActionPerformed(evt);
            }
        });

        menuUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        menuUpdate.setForeground(new java.awt.Color(255, 102, 0));
        menuUpdate.setText("Update Menu");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });

        itinerary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itinerary.setForeground(new java.awt.Color(255, 102, 0));
        itinerary.setText("View Itinerary");
        itinerary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itineraryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(passwordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itinerary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(menuUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itinerary, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
            System.out.println("Connection created");
            String sql = "update userdetails set food = ?,amount = ? where email = ? and not bookingid=''";
            PreparedStatement stmt = conn.prepareStatement(sql);
            String chosenFood = food.getSelectedItem().toString();
            stmt.setString(1,(chosenFood));
            if(chosenFood.equals("Veg")){
                stmt.setDouble(2,10000);
            }
            else if(chosenFood.equals("Combo")){
                stmt.setDouble(2,11000);
            }
            else{
                 stmt.setDouble(2,12000);   
            }
            stmt.setString(3,email_id);
            int c = stmt.executeUpdate();
            //System.out.print(c+" srihari");
            if(c == 0)
                JOptionPane.showMessageDialog(null,"You havent made any booking yet");
            else    
                JOptionPane.showMessageDialog(null,"Food Preferences Noted");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(PassengerDashboardPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuUpdateActionPerformed

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

    private void itineraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itineraryActionPerformed
        // TODO add your handling code here:
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
                String sql = "select itinerary,bookingstatus from userdetails where email = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1,(email_id));

                ResultSet rs = st.executeQuery();

                if(rs.next()){
                    if(rs.getString(2).equals("2")){
                        System.out.println("Booking Validated");
                        JOptionPane.showMessageDialog(null,rs.getString(1));
                    }
                    else{
                        System.out.println("Booking Not Validated Yet");
                        JOptionPane.showMessageDialog(null,"Itinerary Not generated");
                    }
                }
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_itineraryActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDashboardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox food;
    private javax.swing.JButton itinerary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton menuUpdate;
    private javax.swing.JButton passwordUpdate;
    // End of variables declaration//GEN-END:variables
}
