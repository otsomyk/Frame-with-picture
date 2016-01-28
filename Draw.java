package Draw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Draw extends JPanel{
	
	private static int x = 300;
	private final static String image = "sova.jpg";
    private Image iTank;
	   	
	 public Draw(){

        JFrame frame = new JFrame("My frame");
        frame.setLocation(300,100);
        frame.setMinimumSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
            frame.getContentPane().add(this);
            try{
                iTank = ImageIO.read(new File(image));
            } catch (IOException e) {
               System.err.print("Can't find image " + image);
            }

        frame.pack();
        frame.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        g.setColor(Color.YELLOW);
//		g.fillRect(11, 31, 99, 19);
//
//		g.setColor(Color.BLUE);
//		g.fillRect(201, 201, 59, 59);
//
//		g.setColor(Color.GREEN);
//		g.fillOval(x, 109, 59, 59);
		
//		g.setColor(Color.BLACK);
//        Font font = new Font(Font.MONOSPACED, Font.BOLD, 24);
//        g.setFont(font);
//        g.drawString("Owl",300,200);
        
        g.drawImage(iTank, 30, 30, new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        });
    }

    public static void main(String[] args) throws Exception{
        Draw htd = new Draw();
        
        Thread.sleep(5000);
        System.out.println("End");

//        x = 600;
        htd.repaint();
    }

}
