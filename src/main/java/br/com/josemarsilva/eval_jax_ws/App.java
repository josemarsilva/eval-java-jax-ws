package br.com.josemarsilva.eval_jax_ws;

import br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP;

public class App {

	public static void main(String[] args) {
		System.out.println("main()");
		ConsultaCEP consultaCEP = new ConsultaCEP();
		consultaCEP.setCep("13050410");
		System.out.println( consultaCEP.getCep() );

	}

}
