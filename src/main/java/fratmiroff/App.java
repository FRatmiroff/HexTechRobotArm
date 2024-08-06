package fratmiroff;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {


    JButton button1;


    final String MOVE = "stepper.02_move_-4000|stepper.01_move_-2000|stepper.03_move_2000|stepper.00_move_12000|stepper.00_move_-36000|stepper.02_move_-3000;stepper.03_move_4000";


    MqttConnector mqtt = new MqttConnector("ws://mqtt.hextronics.cloud:8083/mqtt", "hextech-frank", "frank");
    String mqttTopic = "hextech/hextech-frank/commands";


    public static void main(String[] args) {
        @SuppressWarnings("unused")
        App app = new App();
    }


    public App() {
        this.setPreferredSize(new Dimension(400, 400));
        this.setLayout(new GridBagLayout());
        this.setLocationRelativeTo(null);


        button1 = new JButton("GRAB");
        button1.setPreferredSize(new Dimension(450, 150)); // Tripling the size
        button1.setFont(new Font("Arial", Font.BOLD, 24)); // Increasing font size
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                mqtt.publishMessage(mqttTopic, MOVE);
            }
        });


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(button1, gbc);


        this.pack();
        this.setVisible(true);
    }
}
