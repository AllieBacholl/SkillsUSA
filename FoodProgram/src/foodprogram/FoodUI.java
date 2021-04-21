
package foodprogram;

/**
 *
 * @author albac
 */
public class FoodUI extends javax.swing.JFrame {

    /**
     * Creates new form FoodUI
     */
    public FoodUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHotDog = new javax.swing.JLabel();
        lblHotDogPrice = new javax.swing.JLabel();
        lblBrat = new javax.swing.JLabel();
        lblBratPrice = new javax.swing.JLabel();
        lblHamburger = new javax.swing.JLabel();
        lblHamburgerPrice = new javax.swing.JLabel();
        txtFieldHotDog = new javax.swing.JTextField();
        txtFieldHamburger = new javax.swing.JTextField();
        txtFieldBrat = new javax.swing.JTextField();
        txtFieldFries = new javax.swing.JTextField();
        txtFieldWater = new javax.swing.JTextField();
        lblFries = new javax.swing.JLabel();
        txtFieldSoda = new javax.swing.JTextField();
        lblFriesPrice = new javax.swing.JLabel();
        lblSoda = new javax.swing.JLabel();
        lblSodaPrice = new javax.swing.JLabel();
        lblWater = new javax.swing.JLabel();
        lblWaterPrice = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblHotDogTotal = new javax.swing.JLabel();
        lblBratTotal = new javax.swing.JLabel();
        lblHamburgerTotal = new javax.swing.JLabel();
        lblFriesTotal = new javax.swing.JLabel();
        lblSodaTotal = new javax.swing.JLabel();
        lblWaterTotal = new javax.swing.JLabel();
        lblTotalHotDogsTitle = new javax.swing.JLabel();
        lblTotalFriesTitle = new javax.swing.JLabel();
        lblTotalBratsTitle = new javax.swing.JLabel();
        lblTotalHamburgersTitle = new javax.swing.JLabel();
        lblTotalWaterTitle = new javax.swing.JLabel();
        lblTotalSodasTitle = new javax.swing.JLabel();
        lblTotalSalesTitle = new javax.swing.JLabel();
        lblTotalSales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitle.setText("Food Truck");

        lblHotDog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHotDog.setText("Hot Dog");

        lblHotDogPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHotDogPrice.setText("$2.50");

        lblBrat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBrat.setText("Brat");

        lblBratPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBratPrice.setText("$3.50");

        lblHamburger.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHamburger.setText("Hamburger");

        lblHamburgerPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamburgerPrice.setText("$5.00");

        txtFieldHotDog.setText("0");

        txtFieldHamburger.setText("0");

        txtFieldBrat.setText("0");

        txtFieldFries.setText("0");

        txtFieldWater.setText("0");

        lblFries.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFries.setText("Fries");

        txtFieldSoda.setText("0");

        lblFriesPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFriesPrice.setText("$2.00");

        lblSoda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSoda.setText("Soda");

        lblSodaPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSodaPrice.setText("$2.00");

        lblWater.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWater.setText("Water");

        lblWaterPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWaterPrice.setText("Free");

        btnCalculate.setText("Calculate");

        btnClear.setText("Clear");
        btnClear.setMaximumSize(new java.awt.Dimension(57, 23));
        btnClear.setMinimumSize(new java.awt.Dimension(57, 23));

        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(51, 23));
        btnExit.setMinimumSize(new java.awt.Dimension(51, 23));

        lblHotDogTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHotDogTotal.setText("0");

        lblBratTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBratTotal.setText("0");

        lblHamburgerTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamburgerTotal.setText("0");

        lblFriesTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFriesTotal.setText("0");

        lblSodaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSodaTotal.setText("0");
        lblSodaTotal.setToolTipText("");

        lblWaterTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWaterTotal.setText("0");

        lblTotalHotDogsTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalHotDogsTitle.setText("Total Sold:");

        lblTotalFriesTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalFriesTitle.setText("Total Sold:");

        lblTotalBratsTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalBratsTitle.setText("Total Sold:");

        lblTotalHamburgersTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalHamburgersTitle.setText("Total Sold:");

        lblTotalWaterTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalWaterTitle.setText("Total Sold:");

        lblTotalSodasTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalSodasTitle.setText("Total Sold:");

        lblTotalSalesTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalSalesTitle.setText("Total Sales:");

        lblTotalSales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalSales.setText("$0.00");
        lblTotalSales.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTotalSalesTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalSales))
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHamburger)
                                    .addComponent(lblHotDog)
                                    .addComponent(lblBrat))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldBrat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotalHotDogsTitle)
                                    .addComponent(lblTotalBratsTitle)
                                    .addComponent(lblTotalHamburgersTitle)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHotDogPrice)
                                    .addComponent(lblBratPrice)
                                    .addComponent(lblHamburgerPrice)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCalculate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBratTotal)
                            .addComponent(lblHotDogTotal)
                            .addComponent(lblHamburgerTotal))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWater)
                            .addComponent(lblFries)
                            .addComponent(lblSoda)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWaterPrice)
                                    .addComponent(lblFriesPrice)
                                    .addComponent(lblSodaPrice))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFieldSoda)
                                .addComponent(txtFieldFries, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldWater, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTotalFriesTitle)
                                        .addComponent(lblTotalWaterTitle)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTotalSodasTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWaterTotal)
                                    .addComponent(lblSodaTotal)
                                    .addComponent(lblFriesTotal))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalSalesTitle)
                    .addComponent(lblTotalSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFieldHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFries)
                            .addComponent(lblHotDog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblHotDogTotal)
                            .addComponent(lblFriesTotal)
                            .addComponent(lblTotalHotDogsTitle)
                            .addComponent(lblTotalFriesTitle)
                            .addComponent(lblHotDogPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFriesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblBrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtFieldBrat)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBratPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblHamburger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtFieldHamburger)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHamburgerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblSoda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtFieldSoda)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSodaPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSodaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotalSodasTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblWater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtFieldWater)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblWaterPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWaterTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotalWaterTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalculate)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBratTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(lblHamburgerTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalBratsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(lblTotalHamburgersTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(41, 41, 41)))
                .addContainerGap())
        );

        lblTitle.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblBrat;
    private javax.swing.JLabel lblBratPrice;
    private javax.swing.JLabel lblBratTotal;
    private javax.swing.JLabel lblFries;
    private javax.swing.JLabel lblFriesPrice;
    private javax.swing.JLabel lblFriesTotal;
    private javax.swing.JLabel lblHamburger;
    private javax.swing.JLabel lblHamburgerPrice;
    private javax.swing.JLabel lblHamburgerTotal;
    private javax.swing.JLabel lblHotDog;
    private javax.swing.JLabel lblHotDogPrice;
    private javax.swing.JLabel lblHotDogTotal;
    private javax.swing.JLabel lblSoda;
    private javax.swing.JLabel lblSodaPrice;
    private javax.swing.JLabel lblSodaTotal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalBratsTitle;
    private javax.swing.JLabel lblTotalFriesTitle;
    private javax.swing.JLabel lblTotalHamburgersTitle;
    private javax.swing.JLabel lblTotalHotDogsTitle;
    private javax.swing.JLabel lblTotalSales;
    private javax.swing.JLabel lblTotalSalesTitle;
    private javax.swing.JLabel lblTotalSodasTitle;
    private javax.swing.JLabel lblTotalWaterTitle;
    private javax.swing.JLabel lblWater;
    private javax.swing.JLabel lblWaterPrice;
    private javax.swing.JLabel lblWaterTotal;
    private javax.swing.JTextField txtFieldBrat;
    private javax.swing.JTextField txtFieldFries;
    private javax.swing.JTextField txtFieldHamburger;
    private javax.swing.JTextField txtFieldHotDog;
    private javax.swing.JTextField txtFieldSoda;
    private javax.swing.JTextField txtFieldWater;
    // End of variables declaration//GEN-END:variables
}
