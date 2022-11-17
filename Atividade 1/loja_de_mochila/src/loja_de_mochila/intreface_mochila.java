package loja_de_mochila;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class intreface_mochila {

	private JFrame frame;
	private JTextField textCor;
	private JTextField textMarca;
	private JTextField textZiper;
	private JTextField textRodinha;
	private JTextField textTamanho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intreface_mochila window = new intreface_mochila();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public intreface_mochila() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 531, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mochila");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(206, 30, 123, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_Comrodinha = new JLabel("Com Rodinha");
		lbl_Comrodinha.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_Comrodinha.setBounds(171, 225, 170, 13);
		frame.getContentPane().add(lbl_Comrodinha);
		
		JLabel lbl_Marca = new JLabel("Marca");
		lbl_Marca.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_Marca.setBounds(171, 78, 170, 13);
		frame.getContentPane().add(lbl_Marca);
		
		JLabel lbl_Cor = new JLabel("Cor");
		lbl_Cor.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_Cor.setBounds(171, 127, 170, 13);
		frame.getContentPane().add(lbl_Cor);
		
		JLabel lbl_QT_Ziper = new JLabel("Quantidade de ziper");
		lbl_QT_Ziper.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_QT_Ziper.setBounds(171, 177, 170, 13);
		frame.getContentPane().add(lbl_QT_Ziper);
		
		JLabel lbl_Tamanho = new JLabel("Tamanho");
		lbl_Tamanho.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_Tamanho.setBounds(171, 270, 170, 13);
		frame.getContentPane().add(lbl_Tamanho);
		
		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(171, 148, 170, 19);
		frame.getContentPane().add(textCor);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(171, 101, 170, 19);
		frame.getContentPane().add(textMarca);
		
		textZiper = new JTextField();
		textZiper.setColumns(10);
		textZiper.setBounds(171, 196, 170, 19);
		frame.getContentPane().add(textZiper);
		
		textRodinha = new JTextField();
		textRodinha.setColumns(10);
		textRodinha.setBounds(171, 241, 170, 19);
		frame.getContentPane().add(textRodinha);
		
		textTamanho = new JTextField();
		textTamanho.setColumns(10);
		textTamanho.setBounds(171, 293, 170, 19);
		frame.getContentPane().add(textTamanho);
		
		JButton btn_Salvar = new JButton("Salvar");
		btn_Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mochila salvar = new mochila();
				salvar.setMarca(textMarca.getText()); 
				salvar.setCor(textCor.getText()); 
				salvar.setQuantidade_de_ziper(Double.parseDouble(textZiper.getText())); 
				salvar.setCom_rodinha(textRodinha.getText());
				salvar.setTamanho(textTamanho.getText());
				
				JOptionPane.showMessageDialog(null , salvar.salvar());
				
				textMarca.setText("");
				textCor.setText("");
				textZiper.setText("");
				textRodinha.setText("");
				textTamanho.setText("");
				
			}
		});
		btn_Salvar.setBounds(171, 341, 170, 40);
		frame.getContentPane().add(btn_Salvar);
	}
}
