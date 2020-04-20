import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField Salario;
    private ButtonGroup botones= new ButtonGroup();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(31, 49, 61, 16);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(110, 44, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(31, 99, 61, 16);
		contentPane.add(lblEdad);
		
		final JComboBox cmb_edad = new JComboBox();
		cmb_edad.setModel(new DefaultComboBoxModel(new String[] {"15-25", "26-35", "36-45", "46-55", "Mas de 55"}));
		cmb_edad.setBounds(110, 95, 52, 27);
		contentPane.add(cmb_edad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(31, 148, 61, 16);
		contentPane.add(lblSexo);
		
		final JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(110, 144, 141, 23);
		contentPane.add(rdbtnMasculino);
		
		final JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(280, 144, 141, 23);
		contentPane.add(rdbtnFemenino);
		botones.add(rdbtnFemenino);
		botones.add(rdbtnMasculino);
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(31, 199, 61, 16);
		contentPane.add(lblSalario);
		
		Salario = new JTextField();
		Salario.setBounds(110, 194, 130, 26);
		contentPane.add(Salario);
		Salario.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje,sexo;
				if(rdbtnMasculino.isSelected()) {
					sexo="Masculino";
				}
				else {
					if(rdbtnFemenino.isSelected()) {
						sexo="Femenino";
					}
					else{
						sexo="";
					}
				}
				
				mensaje=txtNombre.getText()+" que tiene un rango de edad: "+cmb_edad.getSelectedItem()+" de sexo: "+sexo +" que tiene un salario de: "
						+Salario.getText();
				System.out.println(mensaje);
			}
		});
		btnNewButton.setBounds(291, 202, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(291, 243, 117, 29);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Adilem Dobras Castillo");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(157, 16, 166, 16);
		contentPane.add(lblNewLabel);
	}
}
