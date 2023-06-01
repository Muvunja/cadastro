package cadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmformulario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textApelido;
	private JTextField textSala;
	private JTextField textIdade;
	private JTextField textBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmformulario frame = new frmformulario();
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
	public frmformulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.BOLD, 13));
		lblNome.setBounds(10, 75, 121, 29);
		contentPane.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido");
		lblApelido.setFont(new Font("Arial", Font.BOLD, 13));
		lblApelido.setBounds(10, 115, 93, 29);
		contentPane.add(lblApelido);
		
		JLabel lblSala = new JLabel("Sala de Atendimento");
		lblSala.setFont(new Font("Arial", Font.BOLD, 13));
		lblSala.setBounds(10, 155, 146, 29);
		contentPane.add(lblSala);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Arial", Font.BOLD, 13));
		lblIdade.setBounds(10, 197, 93, 29);
		contentPane.add(lblIdade);
		
		textNome = new JTextField();
		textNome.setBounds(165, 75, 321, 29);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textApelido = new JTextField();
		textApelido.setBounds(165, 115, 321, 29);
		contentPane.add(textApelido);
		textApelido.setColumns(10);
		
		textSala = new JTextField();
		textSala.setBounds(166, 159, 320, 29);
		contentPane.add(textSala);
		textSala.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(165, 201, 86, 25);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblTitulo = new JLabel("HOSPITAL DISTRITAL DE GONDOLA");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
		lblTitulo.setBounds(140, 11, 248, 35);
		contentPane.add(lblTitulo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textNome.getText();
				String b= textApelido.getText();
				String c = textSala.getText();
				String d = textIdade.getText();
				
				int S=Integer.parseInt(d);
				Cadastro.guardar(a, b, c, d);
				
				
				textNome.setText("");
				textApelido.setText("");
				textSala.setText("");
				textIdade.setText("");
				
				
			}
		});
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 13));
		btnGuardar.setBounds(0, 351, 131, 35);
		contentPane.add(btnGuardar);
		
		JButton btnNewSair = new JButton("Sair");
		btnNewSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewSair.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewSair.setBounds(406, 351, 131, 35);
		contentPane.add(btnNewSair);
		
		textBuscar = new JTextField();
		textBuscar.setBounds(85, 258, 289, 35);
		contentPane.add(textBuscar);
		textBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 13));
		btnBuscar.addActionListener(new ActionListener() {
			private Object textNome;
			private Object textApelido;
			private Object textSala;
			private Object textIdade;

			public void actionPerformed(ActionEvent e) {
				
				String buscar=textBuscar.getText();
				Cadastro.buscar(buscar);
				
				//limpar dentro de buscar
				
				textBuscar.setText("");
				
			}
			
						

			
		});
		btnBuscar.setBounds(406, 258, 131, 35);
		contentPane.add(btnBuscar);
	}

	public void cargardatos(principal principal) {
		// TODO Auto-generated method stub
		
	}
}
