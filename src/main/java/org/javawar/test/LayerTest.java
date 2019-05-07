package org.javawar.test;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LayerTest extends Canvas {

    private BufferedImage newImage1 = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);
    private BufferedImage newImage2 = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);


    public LayerTest() {
        newImage1.getGraphics().drawString("Chatuba", 5 ,25);
        newImage2.getGraphics().drawString("Mesquita", 5 ,25);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(newImage1, 0, 0, null);
        g2d.drawImage(newImage2, 0, 0, null);
    }

    @Override
    public void update(Graphics g) {
        // super.update(g);
    }
}
