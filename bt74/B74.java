package bt74;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B74 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHo;
	private JTextField txtTen;
	private JTextField txtHoTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B74 frame = new B74();
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
	public B74() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTchHTn = new JLabel("t\u00E1ch h\u1ECD t\u00EAn");
		lblTchHTn.setBounds(10, 11, 71, 14);
		contentPane.add(lblTchHTn);
		
		JLabel lblH = new JLabel("H\u1ECD T\u00EAn");
		lblH.setBounds(10, 36, 46, 14);
		contentPane.add(lblH);
		
		JLabel lblH_1 = new JLabel("H\u1ECD");
		lblH_1.setBounds(10, 64, 46, 14);
		contentPane.add(lblH_1);
		
		JLabel lblTn = new JLabel("T\u00EAn");
		lblTn.setBounds(10, 89, 46, 14);
		contentPane.add(lblTn);
		
		txtHo = new JTextField();
		txtHo.setEditable(false);
		txtHo.setBounds(66, 61, 86, 20);
		contentPane.add(txtHo);
		txtHo.setColumns(10);
		
		txtTen = new JTextField();
		txtTen.setEditable(false);
		txtTen.setBounds(66, 86, 86, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(66, 33, 86, 20);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten=txtHoTen.getText();
				
				int csCuoiHo=0,csDauDem=0,csCuoiDem=0;
				int DemKhoangTrang=0;
				for (int i=0;i< hoten.length();i++){
					if (hoten.charAt(i)== ' ')
					{
						if (DemKhoangTrang==0)
						{
							csCuoiHo=i;
							DemKhoangTrang++;
							csDauDem=i+1;
							csCuoiDem=i;
						}		
						else
						{
							csCuoiDem=i;
						}
					}
				}
				
				txtHo.setText(hoten.substring(0,csCuoiHo));
				txtTen.setText(hoten.substring(csDauDem,hoten.length()));
			}
		});
		btnTinh.setBounds(20, 114, 89, 23);
		contentPane.add(btnTinh);
	}

}
