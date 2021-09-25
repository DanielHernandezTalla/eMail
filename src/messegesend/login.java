package messegesend;

import Builder.Constructor;
import Builder.MailExtensions;
import Builder.ProtocoloGmail;
import Builder.ProtocoloOffice;
import Builder.ProtocoloYahoo;
import jdk.nashorn.internal.ir.BreakNode;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textCorreo = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCorreo.setForeground(new java.awt.Color(102, 102, 102));
        textCorreo.setText("Email");
        textCorreo.setMargin(new java.awt.Insets(10, 10, 10, 10));
        textCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorreoActionPerformed(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textPassword.setText("jPasswordField1");
        textPassword.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jPanel2.setBackground(new java.awt.Color(0, 112, 186));

        btnLogIn.setBackground(new java.awt.Color(0, 128, 250));
        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogIn.setText("Log In ");
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fax.png"))); // NOI18N

        txtError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPassword)
                            .addComponent(textCorreo)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

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

    private void textCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoActionPerformed

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked
        
        // Obtenemos los datos y los procesamos
        String correo = textCorreo.getText();
        String pass = textPassword.getText();
        
//        System.out.println(correo +" - "+ pass);
        
        String[] ArrExtension = correo.split("@");
        
        if(ArrExtension.length != 2){
            txtError.setText("Agregar una extension correcta");
            return;
        }
        
        int indexExtension = MailExtensions.search(ArrExtension[1]);
        
//        System.out.println(indexExtension);
        
        if(indexExtension == 0) {
            txtError.setText("Correo con extension inccorrecta");
            return;
        }
        
        // Creamos un mail para poder comprobar si se puede conectar a el o no
        Constructor constructor = new Constructor();
        Builder.Protocolo mailProtocol = null;
        // Usamos un Switch para decirdir el tipo de protocolo que se va a usar
//        System.out.println(indexExtension);
        //<editor-fold defaultstate="collapsed" desc=" En caso de agregar un nuevo protocolo ">
        /* En caso de agragar un nuevo protocolo, usamos el switch para crear su instancia
         */        
        //</editor-fold>
        switch(indexExtension){
            case 1: 
                 mailProtocol = new ProtocoloGmail();
                break;
            case 2: 
                mailProtocol = new ProtocoloOffice();
                break;
            case 3: 
                mailProtocol = new ProtocoloYahoo();
                break;
        }
        
        // Construimos el mail.
        constructor.setBuilder(mailProtocol);
        constructor.buildMail();
        Builder.Mail mail = constructor.getMail();
        
        //Agregamos el correo y password para comprobar
        mail.setCorreo(correo);
        mail.setContrasena(pass);
           
        String mesajeConeccion = mail.comprobarCorreo();
        
//        System.out.println(mesajeConeccion);
        
        // Comprobamos que el correo sea correcto
        if(mesajeConeccion.equals("Ok")){            
            // Si el correo existe y es correcto, habrimos para enviar mensaje
            // Primero asignamos la instancia del mail creada, en la clase mail
            Builder.Mail.mail = mail;
            Builder.Mail.form = this;
            
//            if(Builder.Mail.formMail == null){
//                jfMessege form =new jfMessege(); 
//                Builder.Mail.formMail = form;
//            }
            
            //línea 1-instanciamos un objeto de la clase Formulario2.java
             
            //línea 2-hacemos visible el formulario que queremos llamar 
            Builder.Mail.formMail = new jfMessege(); 
            Builder.Mail.formMail.setVisible(true); 
            this.setVisible(false);
        }else{
            txtError.setText(mesajeConeccion);
            textCorreo.setText("");
            textPassword.setText("");
        }
    }//GEN-LAST:event_btnLogInMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogIn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JLabel txtError;
    // End of variables declaration//GEN-END:variables
}
