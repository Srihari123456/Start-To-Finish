import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class BookingPage extends javax.swing.JFrame {
    public String bookingid;
    public BookingPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        journeydate = new javax.swing.JTextField();
        groupsize = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bookingdate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking Portal");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Trip Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Date of Journey (DD.MM.YYYY)");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Group Size");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("City");

        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 102, 0));
        submit.setText("Submit Details");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Date of booking (DD.MM.YYYY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city)
                            .addComponent(journeydate)
                            .addComponent(groupsize)
                            .addComponent(bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(journeydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(groupsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CityTour","srihari","srihari");
            PreparedStatement st = con.prepareStatement("insert into bookingdetails values(?,?,?,?,?,?,?)");
            st.setString(1,bookingid);
            
            st.setInt(2,Integer.parseInt(groupsize.getText()));
            st.setString(3,city.getText());
            if(Integer.parseInt(groupsize.getText()) > 5)
                st.setDouble(4,1);
            else
                st.setDouble(4,0);
            
            
            String jd = journeydate.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
            Date journeydates = sdf1.parse(jd);//util Date class object
            long ms = journeydates.getTime();
            java.sql.Date sqjd = new java.sql.Date(ms);//sql Date class object
            
            String bd = bookingdate.getText();
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
            Date bookingdates = sdf1.parse(bd);//util Date class object
            long ms2 = bookingdates.getTime();
            java.sql.Date sqbd = new java.sql.Date(ms2);//sql Date class object
            
            st.setDate(6,sqjd);
            st.setDate(5,sqbd);
            st.setDouble(7,0);
            
            
            int ab = st.executeUpdate();
            if(ab > 0){
                System.out.println("Row inserted");
                JOptionPane.showMessageDialog(null,"Booking Registered");
                
                String sql2 = "select discount,bookingdate,journeydate from bookingdetails where bookingid = ?";
                PreparedStatement st2 = con.prepareStatement(sql2);
                st2.setString(1,(bookingid));
                ResultSet rs2 = st2.executeQuery();
                if(rs2.next()){
                    String sql3 = "select * from bookingdetails where {fn TIMESTAMPDIFF(SQL_TSI_DAY, ?, ?)}>=14 and bookingid = ?";
                    //String sql3 = "select DATEDIFF(d,?,?) from bookingdetails where bookingid = ?";{fn TIMESTAMPDIFF(SQL_TSI_DAY, ?, ?)} <=60  and
                    PreparedStatement stmt3 = con.prepareStatement(sql3);
                    stmt3.setDate(1, rs2.getDate(2));
                    stmt3.setDate(2, rs2.getDate(3));
                    stmt3.setString(3,(bookingid));
                    ResultSet rs3 = stmt3.executeQuery();
                    
                    if(rs3.next()){
                        System.out.println(rs3.getString(1)+" is the datediff");
                        String sql5 = "update bookingdetails set discount = ? where bookingid = ?";
                        PreparedStatement stmt5 = con.prepareStatement(sql5);
                        stmt5.setDouble(1,2);
                        stmt5.setString(2,bookingid);
                        stmt5.executeUpdate();
                    }
                    else{
                        //System.out.println("");
                    }
                 
                }
                String sql4 = "update userdetails set itinerary = ? where bookingid = ?";
                PreparedStatement stmt = con.prepareStatement(sql4);
                stmt.setString(1,city.getText()+"-"+journeydate.getText());
                stmt.setString(2,bookingid);
                int xc = stmt.executeUpdate();
                if(xc != 0)
                    JOptionPane.showMessageDialog(null,"Itinerary Successfully Updated");
                else
                    JOptionPane.showMessageDialog(null,"Noooooo Itinerary Not Successfully Updated");
                con.close();
                
                GroupRepresentativeDashboardPage GroupRepresentativeDashboardPageone = new GroupRepresentativeDashboardPage();
                GroupRepresentativeDashboardPageone.email_id = bookingid;
                GroupRepresentativeDashboardPageone.setVisible(true);
                dispose();
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Details");
            }
            
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookingdate;
    private javax.swing.JTextField city;
    private javax.swing.JTextField groupsize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField journeydate;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
