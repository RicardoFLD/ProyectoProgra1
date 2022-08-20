//BOOK INFORMATION
package Interface;

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
public class BookInformation extends javax.swing.JFrame {

    
    /**
     * Creates new form BookInformation
     */
    
    timer t;
    
    public BookInformation() {
        initComponents();
        this.setSize(600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        t= new timer(5,0,TimeLabel);
        t.start();
        if (TimeLabel.equals("0:0")) {
            this.dispose();
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

        jPanel1 = new javax.swing.JPanel();
        Cover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReserveBook = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Jauthor = new javax.swing.JTextField();
        JTitlespot = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cover.setText("p");
        jPanel1.add(Cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 230));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sinopsis:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sinopsis aquí");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 330, 200));

        btnReserveBook.setBackground(new java.awt.Color(102, 153, 255));
        btnReserveBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveBookMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reservar");

        javax.swing.GroupLayout btnReserveBookLayout = new javax.swing.GroupLayout(btnReserveBook);
        btnReserveBook.setLayout(btnReserveBookLayout);
        btnReserveBookLayout.setHorizontalGroup(
            btnReserveBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReserveBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnReserveBookLayout.setVerticalGroup(
            btnReserveBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReserveBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
        );

        jPanel1.add(btnReserveBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 110, 30));

        Jauthor.setBackground(new java.awt.Color(255, 255, 255));
        Jauthor.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        Jauthor.setForeground(new java.awt.Color(102, 102, 102));
        Jauthor.setBorder(null);
        jPanel1.add(Jauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 220, -1));

        JTitlespot.setBackground(new java.awt.Color(255, 255, 255));
        JTitlespot.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        JTitlespot.setBorder(null);
        jPanel1.add(JTitlespot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, -1));

        TimeLabel.setForeground(new java.awt.Color(204, 204, 204));
        TimeLabel.setText("MM:SS");
        jPanel1.add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

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

    private void btnReserveBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveBookMouseClicked
        
        TreeMap<String,String> reservados= new TreeMap<>();
        String book=JTitlespot.getText();
        String author=Jauthor.getText();
        reservados.put(book, author);
        for (Bookinfo a : books) {
            if (a.getTitle().equals(reservados.get(book)) && a.getAuthor().equals(reservados.values())) {
                try {
                    String titulo=a.getTitle();
                    String autor=a.getAuthor();
                    String genero=a.getGenre();
                    String isbn=a.getISBN();
                    String anno=a.getYear();
                    String edicion=a.getEdition();
                    String tema=a.getTopic();
                    String portada=a.getCover();
                    
                    
                    Bookinfo add=new Bookinfo();
                    add.setTitle(titulo);
                    add.setAuthor(autor);
                    add.setGenre(genero);
                    add.setISBN(isbn);
                    add.setYear(anno);
                    add.setEdition(edicion);
                    add.setCover(portada);
                    add.setTopic(tema);
                    
                    SavedBooks.reserved.add(add);
                    loadData();
                    Thread hilo=new Thread("ReservedTime");
                    hilo.start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El libro se ha reservado durante dos semanas");
                }
            }
        }
    }//GEN-LAST:event_btnReserveBookMouseClicked

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
            java.util.logging.Logger.getLogger(BookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover;
    private javax.swing.JTextField JTitlespot;
    private javax.swing.JTextField Jauthor;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JPanel btnReserveBook;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
