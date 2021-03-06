package marketshop;

import com.google.common.hash.Hashing;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 
import java.time.YearMonth;


public class Registrazione extends javax.swing.JFrame {
    int curyear = YearMonth.now().getYear();
    Dimension dimensioni = Toolkit.getDefaultToolkit().getScreenSize();
    JFrame frame = new JFrame();
    public Registrazione() {
	initComponents();
	for(int x = 1; x < 13; x++){
            if(x < 10) 
		month.add("0"+x); 
            else 
                month.add(""+x);
	}
	for(int d = 1; d < 32; d++){
            if(d < 10) 
		day.add("0"+d); 
            else 
                day.add(""+d);
	}
	for(int y = curyear; y > 1900; y--){
            year.add(""+y);
	}
    }
	
    
    public String getNome() {
	return nome.getText();
    }

	
    public String getCognome() {
	return cognome.getText();
    }


    public String getDatadn() {
	String birth;
	birth = ""+year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
	return birth;
    }

    
    public String getCf() {
	return cf.getText();
    }


    public String getCell() {
	return cel.getText();
    }


    public String getUserId() {
	return userid.getText().toLowerCase();
    }
    
    public String getPassword() {
    	return pasw.getText();
    }

    public String getPasw() {
	String pass = "";
	char [] pwd = pasw.getPassword();
	for(int x = 0; x < pwd.length; x++){
            if(x == 0){
		pass += pwd[x];
		pwd[x] = 0;
            }else{
		pass += pwd[x];
		pwd[x] = 0;
            }
	}
	String enpas = Hashing.sha256().hashString(pass, StandardCharsets.UTF_8).toString();
	return enpas;
    }

    
    public String getCity() {
	return city.getText();
    }

    
    public int getCap() {
        int caps;
        caps = Integer.parseInt(cap.getText());
	return caps;
    }

    public String getCapString() {
    return cap.getText();
    }

    
    public String getVia() {
	return via.getText();
    }

    
    public int getNc() {
        int nuc;
        nuc = Integer.parseInt(nc.getText());
	return nuc;
    }
    
    public String getNcString(){
        return nc.getText();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        cognome = new javax.swing.JTextField();
        cf = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        nome1 = new javax.swing.JLabel();
        cognome1 = new javax.swing.JLabel();
        birth1 = new javax.swing.JLabel();
        cf1 = new javax.swing.JLabel();
        pasw1 = new javax.swing.JLabel();
        city1 = new javax.swing.JLabel();
        via = new javax.swing.JTextField();
        via1 = new javax.swing.JLabel();
        nc = new javax.swing.JTextField();
        cap = new javax.swing.JTextField();
        cap1 = new javax.swing.JLabel();
        nc1 = new javax.swing.JLabel();
        userid1 = new javax.swing.JLabel();
        cel1 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        pasw = new javax.swing.JPasswordField();
        month = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        year = new java.awt.Choice();
        day = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(dimensioni);
        setSize(dimensioni);

        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(dimensioni);

        nome1.setText("Nome");

        cognome1.setText("Cognome");

        birth1.setText("Data di Nascita");

        cf1.setText("Codice Fiscale");

        pasw1.setText("Password");

        city1.setText("Città");

        via1.setText("Via ");

        cap1.setText("CAP");

        nc1.setText("N°");

        userid1.setText("Username");

        cel1.setText("Cellulare");

        back.setText("Indietro");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        reg.setText("Registrati");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        ex.setText("Esci");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });

        jLabel1.setText("    Giorno");

        jLabel2.setText("     Mese");

        jLabel3.setText("    Anno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasw1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(city1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(via1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(birth1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cognome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cap1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nome)
                    .addComponent(cognome)
                    .addComponent(cf)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(via, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nc1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cel)
                    .addComponent(pasw)
                    .addComponent(userid)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome1))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cognome1))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birth1)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf1)
                    .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid1)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasw1)
                    .addComponent(pasw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(city1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cap1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nc1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(via, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(via1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
	private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
            System.exit(0);
	}//GEN-LAST:event_exActionPerformed

        
	private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            java.awt.EventQueue.invokeLater(() -> {
		setVisible(false);
		new Login().setVisible(true);
            });
	}//GEN-LAST:event_backActionPerformed

        
	private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
            final String DB_URL = "jdbc:mysql://db4free.net:3306/data2018";
            final String USER = "fumagalli";
            final String PASS = "fumagalli2018";
            boolean datatrue = false;
            // Birth Date Control
            int giorno = Integer.parseInt(day.getSelectedItem());
            int mese = Integer.parseInt(month.getSelectedItem());
            int anno = Integer.parseInt(year.getSelectedItem());
            if(anno % 4 == 0 && anno % 100 != 0){
                if(mese == 2){
                    if(giorno <30){
                        datatrue = true;
                    }   
                }
            }else if(mese == 2){
                if(giorno <29){
                    datatrue = true;
                }
            }
            if(mese == 4 || mese == 6 || mese == 9 || mese == 11){
                if(giorno < 31){
                    datatrue = true;
                }
            }else if(mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12){
                datatrue = true;
            }
            // Birth Date Control End
            
            // Mobile Phone Number Control
            boolean cellCheck = false;	
            if(getCell().length() == 10) {
		cellCheck = true;
            }
            boolean cellCheck2 = false;
            for(int i = 0; i < getCell().length(); i++) {
		char c = getCell().charAt(i);
                cellCheck2 = false;
                if(Character.isDigit(c)){
                    cellCheck2 = true;
                }
                if(cellCheck2 == false) {
                    break;
                }
            }
            // Mobile Phone Number Control End
            
            // Name Character Control
            boolean namecheck = false;
            for(int i = 0; i < getNome().length(); i++) {
		char c = getNome().charAt(i);
                namecheck = false;
                if(Character.isLetter(c)){
                    namecheck = true;
		}
            }
            // Name Character Control End
            
            // Surname Character Control
            boolean surnamecheck = true;
            for(int i = 0; i < getCognome().length(); i++) {
		char c = getCognome().charAt(i);
                if(!Character.isLetter(c) && c!='\'' && c!=' '){
                    surnamecheck = false;
                }
            }
            // Surname Character Control End
            
            // Fiscal Code Check 
            int setdisp[] = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20,
		11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23 };
            boolean cfcheck = true;
            boolean cfcheck2 = true;
            boolean cfcheck3 = true;
            int v,s,c;
            String cf2 = getCf().toUpperCase();
            if(getCf().length() != 16)
                cfcheck = false;
            if(cfcheck){
                for( v = 0; v < 16; v++ ){
                    c = cf2.charAt(v);
                    if( ! ( Character.isDigit(c) || Character.isLetter(c) ) )
                        cfcheck2 = false;
                }
            }
            if(cfcheck && cfcheck2){
                s = 0;
                for( v = 1; v <= 13; v += 2 ){
                    c = cf2.charAt(v);
                    if( Character.isDigit(c) )
                        s = s + c - '0';
                    else
                        s = s + c - 'A';
                }
                for( v = 0; v <= 14; v += 2 ){
                    c = cf2.charAt(v);
                    if( Character.isDigit(c) )	 
                        c = c - '0' + 'A';
                    s = s + setdisp[c - 'A'];
                }
                if( s%26 + 'A' != cf2.charAt(15) )
                    cfcheck3 = false;
            }
            // Fiscal Code Control End
            
            //Username Empty Control 
            boolean usercontrol = true;
            if(getUserId().isEmpty()) {
            	usercontrol = false;
            }
            //Username Empty Control End
            
            //Password Empty Control 
            boolean pswdcontrol = true;
            if(getPassword().isEmpty()) {
            	pswdcontrol = false;
            }
            //Password Empty Control End
            
            // City Control 
            boolean citycontrol = true;
            if(getCity().isEmpty()) {
            	citycontrol = false;
            }
            for(int i = 0; i < getCity().length(); i++) {
                char city = getCity().charAt(i);
                citycontrol = false;
                if(Character.isLetter(city)){
                    citycontrol = true;
        	}
            }
            // City Control End
            
            // CAP Control
            boolean capcontrol = true;
            boolean lengthcap = true;
            if(getCapString().isEmpty()) {
            	capcontrol = false;
            }
    	    for(int i = 0; i < getCapString().length(); i++) {
    		char car = getCapString().charAt(i);
    	        capcontrol = false;
                if(Character.isDigit(car)){
                    capcontrol = true;
                }
                if(capcontrol == false) {
    	            break;
    	        }
    	    }
            if(getCapString().length() != 5) {
            	lengthcap = false;
            }
            // CAP Control End 
            
            // Via Control
            boolean viacheck = true;
            if(getVia().isEmpty())
                viacheck = false;
            for(int i = 0; i < getVia().length(); i++) {
		char y = getVia().charAt(i);
                if(!Character.isLetter(y) && y != '\'' && y != ' ' && y != '.' && y != '°' && !Character.isDigit(y)){
                    viacheck = false;
                }
            }
            // Via Control End
            
            // House Number Control
            boolean nccontrol = true;
            boolean lengthnc = true;
            if(getNcString().isEmpty()) {
            	nccontrol = false;
            }
    	    for(int i = 0; i < getNcString().length(); i++) {
    		char numc = getNcString().charAt(i);
    	        nccontrol = false;
                if(Character.isDigit(numc)){
                    nccontrol = true;
                }
                if(nccontrol == false) {
    	            break;
    	        }
    	    }
            if(getNcString().length() > 5) {
            	lengthnc = false;
            }
            // House Number Control End 
            
            // Control Implementation
            if(datatrue == false){
		setVisible(false);
		JOptionPane.showMessageDialog(frame,
		"Errore nell'inserimento della data di nascita.\nPer proseguire correggila.",
		"Data Error",
                JOptionPane.ERROR_MESSAGE);
		setVisible(true);
            }else if(namecheck == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Nel campo nome sono ammessi solo caratteri alfabetici e non può essere vuoto.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);
            }else if(surnamecheck == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Nel campo cognome sono ammessi solo caratteri alfabetici e non può essere vuoto.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);
            }else if(cfcheck == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Codice fiscale non inserito o di lunghezza errata.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);
            }else if(cfcheck2 == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Nel codice fiscale ci sono caratteri non ammessi.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true); 
            }else if(cfcheck3 == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il codice fiscale non è corretto.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true); 
            }else if(cellCheck == false){
		setVisible(false);
		JOptionPane.showMessageDialog(frame,
		"Lunghezza del numero di cellulare errata.",
		"Error",
		JOptionPane.ERROR_MESSAGE);
		setVisible(true);
            }else if(cellCheck2 == false) {
		setVisible(false);
		JOptionPane.showMessageDialog(frame,
		"Inserire solo valori numerici nel campo Cellure.",
		"Error",
		JOptionPane.ERROR_MESSAGE);
		setVisible(true);
            }else if(usercontrol == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo Username non può essere vuoto.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);     
            }else if(pswdcontrol == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo Password non può essere vuoto.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);    	
            }else if(citycontrol == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo Città non può essere vuoto e non può contenere valori numerici.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);      	
            }else if(capcontrol == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo CAP non può essere vuoto e non può contenere caratteri alfabetici.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);  	
            }else if(lengthcap == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo CAP deve essere di 5 cifre.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true); 	
            }else if(viacheck == false){
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo via non può essere vuoto o non può contenere alcuni dei caratteri inseriti.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);
            }else if(nccontrol == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo Numero Civico non può essere vuoto e non può contenere caratteri alfabetici.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true);  	
            }else if(lengthnc == false) {
                setVisible(false);
                JOptionPane.showMessageDialog(frame,
                "Il campo Numero Civico è troppo grande per essere reale.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                setVisible(true); 	
            }else{
                Connection conn = null;
		Statement stmt = null;
		try{
                    boolean checkuser = true;
                    System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    System.out.println("Creating statement...");
                    stmt = conn.createStatement();
                    String sql_username_check;
                    sql_username_check = "SELECT User FROM Data";
                    ResultSet rs = stmt.executeQuery(sql_username_check);
                    while(rs.next()) {
			String userdb = rs.getString("User");
			if(userdb.equals(getUserId().toLowerCase())) {
                            stmt.close();
                            conn.close();
                            setVisible(false);
                            JOptionPane.showMessageDialog(frame,
                            "Username non disponibile!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                            setVisible(true);
                            checkuser = false;
                            break;
			}
                    }
                    if(checkuser == true) {
			String sql;
			sql = "INSERT INTO Data(Nome, Cognome, Datadn, CodFis, Cell, User, Password, Citta, CAP, Via, Civico) " 
                            + "VALUES(" + "'" + getNome() + "', " + "'" + getCognome() + "', "  + "'" + getDatadn() + "', "
                            + "'" + getCf() + "', " + "'" + getCell() + "', " + "'" + getUserId() + "', " 
                            + "'" + getPasw() + "', " + 
                            "'" + getCity() + "', " + "'" + getCap() + "', " + "'" + getVia() + "', " + "'" + getNc() + "');" ;
                            stmt.executeUpdate(sql);
                            stmt.close();
                            conn.close();
                            setVisible(false);
                            JOptionPane.showMessageDialog(frame,
                            "Registrazione effettuata con successo",
                            "Successo",
                            JOptionPane.PLAIN_MESSAGE);
                            setVisible(true);
                    }
		}
                catch(SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(frame,
                    "Errore in fase di connessione",
                    "Connection Error",
                    JOptionPane.ERROR_MESSAGE);
		}finally{
                    try{
			if(stmt!=null)
                            stmt.close();
                    }catch(SQLException se2){
                        JOptionPane.showMessageDialog(frame,
			"Errore in fase di connessione",
                        "Connection Error",
			JOptionPane.ERROR_MESSAGE);
                    }
                    try{
                        if(conn!=null)
                            conn.close();
                    }catch(SQLException se){
                        se.printStackTrace();
                        JOptionPane.showMessageDialog(frame,
			"Errore in fase di connessione",
			"Connection Error",
			JOptionPane.ERROR_MESSAGE);
                    }
		}
            }   
	}//GEN-LAST:event_regActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel birth1;
    private javax.swing.JTextField cap;
    private javax.swing.JLabel cap1;
    private javax.swing.JTextField cel;
    private javax.swing.JLabel cel1;
    private javax.swing.JTextField cf;
    private javax.swing.JLabel cf1;
    private javax.swing.JTextField city;
    private javax.swing.JLabel city1;
    private javax.swing.JTextField cognome;
    private javax.swing.JLabel cognome1;
    private java.awt.Choice day;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Choice month;
    private javax.swing.JTextField nc;
    private javax.swing.JLabel nc1;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JPasswordField pasw;
    private javax.swing.JLabel pasw1;
    private javax.swing.JButton reg;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel userid1;
    private javax.swing.JTextField via;
    private javax.swing.JLabel via1;
    private java.awt.Choice year;
    // End of variables declaration//GEN-END:variables
}
