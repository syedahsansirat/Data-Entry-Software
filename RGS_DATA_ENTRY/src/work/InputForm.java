/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;


import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sirat
 */
public class InputForm extends javax.swing.JFrame {

    /**
     * Creates new form inputFrom
     */
    String data;
    int serial;
    DefaultTableModel model;
    public InputForm( String data) {
        initComponents();
        ImageIcon icon=new ImageIcon("img/logo2.png");
        setIconImage(icon.getImage());
        setTitle("Renowned Global Solution Data Management");
        setVisible(true);
        setLocationRelativeTo(null);
        uniqueLabel.setVisible(false);
        nonUniqueLabel.setVisible(false);
        this.data=data;
        nameTitleLabel.setText(this.data+" :");
        connectDB();
        try {
            statement=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        model= (DefaultTableModel) myTable.getModel();
        try { 
            resultSet = statement.executeQuery("select name,contact,note from "+this.data);
             serial=1;
            while (resultSet.next()) {
               String a0 = resultSet.getString(1);
                String a1 = resultSet.getString(2);
                String a2 = resultSet.getString(3);
                
                
                model.addRow(new Object[]{serial,a0,a1,a2});
                serial++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
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

        NameLabel = new javax.swing.JLabel();
        AreaCoverLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        NoteLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        webSiteTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        WebSiteLabel = new javax.swing.JLabel();
        postcodeTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        noteTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        workTextArea = new javax.swing.JTextArea();
        PhoneNumberLabel = new javax.swing.JLabel();
        nameTitleLabel = new javax.swing.JLabel();
        WorkLabel = new javax.swing.JLabel();
        uniqueLabel = new javax.swing.JLabel();
        areaCoverTextField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        nonUniqueLabel = new javax.swing.JLabel();
        PostcodeLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        readXLSMenuItem = new javax.swing.JMenuItem();
        writeXLSMenuItem = new javax.swing.JMenuItem();
        deletetableMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 540));
        getContentPane().setLayout(null);

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameLabel.setText("Name:");
        getContentPane().add(NameLabel);
        NameLabel.setBounds(299, 202, 35, 14);

        AreaCoverLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AreaCoverLabel.setText("Area Cover:");
        getContentPane().add(AreaCoverLabel);
        AreaCoverLabel.setBounds(443, 259, 66, 14);

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addressTextField);
        addressTextField.setBounds(443, 223, 148, 30);

        NoteLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NoteLabel.setText("Note:");
        getContentPane().add(NoteLabel);
        NoteLabel.setBounds(624, 315, 29, 14);

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(239, 259, 33, 14);
        getContentPane().add(webSiteTextField);
        webSiteTextField.setBounds(27, 279, 194, 30);

        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumberTextField);
        phoneNumberTextField.setBounds(27, 223, 182, 30);

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextField);
        emailTextField.setBounds(239, 280, 159, 29);

        WebSiteLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WebSiteLabel.setText("Website:");
        getContentPane().add(WebSiteLabel);
        WebSiteLabel.setBounds(27, 259, 63, 14);
        getContentPane().add(postcodeTextField);
        postcodeTextField.setBounds(624, 225, 149, 28);
        getContentPane().add(nameTextField);
        nameTextField.setBounds(239, 223, 139, 30);

        noteTextArea.setColumns(20);
        noteTextArea.setRows(5);
        jScrollPane3.setViewportView(noteTextArea);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(416, 335, 349, 96);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Name", "Contact", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        myTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(myTable);
        myTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (myTable.getColumnModel().getColumnCount() > 0) {
            myTable.getColumnModel().getColumn(0).setMinWidth(50);
            myTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            myTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(25, 29, 811, 124);

        workTextArea.setColumns(20);
        workTextArea.setRows(5);
        jScrollPane2.setViewportView(workTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(27, 335, 310, 96);

        PhoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhoneNumberLabel.setText("Phone Number");
        getContentPane().add(PhoneNumberLabel);
        PhoneNumberLabel.setBounds(67, 202, 82, 14);

        nameTitleLabel.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        getContentPane().add(nameTitleLabel);
        nameTitleLabel.setBounds(60, 0, 230, 30);

        WorkLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WorkLabel.setText("Type of  Work :");
        getContentPane().add(WorkLabel);
        WorkLabel.setBounds(107, 315, 84, 14);

        uniqueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uniqueLabel.setForeground(new java.awt.Color(0, 204, 0));
        uniqueLabel.setText("Unique Number");
        nonUniqueLabel.setVisible(false);
        getContentPane().add(uniqueLabel);
        uniqueLabel.setBounds(492, 171, 221, 20);

        areaCoverTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCoverTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(areaCoverTextField);
        areaCoverTextField.setBounds(443, 279, 148, 30);

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddressLabel.setText("Address:");
        getContentPane().add(AddressLabel);
        AddressLabel.setBounds(443, 202, 49, 14);

        nonUniqueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nonUniqueLabel.setForeground(new java.awt.Color(255, 0, 0));
        nonUniqueLabel.setText("Phone Number Matched");
        nonUniqueLabel.setVisible(false);
        getContentPane().add(nonUniqueLabel);
        nonUniqueLabel.setBounds(329, 171, 221, 20);

        PostcodeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PostcodeLabel.setText("Postcode:");
        getContentPane().add(PostcodeLabel);
        PostcodeLabel.setBounds(624, 202, 55, 14);

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(775, 420, 61, 31);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 55, 30);

        iconLabel.setIcon(new javax.swing.ImageIcon("img/back.jpg"));
        getContentPane().add(iconLabel);
        iconLabel.setBounds(-60, -76, 1040, 660);

        jMenu1.setText("File");

        readXLSMenuItem.setText("Read XLS File");
        readXLSMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readXLSMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(readXLSMenuItem);

        writeXLSMenuItem.setText("Write XLS File");
        writeXLSMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeXLSMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(writeXLSMenuItem);

        deletetableMenuItem.setForeground(new java.awt.Color(255, 51, 51));
        deletetableMenuItem.setText("Delete All Data");
        deletetableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetableMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(deletetableMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void areaCoverTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCoverTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCoverTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       String name="",contact="",work="",note="",address="",postCode="",email="",website="",areaCover="";
       String insertSql = "INSERT INTO `"+this.data+"` (`name`, `contact`, `work`, `note`, `address`, `postcode`, `email`, `website`, `area_cover`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement    preparedStmt;
       name=nameTextField.getText().trim();
       contact=phoneNumberTextField.getText().trim();
       contact=contact.replaceAll("[^\\d+]", "");
       work= workTextArea.getText().trim();
       note=noteTextArea.getText().trim();
       address=addressTextField.getText().trim();
       postCode=postcodeTextField.getText().trim();
       email=emailTextField.getText().trim();
       website=webSiteTextField.getText().trim();
       areaCover=areaCoverTextField.getText().trim();
       if(!contact.isEmpty() && contact!=null){
           try {
                preparedStmt = con.prepareStatement(insertSql);
                preparedStmt.setString(1, name);
                preparedStmt.setString(2 ,contact );
                preparedStmt.setString( 3,work );
                preparedStmt.setString( 4,note );
                preparedStmt.setString( 5, address);
                preparedStmt.setString( 6,postCode );
                preparedStmt.setString( 7, email);
                preparedStmt.setString( 8, website);
                preparedStmt.setString( 9,areaCover );
                preparedStmt.execute();
                JOptionPane.showMessageDialog(this,"Data Entry Success !");
                uniqueLabel.setVisible(false);
                nonUniqueLabel.setVisible(false);
                model.addRow(new Object[]{serial,name,contact,note});
                serial++;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,"Insert Failed : "+contact);
                }
       nameTextField.setText("");
       phoneNumberTextField.setText("");
       workTextArea.setText("");
       noteTextArea.setText("");
       addressTextField.setText("");
       postcodeTextField.setText("");
       emailTextField.setText("");
       webSiteTextField.setText("");
       areaCoverTextField.setText("");
           
           
           
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Fill Up Contact Number ");
       }
       
       

    }//GEN-LAST:event_saveButtonActionPerformed

    private void readXLSMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readXLSMenuItemActionPerformed
        // TODO add your handling code here:
        new ReadXLS(this.data,this);
        this.dispose();
        new InputForm(this.data);
        
    }//GEN-LAST:event_readXLSMenuItemActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        try {
            // TODO add your handling code here:
            String num=phoneNumberTextField.getText();
            num=num.trim();
            num=num.replaceAll("[^\\d+]", "");
            String numDB="";
            statement=con.createStatement();
            resultSet = statement.executeQuery("select contact from "+this.data+" where contact = '"+num+"'");
            
            while (resultSet.next()) {
                numDB=resultSet.getString(1);
                
                
            }
            if(!numDB.isEmpty())
            {
                uniqueLabel.setVisible(false);
                nonUniqueLabel.setVisible(true);
            }
            else
            {
                nonUniqueLabel.setVisible(false);
                uniqueLabel.setVisible(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void writeXLSMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeXLSMenuItemActionPerformed
        // TODO add your handling code here:
        
        new PreWrite(this.data);
        this.dispose();
    }//GEN-LAST:event_writeXLSMenuItemActionPerformed

    private void deletetableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetableMenuItemActionPerformed
       new deleteTableConfirmation1(this.data);
       this.dispose();
        
    }//GEN-LAST:event_deletetableMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Welcome();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new AboutUs();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputForm("data").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel AreaCoverLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NoteLabel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel PostcodeLabel;
    private javax.swing.JLabel WebSiteLabel;
    private javax.swing.JLabel WorkLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField areaCoverTextField;
    private javax.swing.JMenuItem deletetableMenuItem;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTitleLabel;
    private javax.swing.JLabel nonUniqueLabel;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField postcodeTextField;
    private javax.swing.JMenuItem readXLSMenuItem;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel uniqueLabel;
    private javax.swing.JTextField webSiteTextField;
    private javax.swing.JTextArea workTextArea;
    private javax.swing.JMenuItem writeXLSMenuItem;
    // End of variables declaration//GEN-END:variables
}