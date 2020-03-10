package carro;

/*
 * Author: Tiago Onofre
 * Atv: Classe carro
 */

import carro.carro;

public class Main
{
    public static void main( String[] args )
    {
    	// GOL
    	carro c1 = new carro();
    	c1.tipo = "Gol";
    	c1.cor = "Vermelho";
    	c1.placa = "QGU-8695";
    	c1.numPortas = 4;
    	
    	// HILUX
    	carro c2 = new carro();
    	c2.tipo = "Hilux";
    	c2.cor = "Marrom";
    	c2.placa = "UJH-3490";
    	c2.numPortas = 4;
    	
    	// FREELANDER 2
    	carro c3 = new carro();
    	c3.tipo = "Freelander 2";
    	c3.cor = "Azul Perolado";
    	c3.placa = "OKA-2192";
    	c3.numPortas = 4;

    	// Acionando metódos.
    	
    	// Testando as variavéis antes dos metódos.
    	if(c1.engine.mtLigado) // Verificando se o motor está desligado.
    	{
    		return;
    	}
    	
    	System.out.println("1.1 >> O tanque do " + c1.tipo +
    					   " possui " + c1.gasolina +
    					   " litros e o motor está desligado na " + c1.marcha +
    					   " marcha");
    	
    	// 1 - Verificando a aceleração pré metódo.
    	if(!c1.acelerando)
    	{
    		System.out.println("1.2 >> O veiculo está sem aceleração");
    	}
    	else
    	{
    		return;
    	}
    	
    	c1.acelera();
    	
    	// 2 - Verificando a aceleração pos metódo.
    	if(c1.acelerando)
    	{
    		System.out.println("2.1 >> Veiculo está acelerando! portando seu tanque não está mais cheio: " + c1.gasolina +
    				           " litros.");
    	}
    	else
    	{
    		return;
    	}
    	
    	//---------------------------------------------------------------------------------------------------------------------
    	
    	
    	// verificação da marcha.
    	System.out.println("2.1 >> Com a aceleração a troca de marcha é necessária! marcha atual: " + c1.marcha );
    	
    	c1.pegaMarcha();
    	
    	System.out.println("2.2 >> A marcha foi passada! marcha atual: " + c1.marcha);
    	//---------------------------------------------------------------------------------------------------------------------
    	
    	
    	// Verificação do freio e da redução de marcha.
    	System.out.println("3.1 >> O carro está em aceleração e será parado! marcha atual: " + c1.marcha);
    	
    	c1.freia();
    	c1.pegaMarcha();
    	
    	if(!c1.acelerando)
    	{
    		System.out.println("3.2 >> O veiculo está sem aceleração e sua marcha atual é: " + c1.marcha);
    	}
    	else
    	{
    		return;
    	}
    	
    	
    	//---------------------------------------------------------------------------------------------------------------------
    	
    	
    	//Verificação do abastecimento e da troca de oleo.
    	
    	System.out.println("4.1 >> Teste de abastecimento, tanque atual: " + c1.gasolina);
    	
    	c1.abastecer();
    	
    	System.out.println("4.1 >> Tanque apos abastecimento: " + c1.gasolina);
    	
    	System.out.println("4.2 >> Aproveitando a passagem no posto realizaremos a troca do oleo! trocas atuais: " + c1.engine.oleoMotor);
    	
    	c1.engine.trocaOleo();
    	
    	System.out.println("4.3 >> Oleo trocado! trocas atuais: " + c1.engine.oleoMotor);
    	//---------------------------------------------------------------------------------------------------------------------
    	
    	System.out.println("5.0 >> Testes finalizados!");

    }
}