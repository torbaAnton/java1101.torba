package torba.java1101.oop.joanne_K_rowling_universe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton("Boggart");
    private JRadioButton radio2 = new JRadioButton("Headless Nic");
    private JRadioButton radio3 = new JRadioButton("Bloody Baron");
    public Window(){
        super("Harry Potter universe");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Spirit bloodBaron = new Spirit();
            bloodBaron.setName("Bloody Baron");
            bloodBaron.setDescription("Факультетское привидение Слизерина (в приступе ярости заколол кинжалом любимую девушку," +
                    " Елену Когтевран, и, осознав произошедшее, покончил жизнь самоубийством).");
            bloodBaron.setTransparency(0.1f);
            bloodBaron.setIncorporeality(0.0f);
            bloodBaron.setLocation("Факультет Слизерин");
            bloodBaron.setSex(Sex.MALE);
            bloodBaron.setTemperament(Temperament.HOLERIK);
            Spirit nicolas = new Spirit();
            nicolas.setName("Almost Headless Nic");
            nicolas.setDescription("Факультетское привидение Гриффиндора. Очень демократичное привидение." +
                    " И к тому же харизматичен. Всегда готов прийти на помощь, по крайней мере — гриффиндорцам, позволяет ученикам называть себя просто «Ник»." + "\n"+
                    " Но если вы задели его чувства, гордо вскидывает голову и холодно замечает, что зовут его «Сэр Николас де Мимси-Дельфингтон», и именно так к нему следует обращаться.");
            nicolas.setTransparency(0.1f);
            nicolas.setIncorporeality(0.0f);
            nicolas.setLocation("Факультет Гриффиндор");
            nicolas.setSex(Sex.MALE);
            nicolas.setTemperament(Temperament.MELANHOLIK);
            Spirit boggart = new Spirit();
            boggart.setName("Boggart");
            boggart.setDescription("Привидение, которое хочет всех напугать.");
            boggart.setTransparency(0.3f);
            boggart.setLocation("shelf");
            boggart.setIncorporeality(0.3f);
            boggart.setSex(Sex.IT);
            boggart.setTemperament(Temperament.SANGVINIK);
            String message = "";
            if (radio1.isSelected()) {
                message +="Boggart"+" is selected\n"+boggart;
            }else if(radio2.isSelected()) {
                message += "Headless Nic"+" is selected\n"+nicolas;
            }else
            message+="Bloody Baron" + " is selected\n"+bloodBaron;
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}
