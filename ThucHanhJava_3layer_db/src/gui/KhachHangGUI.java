package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import bll.KhachHangBLL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class KhachHangGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtmaKhachHang;
	private JTextField txtten;
	private JTextField txtngaySinh;
	private JTextField txtdiaChi;
	private JTextField txtngayGiaNhap;
	private JTextField txtdoanhSo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHangGUI frame = new KhachHangGUI();
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
	public KhachHangGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 139, 494, 111);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TableModel mData =table.getModel();
				
				int chon= table.getSelectedRow();
				
				txtmaKhachHang.setText(mData.getValueAt(chon, 0).toString());
				txtten.setText(mData.getValueAt(chon, 1).toString());
				txtngaySinh.setText(mData.getValueAt(chon, 2).toString());
				txtdiaChi.setText(mData.getValueAt(chon, 3).toString());
				txtngayGiaNhap.setText(mData.getValueAt(chon, 4).toString());
				txtdoanhSo.setText(mData.getValueAt(chon, 5).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Kh\u00E1ch H\u00E0ng", "H\u1ECD T\u00EAn", "Ng\u00E0y Sinh", "\u0110\u1ECBa Ch\u1EC9", "Ng\u00E0y Gia Nh\u1EADp", "Doanh S\u1ED1"
			}
		));
		scrollPane.setViewportView(table);
		KhachHangBLL.capNhatTable(table);
		
		JLabel lblNewLabel = new JLabel("Mã Khách Hàng");
		lblNewLabel.setBounds(10, 11, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ Tên");
		lblNewLabel_1.setBounds(10, 36, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày Sinh");
		lblNewLabel_2.setBounds(10, 61, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Địa Chỉ");
		lblNewLabel_3.setBounds(10, 86, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		
		txtmaKhachHang = new JTextField();
		txtmaKhachHang.setBounds(112, 8, 86, 20);
		contentPane.add(txtmaKhachHang);
		txtmaKhachHang.setColumns(10);
		
		txtten = new JTextField();
		txtten.setBounds(112, 33, 86, 20);
		contentPane.add(txtten);
		txtten.setColumns(10);
		
		txtngaySinh = new JTextField();
		txtngaySinh.setBounds(112, 58, 86, 20);
		contentPane.add(txtngaySinh);
		txtngaySinh.setColumns(10);
		
		txtdiaChi = new JTextField();
		txtdiaChi.setBounds(112, 83, 86, 20);
		contentPane.add(txtdiaChi);
		txtdiaChi.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KhachHangBLL.them(txtmaKhachHang,txtten,txtngaySinh,txtdiaChi,txtngayGiaNhap,txtdoanhSo,table);
			}
		});
		btnThem.setBounds(10, 111, 89, 23);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHangBLL.xoa(txtmaKhachHang, table);
				
			}
		});
		btnXoa.setBounds(109, 111, 89, 23);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHangBLL.sua(txtmaKhachHang,txtten,txtngaySinh,txtdiaChi,txtngayGiaNhap,txtdoanhSo,table);
			}
		});
		btnSua.setBounds(208, 111, 89, 23);
		contentPane.add(btnSua);
		
		JLabel lblNewLabel_4 = new JLabel("Ngày Gia Nhập");
		lblNewLabel_4.setBounds(220, 11, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Doanh Số");
		lblNewLabel_5.setBounds(220, 36, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		txtngayGiaNhap = new JTextField();
		txtngayGiaNhap.setBounds(310, 8, 86, 20);
		contentPane.add(txtngayGiaNhap);
		txtngayGiaNhap.setColumns(10);
		
		txtdoanhSo = new JTextField();
		txtdoanhSo.setBounds(310, 33, 86, 20);
		contentPane.add(txtdoanhSo);
		txtdoanhSo.setColumns(10);
	}
}
