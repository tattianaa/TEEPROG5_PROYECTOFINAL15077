package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class bievenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnTienda;
	private JButton btnAdmin;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bievenida frame = new bievenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bievenida() {
		setTitle("Proyecto Final - Speakers Moda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 450);
		setLocationRelativeTo(null);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 242, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Boton Explorar Tienda
		btnTienda = new JButton("<html><center>EXPLORAR<br>TIENDA</center></html>");
		btnTienda.setFont(new Font("Arial", Font.BOLD, 15));
		btnTienda.setBackground(new Color(220, 170, 175));
		btnTienda.setForeground(new Color(50, 50, 50));
		btnTienda.setBorderPainted(false);
		btnTienda.setFocusPainted(false);
		btnTienda.setOpaque(true);
		btnTienda.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTienda.setBounds(100, 200, 210, 90);
		contentPane.add(btnTienda);

		// Boton Acceso Administrativo
		btnAdmin = new JButton("<html><center>ACCESO<br>ADMINISTRATIVO</center></html>");
		btnAdmin.setFont(new Font("Arial", Font.BOLD, 15));
		btnAdmin.setBackground(new Color(185, 190, 195));
		btnAdmin.setForeground(new Color(50, 50, 50));
		btnAdmin.setBorderPainted(false);
		btnAdmin.setFocusPainted(false);
		btnAdmin.setOpaque(true);
		btnAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAdmin.setBounds(380, 200, 210, 90);
		contentPane.add(btnAdmin);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\35oremoe.png"));
		lblNewLabel.setBounds(171, 92, 348, 66);
		contentPane.add(lblNewLabel);
	}
}
