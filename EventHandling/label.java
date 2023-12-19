// Java Program to create a 
package EventHandling;
// blank label and add text to it.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class label extends JFrame {


	// static JFrame f;

	// static JLabel l;


	text()
	{
	}

	// main class
	public static void main(String[] args)
	{
		// create a new frame to store text field and button
		JFrame f = new JFrame("label");

		// create a label to display text
		JLabel l = new JLabel();

		// add text to label
		l.setText("label text");

		// create a panel
		JPanel p = new JPanel();

		// add label to panel
		p.add(l);

		// add panel to frame
		f.add(p);

		// set the size of frame
		f.setSize(300, 300);

		f.show();
	}
}
