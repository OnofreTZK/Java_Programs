package agenda;

// Authorship: Tiago Onofre

import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;



class pagina {
	
	private GregorianCalendar data;
	private String recado;
	
	// formatador
	private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); // objeto que ira formatar a data.
	
	// --------- string do lembrete. ---------
		private String novaAnotacao()
		{
			@SuppressWarnings("resource")
			Scanner lapis = new Scanner(System.in);
			
			System.out.println("Anotação: ");
			
			return lapis.nextLine();
			
		}
	// --------------------------------------
	
	public pagina( String data ) throws Exception // Exceção do parser
	{
		try {
			this.data = new GregorianCalendar();
			this.data.setTime(formatador.parse(data)); // formatando a data
			
			if( this.data.before(new GregorianCalendar()) ) // verificando se a data é válida.
			{
				System.out.println("Data inválida! por favor informe uma data futura.");
				System.exit(1);
			}
			
		} catch( ParseException e) {
			throw new Exception("Data inválida! por favor informe no formato dd/mm/yyyy");
		}
		
		this.recado = this.novaAnotacao(); // cadastrando o recado.
	}
	
	public void printer() // imprimindo agenda com lembretes.
	{
		System.out.println("| " + this.formatador.format(this.data.getTime()) + " | " + this.recado + " | ");
	}

}
