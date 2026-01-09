package Ejercicio2;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    private List<Dibujable> figuras;

    public PanelDibujo(List<Dibujable> figuras) {
        this.figuras = figuras;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Dibujable f : figuras) {
            f.dibujar(g);
        }
    }
}
