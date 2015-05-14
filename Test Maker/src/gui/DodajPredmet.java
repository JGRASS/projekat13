package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajPredmet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajPredmet frame = new DodajPredmet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajPredmet() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPredmet = new JLabel("Predmet");
		lblPredmet.setBounds(26, 30, 46, 14);
		contentPane.add(lblPredmet);

		textField = new JTextField();
		textField.setBounds(26, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblPitanja = new JLabel("Pitanja");
		lblPitanja.setBounds(26, 86, 46, 14);
		contentPane.add(lblPitanja);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 106, 198, 108);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.upisiPredmet(textField.getText());
				GUIKontroler.ubaciPitanje(textField.getText(),
						textArea.getText());
				dispose();
			}
		});
		btnDodaj.setBounds(270, 150, 128, 64);
		contentPane.add(btnDodaj);
	}

}
