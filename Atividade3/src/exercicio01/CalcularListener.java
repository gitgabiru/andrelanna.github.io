package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener {
	Janela j;
	
	
	public CalcularListener(Janela janela) {
		j = janela;
	}

	public void actionPerformed(ActionEvent e){
		float valorAtual = Float.parseFloat(j.txtValorAtual.getText());
		float juros = Float.parseFloat (j.txtJuros.getText());
		int tempo = Integer.parseInt(j.txtTempo.getText());
		
		float valorFuturo = (float)(valorAtual * (Math.pow((1 + (juros/100)), tempo)));
		j.txtResultado.setText(Float.toString(valorFuturo));
	}

}
