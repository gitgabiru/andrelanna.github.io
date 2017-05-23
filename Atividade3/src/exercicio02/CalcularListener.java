package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularListener implements ActionListener {
	Janela j;
	
	public CalcularListener(Janela janela){
		j = janela;
	}
	
	public void actionPerformed(ActionEvent e){
		float juros = Float.parseFloat(j.txtjuros.getText());
		float deposito = Float.parseFloat(j.txtdeposito.getText());
		int tempo = Integer.parseInt(j.txttempo.getText());
		float sn = (float)((1+(juros/100)) * (((Math.pow((1 + (juros/100)), tempo)) - 1)/ (juros/100)) * deposito);
		j.lblResultado.setText(Float.toString(sn));
	}

}




