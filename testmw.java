
import javax.swing.JFrame;

class GameFRAME extends JFrame {
	 GameFRAME()
	 {
	 setLocation(200, 100);
		//setLocationRelativeTo(null);
		setTitle("Game -2018");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
}

}
public class testmw{
	
	public static void main(String[] args) {
		GameFRAME obj = new GameFRAME();	
	}
}

