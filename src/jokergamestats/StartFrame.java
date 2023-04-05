package jokergamestats;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import jokergamestats.JokerDataManagementFrame;

/**
 *
 * @authors 
 * Iraklis Proviadakis 
 * Thomas Gerodimos
 * 
 */


public class StartFrame extends javax.swing.JFrame {
    //Ορισμός παραμέτρων για το EntityManagerFactory και EntityManager για να μπορούμε να το καλουμε 
    //όταν χρειαστεί απο οποιοδήποτε σημείο της εφαρμογής χωρίς να το ξαναδηλώνουμε κάθε φορά
    static EntityManagerFactory emf;
    static EntityManager em;
    
    //Δημιουργία μεθόδου όπου δημιουργούμε τα αντικείμενα EntityManagerFactory και EntityManager
    public static void createEMFandEM(){
        emf=Persistence.createEntityManagerFactory("JokerGameStatsPU");
        em=emf.createEntityManager();
    }
    
    public StartFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnStatsAndPrint = new javax.swing.JButton();
        btnViewData = new javax.swing.JButton();
        btnDataManagement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\JokerGameStats\\images\\Joker.png")); // NOI18N

        btnExit.setText("ΕΞΟΔΟΣ");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStatsAndPrint.setText("ΣΤΑΤΙΣΤΙΚΑ ΚΑΙ ΕΚΤΥΠΩΣΗ");
        btnStatsAndPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsAndPrintActionPerformed(evt);
            }
        });

        btnViewData.setText("ΠΡΟΒΟΛΗ");
        btnViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDataActionPerformed(evt);
            }
        });

        btnDataManagement.setText("ΔΙΑΧΕΙΡΙΣΗ");
        btnDataManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatsAndPrint)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnDataManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatsAndPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDataActionPerformed
        
        //Δημιουργία του frame της φόρμας Προβολή Δεδομένων, άνοιγμα και κλεισιμο του τρέχοντος frame
        JokerViewDataFrame jf20 = new JokerViewDataFrame();
        //Προβολή νέας οθόνης
        jf20.setVisible(true);
        //Κλείσιμο τρέχουας οθόνης
        dispose();  
    }//GEN-LAST:event_btnViewDataActionPerformed

    private void btnDataManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataManagementActionPerformed

        //Δημιουργία του frame της φόρμας Διαχείριση Δεδομένων
        JokerDataManagementFrame jf1 = new JokerDataManagementFrame();
        //Προβολή νέας οθόνης
        jf1.setVisible(true);
        //Κλείσιμο τρέχουας οθόνης
        dispose();
    }//GEN-LAST:event_btnDataManagementActionPerformed

    private void btnStatsAndPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsAndPrintActionPerformed

        //Δημιουργία του frame της φόρμας Στατιστικά και Εκτύπωση
        JokerStatsFrame jf3 = new JokerStatsFrame();
        //Προβολή νέας οθόνης
        jf3.setVisible(true);
        //Κλείσιμο τρέχουας οθόνης
        dispose();
    }//GEN-LAST:event_btnStatsAndPrintActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        //Έξοδος απο την εφαρμογή
        //Δημιουργία του frame της φόρμας 
        JokerStatsFrame jf3 = new JokerStatsFrame();
        //ΕΜφάνιση παράθυρου διαλόγου επιβεβαίωσης
        int answer = JOptionPane.showConfirmDialog(jf3, "Η εφαρμογή πρόκειται να κλείσει. \nΕίστε σίγουρος;");
        //Έλεγχος απάντησης
        if(answer == JOptionPane.YES_OPTION){  
            jf3.setDefaultCloseOperation(JokerStatsFrame.EXIT_ON_CLOSE);
            System.exit(0);
        }   
    }//GEN-LAST:event_btnExitActionPerformed
    
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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataManagement;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStatsAndPrint;
    private javax.swing.JButton btnViewData;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
