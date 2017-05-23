package exercicio02;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	JLabel lbljuros,
		   lbldeposito,
		   lblSn,
		   lblResultado,
		   lbltempo;
	
	JTextField txtjuros,
			   txtdeposito,
			   txtSn,
			   txttempo;
	
	JButton btnCalcula,
			btnLimpar;
	
	public Janela(){
	this.setTitle("Calculadora - Aplicação Mensal");
	this.setSize(400,500);
	this.setLayout(new GridLayout(6, 2));
	
	lbljuros = new JLabel("Taxa de juros");
	lbldeposito = new JLabel("Deposito regular");
	lbltempo = new JLabel("Tempo");
	lblSn = new JLabel("Rendimento");
	lblResultado = new JLabel("Resultado");
	txtjuros = new JTextField("");
	txtdeposito = new JTextField("");
	txttempo = new JTextField("");
	txtSn = new JTextField("");
	btnCalcula = new JButton("Calcular");
	btnLimpar = new JButton("Limpar");
	
	add(lbljuros);
	add(txtjuros);
	add(lbldeposito);
	add(txtdeposito);
	add(lbltempo);
	add(txttempo);
	add(lblSn);
	add(lblResultado);
	add(btnCalcula);
	add(btnLimpar);
	
	btnCalcula.addActionListener(new CalcularListener(this));
	btnLimpar.addActionListener(new LimparListener(this));

	
	
	this.setVisible(true);


	}
}
