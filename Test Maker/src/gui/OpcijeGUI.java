package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class OpcijeGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnDodajPitanje;
	private JButton btnDodajPredmet;
	private JLabel lblDaLiZelite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcijeGUI frame = new OpcijeGUI();
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
	public OpcijeGUI() {
		setTitle("Dodaj");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDodajPitanje());
		contentPane.add(getBtnDodajPredmet());
		contentPane.add(getLblDaLiZelite());
	}
	private JButton getBtnDodajPitanje() {
		if (btnDodajPitanje == null) {
			btnDodajPitanje = new JButton("Dodaj pitanje");
			btnDodajPitanje.setBounds(93, 81, 103, 23);
		}
		return btnDodajPitanje;
	}
	private JButton getBtnDodajPredmet() {
		if (btnDodajPredmet == null) {
			btnDodajPredmet = new JButton("Dodaj predmet");
			btnDodajPredmet.setBounds(256, 81, 103, 23);
		}
		return btnDodajPredmet;
	}
	private JLabel getLblDaLiZelite() {
		if (lblDaLiZelite == null) {
			lblDaLiZelite = new JLabel("Da li zelite da dodate novo pitanje ili novi predmet?\r\n");
			lblDaLiZelite.setBounds(98, 29, 261, 41);
		}
		return lblDaLiZelite;
	}
}
