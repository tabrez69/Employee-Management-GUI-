
package EmpGUI;

import EmpApp.dbutil.DBConnection;
import javax.swing.JOptionPane;


public class Options extends javax.swing.JFrame {

    
    public Options() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Welcome To Application");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        addEmp = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JRadioButton();
        total = new javax.swing.JRadioButton();
        quit = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        delete = new javax.swing.JRadioButton();
        update = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        addEmp.setBackground(new java.awt.Color(0, 0, 0));
        addEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addEmp.setForeground(new java.awt.Color(255, 255, 255));
        addEmp.setText("Add new Employee");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Your Task");

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search Employee");

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("Total Employee");

        quit.setBackground(new java.awt.Color(0, 0, 0));
        quit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 255, 255));
        quit.setText("Quit");

        submit.setBackground(new java.awt.Color(0, 204, 102));
        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 102, 102));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete Employee");

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update Employee Details");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("WELCOME TO APPLICATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search)
                    .addComponent(addEmp)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quit)
                    .addComponent(delete)
                    .addComponent(update))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(update))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmp)
                    .addComponent(quit))
                .addGap(27, 27, 27)
                .addComponent(submit)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(!isValidate()){
           JOptionPane.showMessageDialog(null, "Please Select an Option", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if(addEmp.isSelected()){
            AddEmployee ae = new AddEmployee();
            ae.setVisible(true);
            this.dispose();
        }
        else if(search.isSelected()){
            SearchEmployee se = new SearchEmployee();
            se.setVisible(true);
            this.dispose();
        }
        else if(total.isSelected()){
            AllData ad = new AllData();
            ad.setVisible(true);
            this.dispose();
        }
        else if(update.isSelected()){
            UpdateLanding ud = new UpdateLanding();
            ud.setVisible(true);
            this.dispose();
        }
        else if(delete.isSelected()){
            Delete d = new Delete();
            d.setVisible(true);
            this.dispose();
        }
        else if(quit.isSelected()){
            JOptionPane.showMessageDialog(null, "Thank You for Using App!", "Thanks", JOptionPane.INFORMATION_MESSAGE);
            DBConnection.closeConnection();
            System.exit(0);
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton addEmp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton quit;
    private javax.swing.JRadioButton search;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton total;
    private javax.swing.JRadioButton update;
    // End of variables declaration                   

    private boolean isValidate() {
        if(!addEmp.isSelected() && !quit.isSelected() && !search.isSelected() && !total.isSelected() && !update.isSelected() && !delete.isSelected()){
            return false;
        }
        return true;
                
    }
}
