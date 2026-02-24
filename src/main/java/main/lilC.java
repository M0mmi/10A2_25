
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guest-kihzdj
 */
public class lilC extends JPanel {

    Image Wiese;
    int x = 0;
    int a = 40;

    public lilC() {
        super();
        this.setLayout(null);
        this.setSize(1920, 1080);

        this.setVisible(true);
        ImageIcon A = new ImageIcon(getClass().getResource("Bilder//Wiese.png"));
        Wiese = A.getImage();

    }
    
    Image Weg_Waagerecht;

    {
        ImageIcon B = new ImageIcon(getClass().getResource("Bilder//Weg_Waagerecht.png"));
        Weg_Waagerecht = B.getImage();
    }
    Image Weg_Senkrecht;

    {
        ImageIcon C = new ImageIcon(getClass().getResource("Bilder//Weg_Senkrecht.png"));
        Weg_Senkrecht = C.getImage();
    }
    Image Stein_Hoch;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Stein_Hoch.png"));
        Stein_Hoch = D.getImage();
    }
    Image Stein_Groß;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Stein_Groß.png"));
        Stein_Groß = D.getImage();
    }
    Image Stein_Flach;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Stein_Flach.png"));
        Stein_Flach = D.getImage();
    }
    Image Stamm_Flach;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Stamm_Flach.png"));
        Stamm_Flach = D.getImage();
    }
    Image Stamm_Hoch;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Stamm_Hoch.png"));
        Stamm_Hoch = D.getImage();
    }
    Image Lagerfeuer;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Lagerfeuer.png"));
        Lagerfeuer = D.getImage();
    }
    Image Kurve_Oben_Links;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Kurve_Oben_Links.png"));
        Kurve_Oben_Links = D.getImage();
    }
    Image Kurve_Oben_Rechts;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Kurve_Oben_Rechts.png"));
        Kurve_Oben_Rechts = D.getImage();
    }
    Image Kurve_Unten_Rechts;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Kurve_Unten_Rechts.png"));
        Kurve_Unten_Rechts = D.getImage();
    }
    Image Kurve_Unten_Links;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Kurve_Unten_Links.png"));
        Kurve_Unten_Links = D.getImage();
    }
    Image Flagge;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Flagge.png"));
        Flagge = D.getImage();
    }
    Image Busch_klein;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Busch_klein.png"));
        Busch_klein = D.getImage();
    }
    Image Busch_Groß;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Busch_Groß.png"));
        Busch_Groß = D.getImage();
    }
    Image Busch_2;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Busch_2.png"));
        Busch_2 = D.getImage();
    }
    Image Baum2;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Baum2.png"));
        Baum2 = D.getImage();
    }
    Image Baum1;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Baum1.png"));
        Baum1 = D.getImage();
    }
    Image Baum3;

    {
        ImageIcon D = new ImageIcon(getClass().getResource("Bilder//Baum3.png"));
        Baum3 = D.getImage();
    }
    Image Sign;

    {
        ImageIcon sign = new ImageIcon(getClass().getResource("Bilder//ShopSign.png"));
        Sign = sign.getImage();
    }
    Image Background;

    {
        ImageIcon background = new ImageIcon(getClass().getResource("Bilder//ShopHintergrund.png"));
        Background = background.getImage();
    }
    Image oSL;

    {
        ImageIcon obereShopLeiste = new ImageIcon(getClass().getResource("Bilder//ObereShopLeiste.png"));
        oSL = obereShopLeiste.getImage();
    }

    Image B1;

    {
        ImageIcon button_1 = new ImageIcon(getClass().getResource("Bilder//Button_1.png"));
        B1 = button_1.getImage();
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, 1920, 1080);
        g.setColor(Color.yellow);

        //Wiesen
        g.drawImage(Wiese, 0 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 0 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 3 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 6 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 9 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 12 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 15 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 18 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 3 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 6 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 9 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 12 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 15 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 18 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 21 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 24 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 27 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 30 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 33 * a, 21 * a, 120, 120, this);
        g.drawImage(Wiese, 0 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 3 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 6 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 9 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 12 * a, 24 * a, 120, 60, this);
        g.drawImage(Wiese, 15 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 18 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 21 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 24 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 27 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 30 * a, 24 * a, 120, 50, this);
        g.drawImage(Wiese, 33 * a, 24 * a, 80, 50, this);

        //Weg
        g.drawImage(Weg_Waagerecht, 0, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 2 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 3 * a, 13 * a, 40, 40, this);
        g.drawImage(Kurve_Unten_Links, 4 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 4 * a, 14 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 4 * a, 15 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 4 * a, 16 * a, 40, 40, this);
        g.drawImage(Kurve_Oben_Rechts, 4 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 5 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 6 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 7 * a, 17 * a, 40, 40, this);
        g.drawImage(Kurve_Oben_Links, 8 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 16 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 15 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 14 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 12 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 11 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 10 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 9 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 8 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 8 * a, 7 * a, 40, 40, this);
        g.drawImage(Kurve_Unten_Rechts, 8 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 9 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 10 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 11 * a, 6 * a, 40, 40, this);
        g.drawImage(Kurve_Unten_Links, 12 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 7 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 8 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 9 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 10 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 11 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 12 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 14 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 15 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 16 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 18 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 19 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 12 * a, 20 * a, 40, 40, this);
        g.drawImage(Kurve_Oben_Rechts, 12 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 13 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 14 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 15 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 16 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 17 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 18 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 19 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 20 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 21 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 22 * a, 21 * a, 40, 40, this);
        g.drawImage(Kurve_Oben_Links, 23 * a, 21 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 20 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 19 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 18 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 17 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 16 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 15 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 14 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 12 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 11 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 10 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 9 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 8 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 23 * a, 7 * a, 40, 40, this);
        g.drawImage(Kurve_Unten_Rechts, 23 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 24 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 25 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 26 * a, 6 * a, 40, 40, this);
        g.drawImage(Kurve_Unten_Links, 27 * a, 6 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 7 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 8 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 9 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 10 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 11 * a, 40, 40, this);
        g.drawImage(Weg_Senkrecht, 27 * a, 12 * a, 40, 40, this);
        g.drawImage(Kurve_Oben_Rechts, 27 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 28 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 29 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 30 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 31 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 32 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 33 * a, 13 * a, 40, 40, this);
        g.drawImage(Weg_Waagerecht, 34 * a, 13 * a, 40, 40, this);

        //Dekorationen
        g.drawImage(Stamm_Flach, 3 * a, 6 * a, 40, 40, this);
        g.drawImage(Baum1, 3 * a, 3 * a, 80, 80, this);
        g.drawImage(Stein_Groß, 2 * a, 2 * a, 40, 40, this);
        g.drawImage(Busch_2, 2 * a, 3 * a, 40, 40, this);
        g.drawImage(Lagerfeuer, 3 * a, 5 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 3 * a, 2 * a, 40, 40, this);
        g.drawImage(Baum2, 1 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum3, 0 * a, 0 * a, 80, 80, this);
        g.drawImage(Busch_klein, 0 * a, 1 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 3 * a, 2 * a, 40, 40, this);
        g.drawImage(Baum2, 1 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum3, 0 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum1, 8 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum3, 7 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum2, 6 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum2, 8 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum1, 7 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum3, 6 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum3, 8 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum2, 7 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum1, 8 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum2, 7 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum2, 9 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum3, 10 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum1, 11 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum3, 12 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum2, 13 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum1, 9 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum1, 9 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum2, 10 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum2, 11 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum3, 9 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum3, 13 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum1, 12 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum2, 12 * a, 2 * a, 80, 80, this);
        g.drawImage(Lagerfeuer, 11 * a, 3 * a, 40, 40, this);
        g.drawImage(Baum3, 10 * a, 2 * a, 80, 80, this);
        g.drawImage(Stamm_Hoch, 12 * a, 3 * a, 20, 20, this);
        g.drawImage(Busch_2, 11 * a, 4 * a, 40, 40, this);
        g.drawImage(Baum3, 14 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum1, 15 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum2, 14 * a, 2 * a, 80, 80, this);
        g.drawImage(Busch_2, 16 * a, 0 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 17 * a, 0 * a, 40, 40, this);
        g.drawImage(Baum3, 18 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum1, 15 * a, 0 * a, 80, 80, this);
        g.drawImage(Busch_klein, 16 * a, 1 * a, 40, 40, this);
        g.drawImage(Busch_2, 17 * a, 1 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 18 * a, 1 * a, 40, 40, this);
        g.drawImage(Busch_klein, 19 * a, 0 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 19 * a, 1 * a, 40, 40, this);
        g.drawImage(Busch_2, 20 * a, 0 * a, 40, 40, this);
        g.drawImage(Baum3, 18 * a, 0 * a, 80, 80, this);
        g.drawImage(Stein_Groß, 30 * a, 22 * a, 40, 40, this);
        g.drawImage(Stein_Hoch, 31 * a, 23 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 32 * a, 22 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 31 * a, 21 * a, 40, 40, this);
        g.drawImage(Busch_2, 32 * a, 21 * a, 40, 40, this);
        g.drawImage(Busch_klein, 33 * a, 22 * a, 40, 40, this);
        g.drawImage(Lagerfeuer, 2 * a, 22 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 1 * a, 22 * a, 40, 40, this);
        g.drawImage(Stamm_Hoch, 3 * a, 22 * a, 20, 20, this);
        g.drawImage(Baum3, 0 * a, 21 * a, 80, 80, this);
        g.drawImage(Baum1, 4 * a, 21 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 26 * a, 2 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 27 * a, 3 * a, 40, 40, this);
        g.drawImage(Busch_2, 28 * a, 3 * a, 40, 40, this);
        g.drawImage(Busch_klein, 29 * a, 3 * a, 40, 40, this);
        g.drawImage(Baum3, 26 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum2, 27 * a, 1 * a, 80, 80, this);
        g.drawImage(Baum1, 28 * a, 0 * a, 80, 80, this);
        g.drawImage(Baum3, 29 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum2, 30 * a, 1 * a, 80, 80, this);
        g.drawImage(Busch_2, 27 * a, 2 * a, 40, 40, this);
        g.drawImage(Baum2, 20 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum3, 25 * a, 2 * a, 80, 80, this);
        g.drawImage(Baum1, 28 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum2, 14 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum3, 15 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum1, 16 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum2, 17 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum1, 14 * a, 6 * a, 80, 80, this);
        g.drawImage(Baum2, 15 * a, 6 * a, 80, 80, this);
        g.drawImage(Baum3, 16 * a, 6 * a, 80, 80, this);
        g.drawImage(Baum3, 15 * a, 7 * a, 80, 80, this);
        g.drawImage(Baum1, 16 * a, 7 * a, 80, 80, this);
        g.drawImage(Baum2, 17 * a, 7 * a, 80, 80, this);
        g.drawImage(Baum2, 16 * a, 8 * a, 80, 80, this);
        g.drawImage(Stein_Groß, 14 * a, 23 * a, 40, 40, this);
        g.drawImage(Stein_Hoch, 15 * a, 24 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 16 * a, 23 * a, 40, 40, this);
        g.drawImage(Stein_Groß, 17 * a, 24 * a, 40, 40, this);
        g.drawImage(Lagerfeuer, 1 * a, 18 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 0 * a, 18 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 2 * a, 18 * a, 40, 40, this);
        g.drawImage(Stamm_Hoch, 1 * a, 17 * a, 20, 20, this);
        g.drawImage(Baum1, 0 * a, 16 * a, 80, 80, this);
        g.drawImage(Baum2, 1 * a, 16 * a, 80, 80, this);
        g.drawImage(Baum3, 6 * a, 20 * a, 80, 80, this);
        g.drawImage(Baum1, 9 * a, 22 * a, 80, 80, this);
        g.drawImage(Baum3, 24 * a, 22 * a, 80, 80, this);
        g.drawImage(Flagge, 1365, 505, 40, 40, this);
        g.drawImage(Busch_Groß, 7 * a, 19 * a, 40, 40, this);
        g.drawImage(Busch_klein, 8 * a, 19 * a, 40, 40, this);
        g.drawImage(Busch_2, 15 * a, 18 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 16 * a, 18 * a, 40, 40, this);
        g.drawImage(Baum3, 14 * a, 8 * a, 80, 80, this);
        g.drawImage(Baum2, 15 * a, 8 * a, 80, 80, this);
        g.drawImage(Baum1, 16 * a, 8 * a, 80, 80, this);
        g.drawImage(Baum3, 17 * a, 8 * a, 80, 80, this);
        g.drawImage(Baum2, 14 * a, 9 * a, 80, 80, this);
        g.drawImage(Baum1, 16 * a, 9 * a, 80, 80, this);
        g.drawImage(Baum3, 18 * a, 9 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 14 * a, 11 * a, 40, 40, this);
        g.drawImage(Busch_klein, 16 * a, 11 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 17 * a, 11 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 15 * a, 12 * a, 40, 40, this);
        g.drawImage(Busch_klein, 17 * a, 12 * a, 40, 40, this);
        g.drawImage(Busch_2, 18 * a, 12 * a, 40, 40, this);
        g.drawImage(Baum2, 15 * a, 10 * a, 80, 80, this);
        g.drawImage(Busch_2, 15 * a, 11 * a, 40, 40, this);
        g.drawImage(Baum3, 17 * a, 10 * a, 80, 80, this);
        g.drawImage(Stamm_Flach, 14 * a, 13 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 15 * a, 13 * a, 40, 40, this);
        g.drawImage(Stamm_Hoch, 16 * a, 13 * a, 30, 30, this);
        g.drawImage(Stein_Groß, 17 * a, 13 * a, 40, 40, this);
        g.drawImage(Lagerfeuer, 16 * a, 14 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 15 * a, 14 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 17 * a, 14 * a, 40, 40, this);
        g.drawImage(Baum1, 19 * a, 11 * a, 80, 80, this);
        g.drawImage(Busch_2, 19 * a, 13 * a, 40, 40, this);
        g.drawImage(Baum3, 1 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum2, 2 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum1, 3 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum2, 0 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum3, 2 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum1, 4 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum3, 1 * a, 6 * a, 80, 80, this);
        g.drawImage(Baum2, 3 * a, 6 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 1 * a, 7 * a, 40, 40, this);
        g.drawImage(Busch_2, 2 * a, 7 * a, 40, 40, this);
        g.drawImage(Busch_klein, 3 * a, 7 * a, 40, 40, this);
        g.drawImage(Busch_2, 0 * a, 8 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 2 * a, 8 * a, 40, 40, this);
        g.drawImage(Busch_klein, 4 * a, 8 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 1 * a, 9 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 2 * a, 9 * a, 40, 40, this);
        g.drawImage(Stein_Groß, 3 * a, 9 * a, 40, 40, this);
        g.drawImage(Stamm_Hoch, 4 * a, 9 * a, 20, 20, this);
        g.drawImage(Baum2, 5 * a, 6 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 5 * a, 8 * a, 40, 40, this);
        g.drawImage(Busch_2, 6 * a, 8 * a, 40, 40, this);
        g.drawImage(Baum3, 30 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum2, 31 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum1, 32 * a, 3 * a, 80, 80, this);
        g.drawImage(Baum2, 29 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum3, 31 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum1, 33 * a, 4 * a, 80, 80, this);
        g.drawImage(Baum3, 30 * a, 5 * a, 80, 80, this);
        g.drawImage(Baum2, 32 * a, 5 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 30 * a, 6 * a, 40, 40, this);
        g.drawImage(Busch_2, 31 * a, 6 * a, 40, 40, this);
        g.drawImage(Busch_klein, 32 * a, 6 * a, 40, 40, this);
        g.drawImage(Busch_2, 29 * a, 7 * a, 40, 40, this);
        g.drawImage(Busch_Groß, 31 * a, 7 * a, 40, 40, this);
        g.drawImage(Busch_klein, 33 * a, 7 * a, 40, 40, this);
        g.drawImage(Stein_Flach, 30 * a, 8 * a, 40, 40, this);
        g.drawImage(Stamm_Flach, 31 * a, 8 * a, 40, 40, this);
        g.drawImage(Stein_Groß, 32 * a, 8 * a, 40, 40, this);
        g.drawImage(Stamm_Hoch, 33 * a, 8 * a, 20, 20, this);
        g.drawImage(Baum2, 25 * a, 20 * a, 80, 80, this);
        g.drawImage(Baum3, 26 * a, 20 * a, 80, 80, this);
        g.drawImage(Baum1, 27 * a, 20 * a, 80, 80, this);
        g.drawImage(Baum1, 25 * a, 21 * a, 80, 80, this);
        g.drawImage(Baum2, 26 * a, 21 * a, 80, 80, this);
        g.drawImage(Baum3, 27 * a, 21 * a, 80, 80, this);
        g.drawImage(Baum3, 26 * a, 22 * a, 80, 80, this);
        g.drawImage(Baum2, 27 * a, 22 * a, 80, 80, this);
        g.drawImage(Baum1, 26 * a, 23 * a, 80, 80, this);
        g.drawImage(Busch_klein, 32 * a, 14 * a, 40, 40, this);
        g.drawImage(Baum2, 30 * a, 14 * a, 80, 80, this);
        g.drawImage(Baum3, 31 * a, 14 * a, 80, 80, this);
        g.drawImage(Busch_2, 31 * a, 15 * a, 40, 40, this);
        g.drawImage(Baum1, 30 * a, 15 * a, 80, 80, this);
        g.drawImage(Baum2, 32 * a, 15 * a, 80, 80, this);
        g.drawImage(Busch_Groß, 31 * a, 16 * a, 40, 40, this);
        g.drawImage(Baum3, 29 * a, 16 * a, 80, 80, this);
        g.drawImage(Baum1, 30 * a, 16 * a, 80, 80, this);
        g.drawImage(Baum2, 32 * a, 16 * a, 80, 80, this);
        g.drawImage(Busch_2, 32 * a, 17 * a, 40, 40, this);
        g.drawImage(Busch_klein, 30 * a, 17 * a, 40, 40, this);
        g.drawImage(Baum3, 31 * a, 17 * a, 80, 80, this);

        //Shop
        g.drawImage(Background, 1400, 0, 520, 1080, this);
        g.drawImage(Sign, 1475, 100, 400, 200, this);
        g.drawImage(oSL, 1400, 0, 600, 50, this);
       

    }

}
