package Ejercicio3;

import java.awt.Color;
import java.awt.Graphics;

public class Estrella extends Figura {

    private int radio;

    public Estrella(int x, int y, int radio, Color colorRelleno, Color colorBorde) {
        super(x, y, colorRelleno, colorBorde);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] px = new int[10];
        int[] py = new int[10];

        int r1 = radio;     
        int r2 = radio / 2;  

        for (int i = 0; i < 10; i++) {
            double a = Math.toRadians(i * 36);
            int r = (i % 2 == 0) ? r1 : r2;  //Esta linea de codigo la he copiado de internet ya que no sabia como hacerla
            px[i] = (int) (x + r * Math.cos(a));
            py[i] = (int) (y + r * Math.sin(a));
        }

        g.setColor(colorRelleno);
        g.fillPolygon(px, py, 10);
        g.setColor(colorBorde);
        g.drawPolygon(px, py, 10);
    }
}
