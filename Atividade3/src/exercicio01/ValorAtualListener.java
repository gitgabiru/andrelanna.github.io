package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValorAtualListener implements ActionListener {
	Janela j;
	
	public ValorAtualListener(Janela janela){
		j = janela;
	}
	
	public void actionPerformed(ActionEvent e){
		
		float valorFuturo = Float.parseFloat(j.txtResultado.getText());
		float juros = Float.parseFloat(j.txtJuros.getText());
		int tempo = Integer.parseInt(j.txtTempo.getText());
		
		float valorAtual = (float)((valorFuturo)/(Math.pow((1 + (juros/100)), tempo)));
		j.txtValorAtual.setText(Float.toString(valorAtual));
				//j.txtResultado.setText(Float.toString(valorFuturo));
		
	}

}
