package bt1_1;

import btth2.SinhVien;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class StudentGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtNamSinh;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ArrayList<SinhVien> sv= new ArrayList<SinhVien>();
	private int stt=1;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentGUI frame = new StudentGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public StudentGUI() {
		setTitle("Student Mar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 270, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNmSinh = new JLabel("N\u0103m Sinh");
		lblNmSinh.setBounds(10, 31, 61, 14);
		panel.add(lblNmSinh);
		
		JLabel lblHTn = new JLabel("H\u1ECD T\u00EAn");
		lblHTn.setBounds(10, 6, 61, 14);
		panel.add(lblHTn);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(113, 3, 147, 20);
		panel.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtNamSinh = new JTextField();
		txtNamSinh.setBounds(113, 28, 147, 20);
		panel.add(txtNamSinh);
		txtNamSinh.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Gi\u1EDBi T\u00EDnh");
		lblNewLabel.setBounds(10, 56, 46, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		buttonGroup.add(rdbtnNam);
		rdbtnNam.setBounds(64, 52, 61, 23);
		panel.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("N\u1EEF");
		buttonGroup.add(rdbtnNu);
		rdbtnNu.setBounds(130, 52, 44, 23);
		panel.add(rdbtnNu);
		
		JButton btnThem = new JButton("Th\u00EAm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SinhVien t = new SinhVien();
				t.setStt(stt);
				t.setHoTen(txtHoTen.getText());
				t.setNamSinh(txtNamSinh.getText());
				if (rdbtnNam.isSelected())
					t.setGioiTinh("nam");
				else 
					t.setGioiTinh("nu");
				
				sv.add(t);
				
				stt++;
				
				JOptionPane.showMessageDialog(null, "Da Them");
				
				txtHoTen.setText("");
				txtNamSinh.setText("");
			}
		});
		btnThem.setBounds(64, 82, 89, 23);
		panel.add(btnThem);
		
		JTextArea textAreaSV = new JTextArea();
		textAreaSV.setBounds(10, 129, 453, 136);
		contentPane.add(textAreaSV);
		
		JButton btnNap = new JButton("N\u1EA1p V\u00E0o");
		btnNap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (Object x:sv){
					String s= new String();
					s= Integer.toString(((SinhVien) x).getStt()) + "   " + ((SinhVien) x).getHoTen() + "   " +((SinhVien) x).getNamSinh() + "   " + ((SinhVien) x).getGioiTinh()+ "\n";
					textAreaSV.insert(s,0);
				}
			}
		});
		btnNap.setBounds(321, 95, 89, 23);
		contentPane.add(btnNap);
	}

}
