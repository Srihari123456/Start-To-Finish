import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GroupRepresentativeDashboardPage extends javax.swing.JFrame {
    public String email_id;
    public GroupRepresentativeDashboardPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        makeBooking = new javax.swing.JButton();
        foodItinerary = new javax.swing.JButton();
        applyDiscount = new javax.swing.JButton();
        makePayment = new javax.swing.JButton();
        passengerDetails = new javax.swing.JButton();
        passwordUpdate = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("GROUP REPRESENTATIVE");

        makeBooking.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        makeBooking.setForeground(new java.awt.Color(255, 102, 0));
        makeBooking.setText("Make Booking");
        makeBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeBookingActionPerformed(evt);
            }
        });

        foodItinerary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        foodItinerary.setForeground(new java.awt.Color(255, 102, 0));
        foodItinerary.setText("Food & Itinerary");
        foodItinerary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodItineraryActionPerformed(evt);
            }
        });

        applyDiscount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        applyDiscount.setForeground(new java.awt.Color(255, 102, 0));
        applyDiscount.setText("Apply Discount");
        applyDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyDiscountActionPerformed(evt);
            }
        });

        makePayment.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        makePayment.setForeground(new java.awt.Color(255, 102, 0));
        makePayment.setText("Make Payment");
        makePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePaymentActionPerformed(evt);
            }
        });

        passengerDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passengerDetails.setForeground(new java.awt.Color(255, 102, 0));
        passengerDetails.setText("Add Passenger Details");
        passengerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerDetailsActionPerformed(evt);
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
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(applyDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makeBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(foodItinerary)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(makePayment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passengerDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeBooking)
                    .addComponent(passengerDetails))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyDiscount)
                    .addComponent(makePayment)
                    .addComponent(foodItinerary))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordUpdate)
                    .addComponent(logout))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void passengerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerDetailsActionPerformed
        // TODO add your handling code here:
            PassengerDetailsPage PassengerDetailsPageone = new PassengerDetailsPage();
            PassengerDetailsPageone.email_id = email_id;
            PassengerDetailsPageone.setVisible(true);
            dispose();
    }//GEN-LAST:event_passengerDetailsActionPerformed

    private void foodItineraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodItineraryActionPerformed
        // TODO add your handling code here:
            PassengerDashboardPage PassengerDashboardPageone = new PassengerDashboardPage();
            PassengerDashboardPageone.email_id = email_id;
            PassengerDashboardPageone.setVisible(true);
            dispose();
    }//GEN-LAST:event_foodItineraryActionPerformed

    private void applyDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDiscountActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
            String sql = "select sum(amount)from userdetails where bookingid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,(email_id));
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int cost = Integer.parseInt(rs.getString(1));
                String sql2 = "select discount,bookingdate,journeydate from bookingdetails where bookingid = ?";
                PreparedStatement st2 = con.prepareStatement(sql2);
                st2.setString(1,(email_id));
                ResultSet rs2 = st2.executeQuery();
                if(rs2.next()){
                    int discountpercentage = Integer.parseInt(rs2.getString(1));
                    if(discountpercentage == 2){
                        cost -= (cost/20);
                    }
                    else if(discountpercentage == 1){
                        cost -= (cost/10);
                    }
                    
                 
                    String sql3 = "update bookingdetails set totalamount = ? where bookingid = ? ";
                    PreparedStatement stmt3 = con.prepareStatement(sql3);
                    stmt3.setDouble(1,cost);
                    stmt3.setString(2,email_id);
                    int c = stmt3.executeUpdate();
                    //System.out.print(c+" srihari");
                  /*  if(c == 0)
                        JOptionPane.showMessageDialog(null,"You havent made any booking yet");
                    else    
                        JOptionPane.showMessageDialog(null,"Food Preferences Noted");*/

                    JOptionPane.showMessageDialog(null,"Total Cost is "+cost);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Details");
                
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Invalid Details");
        }
    }//GEN-LAST:event_applyDiscountActionPerformed

    private void makePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePaymentActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
            System.out.println("Connection created");
            String sql = "update userdetails set bookingstatus = ? where bookingid = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,"1");
            stmt.setString(2,email_id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Payment Successfully Done");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(PassengerDetailsPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_makePaymentActionPerformed

    private void makeBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeBookingActionPerformed
        // TODO add your handling code here:
        BookingPage BookingPageone = new BookingPage();
        BookingPageone.bookingid = email_id;
        BookingPageone.setVisible(true);
        dispose();
    }//GEN-LAST:event_makeBookingActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupRepresentativeDashboardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyDiscount;
    private javax.swing.JButton foodItinerary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton makeBooking;
    private javax.swing.JButton makePayment;
    private javax.swing.JButton passengerDetails;
    private javax.swing.JButton passwordUpdate;
    // End of variables declaration//GEN-END:variables
}
