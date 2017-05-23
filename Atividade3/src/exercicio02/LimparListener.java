package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {
	Janela j;
	
	public LimparListener(Janela janela){
		j = janela;
	}
	
	public void actionPerformed(ActionEvent e){
		j.txtdeposito.setText("");
		j.txtjuros.setText("");
		j.lblResultado.setText("");
		j.txttempo.setText("");
	}

}
