import javax.swing.*;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class Menu extends JFrame {
    private JPanel p;
    private Tarefas Tarefas;

    public Menu(){
        setTitle("Tarefas");
        setSize(550,550);
        setLocation(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tarefas = new Tarefas();
        configMenu();
        setVisible(true);
    }

    private void configMenu() {
        p = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(p);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(p);

        JLabel CaixaEntrada = new JLabel("Caixa De Entrada");
        Dimension size = CaixaEntrada.getPreferredSize();
        CaixaEntrada.setBounds(800, 300, size.width, size.height);
        setLocation(200, 150);
        p.add(CaixaEntrada);

        JButton createTarefa = new JButton("Nova Tarefa");
        p.add(Box.createVerticalStrut(50));
        p.add(Box.createHorizontalStrut(400));
        p.add(createTarefa);
        setLocation(300, 150);
        stringLista();
        add(scrollPane);
    }
    private void stringLista(){
        for(String s : Tarefas.seqLista()){
            p.add(createOS(s));
            p.add(Box.createVerticalStrut(20));
            p.add(Box.createHorizontalStrut(35));
        }
    }
    private JPanel createOS(String item){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(item);
        JCheckBox CheckBox = new JCheckBox("");
        CheckBox.setSelected(true);
        panel.add(CheckBox);
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(label);
        return panel;
    }
}