package joy.com.ru;
import java.awt.*;
import java.applet.*;

public class SmileyFace extends Applet {
	
	  public void paint(Graphics g){
		   Font f = new Font("Helvetica" , Font.BOLD , 20) ;
		   
		   g.setFont(f) ; 
		   g.setColor(Color.yellow);
		   g.drawString("Keep smiling" , 50 ,30);
		   g.drawOval(60,60,200,200) ;
		   g.fillOval(90, 120, 50, 20);
		   g.fillOval(190, 120, 50, 20);
		   g.setColor(Color.blue);
		   //g.drawLine(165, 125, 165, 175);
		   g.drawArc(110, 130, 95, 95, 0, -180);
		   
		   
	   }

}
