
public class AdminDashBoard extends javax.swing.JFrame {


    public AdminDashBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTrainSchedule = new javax.swing.JButton();
        btnTrainFind = new javax.swing.JButton();
        btnFareEnquiry = new javax.swing.JButton();
        btnAddTrain = new javax.swing.JButton();
        btnPassengerDetails = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ADMIN DASHBOARD");

        btnTrainSchedule.setBackground(new java.awt.Color(51, 255, 255));
        btnTrainSchedule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrainSchedule.setForeground(new java.awt.Color(153, 0, 153));
        btnTrainSchedule.setText("Train Schedule");
        btnTrainSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainScheduleActionPerformed(evt);
            }
        });

        btnTrainFind.setBackground(new java.awt.Color(51, 255, 255));
        btnTrainFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrainFind.setForeground(new java.awt.Color(153, 0, 153));
        btnTrainFind.setText("Find Train");
        btnTrainFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainFindActionPerformed(evt);
            }
        });

        btnFareEnquiry.setBackground(new java.awt.Color(51, 255, 255));
        btnFareEnquiry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFareEnquiry.setForeground(new java.awt.Color(153, 0, 153));
        btnFareEnquiry.setText("Fare Enquiry");
        btnFareEnquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFareEnquiryActionPerformed(evt);
            }
        });

        btnAddTrain.setBackground(new java.awt.Color(51, 255, 255));
        btnAddTrain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddTrain.setForeground(new java.awt.Color(153, 0, 153));
        btnAddTrain.setText("Add Trains");
        btnAddTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTrainActionPerformed(evt);
            }
        });

        btnPassengerDetails.setBackground(new java.awt.Color(51, 255, 255));
        btnPassengerDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPassengerDetails.setForeground(new java.awt.Color(153, 0, 153));
        btnPassengerDetails.setText("Passenger Details");
        btnPassengerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassengerDetailsActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(153, 0, 153));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTrainFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTrain, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFareEnquiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPassengerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(329, 329, 329))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(btnTrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnTrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrainFind, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFareEnquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPassengerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddTrain, btnFareEnquiry, btnPassengerDetails, btnTrainFind, btnTrainSchedule});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrainScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainScheduleActionPerformed
        TrainScheduleForm ts = new TrainScheduleForm();
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrainScheduleActionPerformed

    private void btnTrainFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainFindActionPerformed
        TrainBetweenStation tbs = new TrainBetweenStation();
        tbs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrainFindActionPerformed

    private void btnFareEnquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFareEnquiryActionPerformed
        TrainFareEnquiryForm tfq = new TrainFareEnquiryForm();
        tfq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFareEnquiryActionPerformed

    private void btnAddTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTrainActionPerformed
        TrainsAdd ta = new TrainsAdd();
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddTrainActionPerformed

    private void btnPassengerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassengerDetailsActionPerformed
        PassengerDetailsForm pdf = new PassengerDetailsForm();
        pdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPassengerDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTrain;
    private javax.swing.JButton btnFareEnquiry;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPassengerDetails;
    private javax.swing.JButton btnTrainFind;
    private javax.swing.JButton btnTrainSchedule;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
