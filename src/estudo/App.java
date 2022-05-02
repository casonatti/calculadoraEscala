package estudo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class App {

	public static void main(String[] args) throws IOException {
		if(!Utils.calendarExists()) {
			System.out.println("Calendario inexistente... Criando novo calendario.");
			try {
				File calendarFile = new File("calendarFile.txt");
				if(calendarFile.createNewFile()) {
					Calendar calendar = Calendar.getInstance();
					calendar.set(2022, Calendar.JANUARY, 5); //Primeiro dia da letra D
			
					Utils.calculaPeriodo(calendar);
				} else {
					System.out.println("Falha ao criar o arquivo!");
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Calendario existe.");
		}
	}
}
