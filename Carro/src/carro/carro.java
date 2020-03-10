package carro;

/*
 * Author: Tiago Onofre
 * class: carro
 */

import java.util.Scanner;

import motor.motor;

public class carro
{
	
	// Variavéis.
	/*********************************************************************/
    String tipo;
    String cor;
    String placa;
    int numPortas;

    // Marcha atual.
    public int marcha = 1;

    // estado que definirá se o carro está acelerando ou não.
    public boolean acelerando;

    // O tanque será um vetor com 60 litros, sendo cada posição 1 litro.
    public int gasolina = 60;

    // Instanciando o objeto motor.
    motor engine = new motor();

    // Câmbio de 5 velocidades + ré.
    int[] cambio = { 1, 2, 3, 4, 5, 0 };
    /*********************************************************************/
    
    
    // Metódos
    /*********************************************************************/
    public void liga()
    {
    	engine.mtLigado = true;
    } 
    
    public void acelera()
    {
    	acelerando = true;
    	
    	gasolina -= 1;
    }
    
    public void freia()
    {
        if (acelerando)
        {
        	acelerando = false;
        }
        else
        {
        	System.out.println("O carro já está parado\n");
        	return;
        }
    }
    
    public void pegaMarcha()
    {
    	// Acelerando e na ultima marcha.
    	if(acelerando && marcha == cambio.length - 1)
    	{
    		return;
    	}
    	// Acelerando e aumentando a marcha.
    	else if(acelerando && marcha != cambio.length - 1)
    	{
    		marcha += 1;
    	}
    	// Sem aceleração e na primeira marcha.
    	else if(acelerando == false && marcha == 1)
    	{
    		return;
    	}
    	// Sem aceleração em qualquer outra marcha.
    	else
    	{
    		marcha -= 1;
    	}
    	
    }
    
    public void abastecer()
    {
    	// O usuário escolhe quanto colocar.
    	if(gasolina < 60) // Tanque com menos de 60 litros.
    	{
    		System.out.println("O tanque ainda está com " + gasolina + 
    				" litros, quanto deseja abastecer?\nTamanho máximo permitido: 60 litros\n");
    		
    		@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
    		while( true ) 
    		{
    			int quantia = scanner.nextInt();
    			
    			if( gasolina + quantia <= 60)
    			{
    				gasolina = gasolina + quantia;
    				return;
    			}
    			else // Enquanto ultrapassar o tamanho do tanque não será possível o abastecimento!
    			{
    				System.out.println("Não há espaço suficiente no tanque, por favor ponha menos gasolina!\n");
    				continue;
    			}
    			
    		}
    		
    		
    	}
    	else // Tanque com 60 litros.
    	{
    		System.out.println("O Tanque está cheio!\n");
    	}
    }
    
    
    /*********************************************************************/


}