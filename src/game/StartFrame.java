package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 400;

    public StartFrame() {
        Game game = new Game(new Field(10, 10));
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setResizable(false);
        Toolkit kit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = kit.getScreenSize();
        setLocation(screenSize.width / 2 - DEFAULT_WIDTH / 2, screenSize.height / 2 - DEFAULT_HEIGHT / 2);

//        URL url = getClass().getResource("images/armlogo.png");
//        setIconImage(new ImageIcon(url).getImage());

        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        JButton newGame = new JButton("Запуск");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame gameFrame = new GameFrame(game);
                gameFrame.setVisible(true);
            }
        });

        centerPanel.add(newGame);
        add(centerPanel, BorderLayout.CENTER);
    }

}
