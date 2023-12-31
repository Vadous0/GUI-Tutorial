import javax.swing.*; // The package where the components are
import java.awt.event.*; // Used for event listeners and events
import java.awt.BorderLayout; // For organazing Objeckts on a Layout
import java.awt.GridLayout;  // For managing multiple objeckts on 1 frame

public class Main {
  public static void main(String[] args) {
    
    
    JFrame frame = new JFrame("My first SWing GUI");
    // Create a frame object
    frame.setSize(500, 500);
    // Set the size of the frame to 500 pixels in length and 500 pixels in height
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // IMPORTANT. TYPE THIS IN EVERY FRAME OR ELSE THE CLOSE BUTTON WILL NOT DO
    // ANYTHING
    JPanel mainpanel = new JPanel(new GridLayout(4, 4));
    // Panel witch usually goes into a frame
    
    JButton button = new JButton("Click me!");
    // Create an instance of JButton
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("The button was clicked!");
      }
    });
    /*
     * The button will not do anything(Other than have a pushed look when it is
     * pressed) unless you add this, an actionListener.
     * When you press a JButton, the button fires an ActionEvent and the only way to
     * listen to these events it to add an ActionListener which has a method:
     * actionPerformed(ActionEvent e)
     * which is called when the button is pressed
     */

    mainpanel.add(button, BorderLayout.WEST);
    // adds the Button to the panel

    frame.getContentPane().add(mainpanel);
    // Adds the panel to the frame's content pane
    // Note: A frame in swing is just like a photoframe, it is the outside and holds
    // the content.
    // The Content Pane is where all the items go in or the "Picture in the frame"

    frame.setLocationRelativeTo(null);
    // Optional. Sets the frame in the center of the screen

    frame.setVisible(true);
    // IMPORTANT. This is to make it visible on the screen.

  }
}