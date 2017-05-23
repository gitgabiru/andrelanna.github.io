package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LimparListener implements ActionListener {
	Janela j;
	
	public LimparListener(Janela janela){
		j = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		j.txtJuros.setText("");
		j.txtTempo.setText("");
		j.txtValorAtual.setText("");
		j.txtResultado.setText("");
	}

}
