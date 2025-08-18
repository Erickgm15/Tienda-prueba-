package Panel;

import java.awt.*;
import javax.swing.*;

public class BuscarPanel extends JPanel {

    public JTextField txtBuscar;

    public BuscarPanel() {
        
        setPreferredSize(new Dimension(120, 50));
        setBorder(BorderFactory.createTitledBorder("Buscar Producto"));

        txtBuscar = new JTextField(10);

     
        add(txtBuscar);
    }
}