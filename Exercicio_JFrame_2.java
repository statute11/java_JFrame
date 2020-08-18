import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_JFrame_2 extends JFrame {

	private JPanel contentPane;
	private JTextPane txtA;
	private JTextPane txtB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_JFrame_2 frame = new Exercicio_JFrame_2();
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
	public Exercicio_JFrame_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 203, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A:");
		lblA.setBounds(23, 32, 11, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B:");
		lblB.setBounds(23, 57, 11, 14);
		contentPane.add(lblB);
		
		txtA = new JTextPane();
		txtA.setBounds(44, 32, 113, 20);
		contentPane.add(txtA);
		
		txtB = new JTextPane();
		txtB.setBounds(44, 57, 113, 20);
		contentPane.add(txtB);
		
		JButton btnMostrarNumeros = new JButton("Mostrar N\u00FAmeros");
		btnMostrarNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			txtA.getText();
			txtB.getText();
			
			int numA = Integer.parseInt(txtA.getText());
			int numB = Integer.parseInt(txtB.getText());
			
			while(numB <= numA) 
				JOptionPane.showMessageDialog(contentPane, numB++);
			
			while(numA <= numB) 
				JOptionPane.showMessageDialog(contentPane, numA++);
				
			
		
			
			}
		});
		btnMostrarNumeros.setBounds(23, 112, 134, 23);
		contentPane.add(btnMostrarNumeros);
	}

}
