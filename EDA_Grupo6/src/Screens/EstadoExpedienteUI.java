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
import TDA.LSE;
import static TDA.LSE.Find_ID_EXP;
import TDA.Nodo_LSE;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EstadoExpedienteUI extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public EstadoExpedienteUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_Exp_Estado = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn_MM = new javax.swing.JPanel();
        txt_exit_MM = new javax.swing.JLabel();
        jLabel_EST_EXP = new javax.swing.JLabel();
        jLabel_ID_EXP = new javax.swing.JLabel();
        jLabel_ASUNT_EXP = new javax.swing.JLabel();
        jTextField_ID_EXP = new javax.swing.JTextField();
        jLabel_ASUNT_EXP_CONT = new javax.swing.JLabel();
        jLabel_EST_EXP_CONT = new javax.swing.JLabel();
        jButton_EST = new javax.swing.JButton();
        jButton_BUSCAR = new javax.swing.JButton();
        jLabel_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background_Exp_Estado.setBackground(new java.awt.Color(255, 255, 255));
        Background_Exp_Estado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 315, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background_Exp_Estado.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jLabel_EST_EXP.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_EST_EXP.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_EST_EXP.setText("Estado:");
        Background_Exp_Estado.add(jLabel_EST_EXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_ID_EXP.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_ID_EXP.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_ID_EXP.setText("ID Expediente:");
        Background_Exp_Estado.add(jLabel_ID_EXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel_ASUNT_EXP.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_ASUNT_EXP.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_ASUNT_EXP.setText("Asunto:");
        Background_Exp_Estado.add(jLabel_ASUNT_EXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        Background_Exp_Estado.add(jTextField_ID_EXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 40, -1));

        jLabel_ASUNT_EXP_CONT.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_ASUNT_EXP_CONT.setForeground(new java.awt.Color(102, 102, 102));
        Background_Exp_Estado.add(jLabel_ASUNT_EXP_CONT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel_EST_EXP_CONT.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_EST_EXP_CONT.setForeground(new java.awt.Color(102, 102, 102));
        Background_Exp_Estado.add(jLabel_EST_EXP_CONT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jButton_EST.setText(">>>");
        jButton_EST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ESTMouseClicked(evt);
            }
        });
        Background_Exp_Estado.add(jButton_EST, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        jButton_BUSCAR.setText("Buscar");
        jButton_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BUSCARActionPerformed(evt);
            }
        });
        Background_Exp_Estado.add(jButton_BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel_Error.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Error.setForeground(new java.awt.Color(204, 0, 51));
        Background_Exp_Estado.add(jLabel_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Exp_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Exp_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
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

    private void jButton_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BUSCARActionPerformed
        
        LSE<Object> lista = new LSE<>();
        
        lista.addLast(InstitutionManager.personas());
        lista.addLast(PersonaManager.personas());
        lista.addLast(EmployeeManager.personas());
        
        Object obj = Find_ID_EXP(lista, Integer.parseInt(jTextField_ID_EXP.getText()));
        
        if (obj != null) {
            if (obj instanceof EmployeeData) {
                EmployeeData emp = (EmployeeData) obj;
                jLabel_ASUNT_EXP_CONT.setText(emp.getIssue());
                jLabel_EST_EXP_CONT.setText(emp.getEstado_exp());
                jLabel_Error.setForeground(Color.green);
                jLabel_Error.setText("Datos Encontrados");
            } else if (obj instanceof InstitutionData) {
                InstitutionData inst = (InstitutionData) obj;
                jLabel_ASUNT_EXP_CONT.setText(inst.getIssue());
                jLabel_EST_EXP_CONT.setText(inst.getEstado_exp());
                jLabel_Error.setForeground(Color.green);
                jLabel_Error.setText("Datos Encontrados");
            } else if (obj instanceof PersonaData){
                PersonaData per = (PersonaData) obj;
                jLabel_ASUNT_EXP_CONT.setText(per.getIssue());
                jLabel_EST_EXP_CONT.setText(per.getEstado_exp());
                jLabel_Error.setForeground(Color.green);
                jLabel_Error.setText("Datos Encontrados");
            } 

        } else{
                jLabel_Error.setForeground(Color.red);
                jLabel_Error.setText("ID no encontrada");
                jLabel_ASUNT_EXP_CONT.setText("");
                jLabel_EST_EXP_CONT.setText("");
            }
    }//GEN-LAST:event_jButton_BUSCARActionPerformed

    private void jButton_ESTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ESTMouseClicked
        LSE<Object> lista = new LSE<>();
        
        lista.addLast(InstitutionManager.personas());
        lista.addLast(PersonaManager.personas());
        lista.addLast(EmployeeManager.personas());
        
        Object obj = Find_ID_EXP(lista, Integer.parseInt(jTextField_ID_EXP.getText()));
        
        if (obj != null) {
            if (obj instanceof EmployeeData) {
                EmployeeData emp = (EmployeeData) obj;
                if(emp.getEstado_exp().equals("No iniciado")){
                    emp.setEstado_exp("En proceso...");
                    jLabel_EST_EXP_CONT.setText("En proceso...");
                } else if(emp.getEstado_exp().equals("En proceso...")){
                    emp.setEstado_exp("Finalizado");
                    jLabel_EST_EXP_CONT.setText("Finalizado");
                    emp.setDate_finish(Obtein_Current_Date());
                }
            } else if (obj instanceof InstitutionData) {
                
                InstitutionData inst = (InstitutionData) obj;
                if(inst.getEstado_exp().equals("No iniciado")){
                    inst.setEstado_exp("En proceso...");
                    jLabel_EST_EXP_CONT.setText("En proceso...");
                } else if(inst.getEstado_exp().equals("En proceso...")){
                    inst.setEstado_exp("Finalizado");
                    jLabel_EST_EXP_CONT.setText("Finalizado");
                    inst.setDate_finish(Obtein_Current_Date());
                }
                } else if (obj instanceof PersonaData){
                    
                PersonaData per = (PersonaData) obj;
                if(per.getEstado_exp().equals("No iniciado")){
                    per.setEstado_exp("En proceso...");
                    jLabel_EST_EXP_CONT.setText("En proceso...");
                } else if(per.getEstado_exp().equals("En proceso...")){
                    per.setEstado_exp("Finalizado");
                    jLabel_EST_EXP_CONT.setText("Finalizado");
                    per.setDate_finish(Obtein_Current_Date());
                    }
                }
        }
        
    }//GEN-LAST:event_jButton_ESTMouseClicked
    
    private String Obtein_Current_Date(){
        LocalDateTime actual_day = LocalDateTime.now();
        DateTimeFormatter format_obj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String act_day = actual_day.format(format_obj);
        
        return act_day;
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
            java.util.logging.Logger.getLogger(EstadoExpedienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadoExpedienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadoExpedienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadoExpedienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadoExpedienteUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Exp_Estado;
    private javax.swing.JPanel exitBtn_MM;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton_BUSCAR;
    private javax.swing.JButton jButton_EST;
    private javax.swing.JLabel jLabel_ASUNT_EXP;
    private javax.swing.JLabel jLabel_ASUNT_EXP_CONT;
    private javax.swing.JLabel jLabel_EST_EXP;
    private javax.swing.JLabel jLabel_EST_EXP_CONT;
    private javax.swing.JLabel jLabel_Error;
    private javax.swing.JLabel jLabel_ID_EXP;
    private javax.swing.JTextField jTextField_ID_EXP;
    private javax.swing.JLabel txt_exit_MM;
    // End of variables declaration//GEN-END:variables
}
