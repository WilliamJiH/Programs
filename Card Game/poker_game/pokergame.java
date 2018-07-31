package poker_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class pokergame extends JFrame implements ActionListener{

	private Container c;
	private JMenu file,help;
	private JMenuBar bar;
	private JMenuItem newgame,quit,about;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	private ImageIcon icon;
	private card[] cards;
	private int counter,position,option;
	double score,scorec;

	public pokergame(){
		this.setSize(490,340);
		this.setLocation(500, 200);
		this.setTitle("Poker Game!");

		this.c = this.getContentPane();
		this.c.setLayout(null);


		this.bar = new JMenuBar();
		this.bar.setBounds(0,0,490,30);
		this.c.add(this.bar);

		this.file = new JMenu("File");
		this.file.setFont(new Font("Cambria",Font.PLAIN,16));
		this.file.setSize(100, 30);
		this.bar.add(this.file);

		this.help = new JMenu("Help");
		this.help.setFont(new Font("Cambria",Font.PLAIN,16));
		this.help.setSize(100, 30);
		this.bar.add(this.help);

		this.cards = new card[52];
		this.counter = 0;
		this.position = 0;

		initializecard();
		makerandom();




		this.setVisible(true);
		this.setResizable(false);


	}

	public static void main(String[] args) {
		pokergame pg = new pokergame();

	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("TEST ACTION LISTENER!");
		b1.setIcon(cards[position].getIcon());
		try {
			Thread.sleep(900);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

		score = cards[position++].getPoint();
		if(option == 1)
			return;
		for(int i = 0; i < 4;i++){
			checkscore();
			if(i == 0){
				b2.setIcon(cards[position].getIcon());
				try {
					Thread.sleep(900);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				score = score + cards[position++].getPoint();
				System.out.println(score);
				if(option == 1){
					return;
				}
			}
			if(i == 1){
				b3.setIcon(cards[position].getIcon());
				try {
					Thread.sleep(900);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				score = score + cards[position++].getPoint();
				System.out.println(score);
				if(option == 1){
					return;
				}
			}
			if(i == 2){
				b4.setIcon(cards[position].getIcon());
				try {
					Thread.sleep(900);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				score = score + cards[position++].getPoint();
				System.out.println(score);

				if(option == 1){
					return;
				}
			}
			if(i == 3){
				b5.setIcon(cards[position].getIcon());
				try {
					Thread.sleep(900);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				score = score + cards[position++].getPoint();
				System.out.println(score);
			}


		}

		//Computer
		System.out.println("TEST ACTION LISTENER! == Computer");
		
		b5.setIcon(cards[position].getIcon());
		try {
			Thread.sleep(900);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		score = cards[position++].getPoint();
		while(score < 10.5){
			for(int i = 0; i < 4;i++){
				if(i == 0){
					b6.setIcon(cards[position].getIcon());
					try {
						Thread.sleep(900);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}

					score = score + cards[position++].getPoint();

				}
				if(i == 1){
					b3.setIcon(cards[position].getIcon());
					try {
						Thread.sleep(900);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
							JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					score = score + cards[position++].getPoint();
					if(option == 1){
						break;
					}
				}
				if(i == 2){
					b4.setIcon(cards[position].getIcon());
					try {
						Thread.sleep(900);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
							JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					score = score + cards[position++].getPoint();
					if(option == 1){
						break;
					}
				}
				if(i == 3){
					b5.setIcon(cards[position].getIcon());
					try {
						Thread.sleep(900);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					score = score + cards[position++].getPoint();
				}
				System.out.println(score);
				checkscore();


			}
			while(scorec < 10.5){
				for(int i = 0; i < 4; i++){
					try{
						Thread.sleep(500);
						System.out.println("computer");

						if(i == 0){
							b6.setIcon(cards[position].getIcon());
							try {
								Thread.sleep(900);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
							option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
									JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							scorec = scorec + cards[position++].getPoint();
							if(option == 1){
								break;
							}
						}
						else if(i == 1){
							b7.setIcon(cards[position].getIcon());
							try {
								Thread.sleep(900);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
							option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
									JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							scorec = scorec + cards[position++].getPoint();
							if(option == 1){
								break;
							}
						}
						else if(i == 2){
							b8.setIcon(cards[position].getIcon());
							try {
								Thread.sleep(900);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
							option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
									JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							scorec = scorec + cards[position++].getPoint();
							if(option == 1){
								break;
							}
						}
						else if(i == 3){
							b9.setIcon(cards[position].getIcon());
							try {
								Thread.sleep(900);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
							option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
									JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							scorec = scorec + cards[position++].getPoint();
							if(option == 1){
								break;
							}
						}
						else if(i == 4){
							b10.setIcon(cards[position].getIcon());
							try {
								Thread.sleep(900);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
							option = JOptionPane.showConfirmDialog(null,"Do you want one more?","Game Status", 
									JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							scorec = scorec + cards[position++].getPoint();
							if(option == 1){
								break;
							}
						}
						System.out.println(score);
						if(scorec > score){
							JOptionPane.showMessageDialog(null,"You Lost!","Game Status", JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}
						else if(scorec < score){
							JOptionPane.showMessageDialog(null,"You Win!","Game Status", JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}
						else{
							JOptionPane.showMessageDialog(null,"You Win!","Game Status", JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);

						}
					}
					catch(InterruptedException ie){
						System.out.println("Scannng...");
					}
				}
			}

		}

	}
	public void checkscore(){
		if(score > 10.5){
			JOptionPane.showMessageDialog(null,"You Lost!","Game Status", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(score == 10.5){
			JOptionPane.showMessageDialog(null,"Computer win!","Game Status", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}


	public void initializecard(){
		this.icon = new ImageIcon("yuan1.jpg");

		this.b1 = new JButton(icon);
		this.b1.addActionListener(this);
		this.b1.setBounds(20, 50, 73, 97);
		this.c.add(this.b1);

		this.b2 = new JButton(icon);
		this.b2.addActionListener(this);
		this.b2.setBounds(113, 50, 73, 97);
		this.c.add(this.b2);

		this.b3 = new JButton(icon);
		this.b3.addActionListener(this);
		this.b3.setBounds(206, 50, 73, 97);
		this.c.add(this.b3);

		this.b4 = new JButton(icon);
		this.b4.addActionListener(this);
		this.b4.setBounds(299, 50, 73, 97);
		this.c.add(this.b4);

		this.b5 = new JButton(icon);
		this.b5.addActionListener(this);
		this.b5.setBounds(392, 50, 73, 97);
		this.c.add(this.b5);

		this.b6 = new JButton(icon);
		this.b6.addActionListener(this);
		this.b6.setBounds(20, 177, 73, 97);
		this.c.add(this.b6);

		this.b7 = new JButton(icon);
		this.b7.addActionListener(this);
		this.b7.setBounds(113, 177, 73, 97);
		this.c.add(this.b7);

		this.b8 = new JButton(icon);
		this.b8.addActionListener(this);
		this.b8.setBounds(206, 177, 73, 97);
		this.c.add(this.b8);

		this.b9 = new JButton(icon);
		this.b9.addActionListener(this);
		this.b9.setBounds(299, 177, 73, 97);
		this.c.add(this.b9);

		this.b10 = new JButton(icon);
		this.b10.addActionListener(this);
		this.b10.setBounds(392, 177, 73, 97);
		this.c.add(this.b10);


		for(int i = 1; i < 11;i++){
			String name = ""+i+"c.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,i,"club");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 11;i++){
			String name = ""+i+"d.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,i,"Diamond");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 11;i++){
			String name = ""+i+"h.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,i,"Heart");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 11;i++){
			String name = ""+i+"s.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,i,"Spade");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 5;i++){
			String name = ""+i+"j.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,0.5,"Jack");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 5;i++){
			String name = ""+i+"q.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,0.5,"Queen");
			cards[counter++]= tempcard;
		}

		for(int i = 1; i < 5;i++){
			String name = ""+i+"k.gif";
			Icon temp = new ImageIcon(name);
			card tempcard = new card(temp,0.5,"King");
			cards[counter++]= tempcard;
		}

		/**
		for(int i = 0; i < cards.length;i++){
			System.out.println(cards[i].getName()+" "+cards[i].getPoint());
		}
		 */
	}

	public void makerandom(){
		//Generate 2 random integers
		Random rd = new Random();

		System.out.println("Starting==============");

		for(int i = 0; i < 500; i++){
			int pos1 = rd.nextInt(52);
			int pos2 = rd.nextInt(52);
			card temp = cards[pos1];
			cards[pos1] = cards[pos2];
			cards[pos2] = temp;			
		}

		for(int i = 0; i < cards.length;i++){
			System.out.println(cards[i].getName() + " " + cards[i].getPoint());

		}
	}




}
