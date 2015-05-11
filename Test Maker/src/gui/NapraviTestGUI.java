package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class NapraviTestGUI extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblPredmet;
	private JList list;
	private JTextField textField;
	private JLabel lblPitanja;
	private JLabel lblBrojGrupa;
	private JTextField textField_1;
	private JLabel lblBrojPitanjaPo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NapraviTestGUI frame = new NapraviTestGUI();
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
	public NapraviTestGUI() {
		setTitle("Novi test");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getLblPredmet());
		contentPane.add(getList());
		contentPane.add(getTextField());
		contentPane.add(getLblPitanja());
		contentPane.add(getLblBrojGrupa());
		contentPane.add(getTextField_1());
		contentPane.add(getLblBrojPitanjaPo());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Matematika", "SPA", "MTR"}));
			comboBox.setBounds(10, 37, 118, 20);
		}
		return comboBox;
	}
	private JLabel getLblPredmet() {
		if (lblPredmet == null) {
			lblPredmet = new JLabel("Predmet");
			lblPredmet.setBounds(10, 11, 46, 14);
		}
		return lblPredmet;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBounds(10, 111, 324, 151);
		}
		return list;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(367, 109, 102, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblPitanja() {
		if (lblPitanja == null) {
			lblPitanja = new JLabel("Pitanja");
			lblPitanja.setBounds(10, 86, 46, 14);
		}
		return lblPitanja;
	}
	private JLabel getLblBrojGrupa() {
		if (lblBrojGrupa == null) {
			lblBrojGrupa = new JLabel("Broj grupa");
			lblBrojGrupa.setBounds(367, 86, 102, 14);
		}
		return lblBrojGrupa;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(367, 163, 102, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblBrojPitanjaPo() {
		if (lblBrojPitanjaPo == null) {
			lblBrojPitanjaPo = new JLabel("Broj pitanja po grupi");
			lblBrojPitanjaPo.setBounds(367, 140, 110, 14);
		}
		return lblBrojPitanjaPo;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Napravi test");
			btnNewButton.setBounds(367, 216, 102, 46);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odaberi predmet");
			btnNewButton_1.setBounds(158, 36, 118, 23);
		}
		return btnNewButton_1;
	}
}
