package Vistas;

import java.awt.BorderLayout;
import javax.swing.*;
import Panel.PanelBuscador;
import Panel.BuscarPanel;
import Panel.PanelCuadros;

public class Dashbord extends JFrame {

    public Dashbord() {
        this.setTitle("Productos");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        // Crear PanelBuscador
        PanelBuscador panelBuscador = new PanelBuscador();

        // Crear BuscarPanel
        BuscarPanel buscarPanel = new BuscarPanel();

        // Agregar el panel de búsqueda al banner
        panelBuscador.getBanner().add(buscarPanel);

        // Agregar al JFrame
        this.add(panelBuscador.getBanner(), BorderLayout.WEST);

        // Crear PanelCuadros
        PanelCuadros panelCuadros = new PanelCuadros(2, 4);
        this.add(panelCuadros, BorderLayout.CENTER);
    }
}
