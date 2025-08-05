import javax.swing.*;
import java.awt.*;

import static

import static
        jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles.title;

public class UiExamples {
    JFrame  window = new JFrame("Example App");
    JPanel myPanel = new JPanel();
    JTextField emailField = new JTextField("Enter your email address");
    JButton myButton = new JButton("Click here");

    void drawUi() {
        myPanel.add(emailField);
        myPanel.add(myButton);
        myPanel.setLayout(new GridLayout(1, 2));
        window.add(myPanel); // FIXED: You were mistakenly doing myPanel.add(myPanel)
        window.setSize(300, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        UiExample uiExample = new UiExample();
        uiExample.drawUi(); // FIXED: you missed calling drawUi()
    }
}
