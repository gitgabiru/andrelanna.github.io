package exercicio01;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	JTextField txtValorAtual,
				txtValorFuturo,
				txtJuros,
				txtTempo,
				txtResultado;
	
	JLabel lblValorAtual,
			lblJuros,
			lblTempo,
			lblValorFuturo;
	
	JButton btnCalcular,
			btnTempo,
			btnValorAtual,
			btnLimpar;
	
	public Janela(){
		this.setTitle("Calculadora - Valor Futuro");
		this.setSize(400, 500);
		this.setLayout(new GridLayout(6, 2));
		
		txtValorAtual = new JTextField("");
		txtJuros = new JTextField("");
		txtTempo = new JTextField("");
		txtValorFuturo = new JTextField("");
		txtResultado = new JTextField("");
		txtTempo = new JTextField("");
		lblValorAtual = new JLabel("Valor Atual");
		lblJuros = new JLabel("Taxa de Juros");
		lblTempo = new JLabel("Tempo em meses");
		lblValorFuturo = new JLabel("Valor Futuro");
		btnCalcular = new JButton("Valor Futuro");
		btnValorAtual = new JButton("Valor Atual");
		btnTempo = new JButton("Tempo");
		btnLimpar = new JButton("Limpar");
		
		add(lblValorAtual);
		add(txtValorAtual);
		add(lblJuros);
		add(txtJuros);
		add(lblTempo);
		add(txtTempo);
		add(lblValorFuturo);
		add(txtResultado);
		add(btnCalcular);
		add(btnValorAtual);
		add(btnTempo);
		add(btnLimpar);
		
		btnCalcular.addActionListener(new CalcularListener(this));
		btnValorAtual.addActionListener(new ValorAtualListener(this));
		btnTempo.addActionListener(new TempoListener(this));
		btnLimpar.addActionListener(new LimparListener(this));
		
		this.setVisible(true);
	}

}
