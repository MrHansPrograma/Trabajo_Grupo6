/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import DataClasses.EmployeeData;
import DataClasses.InstitutionData;
import DataClasses.PersonaData;
import DataManager.EmployeeManager;
import DataManager.InstitutionManager;
import DataManager.PersonaManager;
import TDA.LDE;
import TDA.Nodo_LSE;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TableRegistroUI extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    int countL = 1;
    
    public TableRegistroUI() {
        initComponents();
        initializeTable_INTS();
        initializaTable_WK();
        initializaTable_PE();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_TR = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn_MM = new javax.swing.JPanel();
        txt_exit_MM = new javax.swing.JLabel();
        jPanel_CardLayout_INFO = new javax.swing.JPanel();
        jScrollPane_WK = new javax.swing.JScrollPane();
        jTable_WK = new javax.swing.JTable();
        jScrollPane_INST = new javax.swing.JScrollPane();
        jTable_INST = new javax.swing.JTable();
        jScrollPane_PE = new javax.swing.JScrollPane();
        jTable_PE = new javax.swing.JTable();
        jLabel_ExpReg = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jButton_Avanzar = new javax.swing.JButton();
        jButton_Retroceder = new javax.swing.JButton();
        jLabel_Numb_Pag = new javax.swing.JLabel();
        jLabel_Name_Pag = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        Background_TR.setBackground(new java.awt.Color(255, 255, 255));
        Background_TR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(java.awt.Color.lightGray);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn_MM.setBackground(java.awt.Color.lightGray);

        txt_exit_MM.setBackground(new java.awt.Color(255, 255, 255));
        txt_exit_MM.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        txt_exit_MM.setForeground(new java.awt.Color(102, 102, 102));
        txt_exit_MM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit_MM.setText("X");
        txt_exit_MM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exit_MM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exit_MMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exit_MMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exit_MMMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn_MMLayout = new javax.swing.GroupLayout(exitBtn_MM);
        exitBtn_MM.setLayout(exitBtn_MMLayout);
        exitBtn_MMLayout.setHorizontalGroup(
            exitBtn_MMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit_MM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtn_MMLayout.setVerticalGroup(
            exitBtn_MMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn_MMLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exit_MM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1055, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background_TR.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jPanel_CardLayout_INFO.setLayout(new java.awt.CardLayout());

        jTable_WK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "ID Trabajador", "Telefono", "Email", "Fecha Inicio", "Fecha Final", "Estado", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_WK.setViewportView(jTable_WK);

        jPanel_CardLayout_INFO.add(jScrollPane_WK, "card3");

        jTable_INST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RUC", "Teléfono", "Email", "Fecha Inicio", "Fecha Final", "Estado", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_INST.setViewportView(jTable_INST);

        jPanel_CardLayout_INFO.add(jScrollPane_INST, "card2");

        jTable_PE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "DNI", "Telefono", "Email", "Fecha Inicio", "Fecha Final", "Estado", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_PE.setViewportView(jTable_PE);

        jPanel_CardLayout_INFO.add(jScrollPane_PE, "card4");

        Background_TR.add(jPanel_CardLayout_INFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 880, 380));

        jLabel_ExpReg.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel_ExpReg.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ExpReg.setText("EXPEDIENTES REGISTRADOS");
        Background_TR.add(jLabel_ExpReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        jLabel_Tipo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Tipo.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Tipo.setText("Tipo:");
        Background_TR.add(jLabel_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        jButton_Avanzar.setText(">>>");
        jButton_Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AvanzarActionPerformed(evt);
            }
        });
        Background_TR.add(jButton_Avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 60, -1));

        jButton_Retroceder.setText("<<<");
        jButton_Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RetrocederActionPerformed(evt);
            }
        });
        Background_TR.add(jButton_Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 60, -1));

        jLabel_Numb_Pag.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Numb_Pag.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Numb_Pag.setText("(1 / 3)");
        Background_TR.add(jLabel_Numb_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 40, -1));

        jLabel_Name_Pag.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Name_Pag.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Name_Pag.setText("Trabajador");
        Background_TR.add(jLabel_Name_Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 160, 20));

        jButton1.setText("Vista Detallada");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Background_TR.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background_TR, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_TR, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_exit_MMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit_MMMouseClicked
        ScreenManager.goBack(this);
    }//GEN-LAST:event_txt_exit_MMMouseClicked

    private void txt_exit_MMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit_MMMouseEntered
        exitBtn_MM.setBackground(Color.red);
    }//GEN-LAST:event_txt_exit_MMMouseEntered

    private void txt_exit_MMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit_MMMouseExited
        exitBtn_MM.setBackground(Color.lightGray);
    }//GEN-LAST:event_txt_exit_MMMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void jButton_RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RetrocederActionPerformed
        
        
        if(countL > 1){
            countL -= 1;
        }
        
        if(countL == 1){
           
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_WK);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(1/3)");
            jLabel_Name_Pag.setText("Trabajador");
            
        } else if(countL == 2){
            
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_PE);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(2/3)");
            jLabel_Name_Pag.setText("Persona Externa");
            
        } else {
            
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_INST);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(3/3)");
            jLabel_Name_Pag.setText("Institución");
            
        }
    }//GEN-LAST:event_jButton_RetrocederActionPerformed

    private void jButton_AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AvanzarActionPerformed
        
        
        if(countL < 3){
            countL += 1;
        }
        
        if(countL == 1){
           
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_WK);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(1/3)");
            jLabel_Name_Pag.setText("Trabajador");
            
        } else if(countL == 2){
            
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_PE);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(2/3)");
            jLabel_Name_Pag.setText("Persona Externa");
            
        } else {
            
            jPanel_CardLayout_INFO.removeAll();
            jPanel_CardLayout_INFO.add(jScrollPane_INST);
            jPanel_CardLayout_INFO.repaint();
            jPanel_CardLayout_INFO.revalidate();
            jLabel_Numb_Pag.setText("(3/3)");
            jLabel_Name_Pag.setText("Institución");
            
        }
        
    }//GEN-LAST:event_jButton_AvanzarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jLabel_Name_Pag.getText().equals("Trabajador")){
            WK_VistaDetalladaUI wk = new WK_VistaDetalladaUI();
            ScreenManager.openNewScreen(this, wk);
        }else if(jLabel_Name_Pag.getText().equals("Persona Externa")){
            PE_VistaDetalladaUI pe = new PE_VistaDetalladaUI();
            ScreenManager.openNewScreen(this, pe);
        }else {
            INST_VistaDetalladaUI inst = new INST_VistaDetalladaUI();
            ScreenManager.openNewScreen(this, inst);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void initializeTable_INTS() {
        DefaultTableModel table = (DefaultTableModel)jTable_INST.getModel();
        Nodo_LSE<InstitutionData> ptr = InstitutionManager.personas().L();
        while(ptr != null){
            table.addRow(new Object[] { ptr.value().getID_expedient(), ptr.value().getNombre(), ptr.value().getRUC(), ptr.value().getTelefono(), ptr.value().getEmail(), ptr.value().getDate_start(), ptr.value().getDate_finish(), ptr.value().getEstado_exp() ,ptr.value().getIssue() });
            ptr = ptr.next();
        }
    }
    
    private void initializaTable_WK() {
        DefaultTableModel table = (DefaultTableModel)jTable_WK.getModel();
        Nodo_LSE<EmployeeData> ptr = EmployeeManager.personas().L();
        while(ptr != null){
            table.addRow(new Object[] {ptr.value().getID_expedient(), ptr.value().getNombre(), ptr.value().getApellidos(), ptr.value().getID_employee(), ptr.value().getTelefono(), ptr.value().getEmail(), ptr.value().getDate_start(),ptr.value().getDate_start(), ptr.value().getDate_finish(),ptr.value().getIssue()  });
            ptr = ptr.next();
        }  
    }
    
    private void initializaTable_PE(){
        DefaultTableModel table = (DefaultTableModel)jTable_PE.getModel();
        Nodo_LSE<PersonaData> ptr = PersonaManager.personas().L();
        while(ptr != null){
            table.addRow(new Object[] {ptr.value().getID_expedient(), ptr.value().getNombre(), ptr.value().getApellido(), ptr.value().getDNI(), ptr.value().getTelefono(), ptr.value().getEmail(), ptr.value().getDate_start(),ptr.value().getDate_start(), ptr.value().getDate_finish(),ptr.value().getIssue()  });
            ptr = ptr.next();
        }
    }
    
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
            java.util.logging.Logger.getLogger(TableRegistroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableRegistroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableRegistroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableRegistroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableRegistroUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_TR;
    private javax.swing.JPanel exitBtn_MM;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Avanzar;
    private javax.swing.JButton jButton_Retroceder;
    private javax.swing.JLabel jLabel_ExpReg;
    private javax.swing.JLabel jLabel_Name_Pag;
    private javax.swing.JLabel jLabel_Numb_Pag;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JPanel jPanel_CardLayout_INFO;
    private javax.swing.JScrollPane jScrollPane_INST;
    private javax.swing.JScrollPane jScrollPane_PE;
    private javax.swing.JScrollPane jScrollPane_WK;
    private javax.swing.JTable jTable_INST;
    private javax.swing.JTable jTable_PE;
    private javax.swing.JTable jTable_WK;
    private javax.swing.JLabel txt_exit_MM;
    // End of variables declaration//GEN-END:variables
}
