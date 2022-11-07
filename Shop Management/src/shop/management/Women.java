
package shop.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Women extends javax.swing.JFrame {

    
    public Women() {
        super("Women");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        squantity = new javax.swing.JTextField();
        sbuy = new javax.swing.JButton();
        sprice = new javax.swing.JLabel();
        lbuy = new javax.swing.JButton();
        lquantity = new javax.swing.JTextField();
        lprice = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        shbuy = new javax.swing.JButton();
        shquantity = new javax.swing.JTextField();
        shprice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        scode = new javax.swing.JComboBox<>();
        lcode = new javax.swing.JComboBox<>();
        shcode = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Women");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sharee");

        squantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        sbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sbuy.setText("Buy");
        sbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuyActionPerformed(evt);
            }
        });

        sprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sprice.setForeground(new java.awt.Color(255, 255, 255));
        sprice.setText("3200");

        lbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbuy.setText("Buy");
        lbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbuyActionPerformed(evt);
            }
        });

        lquantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lprice.setForeground(new java.awt.Color(255, 255, 255));
        lprice.setText("9000");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lahenga");

        shbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shbuy.setText("Buy");
        shbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shbuyActionPerformed(evt);
            }
        });

        shquantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        shprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shprice.setForeground(new java.awt.Color(255, 255, 255));
        shprice.setText("5000");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Shoes");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Item");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Code");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quantity");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        scode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S-01", "S-02", "S-03", " " }));

        lcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L-01", "L-02", "L-03" }));

        shcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SH-01", "SH-02", "SH-03" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(sprice))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(squantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(sbuy))
                                    .addComponent(jLabel14))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(lcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(shcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lprice)
                                    .addGap(35, 35, 35)
                                    .addComponent(lquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(lbuy))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(shprice)
                                    .addGap(35, 35, 35)
                                    .addComponent(shquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(shbuy)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sprice)
                        .addComponent(squantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sbuy)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lprice)
                        .addComponent(lquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbuy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shprice)
                    .addComponent(shquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shbuy)
                    .addComponent(shcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(127, 127, 127)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(652, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuyActionPerformed
        String sc = String.valueOf(scode.getSelectedItem());
        String sp = sprice.getText();
        String sq = squantity.getText();
        if(sc.isEmpty() || sp.isEmpty() || sq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO sharee (scode,sprice,squantity) VALUES(?,?,?)");



            st.setString(1, sc);
            st.setString(2, sp);
            st.setString(3, sq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            sprice.setText("");
            sprice.requestFocus();
            scode.setSelectedItem("");
            squantity.setText("");

        }

        }
    }//GEN-LAST:event_sbuyActionPerformed

    private void lbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbuyActionPerformed
String lc = String.valueOf(lcode.getSelectedItem());
        String lp = lprice.getText();
        String lq = lquantity.getText();
        if(lc.isEmpty() || lp.isEmpty() || lq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO lahenga (lcode,lprice,lquantity) VALUES(?,?,?)");



            st.setString(1, lc);
            st.setString(2, lp);
            st.setString(3, lq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            lprice.setText("");
            lprice.requestFocus();
            scode.setSelectedItem("");
            squantity.setText("");

        }

        }
       
    }//GEN-LAST:event_lbuyActionPerformed

    private void shbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shbuyActionPerformed
String fshc = String.valueOf(shcode.getSelectedItem());
        String fshp = shprice.getText();
        String fshq = shquantity.getText();
        if(fshc.isEmpty() || fshp.isEmpty() || fshq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO fshoes (shcode,shprice,shquantity) VALUES(?,?,?)");



            st.setString(1, fshc);
            st.setString(2, fshp);
            st.setString(3, fshq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            shprice.setText("");
            shprice.requestFocus();
            shcode.setSelectedItem("");
            shquantity.setText("");

        }

        }   
    }//GEN-LAST:event_shbuyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fashion fh = new fashion();
        fh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Women().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lbuy;
    private javax.swing.JComboBox<String> lcode;
    private javax.swing.JLabel lprice;
    private javax.swing.JTextField lquantity;
    private javax.swing.JButton sbuy;
    private javax.swing.JComboBox<String> scode;
    private javax.swing.JButton shbuy;
    private javax.swing.JComboBox<String> shcode;
    private javax.swing.JLabel shprice;
    private javax.swing.JTextField shquantity;
    private javax.swing.JLabel sprice;
    private javax.swing.JTextField squantity;
    // End of variables declaration//GEN-END:variables
}
