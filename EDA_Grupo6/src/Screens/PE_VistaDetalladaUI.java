/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import DataClasses.PersonaData;
import DataManager.PersonaManager_LDE;
import TDA.Nodo_LDE;
import java.awt.Color;

/**
 *
 * @author user
 */
public class PE_VistaDetalladaUI extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Nodo_LDE<PersonaData> ptr = PersonaManager_LDE.personas().head();
    
    public PE_VistaDetalladaUI() {
        initComponents();
        MostrarDatos(ptr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_VD = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn_MM = new javax.swing.JPanel();
        txt_exit_MM = new javax.swing.JLabel();
        jLabel_Apellidos = new javax.swing.JLabel();
        jLabel_Fecha_Final = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_DNI = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Prioridad = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Estado = new javax.swing.JLabel();
        jLabel_Asunto = new javax.swing.JLabel();
        jLabel_Fecha_Inicio = new javax.swing.JLabel();
        jButton_Avanzar = new javax.swing.JButton();
        jButton_Retroceder = new javax.swing.JButton();
        jLabel_ID1 = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Telefono1 = new javax.swing.JLabel();
        jLabel_Fecha_Inicio1 = new javax.swing.JLabel();
        jLabel_Asunto1 = new javax.swing.JLabel();
        jLabel_Fecha_Final1 = new javax.swing.JLabel();
        jLabel_Email1 = new javax.swing.JLabel();
        jLabel_Apellidos1 = new javax.swing.JLabel();
        jLabel_Estado1 = new javax.swing.JLabel();
        jLabel_Prioridad1 = new javax.swing.JLabel();
        jLabel_DNI1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        Background_VD.setBackground(new java.awt.Color(255, 255, 255));
        Background_VD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 585, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background_VD.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jLabel_Apellidos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Apellidos.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 140, -1));

        jLabel_Fecha_Final.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Fecha_Final.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Fecha_Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 160, 20));

        jLabel_Nombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, -1));

        jLabel_DNI.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_DNI.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 100, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 140, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("VISTA DETALLADA");
        Background_VD.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 350, -1));

        jLabel_Email.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 170, -1));

        jLabel_Prioridad.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Prioridad.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 80, -1));

        jLabel_ID.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, -1));

        jLabel_Estado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Estado.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        jLabel_Asunto.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Asunto.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 400, -1));

        jLabel_Fecha_Inicio.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel_Fecha_Inicio.setForeground(new java.awt.Color(102, 102, 102));
        Background_VD.add(jLabel_Fecha_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 120, -1));

        jButton_Avanzar.setText(">>>");
        jButton_Avanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AvanzarMouseClicked(evt);
            }
        });
        Background_VD.add(jButton_Avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jButton_Retroceder.setText("<<<");
        jButton_Retroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RetrocederMouseClicked(evt);
            }
        });
        Background_VD.add(jButton_Retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel_ID1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_ID1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_ID1.setText("ID:");
        Background_VD.add(jLabel_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel_Nombre1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Nombre1.setText("Nombre:");
        Background_VD.add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel_Telefono1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Telefono1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Telefono1.setText("Teléfono:");
        Background_VD.add(jLabel_Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel_Fecha_Inicio1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Fecha_Inicio1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Fecha_Inicio1.setText("Fecha Inicio:");
        Background_VD.add(jLabel_Fecha_Inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel_Asunto1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Asunto1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Asunto1.setText("Asunto:");
        Background_VD.add(jLabel_Asunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel_Fecha_Final1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Fecha_Final1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Fecha_Final1.setText("Fecha Final:");
        Background_VD.add(jLabel_Fecha_Final1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel_Email1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Email1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Email1.setText("Email:");
        Background_VD.add(jLabel_Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel_Apellidos1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Apellidos1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Apellidos1.setText("Apellidos:");
        Background_VD.add(jLabel_Apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel_Estado1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Estado1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Estado1.setText("Estado:");
        Background_VD.add(jLabel_Estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel_Prioridad1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Prioridad1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Prioridad1.setText("Prioridad:");
        Background_VD.add(jLabel_Prioridad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel_DNI1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_DNI1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_DNI1.setText("DNI:");
        Background_VD.add(jLabel_DNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_VD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_VD, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
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

    private void jButton_AvanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AvanzarMouseClicked
        if(ptr.next() != null){
            ptr = ptr.next();
            MostrarDatos(ptr);
        }
    }//GEN-LAST:event_jButton_AvanzarMouseClicked

    private void jButton_RetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RetrocederMouseClicked
        if(ptr.prev() != null){
            ptr = ptr.prev();
            MostrarDatos(ptr);
        }
    }//GEN-LAST:event_jButton_RetrocederMouseClicked
    
    private void MostrarDatos(Nodo_LDE<PersonaData> ptr){
        jLabel_Apellidos.setText(ptr.value().getApellido());
        jLabel_Asunto.setText(ptr.value().getIssue());
        jLabel_Email.setText(ptr.value().getEmail());
        jLabel_Estado.setText(ptr.value().getEstado_exp());
        jLabel_Fecha_Final.setText(ptr.value().getDate_finish());
        jLabel_Fecha_Inicio.setText(ptr.value().getDate_start());
        jLabel_ID.setText(String.valueOf(ptr.value().getID_expedient()));
        jLabel_DNI.setText(String.valueOf(ptr.value().getDNI()));
        jLabel_Nombre.setText(ptr.value().getNombre());
        jLabel_Prioridad.setText(Priority_Name(ptr.value().getPriority()));
        jLabel_Telefono.setText(String.valueOf(ptr.value().getTelefono()));
    }
    
    private String Priority_Name(int pri){
        if(pri == 0) return "Baja";
        if(pri == 1) return "Media";
        else return "Alta";
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
            java.util.logging.Logger.getLogger(PE_VistaDetalladaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PE_VistaDetalladaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PE_VistaDetalladaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PE_VistaDetalladaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PE_VistaDetalladaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_VD;
    private javax.swing.JPanel exitBtn_MM;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton_Avanzar;
    private javax.swing.JButton jButton_Retroceder;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_Apellidos1;
    private javax.swing.JLabel jLabel_Asunto;
    private javax.swing.JLabel jLabel_Asunto1;
    private javax.swing.JLabel jLabel_DNI;
    private javax.swing.JLabel jLabel_DNI1;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Email1;
    private javax.swing.JLabel jLabel_Estado;
    private javax.swing.JLabel jLabel_Estado1;
    private javax.swing.JLabel jLabel_Fecha_Final;
    private javax.swing.JLabel jLabel_Fecha_Final1;
    private javax.swing.JLabel jLabel_Fecha_Inicio;
    private javax.swing.JLabel jLabel_Fecha_Inicio1;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_ID1;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Prioridad;
    private javax.swing.JLabel jLabel_Prioridad1;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Telefono1;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel txt_exit_MM;
    // End of variables declaration//GEN-END:variables
}
