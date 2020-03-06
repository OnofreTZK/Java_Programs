package banco;

/*
 * Author: Tiago Onofre
 */

public class banco {

	public static void main(String[] args) {
		
		cliente a = new cliente( "Tiago", "Onofre", "048.508.284-50");
		
		conta a1 = new conta("0001", a, 154678.69, 20000);
		
		//System.out.println( "Numero da conta: " + a1.numero +
		//					"\nTitular: " + a1.titular.nome +
		//					"\nSaldo: " + a1.saldo +
		//					"\nLimite: " + a1.limite );
		
		
		@SuppressWarnings("unused")
		boolean caixa;
			
		caixa = a1.saca();
		
		caixa = a1.deposita();
		
	}

}
