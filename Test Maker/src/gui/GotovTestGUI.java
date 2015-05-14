package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GotovTestGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	public static JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public GotovTestGUI(int brojGrupa, int brojPitanja, String naziv) {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 496, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		
		GUIKontroler.napraviTest(brojGrupa, brojPitanja, naziv, textArea);
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
