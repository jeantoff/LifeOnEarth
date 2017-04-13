package com.trolltech.games.engine;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.sun.glass.ui.Size;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {
    int x = 0;
    int y = 0;

   int windowWidth;
   int windowHeight;
   int xStep=1;
   int yStep=1;



    private void moveBall() {
        x = x + xStep;
        y = y + yStep;

        if(x+30>=windowWidth) {
            xStep=-1;
            x -= 1;
        }

        if(x-30<=0) {
            xStep=1;
            x += 1;
        }

        if(y-30>=windowHeight) {
            yStep=-1;
            y -= 1;

        }

        if(y+30<=0) {
            yStep=1;
            y += 1;
        }

    }


    Webcam webcam = Webcam.getDefault();


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);





//        g2d.drawImage(webcam.getImage(),0,0);

//        ImageIO.write(, "PNG", new File("hello-world.png"));
    }

//    public static void main(String[] args)  throws InterruptedException {
//
//        Webcam webcam = Webcam.getDefault();
//        webcam.setViewSize(WebcamResolution.VGA.getSize());
//
//        WebcamPanel panel = new WebcamPanel(webcam);
//        panel.setFPSDisplayed(true);
//        panel.setDisplayDebugInfo(true);
//        panel.setImageSizeDisplayed(true);
//        panel.setMirrored(true);
//
//        JFrame window = new JFrame("Test webcam panel");
//        window.add(panel);
//        window.setResizable(true);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.pack();
//        window.setVisible(true);
//    }



    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        game.windowHeight=400;
        game.windowWidth=300;

        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}