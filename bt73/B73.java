package bt73;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B73 extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B73 frame = new B73();
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
	public B73() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhGiaiTha = new JLabel("t\u00EDnh giai th\u1EEBa c\u1EE7a x");
		lblTnhGiaiTha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTnhGiaiTha.setBounds(10, 11, 163, 19);
		contentPane.add(lblTnhGiaiTha);
		
		JLabel lblNhpX = new JLabel("Nh\u1EADp x:");
		lblNhpX.setBounds(10, 51, 46, 14);
		contentPane.add(lblNhpX);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKtQu.setBounds(10, 86, 46, 14);
		contentPane.add(lblKtQu);
		
		txtX = new JTextField();
		txtX.setBounds(66, 48, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		JLabel lblKQ = new JLabel("");
		lblKQ.setBorder(new LineBorder(Color.BLACK));
		lblKQ.setBounds(66, 86, 86, 19);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x= Integer.parseInt(txtX.getText());
				int s=1;
				if (x==0)
					lblKQ.setText("0");
				else
					for (int i=1;i<=x;i++)
						s=s*i;
				lblKQ.setText(Integer.toString(s));
			}
		});
		btnTinh.setBounds(63, 114, 89, 23);
		contentPane.add(btnTinh);
		
		JButton btnNhapLai = new JButton("Nh\u1EADp L\u1EA1i");
		btnNhapLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblKQ.setText("");
				txtX.setText("");
			}
		});
		btnNhapLai.setBounds(207, 114, 89, 23);
		contentPane.add(btnNhapLai);
		
		
		contentPane.add(lblKQ);
	}
}
