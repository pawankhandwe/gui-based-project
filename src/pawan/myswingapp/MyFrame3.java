/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pawan.myswingapp;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MyFrame3 extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    public MyFrame3() {
        initComponents();
        this.setTitle(" pawan's employee app ");
        Toolkit t=Toolkit.getDefaultToolkit();
  	Image img=t.getImage("C:\\Users\\HP\\Documents\\pawan\\converter.png");
        this.setIconImage(img);
        this.setLocationRelativeTo(null);
        ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsal = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showarea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("employee management system");

        txtno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtno.setForeground(new java.awt.Color(255, 0, 0));
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 0, 0));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtsal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtsal.setForeground(new java.awt.Color(255, 0, 0));
        txtsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(51, 102, 0));
        btnadd.setText("add record");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnshow.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        btnshow.setForeground(new java.awt.Color(51, 153, 0));
        btnshow.setText("show record");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        showarea.setColumns(20);
        showarea.setForeground(new java.awt.Color(0, 0, 153));
        showarea.setRows(5);
        jScrollPane1.setViewportView(showarea);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("employee id");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("employee name");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("employee salary");

        jButton1.setFont(new java.awt.Font("Dubai Light", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnadd)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(btnshow)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnshow)
                            .addComponent(btnadd)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        boolean res=validateInput();
        if(!res)
        {
            JOptionPane.showMessageDialog(null,"please input all the values");
            return;
        }
        try
        {
            String empno=txtno.getText();
            String ename=txtname.getText();
            String esal=txtsal.getText();
            int no=Integer.parseInt(empno);
            double sal=Double.parseDouble(esal);
            ps.setInt(1, no);
            ps.setString(2, ename);
            ps.setDouble(3,sal);
            int ans=ps.executeUpdate();
            if(ans==1)
            {
                JOptionPane.showMessageDialog(null, "record added");
                txtno.setText("");
                txtname.setText("");
                txtsal.setText("");
                txtno.requestFocus();

            }else
            JOptionPane.showMessageDialog(null, "record not added");

        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "please input values"+e);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Db error"+ex);
            ex.printStackTrace();

        }

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed

        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from information order by id");
            StringBuffer sb=new StringBuffer();
            while(rs.next())
            {
                int std_id=rs.getInt(1);
                String std_name=rs.getString(2);
                double std_sal=rs.getDouble(3);

                sb.append(std_id+"\t"+std_name+"\t"+std_sal+"\n");

            }
            showarea.setText(sb.toString());

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "error in db"+e);
        }

    }//GEN-LAST:event_btnshowActionPerformed

    private void txtsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea showarea;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtsal;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
         if(txtno.getText().isEmpty()||txtname.getText().isEmpty()||txtsal.getText().isEmpty())
        
            return false;
        return true;}

    private void ConnectDB() {
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","firstproject","java");
            ps=con.prepareStatement("insert into information values(?,?,?)");
            JOptionPane.showMessageDialog(null, "connected sucessfully");
        }catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,"not connected"+e);
        }
        
        
        }
    }
          
    

   
