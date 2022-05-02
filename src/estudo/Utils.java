package estudo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
	public static void calculaPeriodo(Calendar calendar) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		data = calendar.getTime();
		int trab4 = 0;
		int folga2 = 0;
		int trab6 = 0; 
		int folga4 = 0;
		
		try {
			FileWriter fileWriter = new FileWriter("calendarFile.txt");
			
			while(calendar.get(Calendar.YEAR) != 2023) {
				for(trab4 = 1; trab4 <= 4; trab4++) {
					System.out.println("[" + sdf.format(data) + "] : T" + "(" + trab4 + ")");
					fileWriter.write("[" + sdf.format(data) + "] : T" + "(" + trab4 + ")\n");
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					data = calendar.getTime();
				}
				
				for(folga2 = 1; folga2 <= 2; folga2++) {
					System.out.println("[" + sdf.format(data) + "] : F" + "(" + folga2 + ")");
					fileWriter.write("[" + sdf.format(data) + "] : F" + "(" + folga2 + ")\n");
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					data = calendar.getTime();
				}
				
				for(trab6 = 1; trab6 <= 6; trab6++) {
					System.out.println("[" + sdf.format(data) + "] : T" + "(" + trab6 + ")");
					fileWriter.write("[" + sdf.format(data) + "] : T" + "(" + trab6 + ")\n");
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					data = calendar.getTime();
				}
				
				for(folga4 = 1; folga4 <= 4; folga4++) {
					System.out.println("[" + sdf.format(data) + "] : F" + "(" + folga4 + ")");
					fileWriter.write("[" + sdf.format(data) + "] : F" + "(" + folga4 + ")\n");
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					data = calendar.getTime();
				}
			}
			
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean calendarExists() {
		File calendarFile = new File("calendarFile.txt");
		
		//System.out.println("Entrei em Utils -> calendarExists() -> [" + calendarFile.exists() + "]");
		
		return calendarFile.exists();
	}
}
