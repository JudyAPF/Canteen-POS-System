/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Judy
 */
public class BillPrint extends javax.swing.JFrame {

    /**
     * Creates new form BillPrint
     */
    public BillPrint() {
        initComponents();
        billPrint();
    }

    public void billPrint() {
        try {
            
            bill.setText("\t   NANAY'S CANTEEN \n");
            bill.setText(bill.getText() + "\t   McArthur Hwy, Nancayasan, \n");
            bill.setText(bill.getText() + "\t   Urdaneta, Pangasinan \n");
            bill.setText(bill.getText() + "\t   (075) 653 7240 \n");
            bill.setText(bill.getText() + " ------------------------------------------------------------------------------ \n");
            
            Menu menu = new Menu();
            
            DefaultTableModel df = (DefaultTableModel) menu.jTable1.getModel();
 
            //get table product details
            for (int i = 0; i < menu.jTable1.getRowCount(); i++) {
                //String Name = df.getValueAt(i, 0).toString();
                //String Qty = df.getValueAt(i, 1).toString();
                //String Price = df.getValueAt(i, 2).toString();
                
                bill.setText(bill.getText() +"\t"+ df.getValueAt(i, 0).toString() +"\t"+ df.getValueAt(i, 1).toString() +
                        "\t"+ df.getValueAt(i, 2).toString());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 340, 555));

        setSize(new java.awt.Dimension(1334, 762));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(BillPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea bill;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
