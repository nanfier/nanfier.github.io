import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class onlineOrder {

	private JFrame frmWelcomeToOnline;
	JButton btnStartOrder;
	JPanel panelSize;
	JButton btnSize6;
	JButton btnSize12;
	private JButton btnRight;
	private JButton btnLeft;
    orderContainer oc = new orderContainer();
    private JPanel panelBread;
    private JButton btnBread1;
    private JButton btnBread2;
    private JButton btnbread3;
    private JButton btnBread4;
    private JButton btntest;
    private JPanel panelflavor;
    private JButton btnflavour1;
    private JButton btnflavour2;
    private JButton btnFlavour3;
    private JButton btnFlavour4;
    private JPanel panelSauces;
    private JButton btnSauces1;
    private JButton btnSauces2;
    private JButton btnSauces3;
    private JButton btnSauces4;
    private JPanel panelVeggies;
    private JButton btnVeggi1;
    private JButton btnVeggi2;
    private JButton btnVeggi3;
    private JButton btnVeggi4;
    private JPanel panelDrinkNcookie;
    private JButton btnDrinkL;
    private JButton btnDrinkS;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JPanel panelRecipt;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JButton btnDone;
    private JPanel panelOrderRec;
    private JLabel lblOrder;
    private JButton btnOrderReady;
    private JPanel panelPickup;
    private JLabel lblNewLabel_5;
    private JPasswordField passwordField;
    private JLabel lblEnterCode;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblOpen;
    private JLabel lblNewLabel_9;
    private JLabel lblMSGL;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					onlineOrder window = new onlineOrder();
					window.frmWelcomeToOnline.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	//System.out.println(oc.order());
	}

	/**
	 * Create the application.
	 */
	public onlineOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToOnline = new JFrame();
		frmWelcomeToOnline.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SubMelt.png"));
		frmWelcomeToOnline.setResizable(false);
		frmWelcomeToOnline.setTitle("Welcome to Online Sandwich Order Kiosk");
		frmWelcomeToOnline.setBounds(100, 100, 1289, 731);
		frmWelcomeToOnline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToOnline.getContentPane().setLayout(null);
		
		btnStartOrder = new JButton("Start Order");
		btnStartOrder.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnStartOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnStartOrder.setVisible(false);
				panelSize.setVisible(true);
				btnRight.setVisible(true);
				btnLeft.setVisible(true);
			}
		});
		String ss = oc.getOrder();
		btnStartOrder.setBounds(490, 251, 261, 133);
		frmWelcomeToOnline.getContentPane().add(btnStartOrder);
		
		panelSize = new JPanel();
		panelSize.setBounds(252, 100, 755, 438);
		panelSize.setVisible(false);
		
		btnRight = new JButton("Next>>");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setActivePane(oc.getActivePane()+1);
				panelSize.setVisible(false);
				panelBread.setVisible(false);
				panelflavor.setVisible(false);
				panelSauces.setVisible(false);
				panelVeggies.setVisible(false);
				panelDrinkNcookie.setVisible(false);
				panelRecipt.setVisible(false);
				if (oc.getActivePane()==1){
					panelBread.setVisible(true);
				}
				if (oc.getActivePane()==2){
				panelflavor.setVisible(true);
				}
				if (oc.getActivePane()==3){
				panelSauces.setVisible(true);
				}
				if (oc.getActivePane()==4){
				panelVeggies.setVisible(true);
				}
				if (oc.getActivePane()==5){
					panelDrinkNcookie.setVisible(true);
				}
				if (oc.getActivePane()==6){
					panelRecipt.setVisible(true);
					btnLeft.setVisible(false);
					btnRight.setVisible(false);
					btnDone.setVisible(true);
				}
			}
		});
		btnRight.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRight.setBounds(1084, 264, 141, 112);
		btnRight.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(btnRight);
		
		btnLeft = new JButton("<<Previous");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(oc.getActivePane()>0){
				oc.setActivePane(oc.getActivePane()-1);}
				
				
				panelSize.setVisible(false);
				panelBread.setVisible(false);
				panelflavor.setVisible(false);
				panelSauces.setVisible(false);
				panelVeggies.setVisible(false);
				panelDrinkNcookie.setVisible(false);
				panelRecipt.setVisible(false);
				if (oc.getActivePane()==0){
					panelSize.setVisible(true);
				}
				panelBread.setVisible(false);
				if (oc.getActivePane()==1){
					panelBread.setVisible(true);
				}
								
				if (oc.getActivePane()==2){
				panelflavor.setVisible(true);
				}
				
				if(oc.getActivePane()==3){
				panelSauces.setVisible(true);
				}
				if (oc.getActivePane()==4){
					panelVeggies.setVisible(true);
				}
				if (oc.getActivePane()==5){
				panelDrinkNcookie.setVisible(true);
				}
				if (oc.getActivePane()==6){
					panelRecipt.setVisible(true);
					
					}
			}
		});
		btnLeft.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLeft.setBounds(53, 264, 147, 112);
		btnLeft.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(btnLeft);
		
		btntest = new JButton("Check Order");
		btntest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(oc.order());
			}
		});
		
		btnDone = new JButton("Done");
		btnDone.setVisible(false);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRecipt.setVisible(false);
				btnDone.setVisible(false);
				panelOrderRec.setVisible(true);
				
			}
		});
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDone.setForeground(new Color(178, 34, 34));
		btnDone.setBounds(1084, 392, 149, 133);
		frmWelcomeToOnline.getContentPane().add(btnDone);
		btntest.setBounds(1110, 16, 115, 29);
		frmWelcomeToOnline.getContentPane().add(btntest);
		frmWelcomeToOnline.getContentPane().add(panelSize);
		panelSize.setLayout(null);
		
		btnSize6 = new JButton("6\"");
		btnSize6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			oc.setSize("Size: 6 inch");
			}
		});
		btnSize6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSize6.setBounds(238, 48, 260, 133);
		panelSize.add(btnSize6);
		
	    btnSize12 = new JButton("Foot Long");
	    btnSize12.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		oc.setSize("Size:Foot Long");
	    	}
	    });
	    btnSize12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSize12.setBounds(238, 240, 260, 133);
		panelSize.add(btnSize12);
		
		panelBread = new JPanel();
		panelBread.setBounds(226, 73, 837, 504);
		panelBread.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelBread);
		panelBread.setLayout(null);
		
		btnBread1 = new JButton("");
		btnBread1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setBread("Bread: Honey Oat");
			}
		});
		btnBread1.setToolTipText("Honey Oat");
		btnBread1.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\b_Bread_HoneyOat.png"));
		btnBread1.setBounds(0, 0, 400, 234);
		panelBread.add(btnBread1);
		
		btnBread2 = new JButton("");
		btnBread2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setBread("Bread: Italina Herbs");
			}
		});
		btnBread2.setToolTipText("Italian Herbs");
		btnBread2.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\b_Bread_ItalHerbs.png"));
		btnBread2.setBounds(437, 0, 400, 221);
		panelBread.add(btnBread2);
		
		btnbread3 = new JButton("");
		btnbread3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setBread("Bread: Multigrain");
			}
		});
		btnbread3.setToolTipText("Multigrain");
		btnbread3.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\b_Bread_multi.png"));
		btnbread3.setBounds(0, 263, 400, 241);
		panelBread.add(btnbread3);
		
		btnBread4 = new JButton("");
		btnBread4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setBread("Bread: Wheat");
			}
		});
		btnBread4.setToolTipText("Wheat");
		btnBread4.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\b_Bread_wheat.png"));
		btnBread4.setBounds(447, 263, 390, 241);
		panelBread.add(btnBread4);
		
		panelflavor = new JPanel();
		panelflavor.setBounds(226, 73, 843, 504);
		panelflavor.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelflavor);
		panelflavor.setLayout(null);
		
		btnflavour1 = new JButton("");
		btnflavour1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setFlavour("flavour: Meat Ball");
			}
		});
		btnflavour1.setToolTipText("Meat Ball");
		btnflavour1.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SubMeatBall.png"));
		btnflavour1.setBounds(0, 0, 415, 247);
		panelflavor.add(btnflavour1);
		
		btnflavour2 = new JButton("");
		btnflavour2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setFlavour("flavour: Pizza");
			}
		});
		btnflavour2.setToolTipText("Pizza");
		btnflavour2.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SubPizza.png"));
		btnflavour2.setBounds(430, 0, 398, 247);
		panelflavor.add(btnflavour2);
		
		btnFlavour3 = new JButton("");
		btnFlavour3.setToolTipText("Tuna");
		btnFlavour3.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SubTuna.png"));
		btnFlavour3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setFlavour("flavour: Tuna");
			}
		});
		btnFlavour3.setBounds(0, 263, 415, 241);
		panelflavor.add(btnFlavour3);
		
		btnFlavour4 = new JButton("");
		btnFlavour4.setToolTipText("Clasic Chicken");
		btnFlavour4.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SubChickenClassic.png"));
		btnFlavour4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setFlavour("flavour: Clasic Chicken");
			}
		});
		btnFlavour4.setBounds(430, 263, 398, 241);
		panelflavor.add(btnFlavour4);
		
		panelSauces = new JPanel();
		panelSauces.setBounds(226, 73, 837, 504);
		panelSauces.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelSauces);
		panelSauces.setLayout(null);
		
		btnSauces1 = new JButton("BBQ");
		btnSauces1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setSauces1("Sauces: BBQ ");
			}
		});
		btnSauces1.setToolTipText("BBQ");
		btnSauces1.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\s_Sauce_BBQ.png"));
		btnSauces1.setBounds(0, 0, 400, 230);
		panelSauces.add(btnSauces1);
		
		btnSauces2 = new JButton("Honey Mastred");
		btnSauces2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setSauces2("Sauces: Honey Mastred ");
			}
		});
		btnSauces2.setToolTipText("Honey Mastred");
		btnSauces2.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\s_Sauce_HoneyMustard.png"));
		btnSauces2.setBounds(425, 0, 412, 230);
		panelSauces.add(btnSauces2);
		
		btnSauces3 = new JButton("Sweet Onion");
		btnSauces3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setSauces3("Sauces: Sweet Onion ");
			}
		});
		btnSauces3.setToolTipText("Sweet Onion");
		btnSauces3.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\s_Sauce_SweetOnion.png"));
		btnSauces3.setBounds(0, 258, 400, 230);
		panelSauces.add(btnSauces3);
		
		btnSauces4 = new JButton("Sweet Chilli");
		btnSauces4.setToolTipText("Sweet Chilli");
		btnSauces4.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\s_Sauce_SweetChilli.png"));
		btnSauces4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setSauces4("Sauces: Sweet Chilli");
			}
		});
		btnSauces4.setBounds(425, 258, 412, 230);
		panelSauces.add(btnSauces4);
		
		panelDrinkNcookie = new JPanel();
		panelDrinkNcookie.setBounds(226, 69, 837, 504);
		panelDrinkNcookie.setVisible(false);
		
		panelVeggies = new JPanel();
		panelVeggies.setBounds(226, 73, 837, 504);
		panelVeggies.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelVeggies);
		panelVeggies.setLayout(null);
		
		btnVeggi1 = new JButton("Peppers");
		btnVeggi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setVeggi1("Veggies: Peppers");
			}
		});
		btnVeggi1.setToolTipText("Peppers");
		btnVeggi1.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SaladCapsicum.png"));
		btnVeggi1.setBounds(0, 0, 410, 231);
		panelVeggies.add(btnVeggi1);
		
		btnVeggi2 = new JButton("Tomatos");
		btnVeggi2.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SaladTomato.png"));
		btnVeggi2.setToolTipText("Tomatos");
		btnVeggi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setVeggi2("Veggies: Tomatos");
			}
		});
		btnVeggi2.setBounds(427, 0, 410, 230);
		panelVeggies.add(btnVeggi2);
		
		btnVeggi3 = new JButton("Onions");
		btnVeggi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setVeggi3("Veggies: Onions");
			}
		});
		btnVeggi3.setToolTipText("Onions");
		btnVeggi3.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SaladOnion.png"));
		btnVeggi3.setBounds(0, 247, 410, 241);
		panelVeggies.add(btnVeggi3);
		
		btnVeggi4 = new JButton("Olives");
		btnVeggi4.setToolTipText("Olives");
		btnVeggi4.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\SaladOlives.png"));
		btnVeggi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setVeggi4("Veggies: Olives");
			}
		});
		btnVeggi4.setBounds(427, 246, 410, 242);
		panelVeggies.add(btnVeggi4);
		frmWelcomeToOnline.getContentPane().add(panelDrinkNcookie);
		panelDrinkNcookie.setLayout(null);
		
		btnDrinkL = new JButton("");
		btnDrinkL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setDrink("Drink: Large");
			}
		});
		btnDrinkL.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\drink.jpg"));
		btnDrinkL.setToolTipText("Large Drink");
		btnDrinkL.setBounds(261, 54, 94, 137);
		panelDrinkNcookie.add(btnDrinkL);
		
		btnDrinkS = new JButton("");
		btnDrinkS.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\drink_small.jpg"));
		btnDrinkS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oc.setDrink("Drink: Small");
			}
		});
		btnDrinkS.setToolTipText("Small Drink");
		btnDrinkS.setBounds(406, 54, 94, 137);
		panelDrinkNcookie.add(btnDrinkS);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c1 = oc.getCookie1()+1 ;
				oc.setCookie1(c1);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Cookie_DblChoc.png"));
		btnNewButton.setBounds(111, 283, 166, 137);
		panelDrinkNcookie.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c2 = oc.getCookie2()+1 ;
				oc.setCookie2(c2);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Cookie_Raspberrychee.png"));
		btnNewButton_1.setBounds(318, 283, 159, 137);
		panelDrinkNcookie.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c3 = oc.getCookie3()+1 ;
				oc.setCookie3(c3);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Cookie_Maca_WhiteChoc.png"));
		btnNewButton_2.setBounds(517, 283, 166, 137);
		panelDrinkNcookie.add(btnNewButton_2);
		
		panelRecipt = new JPanel();
		panelRecipt.setForeground(new Color(165, 42, 42));
		panelRecipt.setBounds(220, 66, 849, 507);
		panelRecipt.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelRecipt);
		panelRecipt.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\payment.JPG"));
		lblNewLabel.setBounds(15, 16, 414, 195);
		panelRecipt.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Thanks for Order.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(81, 211, 296, 87);
		panelRecipt.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Please collect your recipt and remeber the code:2424");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(48, 351, 746, 87);
		panelRecipt.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\recipt.JPG"));
		lblNewLabel_3.setBounds(483, 16, 336, 320);
		panelRecipt.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Press Done >>");
		lblNewLabel_4.setForeground(new Color(178, 34, 34));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(600, 402, 219, 52);
		panelRecipt.add(lblNewLabel_4);
		
		panelOrderRec = new JPanel();
		panelOrderRec.setVisible(false);
		panelOrderRec.setBackground(new Color(0, 0, 0));
		panelOrderRec.setForeground(new Color(127, 255, 0));
		panelOrderRec.setBounds(53, 51, 1190, 591);
		
		frmWelcomeToOnline.getContentPane().add(panelOrderRec);
		panelOrderRec.setLayout(null);
		
		lblOrder = new JLabel("");
		lblOrder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrder.setVerticalAlignment(SwingConstants.TOP);
		lblOrder.setForeground(new Color(154, 205, 50));
		lblOrder.setText("Only Subway Employee will see this screen. \n When Oreder is ready press Order Ready Button");
		
		lblOrder.setBounds(65, 71, 885, 51);
		panelOrderRec.add(lblOrder);
		
		btnOrderReady = new JButton("Order Ready");
		btnOrderReady.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOrderReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOrderRec.setVisible(false);
				btnOrderReady.setVisible(false);
				panelPickup.setVisible(true);
			}
		});
		btnOrderReady.setBounds(992, 234, 160, 129);
		panelOrderRec.add(btnOrderReady);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText(oc.getOrder());
		textPane.setBounds(75, 115, 769, 107);
		panelOrderRec.add(textPane);
		
		panelPickup = new JPanel();
		panelPickup.setBounds(53, 51, 1193, 591);
		panelPickup.setVisible(false);
		frmWelcomeToOnline.getContentPane().add(panelPickup);
		panelPickup.setLayout(null);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblNewLabel_5.setBounds(0, 0, 506, 168);
		panelPickup.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("Enter");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				passwordField.setVisible(false);
				lblOpen.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker_open.jpg"));
				lblMSGL.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(1015, 188, 144, 77);
		panelPickup.add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(1015, 125, 144, 43);
		panelPickup.add(passwordField);
		
		lblEnterCode = new JLabel("Enter Code");
		lblEnterCode.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEnterCode.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEnterCode.setBounds(1015, 57, 144, 48);
		panelPickup.add(lblEnterCode);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblNewLabel_6.setBounds(0, 167, 506, 168);
		panelPickup.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblNewLabel_7.setBounds(504, 0, 408, 168);
		panelPickup.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblNewLabel_8.setBounds(0, 337, 506, 168);
		panelPickup.add(lblNewLabel_8);
		
		lblOpen = new JLabel("");
		lblOpen.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblOpen.setBounds(504, 167, 408, 168);
		panelPickup.add(lblOpen);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Sukhvir\\workspace\\HCI\\src\\imgs\\Locker.jpg"));
		lblNewLabel_9.setBounds(504, 345, 408, 160);
		panelPickup.add(lblNewLabel_9);
		
		 lblMSGL = new JLabel("Locker #15");
		 lblMSGL.setForeground(new Color(34, 139, 34));
		 lblMSGL.setFont(new Font("Tahoma", Font.PLAIN, 34));
		 lblMSGL.setVisible(false);
		 lblMSGL.setBackground(new Color(143, 188, 143));
		 lblMSGL.setBounds(959, 57, 219, 199);
		 panelPickup.add(lblMSGL);
	}
}
