import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
 
                //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                //Paint the background
                g.setColor(Color.DARK_GRAY);
                g.fillRect(x1, y1, width + 1, height + 1);
                
//                //Draw a border
//                g.setColor(Color.YELLOW);
//                g.drawRect(x1, y1, width, height);
//                
//                //Draw a border2
//                g.setColor(Color.BLUE);
//                g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
//                
//                //Line
//                g.setColor(Color.WHITE);
//                g.drawLine(x1, y1, x2, y2);
//                
//                //Line2
//                g.setColor(Color.ORANGE);
//                g.drawLine(x2, y1, x1, y2);
                
//                g.setColor(Color.LIGHT_GRAY);
//                g.fillOval((width - 55)/2, (height - 55)/2, 55, 55);
                
//                Polygon p = new Polygon();
//                	p.addPoint(x1 + 5, y1 + 25);
//                	p.addPoint(x1 + 20, y1 + 10);
//                	p.addPoint(x1 + 35, y1 + 25);
//                	p.addPoint(x1 + 25, y1 + 25);
//                	p.addPoint(x1 + 25, y1 + 45);
//                	p.addPoint(x1 + 15, y1 + 45);
//                	p.addPoint(x1 + 15, y1 + 25);
//                	g.setColor(Color.YELLOW);
//                	g.fillPolygon(p);
                
                //Rectangle
                g.setColor(Color.RED);
                g.fillRect((width - 280)/2, (height - 150)/2, 280, 150);
                g.setColor(Color.BLACK);
                g.drawRect((width - 280)/2, (height - 150)/2, 280, 150);
                
                //White lines
                g.setColor(Color.WHITE);
                g.fillRect((width - 280)/2, (height - 90)/2, 280, 30);
                g.setColor(Color.BLACK);
                g.drawRect((width - 280)/2, (height - 90)/2, 280, 30);
                g.setColor(Color.WHITE);
                g.fillRect((width - 280)/2, (height + 30)/2, 280, 30);
                g.setColor(Color.BLACK);
                g.drawRect((width - 280)/2, (height + 30)/2, 280, 30);
                
                //Triangle
                Polygon triangle = new Polygon();
                triangle.addPoint((width - 280)/2, (height - 150)/2);
                triangle.addPoint((width - 100)/2, (height)/2);
                triangle.addPoint((width - 280)/2, (height + 150)/2);
                g.setColor(Color.BLUE);
                g.fillPolygon(triangle);
                g.setColor(Color.BLACK);
                g.drawPolygon(triangle);
                
                //Star
                Polygon p2 = new Polygon();
				p2.addPoint((width - 210)/2, (height - 50)/2);
				p2.addPoint((width - 200)/2, (height - 20)/2);
				p2.addPoint((width - 170)/2, (height - 20)/2);
				p2.addPoint((width - 200)/2, (height)/2);
				p2.addPoint((width - 180)/2, (height + 30)/2);
				p2.addPoint((width - 210)/2, (height + 10)/2);
				p2.addPoint((width - 240)/2, (height + 30)/2);
				p2.addPoint((width - 220)/2, (height)/2);
				p2.addPoint((width - 250)/2, (height - 20)/2);
				p2.addPoint((width - 220)/2, (height - 20)/2);
				g.setColor(Color.WHITE);
				g.fillPolygon(p2);
            }
}