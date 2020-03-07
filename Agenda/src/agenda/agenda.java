package agenda;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.text.ParseException;


public class agenda {
	
	// data no formato dd/mm/aaaa.
	private GregorianCalendar calendario;
	private Date dataManipulavel;
	private TimeZone utc;
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); // objeto que ira formatar a data.
	
	// Anotacão associada a data.
	String reminder;
	
	// Construtor com passagem de string.
	public agenda(String data)
	{
		// tratamento de excessões.
		try {
			this.calendario = new GregorianCalendar(utc);
			this.calendario.setTime(formatador.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	
}
