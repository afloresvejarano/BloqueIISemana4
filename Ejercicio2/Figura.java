package Ejercicio2;


public abstract class Figura {
    protected int x, y; 

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Dibujamos la figura
    public abstract void dibujar(java.awt.Graphics g);
}
