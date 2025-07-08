/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import DataClasses.EmployeeData;
import DataClasses.InstitutionData;
import DataClasses.PersonaData;
import static DataManager.CountManager.*;
import DataManager.EmployeeManager;
import DataManager.EmployeeManager_LDE;
import DataManager.InstitutionManager;
import DataManager.InstitutionManager_LDE;
import DataManager.PersonaManager;
import DataManager.PersonaManager_LDE;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class RegisterExpUI extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public RegisterExpUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_priority = new javax.swing.ButtonGroup();
        Background_RE = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        priority_low_button = new javax.swing.JRadioButton();
        type_expedient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        priority_high_button = new javax.swing.JRadioButton();
        priority_medium_button = new javax.swing.JRadioButton();
        header = new javax.swing.JPanel();
        exitBtn_MM = new javax.swing.JPanel();
        txt_exit_MM = new javax.swing.JLabel();
        jPanel_CardLayout = new javax.swing.JPanel();
        jPanel_INST = new javax.swing.JPanel();
        jLabel_INST_RUC = new javax.swing.JLabel();
        jTextField_INST_RUC = new javax.swing.JTextField();
        jLabel_INST_Nombre = new javax.swing.JLabel();
        jTextField_INST_Nombre = new javax.swing.JTextField();
        jLabel_INST_Email = new javax.swing.JLabel();
        jTextField_INST_Email = new javax.swing.JTextField();
        jLabel_INST_Telefono = new javax.swing.JLabel();
        jTextField_INST_Telefono = new javax.swing.JTextField();
        jPanel_WK = new javax.swing.JPanel();
        jLabel_WK_Apellido = new javax.swing.JLabel();
        jTextField_WK_Nombre = new javax.swing.JTextField();
        jLabel_WK_Nombre = new javax.swing.JLabel();
        jTextField_WK_Apellido = new javax.swing.JTextField();
        jLabel_WK_ID = new javax.swing.JLabel();
        jLabel_WK_Telefono = new javax.swing.JLabel();
        jTextField_WK_Telefono = new javax.swing.JTextField();
        jTextField_WK_ID = new javax.swing.JTextField();
        jLabel_WK_Email = new javax.swing.JLabel();
        jTextField_WK_Email = new javax.swing.JTextField();
        jPanel_PE = new javax.swing.JPanel();
        jLabel_PE_Apellido = new javax.swing.JLabel();
        jTextField_PE_Apellido = new javax.swing.JTextField();
        jLabel_PE_Nombre = new javax.swing.JLabel();
        jTextField_PE_Nombre = new javax.swing.JTextField();
        jLabel_PE_DNI = new javax.swing.JLabel();
        jTextField_PE_DNI = new javax.swing.JTextField();
        jLabel_PE_Telefono = new javax.swing.JLabel();
        jTextField_PE_Telefono = new javax.swing.JTextField();
        jLabel_PE_Email = new javax.swing.JLabel();
        jTextField_PE_Email = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        Background_Asunto = new javax.swing.JPanel();
        jLabel_Asunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Asunto = new javax.swing.JTextArea();
        jLabel_Error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background_RE.setBackground(new java.awt.Color(255, 255, 255));
        Background_RE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INSERTE LOS DATOS");
        Background_RE.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        buttonGroup_priority.add(priority_low_button);
        priority_low_button.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        priority_low_button.setForeground(new java.awt.Color(0, 204, 51));
        priority_low_button.setSelected(true);
        priority_low_button.setText("Baja");
        Background_RE.add(priority_low_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 125, -1));

        type_expedient.setBackground(new java.awt.Color(102, 102, 102));
        type_expedient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Institución", "Persona Externa", "Trabajador" }));
        type_expedient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_expedientActionPerformed(evt);
            }
        });
        Background_RE.add(type_expedient, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 125, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Prioridad:");
        Background_RE.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        buttonGroup_priority.add(priority_high_button);
        priority_high_button.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        priority_high_button.setForeground(new java.awt.Color(153, 0, 0));
        priority_high_button.setText("Alta");
        Background_RE.add(priority_high_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        buttonGroup_priority.add(priority_medium_button);
        priority_medium_button.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        priority_medium_button.setForeground(new java.awt.Color(153, 153, 0));
        priority_medium_button.setText("Intermedia");
        Background_RE.add(priority_medium_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

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
                .addGap(0, 755, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background_RE.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel_CardLayout.setLayout(new java.awt.CardLayout());

        jPanel_INST.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_INST_RUC.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_INST_RUC.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_INST_RUC.setText("RUC:");

        jLabel_INST_Nombre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_INST_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_INST_Nombre.setText("Institución:");

        jLabel_INST_Email.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_INST_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_INST_Email.setText("Email:");

        jLabel_INST_Telefono.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_INST_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_INST_Telefono.setText("Teléfono:");

        javax.swing.GroupLayout jPanel_INSTLayout = new javax.swing.GroupLayout(jPanel_INST);
        jPanel_INST.setLayout(jPanel_INSTLayout);
        jPanel_INSTLayout.setHorizontalGroup(
            jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_INSTLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_INST_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_INST_Email)
                    .addComponent(jTextField_INST_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_INST_Nombre))
                .addGap(74, 74, 74)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_INST_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_INST_Telefono)
                    .addComponent(jLabel_INST_RUC)
                    .addComponent(jTextField_INST_RUC, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel_INSTLayout.setVerticalGroup(
            jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_INSTLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_INST_RUC)
                    .addComponent(jLabel_INST_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_INST_RUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_INST_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_INST_Email)
                    .addComponent(jLabel_INST_Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_INSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_INST_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_INST_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel_CardLayout.add(jPanel_INST, "card4");

        jPanel_WK.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_WK_Apellido.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_WK_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WK_Apellido.setText("Apellidos:");

        jLabel_WK_Nombre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_WK_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WK_Nombre.setText("Nombre:");

        jLabel_WK_ID.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_WK_ID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WK_ID.setText("ID:");

        jLabel_WK_Telefono.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_WK_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WK_Telefono.setText("Telefono:");

        jLabel_WK_Email.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_WK_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WK_Email.setText("Email:");

        javax.swing.GroupLayout jPanel_WKLayout = new javax.swing.GroupLayout(jPanel_WK);
        jPanel_WK.setLayout(jPanel_WKLayout);
        jPanel_WKLayout.setHorizontalGroup(
            jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WKLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_WK_Email)
                    .addGroup(jPanel_WKLayout.createSequentialGroup()
                        .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_WK_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jLabel_WK_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_WK_ID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_WK_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_WK_ID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_WK_Telefono)
                            .addComponent(jLabel_WK_Apellido)
                            .addComponent(jTextField_WK_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jTextField_WK_Telefono))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel_WKLayout.setVerticalGroup(
            jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WKLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_WK_Nombre)
                    .addComponent(jLabel_WK_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_WK_Nombre)
                    .addComponent(jTextField_WK_Apellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_WK_ID)
                    .addComponent(jLabel_WK_Telefono))
                .addGap(12, 12, 12)
                .addGroup(jPanel_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_WK_Telefono)
                    .addComponent(jTextField_WK_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_WK_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_WK_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel_CardLayout.add(jPanel_WK, "card3");

        jPanel_PE.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_PE_Apellido.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_PE_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PE_Apellido.setText("Apellidos:");

        jLabel_PE_Nombre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_PE_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PE_Nombre.setText("Nombre:");

        jLabel_PE_DNI.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_PE_DNI.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PE_DNI.setText("DNI:");

        jLabel_PE_Telefono.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_PE_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PE_Telefono.setText("Teléfono:");

        jLabel_PE_Email.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_PE_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PE_Email.setText("Email:");

        javax.swing.GroupLayout jPanel_PELayout = new javax.swing.GroupLayout(jPanel_PE);
        jPanel_PE.setLayout(jPanel_PELayout);
        jPanel_PELayout.setHorizontalGroup(
            jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PELayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_PE_Email)
                    .addComponent(jTextField_PE_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_PELayout.createSequentialGroup()
                        .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_PE_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PE_DNI)
                            .addComponent(jTextField_PE_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PE_Nombre))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_PE_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PE_Telefono)
                            .addComponent(jLabel_PE_Apellido)
                            .addComponent(jTextField_PE_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel_PELayout.setVerticalGroup(
            jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PELayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PE_Apellido)
                    .addComponent(jLabel_PE_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PE_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PE_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PE_DNI)
                    .addComponent(jLabel_PE_Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_PELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PE_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PE_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_PE_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_PE_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel_CardLayout.add(jPanel_PE, "card2");

        Background_RE.add(jPanel_CardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 590, 230));

        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        Background_RE.add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        Background_Asunto.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_Asunto.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Asunto.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel_Asunto.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Asunto.setText("Asunto:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Asunto.setColumns(20);
        jTextArea_Asunto.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Asunto);

        javax.swing.GroupLayout Background_AsuntoLayout = new javax.swing.GroupLayout(Background_Asunto);
        Background_Asunto.setLayout(Background_AsuntoLayout);
        Background_AsuntoLayout.setHorizontalGroup(
            Background_AsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_AsuntoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Background_AsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Asunto))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        Background_AsuntoLayout.setVerticalGroup(
            Background_AsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_AsuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Asunto)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background_RE.add(Background_Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 590, -1));

        jLabel_Error.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel_Error.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background_RE.add(jLabel_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 370, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Tipo:");
        Background_RE.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void type_expedientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_expedientActionPerformed
        
        String x = String.valueOf(type_expedient.getSelectedItem());
        
        if(x.equals("Trabajador")){
            
            jLabel_Error.setText("");
            jTextArea_Asunto.setText("");
            jPanel_CardLayout.removeAll();
            jPanel_CardLayout.add(jPanel_WK);
            jPanel_CardLayout.repaint();
            jPanel_CardLayout.revalidate();
            
        } else if(x.equals("Persona Externa")){
            
            jLabel_Error.setText("");
            jTextArea_Asunto.setText("");
            jPanel_CardLayout.removeAll();
            jPanel_CardLayout.add(jPanel_PE);
            jPanel_CardLayout.repaint();
            jPanel_CardLayout.revalidate();
            
        } else {
            
            jLabel_Error.setText("");
            jTextArea_Asunto.setText("");
            jPanel_CardLayout.removeAll();
            jPanel_CardLayout.add(jPanel_INST);
            jPanel_CardLayout.repaint();
            jPanel_CardLayout.revalidate();
            
        }
    }//GEN-LAST:event_type_expedientActionPerformed

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        
        String r = String.valueOf(type_expedient.getSelectedItem());
        
        if(r.equals("Trabajador")){
            if(jTextField_WK_Apellido.getText().isBlank() || jTextField_WK_Nombre.getText().isBlank() || jTextField_WK_ID.getText().isBlank() 
               || jTextField_WK_Email.getText().isBlank() || jTextField_WK_Telefono.getText().isBlank() || jTextArea_Asunto.getText().isBlank()){
                
                jLabel_Error.setForeground(Color.red);
                jLabel_Error.setText("ERROR: Faltan datos por completar");
                return;
            }
            
            
            EmployeeData employ = new EmployeeData(Integer.parseInt(jTextField_WK_ID.getText()),jTextField_WK_Nombre.getText(),jTextField_WK_Apellido.getText(),Integer.parseInt(jTextField_WK_Telefono.getText()),jTextField_WK_Email.getText(),getPriority(),jTextArea_Asunto.getText());
            employ.setID_expedient(getExp_Number());
            IncreaseExp_Number();
            employ.setDate_start(Obtein_Current_Date());
            EmployeeManager.addUser(employ);
            EmployeeManager_LDE.addUser(employ);
            Reset_form_WK();
            jLabel_Error.setForeground(Color.green);
            jLabel_Error.setText("Expediente registrado!!!!");
            
        }
        
        if(r.equals("Persona Externa")){
            if(jTextField_PE_Apellido.getText().isBlank() || jTextField_PE_Nombre.getText().isBlank() || jTextField_PE_DNI.getText().isBlank()
               || jTextField_PE_Email.getText().isBlank() || jTextField_PE_Telefono.getText().isBlank() || jTextArea_Asunto.getText().isBlank()){
                
                jLabel_Error.setForeground(Color.red);
                jLabel_Error.setText("ERROR: Faltan datos por completar");
                return;
            }
            
            PersonaData per = new PersonaData(Integer.parseInt(jTextField_PE_DNI.getText()),jTextField_PE_Nombre.getText(),jTextField_PE_Apellido.getText(),Integer.parseInt(jTextField_PE_Telefono.getText()),jTextField_PE_Email.getText(),getPriority(),jTextArea_Asunto.getText()); 
            per.setID_expedient(getExp_Number());
            IncreaseExp_Number();
            per.setDate_start(Obtein_Current_Date());
            PersonaManager.addUser(per);
            PersonaManager_LDE.addUser(per);
            Reset_form_PE();
            jLabel_Error.setForeground(Color.green);
            jLabel_Error.setText("Expediente registrado!!!!");
        }
        
        if(r.equals("Institución")){
            if(jTextField_INST_Nombre.getText().isBlank() || jTextField_INST_RUC.getText().isBlank() || jTextField_INST_Email.getText().isBlank()
               || jTextField_INST_Telefono.getText().isBlank() || jTextArea_Asunto.getText().isBlank()){
                
                jLabel_Error.setForeground(Color.red);
                jLabel_Error.setText("ERROR: Faltan datos por completar");
                return;
            }
            
            InstitutionData insti = new InstitutionData(jTextField_INST_Nombre.getText(), Integer.parseInt(jTextField_INST_RUC.getText()),Integer.parseInt(jTextField_INST_Telefono.getText()),jTextField_INST_Email.getText() ,getPriority(), jTextArea_Asunto.getText());
            insti.setID_expedient(getExp_Number());
            IncreaseExp_Number();
            insti.setDate_start(Obtein_Current_Date());
            InstitutionManager.addUser(insti);
            InstitutionManager_LDE.addUser(insti);
            Reset_form_INSTI();
            jLabel_Error.setForeground(Color.green);
            jLabel_Error.setText("Expediente registrado!!!!");
            
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private int getPriority(){
        
        if(priority_low_button.isSelected()){
                return 0;
            }
            
        if(priority_high_button.isSelected()){
                return 2;
            }
            
        if(priority_medium_button.isSelected()){
                return 1;
            }
        return -1;
    }
    
    private void Reset_form_WK(){
        jTextField_WK_Apellido.setText("");
        jTextField_WK_Nombre.setText("");
        jTextField_WK_Email.setText("");
        jTextField_WK_Telefono.setText("");
        jTextField_WK_ID.setText("");
        jTextArea_Asunto.setText("");
    }
    
    private void Reset_form_PE(){
        jTextField_PE_Apellido.setText("");
        jTextField_PE_Nombre.setText("");
        jTextField_PE_Email.setText("");
        jTextField_PE_Telefono.setText("");
        jTextField_PE_DNI.setText("");
        jTextArea_Asunto.setText("");
    }
    
    private void Reset_form_INSTI(){
        jTextField_INST_RUC.setText("");
        jTextField_INST_Nombre.setText("");
        jTextField_INST_Email.setText("");
        jTextField_INST_Telefono.setText("");
        jTextArea_Asunto.setText("");
    }
    
    private String Obtein_Current_Date(){
        LocalDateTime actual_day = LocalDateTime.now();
        DateTimeFormatter format_obj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String act_day = actual_day.format(format_obj);
        
        return act_day;
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
            java.util.logging.Logger.getLogger(RegisterExpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterExpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterExpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterExpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterExpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Asunto;
    private javax.swing.JPanel Background_RE;
    private javax.swing.ButtonGroup buttonGroup_priority;
    private javax.swing.JPanel exitBtn_MM;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Asunto;
    private javax.swing.JLabel jLabel_Error;
    private javax.swing.JLabel jLabel_INST_Email;
    private javax.swing.JLabel jLabel_INST_Nombre;
    private javax.swing.JLabel jLabel_INST_RUC;
    private javax.swing.JLabel jLabel_INST_Telefono;
    private javax.swing.JLabel jLabel_PE_Apellido;
    private javax.swing.JLabel jLabel_PE_DNI;
    private javax.swing.JLabel jLabel_PE_Email;
    private javax.swing.JLabel jLabel_PE_Nombre;
    private javax.swing.JLabel jLabel_PE_Telefono;
    private javax.swing.JLabel jLabel_WK_Apellido;
    private javax.swing.JLabel jLabel_WK_Email;
    private javax.swing.JLabel jLabel_WK_ID;
    private javax.swing.JLabel jLabel_WK_Nombre;
    private javax.swing.JLabel jLabel_WK_Telefono;
    private javax.swing.JPanel jPanel_CardLayout;
    private javax.swing.JPanel jPanel_INST;
    private javax.swing.JPanel jPanel_PE;
    private javax.swing.JPanel jPanel_WK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Asunto;
    private javax.swing.JTextField jTextField_INST_Email;
    private javax.swing.JTextField jTextField_INST_Nombre;
    private javax.swing.JTextField jTextField_INST_RUC;
    private javax.swing.JTextField jTextField_INST_Telefono;
    private javax.swing.JTextField jTextField_PE_Apellido;
    private javax.swing.JTextField jTextField_PE_DNI;
    private javax.swing.JTextField jTextField_PE_Email;
    private javax.swing.JTextField jTextField_PE_Nombre;
    private javax.swing.JTextField jTextField_PE_Telefono;
    private javax.swing.JTextField jTextField_WK_Apellido;
    private javax.swing.JTextField jTextField_WK_Email;
    private javax.swing.JTextField jTextField_WK_ID;
    private javax.swing.JTextField jTextField_WK_Nombre;
    private javax.swing.JTextField jTextField_WK_Telefono;
    private javax.swing.JRadioButton priority_high_button;
    private javax.swing.JRadioButton priority_low_button;
    private javax.swing.JRadioButton priority_medium_button;
    private javax.swing.JLabel txt_exit_MM;
    private javax.swing.JComboBox<String> type_expedient;
    // End of variables declaration//GEN-END:variables
}
