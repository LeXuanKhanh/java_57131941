package bt75;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B75 extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B75 frame = new B75();
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
	public B75() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00ECm Ki\u1EBFm Chu\u1ED7i ");
		lblNewLabel.setBounds(10, 11, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp Chu\u1ED7i 1");
		lblNewLabel_1.setBounds(10, 36, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nh\u1EADp Chu\u1ED7i 2");
		lblNewLabel_2.setBounds(10, 78, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt Qu\u1EA3");
		lblKtQu.setBounds(10, 115, 46, 14);
		contentPane.add(lblKtQu);
		
		JButton btnTim = new JButton("T\u00ECm Ki\u1EBFm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=txt1.getText();
				String b=txt1.getText();
				if (a.contains(b))
					txtKQ.setText("co");
				else
					txtKQ.setText("khong");
			}
		});
		btnTim.setBounds(46, 153, 89, 23);
		contentPane.add(btnTim);
		
		txt1 = new JTextField();
		txt1.setBounds(93, 33, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(93, 75, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(93, 112, 86, 20);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
	}
}
