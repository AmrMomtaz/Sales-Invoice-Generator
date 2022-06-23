package frontend;

import javax.swing.*;

public class GUI extends JFrame{

    // GUI constructor
    public GUI(){
        //Creating main frame
        this.setResizable(false);
        this.setSize(1000,500);
        this.setTitle("Sales Invoice Generator");
        ImageIcon image = new ImageIcon("src/main/java/frontend/logo.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);
        this.setVisible(true);

        //
    }
}
