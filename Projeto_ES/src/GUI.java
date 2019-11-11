import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;

	public GUI() {

		frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());

		addFrameContent();

		open();
	}


	public void addFrameContent() {

		JPanel painelTop = new JPanel();
		painelTop.setLayout(new GridLayout(1,3));
	}

	public void open() {
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	public void ex() {
	}


}
