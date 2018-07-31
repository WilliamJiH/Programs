package poker_game;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class card {
	
	private Icon icon;
	private double point;
	private String type;

	public card(Icon icon,double point, String type){
		this.icon = icon;
		this.point = point;
		this.type = type;
	}
	
	public card(){
		
	}
	
	public String getName(){
		return this.type;
	}
	
	public Icon getIcon(){
		return this.icon;
	}
	
	public double getPoint(){
		return this.point;
	}

}
