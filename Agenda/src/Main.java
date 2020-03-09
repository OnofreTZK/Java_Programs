// Project: Agenda
// Authorship: Tiago Onofre

import agenda.agenda;

import java.util.Scanner;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws Exception {
		
		agenda novaAgenda = new agenda();
		
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Informe uma data: ");
		
		novaAgenda.novoLembrete(terminal.nextLine());
		
		novaAgenda.print();
		

	}

}
