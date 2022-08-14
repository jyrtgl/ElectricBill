import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class FinalsProgram extends JFrame implements ActionListener{
    JLabel hours,perday,amountday,permonth,amountmonth,greetname,bnu,bnid,bnad,bnbd,bndd,dfmonth,dfday,dfyear,bnbreak,bngen,bntrans,bndis,bntax,bnoth,dfdatec;
    JTextField tf1,tf2,tf3,tf4,tf5,bf1,bf2,bf3,bf4,bf5,bf6,bf7,bf8,bf9,bf0,dtf1,dtf2,dtf3,userText,passwordText;
    JButton b1,b2,b3,b4,b5,loginButton,exitbn,rbn,dp1; 
    FinalsProgram(){ 
    final JFrame djf= new JFrame("DATE"); 
	final JFrame homef = new JFrame("WATT A MERALCO");
	final JFrame calf= new JFrame("WATT A CALCULATOR"); 
	final JFrame helpf = new JFrame("Help");
	final JFrame bnf= new JFrame("BILLING NOTICE"); 
	final JFrame login = new JFrame("WATTA CALCULATOR LOGIN");
	final JFrame loginfail = new JFrame("ERROR");
	final JFrame datefail = new JFrame("ERROR");
	//FAILED LOGIN
	loginfail.setSize(200,200);
	loginfail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel failpanel1 = new JPanel();
	loginfail.add(failpanel1);
	JLabel failLabel = new JLabel("LOGIN FAILED");
	failpanel1.add(failLabel);
	JPanel failpanel2 = new JPanel();
	loginfail.add(failpanel2);
	JButton failButton = new JButton("Retry");
    failButton.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			login.setVisible(true);
			loginfail.setVisible(false);
		 }
	 });
	 failpanel2.add(failButton);
	loginfail.getContentPane().add(BorderLayout.CENTER, failpanel1);
	loginfail.getContentPane().add(BorderLayout.SOUTH, failpanel2);
    loginfail.setVisible(false);
	loginfail.setResizable(false);
	//FAILED LOGIN
	//LOGIN WINDOW
        login.setSize(350, 200);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel lpanel = new JPanel();    

        login.add(lpanel);

        lpanel.setLayout(null);

        JLabel userLabel = new JLabel("Name");
 
        userLabel.setBounds(10,20,80,25);
        lpanel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        lpanel.add(userText);

        JLabel passwordLabel = new JLabel("ID Number");
        passwordLabel.setBounds(10,50,80,25);
        lpanel.add(passwordLabel);

        passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        lpanel.add(passwordText);

		loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
		loginButton.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 String lp2=passwordText.getText();
			 int logp2=Integer.parseInt(lp2);
			 
			 if(logp2>99999&&logp2<1000000){
			 djf.setVisible(true);
			 login.setVisible(false);
			 }
			 else{
				 login.setVisible(false);
				loginfail.setVisible(true);
			 }
		 }
	 });
        lpanel.add(loginButton);
		login.setResizable(false);
        login.setVisible(true);
	//END OF LOGIN
	//DATE FAILED
	datefail.setSize(200,200);
	datefail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel datefailpanel1 = new JPanel();
	datefail.add(datefailpanel1);
	JLabel datefailLabel = new JLabel("INVALID DATE");
	datefailpanel1.add(datefailLabel);
	JPanel datefailpanel2 = new JPanel();
	datefail.add(datefailpanel2);
	JButton datefailButton = new JButton("Retry");
    datefailButton.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			djf.setVisible(true);
			datefail.setVisible(false);
		 }
	 });
	 datefailpanel2.add(datefailButton);
	datefail.getContentPane().add(BorderLayout.CENTER, datefailpanel1);
	datefail.getContentPane().add(BorderLayout.SOUTH, datefailpanel2);
    datefail.setVisible(false);
	datefail.setResizable(false);
	//END OF DF
	//DATE
     dtf1=new JTextField(); 
     dtf1.setBounds(100,10,30,20); 
     dtf2=new JTextField(); 
     dtf2.setBounds(100,40,30,20); 
     dtf3=new JTextField(); 
     dtf3.setBounds(100,70,50,20); 
     dfmonth=new JLabel("Month"); 
     dfmonth.setBounds(20,10,70,20);
     dfday=new JLabel("Day");
     dfday.setBounds(20,40,70,20);
     dfyear=new JLabel("Year");
     dfyear.setBounds(20,70,70,20);
	 dfdatec=new JLabel();
     dfdatec.setBounds(70,145,70,15);
     
     dp1=new JButton("Proceed"); 
	 dp1.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			String fm=dtf1.getText();
			String fd=dtf2.getText();
			String fy=dtf3.getText();
			int fmm=Integer.parseInt(fm);
			int fdd=Integer.parseInt(fd);
			int fyy=Integer.parseInt(fy);
			if(fmm>0&&fmm<13&&fdd>0&&fdd<32){
			homef.setVisible(true);
			djf.setVisible(false);
			}else{
				djf.setVisible(false);
				datefail.setVisible(true);
			}
		 }
	 });
     dp1.setBounds(50,100,100,40); 
     djf.add(dtf1);djf.add(dtf2);djf.add(dtf3);djf.add(dp1);

     djf.add(dfmonth);djf.add(dfday);djf.add(dfyear);djf.add(dfdatec);

     djf.setSize(220,200); 
     djf.setLayout(null); 
     djf.setVisible(false); 
	 djf.setResizable(false);
	//END OF DATE
	//HOME WINDOW
    homef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    homef.setSize(400, 200);
    JMenuBar mb = new JMenuBar();
    JMenu mc = new JMenu("FILE");
    mb.add(mc);
	JMenuItem mh = new JMenuItem("Help");
	mh.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 helpf.setVisible(true);
			 homef.setVisible(false);
		 }
	});
	mb.add(mh);
    JMenuItem m11 = new JMenuItem("Calculator");
	m11.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 calf.setVisible(true);
			 homef.setVisible(false);
		 }
	 });
	JMenuItem m22 = new JMenuItem("Billing Notice");
	m22.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			bnf.setVisible(true);
			homef.setVisible(false);
		 }
	 });
    mc.add(m11);
    mc.add(m22);

    JPanel hp = new JPanel();
	JLabel mt = new JLabel("ANG LIWANAG NG BUKAS");
	hp.add(mt);
		
	JPanel panel2 = new JPanel();
	greetname = new JLabel("HELLO NEW MEMBER! DO YOU WANT TO");
	JButton logout = new JButton("LOGOUT");
	logout.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 login.setVisible(true);
			 homef.setVisible(false);
		 }
	 });
	panel2.add(greetname);
	panel2.add(logout);
		
    homef.getContentPane().add(BorderLayout.NORTH, mb);
	homef.getContentPane().add(BorderLayout.CENTER, hp);
	homef.getContentPane().add(BorderLayout.SOUTH, panel2);
    homef.setVisible(false);
	homef.setResizable(false);
	 //END OF HOME
	 //CALCULATOR
     tf1=new JTextField(); 
     tf1.setBounds(200,50,30,20); 
     tf2=new JTextField(); 
     tf2.setBounds(200,100,70,20); 
     tf2.setEditable(false);
	 tf3=new JTextField(); 
     tf3.setBounds(200,150,70,20); 
     tf3.setEditable(false);
	 tf4=new JTextField(); 
     tf4.setBounds(200,200,70,20); 
     tf4.setEditable(false);
	 tf5=new JTextField(); 
     tf5.setBounds(200,250,70,20); 
     tf5.setEditable(false);
     hours=new JLabel("NUMBER OF HOURS / DAY");
     hours.setBounds(20,50,150,20);
     perday=new JLabel("KWH / DAY");
     perday.setBounds(20,100,150,20);
     amountday=new JLabel("Amount / DAY");
     amountday.setBounds(20,150,150,20);
     permonth=new JLabel("KWH / MONTH = 30days");
     permonth.setBounds(20,200,150,20);
     amountmonth=new JLabel("AMOUNT / MONTH = 30days");
     amountmonth.setBounds(20,250,170,20);
     b1=new JButton("AirCon"); 
     b1.setBounds(10,300,110,50); 
     b2=new JButton("Dryer"); 
     b2.setBounds(130,300,110,50);
	 b3= new JButton("Refrigerator");
	 b3.setBounds(250,300,110,50);
	 b4=new JButton("RETURN");
	 b4.setBounds(210,390,110,50);
	 b4.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 homef.setVisible(true);
			 calf.setVisible(false);
		 }
	 });
	 b5=new JButton("SUBMIT");
	 b5.setBounds(50,390,110,50);
	 b5.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 bnf.setVisible(true);
			 calf.setVisible(false);
		 }
	 });
     b1.addActionListener(this); 
     b2.addActionListener(this);
	 b3.addActionListener(this);
     calf.add(tf1);calf.add(tf2);calf.add(tf3);calf.add(tf4);calf.add(tf5);calf.add(b1);calf.add(b2);calf.add(b3);calf.add(b4);calf.add(b5);
     //
     calf.add(hours);calf.add(perday);calf.add(amountday);calf.add(permonth);calf.add(amountmonth);                          //ADDED
     //
     calf.setSize(400,500); 
     calf.setLayout(null); 
     calf.setVisible(false); 
	 calf.setResizable(false);
	 //END OF CALCULATOR
	 //BILLING NOTICE
     bf1=new JTextField(); 
     bf1.setBounds(150,50,100,20); 
	 bf1.setEditable(false);
     bf2=new JTextField(); 
     bf2.setBounds(150,100,100,20); 
	 bf2.setEditable(false);
     bf3=new JTextField(); 
     bf3.setBounds(150,150,100,20); 
     bf3.setEditable(false);
     bnu=new JLabel("USERNAME");
     bnu.setBounds(20,50,150,20);
     bnid=new JLabel("ID Number");
     bnid.setBounds(20,100,150,20);
     bnad=new JLabel("AMOUNT DUE: ");
     bnad.setBounds(20,150,150,20);
	 bf4=new JTextField(); 
     bf4.setBounds(150,200,100,20); 
     bf4.setEditable(false);
     bnbd=new JLabel("BILLING DATE: ");
     bnbd.setBounds(20,200,150,20);
     bf5=new JTextField(); 
     bf5.setBounds(150,250,100,20); 
     bf5.setEditable(false);
	 //
	 bnbreak=new JLabel("BREAKDOWN");
     bnbreak.setBounds(100,300,150,20);
	 
	 bngen=new JLabel("GENERATION: ");
     bngen.setBounds(20,350,150,20);
     bf6=new JTextField(); 
     bf6.setBounds(150,350,100,20); 
     bf6.setEditable(false);
	 
	 bntrans=new JLabel("TRANSMISSION: ");
     bntrans.setBounds(20,400,150,20);
     bf7=new JTextField(); 
     bf7.setBounds(150,400,100,20); 
     bf7.setEditable(false);
	 
	 bndis=new JLabel("DISTRIBUTION: ");
     bndis.setBounds(20,450,150,20);
     bf8=new JTextField(); 
     bf8.setBounds(150,450,100,20); 
     bf8.setEditable(false);
	 
	 bntax=new JLabel("TAXES: ");
     bntax.setBounds(20,500,150,20);
     bf9=new JTextField(); 
     bf9.setBounds(150,500,100,20); 
     bf9.setEditable(false);
	 
	 bnoth=new JLabel("OTHERS: ");
     bnoth.setBounds(20,550,150,20);
     bf0=new JTextField(); 
     bf0.setBounds(150,550,100,20); 
     bf0.setEditable(false);
	 //
     bndd=new JLabel("DUE DATE: ");
     bndd.setBounds(20,250,150,20);
	 
	 rbn=new JButton("RETURN");
	 rbn.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 calf.setVisible(true);
			 bnf.setVisible(false);
		 }
	 });
	 rbn.setBounds(25,600,100,50);
	 exitbn=new JButton("LOGOUT");
	 exitbn.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 login.setVisible(true);
			 bnf.setVisible(false);
		 }
	 });
	 exitbn.setBounds(160,600,100,50);
     bnf.add(bf1);bnf.add(bf2);bnf.add(bf3);bnf.add(bf4);bnf.add(bf5);bnf.add(bf6);bnf.add(bf7);bnf.add(bf8);bnf.add(bf9);bnf.add(bf0);
     bnf.add(bnu);bnf.add(bnid);bnf.add(bnad);bnf.add(bnbd);bnf.add(bndd);
	 bnf.add(bnbreak);bnf.add(bngen);bnf.add(bntrans);bnf.add(bndis);bnf.add(bntax);bnf.add(bnoth);
	 bnf.add(exitbn);bnf.add(rbn);
     bnf.setSize(300,700); 
     bnf.setLayout(null); 
     bnf.setVisible(false); 
	 bnf.setResizable(true);
	 //END OF BILLING
	// HELP
        helpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        helpf.setSize(500, 200);
        JPanel helpp = new JPanel();
		JLabel ht = new JLabel("THIS CALCULATOR BY ROLAN M. TAGLE JR. IS NOT YET WELL DEVELOPED.");
		helpp.add(ht);
		
		JPanel helpanel = new JPanel();
		JLabel h1 = new JLabel("THIS IS NOT THE REAL MERALCO APPLIANCES CALCULATOR.");
		helpanel.add(h1);
		JButton rb = new JButton("RETURN");
		rb.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent arg0){
			 homef.setVisible(true);
			 helpf.setVisible(false);
		 }
	 });
		helpf.getContentPane().add(BorderLayout.SOUTH, rb);
		helpf.getContentPane().add(BorderLayout.NORTH, helpp);
		helpf.getContentPane().add(BorderLayout.CENTER, helpanel);
        helpf.setVisible(false);
		helpf.setResizable(false);
		//END OF HELP
} 
public void actionPerformed(ActionEvent e) { 
     String s1=tf1.getText(); 
	 String sm=dtf1.getText();
	 String sd=dtf2.getText();
	 String sy=dtf3.getText();
	 String lu=userText.getText();
	 String lp=passwordText.getText();
	 int logp=Integer.parseInt(lp);
	 int mm=Integer.parseInt(sm);
	 int dd=Integer.parseInt(sd);
	 int yy=Integer.parseInt(sy);
     double a=Double.parseDouble(s1); 
     double c=0; 
	 int duedate=0;
	 int leapyear=yy%4;
	 //dueday, addmonth, duemonth, dueyear//
	 int dueday=dd+9;
	 int addmonth=0;
	 int duemonth=0;
	 int dueyear=0;

	 if(yy%4==0){
		 if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10){
			 if(dd>=1&&dd<=31){
				 if(dueday>=1&&dueday<=31){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-31;
					 String BillingDueDate=String.valueOf(addmonth + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }else if(mm==12){
			 if(dd>=1&&dd<=31){
				 if(dueday>=1&&dueday<=31){
						String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
						bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm-11;
					 duedate=dueday-31;
					 dueyear=yy+1;
					 String BillingDueDate=String.valueOf(addmonth + "/" + duedate + "/" + dueyear);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }else if(mm==2){
			 if(dd>=1&&dd<=29){
				 if(dueday>=1&&dueday<=29){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-29;
					 String BillingDueDate=String.valueOf(addmonth + "/" + duedate + "/" + yy);
					bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }else if(mm==4||mm==6||mm==9||mm==11){
			 if(dd>=1&&dd<=30){
				 if(dueday>=1&&dueday<=30){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-30;
					 String BillingDueDate=String.valueOf(addmonth + "/" + duedate + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }
	 }else{
		 if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10){
			 if(dd>=1&&dd<=31){
				 if(dueday>=1&&dueday<=31){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-31;
					 String BillingDueDate=String.valueOf(addmonth + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }else if(mm==12){
			 if(dd>=1&&dd<=31){
				 if(dueday>=1&&dueday<=31){
						String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
						bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm-11;
					 duedate=dueday-31;
					 dueyear=yy+1;
					 String BillingDueDate=String.valueOf(addmonth + "/" + duedate + "/" + dueyear);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }else if(mm==2){
			 if(dd>=1&&dd<=28){
				 if(dueday>=1&&dueday<=28){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-28;
					 String BillingDueDate=String.valueOf(addmonth + "/" + duedate + "/" + yy);
					bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10){
			 if(dd>=1&&dd<=31){
				 if(dueday>=1&&dueday<=31){
					 String BillingDueDate=String.valueOf(mm + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }else{
					 addmonth=mm+1;
					 duedate=dueday-31;
					 String BillingDueDate=String.valueOf(addmonth + "/" + dueday + "/" + yy);
					 bf5.setText(BillingDueDate);
				 }
			 }else{
				 dfdatec.setText("Invalid Input");
				 bf5.setText("Invalid Input");
			 }
		 }
	 }
	//
	//	
	 if (a>0&&a<25){
     if(e.getSource()==b1){ 
           c=a*1.25; 
     }else if(e.getSource()==b2){ 
            c=a*3.21;
     }else if(e.getSource()==b3){
			c=a*.2;
	 }
	 double perdaily= c*10.56;
	 double monthly = c*30;
	 double permonthly = monthly*10.56;
       String perday=String.valueOf(String.format("%.2f",c)); 
       tf2.setText(perday); 	 
       String amountday=String.valueOf(String.format("%.2f",perdaily));
	   tf3.setText(amountday);
	   String permonth=String.valueOf(String.format("%.2f",monthly));
	   tf4.setText(permonth);
	   String amountmonth=String.valueOf(String.format("%.2f",permonthly));
	   tf5.setText(amountmonth);
	   //
	 double generation = permonthly * 0.55;
	 double transmission = permonthly * 0.101;
	 double distribution = permonthly * 0.175;
	 double taxes = permonthly *0.117;
	 double others = permonthly * 0.057;
	 
		String breakgen=String.valueOf(String.format("%.2f",generation));
		bf6.setText(breakgen);
		String breaktrans=String.valueOf(String.format("%.2f",transmission));
		bf7.setText(breaktrans);
		String breakdis=String.valueOf(String.format("%.2f",distribution));
		bf8.setText(breakdis);
		String breaktax=String.valueOf(String.format("%.2f",taxes));
		bf9.setText(breaktax);
		String breakoth=String.valueOf(String.format("%.2f",others));
		bf0.setText(breakoth);
	   //
	   bf3.setText(amountmonth);
	   String BillingDate=String.valueOf(mm + "/" + dd + "/" + yy);
	   bf4.setText(BillingDate);
	   bf1.setText(lu);
	   String Lid=String.valueOf(logp);
	   bf2.setText(Lid);
	 }else if(a<1||a>24){
		 tf2.setText("Invalid Input");
		 tf3.setText("Invalid Input");
		 tf4.setText("Invalid Input");
		 tf5.setText("Invalid Input");
	 }
     } 
    public static void main(String[] args) { 
     new FinalsProgram(); 
}
}