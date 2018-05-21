package bt89;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bt89.NhanVien;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NhapThongTinNV extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaNV;
	private JTextField txtSoSP;
	private JTextField txtLuong;
	private JTextField txtSoSpChuan;
	private JTable table;
	private Vector<NhanVien> nv = new Vector<NhanVien>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhapThongTinNV frame = new NhapThongTinNV();
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
	public NhapThongTinNV() {
		setTitle("Nhập Thông Tin NV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã NV:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số Sản Phẩm");
		lblNewLabel_1.setBounds(10, 36, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phân Xưởng");
		lblNewLabel_2.setBounds(10, 61, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tiền Lương");
		lblNewLabel_3.setBounds(10, 86, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		txtMaNV = new JTextField();
		txtMaNV.setBounds(94, 8, 86, 20);
		contentPane.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		txtSoSP = new JTextField();
		txtSoSP.setBounds(94, 33, 86, 20);
		contentPane.add(txtSoSP);
		txtSoSP.setColumns(10);
		
		txtLuong = new JTextField();
		txtLuong.setEditable(false);
		txtLuong.setBackground(Color.CYAN);
		txtLuong.setBounds(94, 83, 199, 20);
		contentPane.add(txtLuong);
		txtLuong.setColumns(10);
		
		JComboBox cbPhanXuong = new JComboBox();
		cbPhanXuong.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (cbPhanXuong.getSelectedItem().toString().equals("a"))
					txtSoSpChuan.setText("300");
				else
					txtSoSpChuan.setText("500");
			}
		});
		cbPhanXuong.setModel(new DefaultComboBoxModel(new String[] {"a", "b", "c"}));
		cbPhanXuong.setBounds(94, 58, 86, 20);
		contentPane.add(cbPhanXuong);
		
		JLabel lblNewLabel_4 = new JLabel("Số Sản Phẩm Chuẩn");
		lblNewLabel_4.setBounds(190, 61, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		txtSoSpChuan = new JTextField();
		txtSoSpChuan.setText("300");
		txtSoSpChuan.setEditable(false);
		txtSoSpChuan.setBounds(303, 58, 86, 20);
		contentPane.add(txtSoSpChuan);
		txtSoSpChuan.setColumns(10);
		
		JButton btnTinhLuong = new JButton("Tính Lương");
		btnTinhLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int chonSua=table.getSelectedRow();

				txtLuong.setText(Long.toString( nv.get(chonSua).tinhLuong()));
				
			}
		});
		btnTinhLuong.setBounds(0, 111, 110, 23);
		contentPane.add(btnTinhLuong);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien hangMoi = new NhanVien(txtMaNV.getText(), cbPhanXuong.getSelectedItem().toString(), Integer.parseInt(txtSoSP.getText()));
				
				nv.add(hangMoi);
			
				//do du lieu tu vector sang DefaultTableModel
				LamMoiTable();
				
				txtMaNV.setText("");
				txtSoSP.setText("");
			}
		});
		btnThem.setBounds(120, 111, 66, 23);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int h =table.getSelectedRow();
				nv.remove(h);
			
				LamMoiTable();
				
			}
		});
		btnXoa.setBounds(196, 111, 74, 23);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int chonSua=table.getSelectedRow();
				nv.get(chonSua).setMaNV(txtMaNV.getText());
				nv.get(chonSua).setPhanXuong(cbPhanXuong.getSelectedItem().toString());
				nv.get(chonSua).setSoSP(Integer.parseInt(txtSoSP.getText()) );
				
				LamMoiTable();  
				
				txtMaNV.setText("");
				txtSoSP.setText("");
			}
		});
		btnSua.setBounds(280, 111, 77, 23);
		contentPane.add(btnSua);
		
		JButton btnDong = new JButton("Đóng");
		btnDong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnDong.setBounds(363, 111, 71, 23);
		contentPane.add(btnDong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 414, 105);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//lay ve model
				TableModel mData =table.getModel();
				//lay dong dc chon
				int chon= table.getSelectedRow();
				txtMaNV.setText(mData.getValueAt(chon, 0).toString());
				cbPhanXuong.setSelectedItem(mData.getValueAt(chon, 1).toString());
				txtSoSP.setText(mData.getValueAt(chon, 2).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Nh\u00E2n Vi\u00EAn", "Ph\u00E2n X\u01B0\u1EDFng", "S\u1ED1 S\u1EA3n Ph\u1EA9m", "V\u01B0\u1EE3t Chu\u1EA9n"
			}
		));
		scrollPane.setViewportView(table);
	}
	private void LamMoiTable(){
		
		DefaultTableModel model= new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"M\u00E3 Nh\u00E2n Vi\u00EAn", "Ph\u00E2n X\u01B0\u1EDFng", "S\u1ED1 S\u1EA3n Ph\u1EA9m", "V\u01B0\u1EE3t Chu\u1EA9n"
				}
			);
		for (int i=0; i<nv.size();i++)
		{
			NhanVien t= nv.get(i);
			Vector<String> hang= new Vector<String>();
			hang.add( t.getMaNV() );
			hang.add( t.getPhanXuong() );
			hang.add( Integer.toString(t.getSoSP()) );
			if (t.vuotChuan())
				hang.add("x");
			else 
				hang.add("");
			
			model.addRow(hang);
		}
		table.setModel(model);
	}
}
