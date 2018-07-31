package PlatinumBeatsGame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Platinum_Beats extends JFrame {

	private int mouseX, mouseY;
	private Image MENU_IMAGE;
	private Graphics MENU_GRAPHIC;

	private ImageIcon BUTTON_EXIT_BASIC = new ImageIcon(Main.class.getResource("../image/Clicked.png"));
	private ImageIcon BUTTON_EXIT_PRESS = new ImageIcon(Main.class.getResource("../image/Basic.png"));
	private ImageIcon MENU_START = new ImageIcon(Main.class.getResource("../image/START_BUT.png"));
	private ImageIcon MENU_START_ENTERED = new ImageIcon(Main.class.getResource("../image/START_BUT_ENTERED.png"));
	private ImageIcon EXIT_BUT = new ImageIcon(Main.class.getResource("../image/EXIT_BUT.png"));
	private ImageIcon EXIT_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/EXIT_BUT_ENTERED.png"));
	private ImageIcon LEFT_BUT = new ImageIcon(Main.class.getResource("../image/leftButtonBasic.png"));
	private ImageIcon LEFT_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/leftButtonEntered.png"));
	private ImageIcon RIGHT_BUT = new ImageIcon(Main.class.getResource("../image/rightButtonBasic.png"));
	private ImageIcon RIGHT_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/rightButtonEntered.png"));
	private ImageIcon EASY_BUT = new ImageIcon(Main.class.getResource("../image/easyButtonBasic.png"));
	private ImageIcon EASY_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/easyButtonEntered.png"));
	private ImageIcon HARD_BUT = new ImageIcon(Main.class.getResource("../image/hardButtonBasic.png"));
	private ImageIcon HARD_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/hardButtonEntered.png"));
	private ImageIcon BACK_BUT = new ImageIcon(Main.class.getResource("../image/backButtonBasic.png"));
	private ImageIcon BACK_BUT_ENTERED = new ImageIcon(Main.class.getResource("../image/backButtonEntered.png"));

	
	private Image MENU_BG = new ImageIcon(Main.class.getResource("../image/MENU_BG.jpg"))
			.getImage();

	private JLabel MENU_TBAR = new JLabel(new ImageIcon(Main.class.getResource("../image/MENU_TBAR.png")));

	private JButton EXIT_BUTTON = new JButton(BUTTON_EXIT_BASIC);
	private JButton START_BUTTON = new JButton(MENU_START);
	private JButton EXIT2_BUTTON = new JButton(EXIT_BUT);
	private JButton LEFT_BUTTON = new JButton(LEFT_BUT);
	private JButton RIGHT_BUTTON = new JButton(RIGHT_BUT);
	private JButton EASY_BUTTON = new JButton(EASY_BUT);
	private JButton HARD_BUTTON = new JButton(HARD_BUT);
	private JButton BACK_BUTTON = new JButton(BACK_BUT);

	private boolean isMainScreen = false;
	private boolean isGameScreen = false;
	ArrayList<Track> tracklist= new ArrayList<Track>();

	private Music SelectedMusic;
	private Image TitleImage;
	private Image SelectedImage;
	private int NOW_SELECT = 0;
	
	private Music INTRO_MUSIC = new Music("MENU_MC.mp3", true);
	public static Game game;

	public Platinum_Beats() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.MENU_LENGTH,Main.MENU_WIDTH);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		addKeyListener(new KeyListener());

		INTRO_MUSIC.start();
		

		tracklist.add(new Track("fadedtitle.png","fadedstart.jpg",
				"fadedgame.jpg","Faded.mp3","Faded.mp3","Faded - Alan Walker"));
		tracklist.add(new Track("tokyoghoultitle.png","tokyoghoulstart.jpg",
				"tokyoghoulgame.jpg","unravelSelected.mp3","unravel.mp3","Unravel - TK from Toru Kitajima"));
		tracklist.add(new Track("despacitotitle.png","despacitostart.jpg",
				"despacitogame.jpg","Despacito.mp3","Despacito.mp3","Despacito - Luis Fonsi Feat"));

		EXIT_BUTTON.setBounds(1245, 0, 30, 30);
		EXIT_BUTTON.setBorderPainted(false);
		EXIT_BUTTON.setContentAreaFilled(false);
		EXIT_BUTTON.setFocusPainted(false);
		EXIT_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				EXIT_BUTTON.setIcon(BUTTON_EXIT_PRESS);
				EXIT_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				EXIT_BUTTON.setIcon(BUTTON_EXIT_BASIC);
				EXIT_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(EXIT_BUTTON);

		EXIT2_BUTTON.setBounds(390, 500, 500, 100);
		EXIT2_BUTTON.setBorderPainted(false);
		EXIT2_BUTTON.setContentAreaFilled(false);
		EXIT2_BUTTON.setFocusPainted(false);
		EXIT2_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				EXIT2_BUTTON.setIcon(EXIT_BUT_ENTERED);
				EXIT2_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				EXIT2_BUTTON.setIcon(EXIT_BUT);
				EXIT2_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);

			}
		});
		add(EXIT2_BUTTON);



		START_BUTTON.setBounds(390, 350, 500, 100);
		START_BUTTON.setBorderPainted(false);
		START_BUTTON.setContentAreaFilled(false);
		START_BUTTON.setFocusPainted(false);
		START_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				START_BUTTON.setIcon(MENU_START_ENTERED);
				START_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				START_BUTTON.setIcon(MENU_START);
				START_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				enterMain();

			}
		});
		add(START_BUTTON);

		LEFT_BUTTON.setVisible(false);
		LEFT_BUTTON.setBounds(200, 380, 60, 60);
		LEFT_BUTTON.setBorderPainted(false);
		LEFT_BUTTON.setContentAreaFilled(false);
		LEFT_BUTTON.setFocusPainted(false);
		LEFT_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				LEFT_BUTTON.setIcon(LEFT_BUT_ENTERED);
				LEFT_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				LEFT_BUTTON.setIcon(LEFT_BUT);
				LEFT_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				selectLeft();

			}
		});
		add(LEFT_BUTTON);

		RIGHT_BUTTON.setVisible(false);
		RIGHT_BUTTON.setBounds(1020, 380, 60, 60);
		RIGHT_BUTTON.setBorderPainted(false);
		RIGHT_BUTTON.setContentAreaFilled(false);
		RIGHT_BUTTON.setFocusPainted(false);
		RIGHT_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				RIGHT_BUTTON.setIcon(RIGHT_BUT_ENTERED);
				RIGHT_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				RIGHT_BUTTON.setIcon(RIGHT_BUT);
				RIGHT_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				selectRight();

			}
		});
		add(RIGHT_BUTTON);

		EASY_BUTTON.setVisible(false);
		EASY_BUTTON.setBounds(355, 630, 250, 67);
		EASY_BUTTON.setBorderPainted(false);
		EASY_BUTTON.setContentAreaFilled(false);
		EASY_BUTTON.setFocusPainted(false);
		EASY_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				EASY_BUTTON.setIcon(EASY_BUT_ENTERED);
				EASY_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				EASY_BUTTON.setIcon(EASY_BUT);
				EASY_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				gamestart(NOW_SELECT,"Easy");

			}
		});
		add(EASY_BUTTON);


		HARD_BUTTON.setVisible(false);
		HARD_BUTTON.setBounds(675, 630, 250, 67);
		HARD_BUTTON.setBorderPainted(false);
		HARD_BUTTON.setContentAreaFilled(false);
		HARD_BUTTON.setFocusPainted(false);
		HARD_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				HARD_BUTTON.setIcon(HARD_BUT_ENTERED);
				HARD_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				HARD_BUTTON.setIcon(HARD_BUT);
				HARD_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				gamestart(NOW_SELECT,"Hard");

			}
		});
		add(HARD_BUTTON);

		BACK_BUTTON.setVisible(false);
		BACK_BUTTON.setBounds(20, 50, 80, 80);
		BACK_BUTTON.setBorderPainted(false);
		BACK_BUTTON.setContentAreaFilled(false);
		BACK_BUTTON.setFocusPainted(false);
		BACK_BUTTON.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent m) {
				BACK_BUTTON.setIcon(BACK_BUT_ENTERED);
				BACK_BUTTON.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent m) {
				BACK_BUTTON.setIcon(BACK_BUT);
				BACK_BUTTON.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent m) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				backtoMain();

			}
		});
		add(BACK_BUTTON);

		MENU_TBAR.setBounds(0, 0, 1280, 30);
		MENU_TBAR.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		MENU_TBAR.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent m) {
				int x = m.getXOnScreen();
				int y = m.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(MENU_TBAR);
	}

	public void paint(Graphics g) {
		MENU_IMAGE = createImage(Main.MENU_LENGTH,Main.MENU_WIDTH);
		MENU_GRAPHIC = MENU_IMAGE.getGraphics();
		screenDraw((Graphics2D)MENU_GRAPHIC);
		g.drawImage(MENU_IMAGE, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(MENU_BG, 0, 0, null);

		if(isMainScreen){
			g.drawImage(SelectedImage,340,200,null);
			g.drawImage(TitleImage,340,130,null);
		}
		if(isGameScreen){
			//System.out.println("hi");
			game.screenDraw(g);
			
		}
		paintComponents(g);
		this.repaint();
	}

	public void selectedTrack(int NOW_SELECT){
		if(SelectedMusic != null){
			SelectedMusic.EXIT();
		}
		TitleImage = new ImageIcon(Main.class.getResource("../image/" + tracklist.get(NOW_SELECT).getTitleImage()))
				.getImage();
		SelectedImage = new ImageIcon(Main.class.getResource("../image/" + tracklist.get(NOW_SELECT).getStartImage()))
				.getImage();
		SelectedMusic = new Music(tracklist.get(NOW_SELECT).getStartMusic(),true);
		SelectedMusic.start();
	}

	public void selectLeft(){
		if(NOW_SELECT == 0)
			NOW_SELECT = tracklist.size() - 1;
		else
			NOW_SELECT--;
		selectedTrack(NOW_SELECT);
	}

	public void selectRight(){
		if(NOW_SELECT == tracklist.size() - 1)
			NOW_SELECT = 0;
		else
			NOW_SELECT++;
		selectedTrack(NOW_SELECT);
	}

	public void gamestart(int NOW_SELECT, String DIFFICULTY){
		if(SelectedMusic != null){
			SelectedMusic.EXIT();
		}
		isMainScreen = false;
		LEFT_BUTTON.setVisible(false);
		RIGHT_BUTTON.setVisible(false);
		EASY_BUTTON.setVisible(false);
		HARD_BUTTON.setVisible(false);
		MENU_BG = new ImageIcon(Main.class.getResource("../image/" + tracklist.get(NOW_SELECT).getGameImage()))
				.getImage();
		BACK_BUTTON.setVisible(true);	
		isGameScreen = true;
		setFocusable(true);
		game = new Game(tracklist.get(NOW_SELECT).getTitleName(), DIFFICULTY, tracklist.get(NOW_SELECT).getGameMusic());
	}

	public void backtoMain(){
		isMainScreen = true;
		LEFT_BUTTON.setVisible(true);
		RIGHT_BUTTON.setVisible(true);
		EASY_BUTTON.setVisible(true);
		HARD_BUTTON.setVisible(true);
		MENU_BG = new ImageIcon(Main.class.getResource("../image/MENU_BG2.jpg"))
				.getImage();
		BACK_BUTTON.setVisible(false);
		selectedTrack(NOW_SELECT);	
		isGameScreen = false;
		game.close();

	}

	public void enterMain(){
		START_BUTTON.setVisible(false);
		EXIT2_BUTTON.setVisible(false);
		MENU_BG = new ImageIcon(Main.class.getResource("../image/MENU_BG2.jpg"))
				.getImage();
		isMainScreen = true;
		LEFT_BUTTON.setVisible(true);
		RIGHT_BUTTON.setVisible(true);
		EASY_BUTTON.setVisible(true);
		HARD_BUTTON.setVisible(true);
		INTRO_MUSIC.EXIT();
		selectedTrack(0);
	}

}
