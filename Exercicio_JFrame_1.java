import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_JFrame_1 extends JFrame {

	private JPanel contentPane;
	private JTextPane txtLogin;
	private JTextPane txtSenha;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_JFrame_1 frame = new Exercicio_JFrame_1();
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
	public Exercicio_JFrame_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(42, 29, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(37, 66, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.getText();
				txtSenha.getText();
				
					
			if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("swordfish")) 
				JOptionPane.showMessageDialog(contentPane, "Login/Senha corretas! Acesso garantido.");
			else
				JOptionPane.showMessageDialog(contentPane, "Login/Senha incorretos! Tente novamente.");
				
			
			
			

			}
		});
		btnOK.setBounds(83, 126, 89, 23);
		contentPane.add(btnOK);
		
		txtLogin = new JTextPane();
		txtLogin.setBounds(83, 26, 109, 20);
		contentPane.add(txtLogin);
		
		txtSenha = new JTextPane();
		txtSenha.setBounds(83, 63, 109, 20);
		contentPane.add(txtSenha);
	}

}
