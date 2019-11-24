import java.applet.*;
import java.awt.*;

public class draw extends Applet{
	public void paint(Graphics g){
		
		 
			
			
			g.drawRect(200,200,200,200);
			
			g.drawRect(300,300,200,200);
			g.drawLine(200,200,300,300);
			g.drawLine(400,200,500,300);
			g.drawLine(200,400,300,500);
			g.drawLine(400,400,500,500);

			// 2 nd
			g.drawRect(400,200,200,200);
			
			g.drawRect(500,300,200,200);
			g.drawLine(400,400,500,500);
			g.drawLine(600,400,700,500);
			g.drawLine(600,200,700,300);

			// circle
			g.drawOval(100,100,100,150);
	}
}