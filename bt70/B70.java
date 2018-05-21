package bt70;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class B70 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B70 frame = new B70();
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
	public B70() {
		setTitle("tinh gia tri hoa hon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("S\u1ED1 L\u01B0\u1EE3ng");
		lblA.setBounds(10, 55, 134, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("\u0110\u01A1n Gi\u00E1");
		lblB.setBounds(10, 80, 134, 14);
		contentPane.add(lblB);
		
		JTextField txtSoLuong = new JTextField();
		txtSoLuong.setBounds(154, 52, 86, 20);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		JTextField txtDonGia = new JTextField();
		txtDonGia.setBounds(154, 77, 86, 20);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Th\u00E0nh Ti\u1EC1n");
		lblNewLabel.setBounds(10, 111, 134, 14);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDnh Gi\u00E1 Tr\u1ECB H\u00F3a \u0110\u01A1n");
		lblNewLabel_1.setBounds(82, 11, 158, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKQ = new JLabel("");
		lblKQ.setBounds(154, 108, 86, 17);
		lblKQ.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblKQ);
		
		
		JButton btnTong = new JButton("T\u00EDnh");
		btnTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txtSoLuong.getText());
				int b=Integer.parseInt(txtDonGia.getText());
				int s=a*b;
				lblKQ.setText(Integer.toString(s));
			}
		});
		btnTong.setBounds(85, 136, 89, 23);
		contentPane.add(btnTong);
		
		
	}
}
