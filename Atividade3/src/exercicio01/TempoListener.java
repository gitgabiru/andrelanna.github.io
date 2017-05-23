package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempoListener implements ActionListener {
	Janela j;
	
	public TempoListener(Janela janela){
		j = janela;
	}
	
	public void actionPerformed(ActionEvent e){
		float valorFuturo = Float.parseFloat(j.txtResultado.getText());
		float valorPresente = Float.parseFloat(j.txtValorAtual.getText());
		float juros = Float.parseFloat(j.txtJuros.getText());
		int tempo = (int)((Math.log(valorFuturo) - Math.log(valorPresente)) / Math.log(1+(juros)/100) + 0.5);
		j.txtTempo.setText(Integer.toString(tempo));
		
	}

}
