package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmNoviTest;
	private JMenu mnDodaj;
	private JMenu mnNewMenu;
	private JMenuItem mntmPredmet;
	private JMenuItem mntmPitanja;
	private JMenuItem mntmIzlaz;
	private JMenuItem mntmOProgram;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzor frame = new GlavniProzor();
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
	public GlavniProzor() {
		setTitle("Test Maker");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNoviTest());
			mnFile.add(getMnDodaj());
			mnFile.add(getSeparator());
			mnFile.add(getMntmIzlaz());
		}
		return mnFile;
	}
	private JMenuItem getMntmNoviTest() {
		if (mntmNoviTest == null) {
			mntmNoviTest = new JMenuItem("Novi test");
			mntmNoviTest.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		}
		return mntmNoviTest;
	}
	private JMenu getMnDodaj() {
		if (mnDodaj == null) {
			mnDodaj = new JMenu("Dodaj");
			mnDodaj.add(getMntmPredmet());
			mnDodaj.add(getMntmPitanja());
		}
		return mnDodaj;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Pomoc");
			mnNewMenu.add(getMntmOProgram());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmPredmet() {
		if (mntmPredmet == null) {
			mntmPredmet = new JMenuItem("Predmet");
		}
		return mntmPredmet;
	}
	private JMenuItem getMntmPitanja() {
		if (mntmPitanja == null) {
			mntmPitanja = new JMenuItem("Pitanja");
		}
		return mntmPitanja;
	}
	private JMenuItem getMntmIzlaz() {
		if (mntmIzlaz == null) {
			mntmIzlaz = new JMenuItem("Izlaz");
			mntmIzlaz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		}
		return mntmIzlaz;
	}
	private JMenuItem getMntmOProgram() {
		if (mntmOProgram == null) {
			mntmOProgram = new JMenuItem("O programu");
		}
		return mntmOProgram;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Napravi test");
			btnNewButton.addActionListener(new BtnNewButtonActionListener());
			btnNewButton.setBounds(10, 29, 107, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Dodaj");
			btnNewButton_1.setBounds(10, 81, 107, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izlaz");
			btnNewButton_2.setBounds(10, 143, 107, 23);
		}
		return btnNewButton_2;
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(final ActionEvent arg0) {
			NapraviTestGUI frame=new NapraviTestGUI();
			frame.setVisible(true);
		}
	}
}
