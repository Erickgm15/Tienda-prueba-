import java.awt.BorderLayout;
import javax.swing.*;
import Panel.PanelBuscador;
import Panel.BuscarPanel;
import Panel.PanelCuadros;

public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Productos");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);

       
        PanelBuscador panelBuscador = new PanelBuscador();

        
        BuscarPanel buscarPanel = new BuscarPanel();

       
        panelBuscador.getBanner().add(buscarPanel);

       
        miVentana.add(panelBuscador.getBanner(), BorderLayout.WEST);

        
        PanelCuadros panelCuadros = new PanelCuadros(2, 4); 
        miVentana.add(panelCuadros, BorderLayout.CENTER);
    

        miVentana.setVisible(true);
    }
}
