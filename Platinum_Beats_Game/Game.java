package PlatinumBeatsGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

public class Game extends Thread{

	private Image GAMELINE = new ImageIcon(Main.class.getResource("../image/bar3.png"))
			.getImage();
	private Image GAMEINFO = new ImageIcon(Main.class.getResource("../image/bar2.png"))
			.getImage();
	private Image GAMEROUTELINE = new ImageIcon(Main.class.getResource("../image/bar5.png"))
			.getImage();
	private Image GAMEROUTES = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTED = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTEF = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTESP = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTESP2 = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTEJ = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTEK = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();
	private Image GAMEROUTEL = new ImageIcon(Main.class.getResource("../image/bar4.png"))
			.getImage();

	private String titleName;
	private String difficulty;
	private String musicTitle;
	public static Music gameMusic;

	ArrayList<Note> noteList = new ArrayList<Note>();


	public Game(String titleName, String difficulty, String musicTitle){
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
		gameMusic.start();
		dropNotes(titleName);
	}

	public void screenDraw(Graphics2D g){
		g.drawImage(GAMEROUTES,228,30,null);
		g.drawImage(GAMEROUTED,332,30,null);
		g.drawImage(GAMEROUTEF,436,30,null);
		g.drawImage(GAMEROUTESP,540,30,null);
		g.drawImage(GAMEROUTESP2,644,30,null);
		g.drawImage(GAMEROUTEJ,748,30,null);
		g.drawImage(GAMEROUTEK,852,30,null);
		g.drawImage(GAMEROUTEL,956,30,null);

		g.drawImage(GAMEROUTELINE,224,30,null);
		g.drawImage(GAMEROUTELINE,328,30,null);
		g.drawImage(GAMEROUTELINE,432,30,null);
		g.drawImage(GAMEROUTELINE,536,30,null);
		g.drawImage(GAMEROUTELINE,640,30,null);
		g.drawImage(GAMEROUTELINE,744,30,null);
		g.drawImage(GAMEROUTELINE,848,30,null);
		g.drawImage(GAMEROUTELINE,952,30,null);
		g.drawImage(GAMEROUTELINE,1056,30,null);

		g.drawImage(GAMEINFO,0,708,null);
		g.drawImage(GAMELINE,0,628,null);

		for(int i = 0; i < noteList.size(); i++)
		{
			Note note = noteList.get(i);
			note.screenDraw(g);
		}
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Cambria",Font.BOLD,30));
		g.drawString(titleName, 20, 750);
		g.drawString(difficulty, 1190, 750);

		g.setFont(new Font("Cambria",Font.BOLD,26));
		g.setColor(Color.darkGray);
		g.drawString("S", 270, 660);
		g.drawString("D", 374, 660);
		g.drawString("F", 478, 660);
		g.drawString("Space Bar", 580, 660);
		g.drawString("J", 784, 660);
		g.drawString("K", 889, 660);
		g.drawString("L", 993, 660);
		g.setColor(Color.lightGray);
		g.setFont(new Font("Courier New",Font.BOLD,30));
		g.drawString("000000", 565, 750);
	}

	public void pressS(){
		GAMEROUTES = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();

		System.out.println("S");
	}
	public void releaseS(){
		GAMEROUTES = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressD(){
		GAMEROUTED = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	public void releaseD(){
		GAMEROUTED = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressF(){
		GAMEROUTEF = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	public void releaseF(){
		GAMEROUTEF = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressSPACE(){
		GAMEROUTESP = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		GAMEROUTESP2 = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumBig3.mp3", false).start();
	}
	public void releaseSPACE(){
		GAMEROUTESP = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
		GAMEROUTESP2 = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressJ(){
		GAMEROUTEJ = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	public void releaseJ(){
		GAMEROUTEJ = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressK(){
		GAMEROUTEK = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	public void releaseK(){
		GAMEROUTEK = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}
	public void pressL(){
		GAMEROUTEL = new ImageIcon(Main.class.getResource("../image/barpressed.png"))
				.getImage();
		new Music("drumSmall1.mp3", false).start();
	}
	public void releaseL(){
		GAMEROUTEL = new ImageIcon(Main.class.getResource("../image/bar4.png"))
				.getImage();
	}

	public void close(){
		gameMusic.EXIT();
		this.interrupt();
	}

	public void dropNotes(String titleName){
		ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
		ScheduledThreadPoolExecutor exec2 = new ScheduledThreadPoolExecutor(1);
		ScheduledThreadPoolExecutor exec3 = new ScheduledThreadPoolExecutor(1);
		ScheduledThreadPoolExecutor exec4 = new ScheduledThreadPoolExecutor(1);
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		exec.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				straightnote();
			}
		},0,690,TimeUnit.MILLISECONDS);
		scheduler.schedule(new Runnable() {  
            public void run() {  
                exec.shutdown();
            }  
        },3500, TimeUnit.MILLISECONDS);  
		
		exec2.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				upper1note();
			}
		},4500,3000,TimeUnit.MILLISECONDS);
		scheduler.schedule(new Runnable() {  
            public void run() {  
                exec2.shutdown();
            }  
        },13, TimeUnit.SECONDS);  
		
		exec3.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				straightnote();
			}
		},14000,690,TimeUnit.MILLISECONDS);
		scheduler.schedule(new Runnable() {  
            public void run() {  
                exec3.shutdown();
            }  
        },20, TimeUnit.SECONDS); 
		
		exec4.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				upper1note();
			}
		},21,3000,TimeUnit.SECONDS);
		scheduler.schedule(new Runnable() {  
            public void run() {  
                exec4.shutdown();
            }  
        },40, TimeUnit.SECONDS); 
					
	}
	
	private void straightnote(){
		Note note = new Note(228,+50,"short");
		Note note6 = new Note(852,+50,"short");
		note.start();
		note6.start();
		noteList.add(note);
		noteList.add(note6);
	}
	
	private void upper1note(){
		Note note1 = new Note(332,100,"short");
		Note note2 = new Note(436,0,"short");
		Note note3 = new Note(332,-100,"short");
		Note note4 = new Note(748,-200,"short");
		Note note5 = new Note(852,-300,"short");
		Note note6 = new Note(748,-400,"short");
		Note note7= new Note(332,-500,"short");
		Note note8= new Note(436,-600,"short");
		Note note9= new Note(332,-700,"short");
		note1.start();
		note2.start();
		note3.start();
		note4.start();
		note5.start();
		note6.start();
		note7.start();
		note8.start();
		note9.start();
		noteList.add(note1);
		noteList.add(note2);
		noteList.add(note3);
		noteList.add(note4);
		noteList.add(note5);
		noteList.add(note6);
		noteList.add(note7);
		noteList.add(note8);
		noteList.add(note9);
	}


	/*		Note note1 = new Note(332,0,"short");
	 * 		Note note6 = new Note(852,-400,"short");
	 *		Note note2 = new Note(436,-100,"short");
			Note note3 = new Note(540,-200,"short");
			Note note4 = new Note(644,-200,"short");
			Note note5 = new Note(748,-300,"short");
			Note note7 = new Note(956,0, "short");
			note1.start();
			note2.start();
			note3.start();
			note4.start();
			note5.start();
			note6.start();
			note7.start();
			noteList.add(note1);
			noteList.add(note2);
			noteList.add(note3);
			noteList.add(note4);
			noteList.add(note5);
			noteList.add(note6);
			noteList.add(note7);
	 */
}

