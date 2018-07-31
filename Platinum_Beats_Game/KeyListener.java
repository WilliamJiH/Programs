package PlatinumBeatsGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

	public class KeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			if(Platinum_Beats.game == null) {
				return;
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				Platinum_Beats.game.pressS();
			}
			else if(e.getKeyCode() == KeyEvent.VK_D) {
				Platinum_Beats.game.pressD();
			}
			else if(e.getKeyCode() == KeyEvent.VK_F) {
				Platinum_Beats.game.pressF();
			}
			else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				Platinum_Beats.game.pressSPACE();
			}
			else if(e.getKeyCode() == KeyEvent.VK_J) {
				Platinum_Beats.game.pressJ();
			}
			else if(e.getKeyCode() == KeyEvent.VK_K) {
				Platinum_Beats.game.pressK();
			}
			else if(e.getKeyCode() == KeyEvent.VK_L) {
				Platinum_Beats.game.pressL();
			}
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			if(Platinum_Beats.game == null)
				return;
			if(e.getKeyCode() == KeyEvent.VK_S) {
				Platinum_Beats.game.releaseS();
	    	}
			else if(e.getKeyCode() == KeyEvent.VK_D) {
				Platinum_Beats.game.releaseD();
	    	}
			else if(e.getKeyCode() == KeyEvent.VK_F) {
				Platinum_Beats.game.releaseF();
	    	}           
			else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				Platinum_Beats.game.releaseSPACE();
	    	}           
			else if(e.getKeyCode() == KeyEvent.VK_J) {
				Platinum_Beats.game.releaseJ();
	    	}           	
			else if(e.getKeyCode() == KeyEvent.VK_K) {
				Platinum_Beats.game.releaseK();
	    	}           	
			else if(e.getKeyCode() == KeyEvent.VK_L) {
				Platinum_Beats.game.releaseL();
	    	}           
		}

	}
