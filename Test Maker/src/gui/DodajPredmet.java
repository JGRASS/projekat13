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
	private JTextField textFieldPredmet;
	private JTextArea textAreaPitanja;

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
		
		JLabel lblNazizPredmeta = new JLabel("Naziz predmeta");
		lblNazizPredmeta.setBounds(26, 22, 92, 14);
		contentPane.add(lblNazizPredmeta);
		
		textFieldPredmet = new JTextField();
		textFieldPredmet.setBounds(26, 47, 86, 20);
		contentPane.add(textFieldPredmet);
		textFieldPredmet.setColumns(10);
		
		JLabel lblPitanja = new JLabel("Pitanja:");
		lblPitanja.setBounds(26, 78, 58, 14);
		contentPane.add(lblPitanja);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 98, 201, 103);
		contentPane.add(scrollPane);
		
		textAreaPitanja = new JTextArea();
		scrollPane.setViewportView(textAreaPitanja);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.upisiPredmet(textFieldPredmet.getText());
				GUIKontroler.ubaciPitanje(textFieldPredmet.getText(), textAreaPitanja.getText());
				dispose();
			}
		});
		btnDodaj.setBounds(277, 147, 114, 54);
		contentPane.add(btnDodaj);
	}
}
