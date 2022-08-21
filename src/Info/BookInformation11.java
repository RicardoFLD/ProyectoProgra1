//BOOK INFORMATION
package Info;

import Interface.*;
import Books.Bookinfo;
import Books.SavedBooks;
import static Books.SavedBooks.books;
import static Interface.Administrator.loadData;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class BookInformation11 extends javax.swing.JFrame {

    
    /**
     * Creates new form BookInformation
     */
    public BookInformation11() {
        initComponents();
        this.setSize(600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jauthor = new javax.swing.JTextField();
        JTitlespot = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sinopsis:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        Jauthor.setBackground(new java.awt.Color(255, 255, 255));
        Jauthor.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        Jauthor.setForeground(new java.awt.Color(102, 102, 102));
        Jauthor.setBorder(null);
        jPanel1.add(Jauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 220, -1));

        JTitlespot.setBackground(new java.awt.Color(255, 255, 255));
        JTitlespot.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        JTitlespot.setForeground(new java.awt.Color(0, 0, 0));
        JTitlespot.setText("Doctor sueño ");
        JTitlespot.setBorder(null);
        jPanel1.add(JTitlespot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, -1));

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Dan, alcohólico y traumatizado por lo que le pasó siendo un niño en el hotel Overlook, conoce a Abra, una adolescente que posee el mismo don que él. Dan tratará de salvar a Abra de un grupo de siniestros personajes que ansían la inmortalidad y aspiran alcanzarla alimentándose de los poderes psíquicos de gente como ellos.");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 430, 170));

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setText("Reservar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Interface inicio=new Interface();
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Interface inicio=new Interface();
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BookInformation11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInformation11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInformation11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInformation11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInformation11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTitlespot;
    private javax.swing.JTextField Jauthor;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
