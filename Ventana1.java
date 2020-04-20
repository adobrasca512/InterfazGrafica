import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUsuario;
	public static JPasswordField pss_contrasenia;


	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(197, 45, 130, 26);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(29, 50, 61, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(29, 139, 61, 16);
		contentPane.add(lblPassword);
		
		pss_contrasenia = new JPasswordField();
		pss_contrasenia.setBounds(197, 134, 130, 26);
		contentPane.add(pss_contrasenia);
		final DatosUsuario data= new DatosUsuario();
		final Ventana2 window2= new Ventana2();
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(data.probarPass()==1) {
				JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
				window2.setVisible(true);
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null,"Error, usuario o contraseña incorrecto");
			}
			}
		});
		btnEntrar.setBounds(45, 223, 117, 29);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(290, 223, 117, 29);
		contentPane.add(btnSalir);
		
		JLabel lblAdilemDobrasCastillo = new JLabel("Adilem Dobras Castillo");
		lblAdilemDobrasCastillo.setForeground(Color.MAGENTA);
		lblAdilemDobrasCastillo.setBounds(142, 6, 151, 16);
		contentPane.add(lblAdilemDobrasCastillo);
	}

}
