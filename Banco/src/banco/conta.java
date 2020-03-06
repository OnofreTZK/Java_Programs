package banco;

import java.text.DecimalFormat;

/*
 * Author: Tiago Onofre
 * class: conta.
 */

import java.util.Scanner;

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
	
	// Sacar dinheiro da conta --> deve verificar se o valor requerido é válido( n <= saldo )
	boolean saca()
	{
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Informe quanto deseja sacar: ");
		
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		while ( true ) // loop para impedir fazer com que o usuário consiga sacar mesmo após errar o valor desejado.
		{
			double valor = terminal.nextDouble();
			
			if ( valor > this.saldo )
			{
				System.out.println("Saldo insuficiente! Por favor informe uma quantia válida.");
				continue;
			}
			else
			{
				this.saldo = this.saldo - valor;
				
				System.out.println("Operação bem sucedida!\nSaldo atual: " + df2.format(this.saldo));
				
				return true;
			}
		}
	}
	
	// Deve aumentar o saldo --> até o momento sem necessidade verificação.
	boolean deposita()
	{
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Valor a ser depositado: ");
		
		double valor = terminal.nextDouble();
		
		this.saldo = this.saldo + valor;
		
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		System.out.println("Valor depositado com sucesso!\nSaldo atual: " + df2.format(this.saldo) );
		
		return true;
	}
	
}
