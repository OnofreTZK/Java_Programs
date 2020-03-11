package list1_exe1_pessoa;

/*
 * Authorship: Tiago Onofre
 * Quest: 1
 */

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DecimalFormat;

public class Pessoa {

	/* ---------- Atributtes ---------- */
	// Complete name;
	private String personName;
	
	// Birth date in format dd/mm/yyyy
	private GregorianCalendar birthDate;
	
	// to format gregorian calendar date.
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
	
	// Precision height in meters.
	private double height;
	
	
	/* ------------ Methods ----------- */
	
	public void setBirthDate( String data ) throws Exception
	{	
		try {
			this.birthDate = new GregorianCalendar();
			this.birthDate.setTime(formatter.parse(data)); // formatting data
			
		} catch( ParseException e) {
			throw new Exception("Invalid data! please use format dd/mm/yyyy");
		}
		
	}
	
	
	public void setHeight ( double height )
	{	
		this.height = height;
	}
	
	
	public void setName ( String name )
	{
		this.personName = name;
	}
	
	
	public String getBirthDate()
	{
		return this.formatter.format(this.birthDate.getTime());
	}
	
	
	public double getHeight()
	{
		
		
		return this.height; 
	}
	
	
	public String getName()
	{
		return this.personName;
	}
	
	public int getAge()
	{
		// Creating a date with current year.
		GregorianCalendar currentYear = new GregorianCalendar();
		return ( currentYear.get(GregorianCalendar.YEAR) - this.birthDate.get(GregorianCalendar.YEAR) ) - 
				( this.birthDate.get(GregorianCalendar.MONTH) );
	}
	
	public void printInfo()
	{
		// formatting double number
		DecimalFormat fmtHeight = new DecimalFormat("#.##");
		
		System.out.println("|Name: " + this.personName + 
						   "\n|Birth: " + formatter.format(this.birthDate.getTime()) +
						   "\n|Height: " + fmtHeight.format(this.height) +
						   "\n|Age: " + this.getAge());
		
		// Saving this for future!
		//System.out.println(this.birthDate.get(GregorianCalendar.YEAR));
	}
	
}

