package marketshop;

import com.google.common.hash.Hashing;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    Dimension dimensioni = Toolkit.getDefaultToolkit().getScreenSize();
    private String accountid; //account id
    private char[] pwd; //password utente1
    private String pass;
    JFrame frame = new JFrame();
    public Login() {
        initComponents();
        this.accountid = accountid;
        this.pwd = pwd;
    }
    public String getAccountId(){
        return accountid = accid.getText();
    }
    public String getPwd(){
        pwd = pwds.getPassword();
        for(int x = 0; x < pwd.length; x++){
            if(x == 0){
                pass = ""+pwd[x];
                pwd[x] = 0;
            }else{
            pass += pwd[x];
            pwd[x] = 0;    
            }
        }
        String enps = Hashing.sha256().hashString(pass, StandardCharsets.UTF_8).toString();
        return enps;
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        login = new javax.swing.JButton();
        regi = new javax.swing.JButton();
        accid = new javax.swing.JTextField();
        pwds = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(dimensioni);
        setSize(dimensioni);

        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(dimensioni);

        exit.setText("Esci");
        exit.setAlignmentX(0.5F);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.setAlignmentX(150.0F);
        login.setAlignmentY(150.0F);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        regi.setText("Registrati");
        regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiActionPerformed(evt);
            }
        });

        accid.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        pwds.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwds)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regi, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwds, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        final String DB_URL = "jdbc:mysql://db4free.net:3306/data2018";
        final String USER = "fumagalli";
	final String PASS = "fumagalli2018";
        boolean checks = false;
        Connection conn = null;
        Statement stmt = null;
        try{
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT User, Password FROM Data";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
		String userdb = rs.getString("User");
		String passworddb = rs.getString("Password");
                if(userdb.equals(getAccountId().toLowerCase()) && passworddb.equals(getPwd())){
                    setVisible(false);
                    java.awt.EventQueue.invokeLater(() -> {
                        new Registrazione().setVisible(true);
                    });
                    checks = true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
            }catch (SQLException se){
                System.out.println(se);
            }catch(Exception e){
		e.printStackTrace();
            }finally{
		try{
		    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                    se2.printStackTrace();
                }try{
                    if(conn!=null)
                        conn.close();
		}catch(SQLException se){
                    se.printStackTrace();
                }
            }
        if(checks == false){
            setVisible(false);
            JOptionPane.showMessageDialog(frame,
                    "Username o Password errati o non registrati.",
                    "Data Error",
                    JOptionPane.ERROR_MESSAGE);
            setVisible(true);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        java.awt.EventQueue.invokeLater(() -> {
            new Registrazione().setVisible(true);
        });

    }//GEN-LAST:event_regiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accid;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pwds;
    private javax.swing.JButton regi;
    // End of variables declaration//GEN-END:variables
}
