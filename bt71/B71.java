package bt71;

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
import java.awt.Font;

public class B71 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B71 frame = new B71();
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
	public B71() {
		setTitle("Hinh Tron");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("B\u00E1n K\u00EDnh");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setBounds(10, 55, 134, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("Chu Vi");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblB.setBounds(10, 86, 134, 14);
		contentPane.add(lblB);
		
		JTextField txtBK = new JTextField();
		txtBK.setBounds(154, 52, 86, 20);
		contentPane.add(txtBK);
		txtBK.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Di\u1EC7n T\u00EDch");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 111, 134, 14);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDnh chu vi v\u00E0 di\u1EC7n t\u00EDch h\u00ECnh tr\u00F2n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(51, 11, 189, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDT = new JLabel("");
		lblDT.setBounds(154, 105, 86, 20);
		lblDT.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblDT);
		
		JLabel lblCV = new JLabel("");
		lblCV.setBounds(154, 80, 86, 20);
		lblCV.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblCV);
		
		
		JButton btnTong = new JButton("T\u00EDnh");
		btnTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float r=Integer.parseInt(txtBK.getText());
				float cv=(float) (r*2*3.14);
				float s= (float) (r*r*3.14);
				lblDT.setText(String.format("%.2f", s));
				lblCV.setText(String.format("%.2f", cv));
			}
		});
		btnTong.setBounds(85, 136, 89, 23);
		contentPane.add(btnTong);
		
		
	}
}
