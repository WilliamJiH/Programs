package PlatinumBeatsGame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player PLAYER;
	private boolean LOOP;
	private File FILE;
	private FileInputStream FIS;
	private BufferedInputStream BIS;
	
	public Music(String name, boolean LOOP){
		try{
			this.LOOP = LOOP;
			FILE = new File(Main.class.getResource("../music/" + name).toURI());
			FIS = new FileInputStream(FILE);
			BIS = new BufferedInputStream(FIS);
			PLAYER = new Player(BIS);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime(){
		if(PLAYER == null)
			return 0;
		return PLAYER.getPosition();
	}
	
	public void EXIT(){
		LOOP = false;
		PLAYER.close();
		this.interrupt();
	}
	
	@Override
	public void run(){
		try{
			do{
				PLAYER.play();
				FIS = new FileInputStream(FILE);
				BIS = new BufferedInputStream(FIS);
				PLAYER = new Player(BIS);
			}while(LOOP);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	

}
