package Panel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class PanelBuscador {
    private JPanel panelBanner;

    public PanelBuscador() {
        this.panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(200,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.GRAY);
    }
    public JPanel getBanner(){
        return panelBanner;
    }
}