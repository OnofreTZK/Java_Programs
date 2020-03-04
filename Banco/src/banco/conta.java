package banco;

/*
 * Author: Tiago Onofre
 * class: conta.
 */

public class conta 
{
	// Atributos
	String numero;
	cliente titular;
	double saldo;
	int limite;
	static int totalDeContas;
	//-----------------------
	
	conta( String numero, cliente titular, double saldo, int limite )
	{ 
		this.numero = numero; 
		this.titular = new cliente(titular.nome, titular.sobrenome, titular.cpf ); 
		this.saldo = saldo; 
		this.limite = limite;
	}
}
