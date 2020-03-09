package agenda;

// Authorship: Tiago Onofre

import agenda.pagina;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class agenda {
	
	private LinkedList<pagina> caderno;
	// data no formato dd/mm/aaaa.
	
	// index para controlar as datas.
	private static int index;
	
	
	// --------- Construtor comum. ----------
	public agenda()
	{
		caderno = new LinkedList<pagina>();
		index = 0;
	}
	// --------------------------------------
	
	
	// ------------ adicionar lembrete a list da agenda. ---------------
	public void novoLembrete(String data) throws Exception
	{
		this.caderno.add(index, new pagina( data ) );
		
		//caderno.get(index).printer();
		
	}
	// -----------------------------------------------------------------
	
	public void print()
	{
		System.out.println("| Agenda compromissos");
		
		for( pagina p : caderno )
		{
			p.printer();
		}
		
	}
	//-------------------------------------------------------------------

	
}
