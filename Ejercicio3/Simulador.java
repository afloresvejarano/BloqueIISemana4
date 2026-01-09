package Ejercicio3;

import javax.swing.JFrame;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Simulador {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Simulador de Figuras");
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        List<Dibujable> figuras = new ArrayList<>();  
        figuras.add(new Hexagono(150, 150, 50, Color.YELLOW, Color.BLACK)); 
        figuras.add(new Trapecio(300, 100, 120, 60, 80, Color.CYAN, Color.BLACK));
        figuras.add(new Estrella(400, 300, 60, Color.MAGENTA, Color.BLACK));

        PanelDibujo panel = new PanelDibujo(figuras);
        ventana.add(panel);
        ventana.setVisible(true); 
    }
}