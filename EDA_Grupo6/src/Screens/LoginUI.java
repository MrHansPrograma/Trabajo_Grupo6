package Screens;

import DataClasses.UserData;
import DataManager.UserManager;
import TDA.Nodo_LSE;
import java.awt.Color;

public class LoginUI extends javax.swing.JFrame {
    
    int xMouse, yMouse; 
    
    public LoginUI() {
        initComponents();
        UserManager.initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Background_orange = new javax.swing.JPanel();
        Ulima_logo = new javax.swing.JLabel();
        Ulima_texto1 = new javax.swing.JLabel();
        Ulima_texto2 = new javax.swing.JLabel();
        txt_in = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pf_contraseña = new javax.swing.JPasswordField();
        Background_ingresar = new javax.swing.JPanel();
        txt_ingresar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        txt_exit = new javax.swing.JLabel();
        txt_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background_orange.setBackground(new java.awt.Color(255, 102, 0));

        Ulima_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ulima_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ULima_Logo_1.png"))); // NOI18N

        Ulima_texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ulima_texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ULima_Titulo1.png"))); // NOI18N

        Ulima_texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ulima_texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ULima_Titulo2.png"))); // NOI18N

        javax.swing.GroupLayout Background_orangeLayout = new javax.swing.GroupLayout(Background_orange);
        Background_orange.setLayout(Background_orangeLayout);
        Background_orangeLayout.setHorizontalGroup(
            Background_orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ulima_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_orangeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Background_orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ulima_texto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ulima_texto1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        Background_orangeLayout.setVerticalGroup(
            Background_orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_orangeLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Ulima_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ulima_texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ulima_texto2)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        Background.add(Background_orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 510));

        txt_in.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        txt_in.setForeground(new java.awt.Color(51, 51, 51));
        txt_in.setText("INICIAR SESIÓN");
        Background.add(txt_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(51, 51, 51));
        txt_usuario.setText("USUARIO");
        Background.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tf_usuario.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(153, 153, 153));
        tf_usuario.setText("Ingrese su nombre de usuario");
        tf_usuario.setToolTipText("");
        tf_usuario.setBorder(null);
        tf_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_usuarioMousePressed(evt);
            }
        });
        Background.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 410, 30));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 410, 20));

        txt_usuario1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        txt_usuario1.setForeground(new java.awt.Color(51, 51, 51));
        txt_usuario1.setText("CONTRASEÑA");
        Background.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 410, 20));

        pf_contraseña.setText("********");
        pf_contraseña.setBorder(null);
        pf_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_contraseñaMousePressed(evt);
            }
        });
        Background.add(pf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 410, 30));

        Background_ingresar.setBackground(new java.awt.Color(255, 102, 51));

        txt_ingresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        txt_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        txt_ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_ingresar.setText("INGRESAR");
        txt_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Background_ingresarLayout = new javax.swing.GroupLayout(Background_ingresar);
        Background_ingresar.setLayout(Background_ingresarLayout);
        Background_ingresarLayout.setHorizontalGroup(
            Background_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Background_ingresarLayout.setVerticalGroup(
            Background_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Background.add(Background_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
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

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        txt_exit.setBackground(new java.awt.Color(255, 255, 255));
        txt_exit.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        txt_exit.setForeground(new java.awt.Color(102, 102, 102));
        txt_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit.setText("X");
        txt_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 753, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        txt_error.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 0, 51));
        Background.add(txt_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void txt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txt_exitMouseClicked

    private void txt_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseEntered
        exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_txt_exitMouseEntered

    private void txt_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseExited
        exitBtn.setBackground(Color.white);
    }//GEN-LAST:event_txt_exitMouseExited

    private void tf_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usuarioMousePressed
        if(tf_usuario.getText().equals("Ingrese su nombre de usuario")){
            tf_usuario.setText("");
            tf_usuario.setForeground(Color.black);
        }
        if(String.valueOf(pf_contraseña.getPassword()).isEmpty()){
            pf_contraseña.setText("********");
            tf_usuario.setForeground(Color.gray);
        }     
    }//GEN-LAST:event_tf_usuarioMousePressed

    private void pf_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_contraseñaMousePressed
        if(String.valueOf(pf_contraseña.getPassword()).equals("********")){
            pf_contraseña.setText("");
            pf_contraseña.setForeground(Color.black);
        }
        if(tf_usuario.getText().isEmpty()){
            tf_usuario.setText("Ingrese su nombre de usuario");
            tf_usuario.setForeground(Color.gray);
        }       
    }//GEN-LAST:event_pf_contraseñaMousePressed

    private void txt_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ingresarMouseClicked
        
        txt_error.setText("");
        
        Nodo_LSE<UserData> ptr = UserManager.users().L();
        
        while(ptr != null){
            UserData userdata = ptr.value();
            if(userdata.username.equals(tf_usuario.getText()) && userdata.password.equals(String.valueOf(pf_contraseña.getPassword()))){
                
                System.out.println("User Exists!");
                MainMenu mainmenu = new MainMenu();
                ScreenManager.openNewScreen(this, mainmenu);
                ResetForm();
                return;
            }
            
            ptr = ptr.next();
        }
        
         txt_error.setText("Usuario o contraseña incorrecta!");
        
    }//GEN-LAST:event_txt_ingresarMouseClicked
    
    public void ResetForm(){
        
        tf_usuario.setText("Ingrese su nombre de usuario");
        tf_usuario.setForeground(Color.gray);
        pf_contraseña.setText("********");
        pf_contraseña.setForeground(Color.gray);
        
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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Background_ingresar;
    private javax.swing.JPanel Background_orange;
    private javax.swing.JLabel Ulima_logo;
    private javax.swing.JLabel Ulima_texto1;
    private javax.swing.JLabel Ulima_texto2;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JLabel txt_error;
    private javax.swing.JLabel txt_exit;
    private javax.swing.JLabel txt_in;
    private javax.swing.JLabel txt_ingresar;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel txt_usuario1;
    // End of variables declaration//GEN-END:variables
}
