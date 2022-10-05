package datas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ExemploLocalDateTime {

	public static void main(String[] args) {

		ExemploLocalDateTime eldt = new ExemploLocalDateTime();
		// eldt.dataAtualDefinida();
		// eldt.diferencaDuasDatas();
		eldt.localDateTimeParaDate();
		eldt.dateParaLocalDateTime();
	}

	private void localDateTimeParaDate() {
		LocalDateTime dataAtual = LocalDateTime.now();
		Date data = Date.from(dataAtual.atZone(ZoneId.of("America/Sao_Paulo")).toInstant());
		System.out.println(data);
	}

	private void dateParaLocalDateTime() {
		Date agora = new Date();
		LocalDateTime database = agora.toInstant().atZone(/* Mesma coisa que fazer ZoneId.of("America/Sao_Paulo") */
		ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(database);
	}

	private void diferencaDuasDatas() {

		LocalDateTime primeiraData = LocalDateTime.of(2022, 10, 4, 0, 0, 0, 0);
		LocalDateTime segundaData = LocalDateTime.of(2022, 12, 4, 0, 0, 0, 0);

		long meses = primeiraData.until(segundaData, ChronoUnit.MONTHS);
		long dias = primeiraData.until(segundaData, ChronoUnit.DAYS);
		System.out.println("Diferença de meses: " + meses);
		System.out.println("Diferença de dias: " + dias);

	}

	private void dataAtualDefinida() {
		LocalDateTime dataBase = LocalDateTime.now();
		System.out.println(dataBase);

		dataBase = dataBase.withHour(0);
		dataBase = dataBase.withMinute(0);
		dataBase = dataBase.withSecond(0);
		dataBase = dataBase.withNano(0);

		dataBase = dataBase.withMonth(1);

		System.out.println(dataBase);

		LocalDateTime segundaData = LocalDateTime.of(2022, 10, 4, 0, 0, 0, 0);
		System.out.println(segundaData);

	}

}
