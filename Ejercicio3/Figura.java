package Ejercicio3;

import java.awt.Color;

public abstract class Figura implements Dibujable {
    protected int x, y;
    protected Color colorRelleno;
    protected Color colorBorde;

    public Figura(int x, int y, Color colorRelleno, Color colorBorde) {
        this.x = x;
        this.y = y;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }
}
