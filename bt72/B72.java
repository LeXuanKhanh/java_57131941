package bt72;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class B72 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCSM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B72 frame = new B72();
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
	public B72() {
		setTitle("Tinh Tien Dien");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("Ch\u1EC9 s\u1ED1 c\u0169");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setBounds(10, 55, 134, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("Ch\u1EC9 s\u1ED1 m\u1EDBi");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblB.setBounds(10, 80, 134, 14);
		contentPane.add(lblB);
		
		JTextField txtCSC = new JTextField();
		txtCSC.setBounds(109, 52, 86, 20);
		contentPane.add(txtCSC);
		txtCSC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T\u1ED5ng s\u1ED1 \u0111i\u1EC7n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 111, 89, 14);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDnh ti\u1EC1n \u0111i\u1EC7n theo ch\u1EC9 s\u1ED1 \u0111\u1ED3ng h\u1ED3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(37, 11, 189, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTT = new JLabel("");
		lblTT.setBounds(109, 136, 86, 20);
		lblTT.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblTT);
		
		JLabel lbTSD = new JLabel("");
		lbTSD.setBounds(109, 105, 86, 20);
		lbTSD.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lbTSD);
		
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int csm=Integer.parseInt(txtCSM.getText());
				int csc=Integer.parseInt(txtCSC.getText());
				int tsd=csm-csc;
				double t=0;
				if (t<=50)
					t= tsd*500;
				else
					if ((51<=t) && (t<=100))
					t=50*500 + (tsd-50)*1000;
					else
						if ((101<=t) && (t<=200))
							t= 50*500 + 50*1000 +(tsd-100)*2000;
						else
							if ((201<=t) && (t<=300))
								t= 50*500 + 50*1000 + 100*200 + (tsd-200)*2500;
							else
								if (301<=t)
										t= 50*500 + 50*1000 + 100*200 + 100*2500 + (tsd-300)*4000;
				
				lbTSD.setText(Integer.toString(tsd));
				lblTT.setText(Double.toString(t));
				
			}
		});
		btnTinh.setBounds(85, 227, 89, 23);
		contentPane.add(btnTinh);
		
		JLabel lblThnhTin = new JLabel("Th\u00E0nh ti\u1EC1n");
		lblThnhTin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblThnhTin.setBounds(10, 136, 89, 14);
		contentPane.add(lblThnhTin);
		
		txtCSM = new JTextField();
		txtCSM.setBounds(109, 77, 86, 20);
		contentPane.add(txtCSM);
		txtCSM.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("VND");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(205, 136, 46, 20);
		contentPane.add(lblNewLabel_2);
	}
}
