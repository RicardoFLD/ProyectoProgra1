/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Books.Bookinfo;
import Books.SavedBooks;
import LogIn.Login;
import com.itextpdf.text.DocumentException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jesus
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    
    File inventario= new File("DB.txt");
    
    
    static DefaultTableModel InventoryModel= new DefaultTableModel();
    static DefaultTableModel InventoryModelReserved= new DefaultTableModel();
    
    
    public Administrator() throws IOException {
        initComponents();
        
        verifyDataBase();
        
        fillupData();
        
        this.setSize(1200, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        InventoryTab.setModel(InventoryModel);
        
        
        InventoryModel.addColumn("Titulo");
        InventoryModel.addColumn("Autor");
        InventoryModel.addColumn("Género");
        InventoryModel.addColumn("ISBN");
        InventoryModel.addColumn("Año");
        InventoryModel.addColumn("Edición");
        InventoryModel.addColumn("Tema");
        InventoryModel.addColumn("Portada");
        InventoryModel.addColumn("Sinopsis");
        
        ReservedTab.setModel(InventoryModelReserved);
        
        InventoryModelReserved.addColumn("Titulo");
        InventoryModelReserved.addColumn("Autor");
        InventoryModelReserved.addColumn("Género");
        InventoryModelReserved.addColumn("ISBN");
        InventoryModelReserved.addColumn("Año");
        InventoryModelReserved.addColumn("Edición");
        InventoryModelReserved.addColumn("Tema");
        InventoryModelReserved.addColumn("Portada");
        
    }
    
    public static void loadData(){
        InventoryModel.setRowCount(0);
        for (int i = 0; i < SavedBooks.books.size(); i++) {
            InventoryModel.addRow(new Object[]{
                SavedBooks.books.get(i).getTitle(),
                SavedBooks.books.get(i).getAuthor(),
                SavedBooks.books.get(i).getGenre(),
                SavedBooks.books.get(i).getISBN(),
                SavedBooks.books.get(i).getYear(),
                SavedBooks.books.get(i).getEdition(),
                SavedBooks.books.get(i).getTopic(),
                SavedBooks.books.get(i).getCover(),
                SavedBooks.books.get(i).getSinopsis()
        });
        
        }
        
        InventoryModelReserved.setRowCount(0);
        for (int i = 0; i < SavedBooks.reserved.size(); i++) {
            InventoryModelReserved.addRow(new Object[]{
                SavedBooks.reserved.get(i).getTitle(),
                SavedBooks.reserved.get(i).getAuthor(),
                SavedBooks.reserved.get(i).getGenre(),
                SavedBooks.reserved.get(i).getISBN(),
                SavedBooks.reserved.get(i).getYear(),
                SavedBooks.reserved.get(i).getEdition(),
                SavedBooks.reserved.get(i).getTopic(),
                SavedBooks.reserved.get(i).getCover()
            });
            
        }
    }
    
    public void verifyDataBase() throws IOException{
        if (!inventario.exists()) {
            inventario.createNewFile();
            System.out.println("DB created");
        }else{
            System.out.println("DB already exists");
        }
    }
    
    public void fillupData() throws FileNotFoundException, IOException{
        InventoryModel.setRowCount(0);
        String linea=null;
        int filas=0;
        BufferedReader leer= new BufferedReader(new FileReader(inventario));
        
        while((linea=leer.readLine())!=null){
            filas=filas+1;
        }
        leer.close();
        if (filas==0) {
            JOptionPane.showMessageDialog(rootPane, "Blank");
        }else{
            String[][] data= new String[filas][9];
            BufferedReader leerdatos= new BufferedReader(new FileReader(inventario));
            int position=0;
            while((linea=leerdatos.readLine())!=null){
                StringTokenizer st=new StringTokenizer(linea,"\t");
                data[position][0]=st.nextToken();
                data[position][1]=st.nextToken();
                data[position][2]=st.nextToken();
                data[position][3]=st.nextToken();
                data[position][4]=st.nextToken();
                data[position][5]=st.nextToken();
                data[position][6]=st.nextToken();
                data[position][7]=st.nextToken();
                data[position][8]=st.nextToken();
                position=position+1;
            }
            
            leerdatos.close();
            
            for (int i = 0; i < data.length; i++) {
                
                String []datos=new String[9];
                for (int j = 0; j < data[i].length; j++) {
                    datos[(j)]=data[i][j];
                }
                InventoryModel.addRow(data);
            }
        }
    }

    public void inputData() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        
        String titulo= txtTitle.getText();
        String autor= txtAutor.getText();
        String genero= txtGenre.getText();
        String isbn= txtISBN.getText();
        String anno= txtYear.getText();
        String edicion= txtEdition.getText();
        String portada= txtCover.getText();
        String tema= (String) txtTopic.getSelectedItem();
        String Sinopsis= txtSinopsis.getText();
        
        BufferedWriter escribir= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inventario, true),"utf-8"));
        escribir.write(titulo+"\t"+autor+"\t"+genero+"\t"+isbn+"\t"+anno+"\t"+edicion+"\t"+portada+"\t"+tema+"\t"+Sinopsis+"\n");
        escribir.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnReporteIn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryTab = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnReporteRe = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReservedTab = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtEdition = new javax.swing.JTextField();
        txtGenre = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtCover = new javax.swing.JTextField();
        txtSinopsis = new javax.swing.JTextField();
        txtTopic = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AboutMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        GoToLibrary = new javax.swing.JMenu();
        ExiMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        LogOutMenu = new javax.swing.JMenu();
        ChangeProfileMenu = new javax.swing.JMenu();

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnReporteIn.setBackground(new java.awt.Color(51, 153, 255));
        btnReporteIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteInMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reporte");

        javax.swing.GroupLayout btnReporteInLayout = new javax.swing.GroupLayout(btnReporteIn);
        btnReporteIn.setLayout(btnReporteInLayout);
        btnReporteInLayout.setHorizontalGroup(
            btnReporteInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteInLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        btnReporteInLayout.setVerticalGroup(
            btnReporteInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporteInLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        InventoryTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(InventoryTab);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnReporteRe.setBackground(new java.awt.Color(51, 153, 255));
        btnReporteRe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteReMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Reporte");

        javax.swing.GroupLayout btnReporteReLayout = new javax.swing.GroupLayout(btnReporteRe);
        btnReporteRe.setLayout(btnReporteReLayout);
        btnReporteReLayout.setHorizontalGroup(
            btnReporteReLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteReLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnReporteReLayout.setVerticalGroup(
            btnReporteReLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporteReLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        ReservedTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ReservedTab);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteRe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Autor");

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ISBN");

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Portada");

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Edición");

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Género");

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tema");

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sinopsis");

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Agregar");

        javax.swing.GroupLayout btnAddLayout = new javax.swing.GroupLayout(btnAdd);
        btnAdd.setLayout(btnAddLayout);
        btnAddLayout.setHorizontalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAddLayout.setVerticalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitle.setText(". . .");

        txtAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAutor.setText(". . .");

        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setText(". . .");

        txtEdition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdition.setText(". . .");

        txtGenre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenre.setText(". . .");

        txtISBN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtISBN.setText(". . .");

        txtCover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCover.setText(". . .");

        txtSinopsis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSinopsis.setText(". . .");

        txtTopic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tema", "Ciencia", "Historia", "Literatura", "Matemática" }));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eliminar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtTitle)
                    .addComponent(txtEdition)
                    .addComponent(txtCover, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor)
                    .addComponent(txtGenre)
                    .addComponent(txtTopic, 0, 191, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtYear)
                    .addComponent(txtISBN)
                    .addComponent(txtSinopsis, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(200, 200, 200))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtYear))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdition)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtISBN))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        jTabbedPane1.addTab("tab3", jPanel8);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 580));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(51, 102, 255));

        AboutMenu.setText("Opciones");
        AboutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMenuMouseClicked(evt);
            }
        });

        jMenu3.setText("Acerca de");
        AboutMenu.add(jMenu3);

        GoToLibrary.setText("Volver a biblioteca");
        GoToLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToLibraryMouseClicked(evt);
            }
        });
        AboutMenu.add(GoToLibrary);

        ExiMenu.setText("Salir");
        ExiMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExiMenuMouseClicked(evt);
            }
        });
        AboutMenu.add(ExiMenu);

        jMenuBar1.add(AboutMenu);

        jMenu2.setText("Perfiles");

        LogOutMenu.setText("Cerrar Sesión");
        LogOutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMenuMouseClicked(evt);
            }
        });
        jMenu2.add(LogOutMenu);

        ChangeProfileMenu.setText("Cambiar perfil");
        ChangeProfileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeProfileMenuMouseClicked(evt);
            }
        });
        jMenu2.add(ChangeProfileMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        try {
            inputData();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            Bookinfo add=new Bookinfo();
            add.setTitle(txtTitle.getText());
            add.setAuthor(txtAutor.getText());
            add.setGenre(txtGenre.getText());
            add.setISBN(txtISBN.getText());
            add.setYear(txtYear.getText());
            add.setEdition(txtEdition.getText());
            add.setTopic((String)txtTopic.getSelectedItem());
            add.setCover(txtCover.getText());
            add.setSinopsis(txtSinopsis.getText());
            
            SavedBooks.books.add(add);
            loadData();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Libro agregado");
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnReporteInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteInMouseClicked
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
        String fechas = formato.format(fecha);
        
        String[][] libros= new String [InventoryModel.getRowCount()][9];
        
        for (int i = 0; i < InventoryModel.getRowCount(); i++) {
            for (int j = 0; j < 8; j++) {
                libros[i][j]=String.valueOf(InventoryModel.getValueAt(i, j));
            }
        }
        
        Reports reporte=new Reports("Reporte Inventario General", fechas.toString(),libros);
        try {
            reporte.crearReporte();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteInMouseClicked

    private void btnReporteReMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteReMouseClicked
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
        String fechas = formato.format(fecha);
        
        String[][] libros= new String [InventoryModelReserved.getRowCount()][8];
        
        for (int i = 0; i < InventoryModelReserved.getRowCount(); i++) {
            for (int j = 0; j < 8; j++) {
                libros[i][j]=String.valueOf(InventoryModelReserved.getValueAt(i, j));
            }
        }
        
        ReservedReports reporte=new ReservedReports("Reporte Inventario Reservado", fechas.toString(),libros);
        try {
            reporte.crearReporte();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteReMouseClicked

    private void AboutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMenuMouseClicked
        About change=new About();
        change.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AboutMenuMouseClicked

    private void GoToLibraryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToLibraryMouseClicked
        Interface library=new Interface();
        library.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GoToLibraryMouseClicked

    private void ExiMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExiMenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_ExiMenuMouseClicked

    private void LogOutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMenuMouseClicked
        Login change=new Login();
        change.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMenuMouseClicked

    private void ChangeProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeProfileMenuMouseClicked
        Login change=new Login();
        change.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeProfileMenuMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    String titulo= txtTitle.getText();
    String autor= txtAutor.getText();
    String genero= txtGenre.getText();
    String isbn= txtISBN.getText();
    String anno= txtYear.getText();
    String edicion= txtEdition.getText();
    String portada= txtCover.getText();
    String tema= (String) txtTopic.getSelectedItem();
    String Sinopsis= txtSinopsis.getText();
                
    ArrayList <String> deleted= new ArrayList<>();
    deleted.add(titulo);
    deleted.add(autor);
    deleted.add(genero);
    deleted.add(isbn);
    deleted.add(anno);
    deleted.add(edicion);
    deleted.add(portada);
    deleted.add(tema);
    deleted.add(Sinopsis);
                
    for (String i : deleted) {
        for (Bookinfo a : SavedBooks.books) {
            if (titulo.equals(a.getTitle())) {
                SavedBooks.books.remove(a);
                loadData();
                JOptionPane.showMessageDialog(null, "Libro eliminado");
                }
            }
        }
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Administrator().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenu ChangeProfileMenu;
    private javax.swing.JMenu ExiMenu;
    private javax.swing.JMenu GoToLibrary;
    private javax.swing.JTable InventoryTab;
    private javax.swing.JMenu LogOutMenu;
    private javax.swing.JTable ReservedTab;
    private javax.swing.JPanel btnAdd;
    private javax.swing.JPanel btnReporteIn;
    private javax.swing.JPanel btnReporteRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCover;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtSinopsis;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JComboBox<String> txtTopic;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
