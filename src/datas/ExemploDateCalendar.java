package datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ExemploDateCalendar {
	
	public static void main(String[] args) {
		
		ExemploDateCalendar edc = new ExemploDateCalendar();
		
		//edc.exibirDataAtualUm();
		//edc.exibirDataAtualUmInternacional();
		//edc.exibirDataAtualDois();
		//edc.exibirDataAtualTres();
		//edc.stringParaData();
		//edc.diferencaDuasDatas();
		//edc.setarDataHora();
		
	}
	
	private void setarDataHora() {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar c = Calendar.getInstance();
		
		System.out.println(df.format(c.getTime()));
		
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		System.out.println(df.format(c.getTime()));
	}

	private void diferencaDuasDatas() {
		
		
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date d1 = df.parse("01/03/2020");
			System.out.println(d1);
			
			Date d2 = df.parse("04/10/2022");
			System.out.println(d2);
			
			long dt = (d2.getTime()-d1.getTime());
			System.out.println("Qtd dias: "+dt/86400000L);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void stringParaData() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date date = sdf.parse("04/10/2022");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void exibirDataAtualTres() {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data/Hora atual: "+calendar.getTime());
		System.out.println("Ano: "+calendar.get(Calendar.YEAR));
		System.out.println("Mês: "+(calendar.get(Calendar.MONTH)+1));
		System.out.println("Quantas semans tem o mês: "+calendar.WEEK_OF_MONTH);
		System.out.println("Semana do ano: "+calendar.WEEK_OF_YEAR);
		
	}

	private void exibirDataAtualDois() {
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf2.format(data));
		
	}

	private void exibirDataAtualUmInternacional() {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		Locale brasil = new Locale("pt","BR");//Transforma para o padrão br.
		Locale eua = Locale.US;
		Locale italia = Locale.ITALIAN;
		
		DateFormat dfBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("Data e hora brasileira: "+ dfBrasil.format(data));
		
		DateFormat dfEUA = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println("Data e hora EUA: "+ dfEUA.format(data));
		
		DateFormat dfITA = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println("Data e hora EUA: "+ dfITA.format(data));
		
		
		
	}

	private void exibirDataAtualUm() {
		
		Date data = new Date();
		
		//Exibe a data em milisegundos
		System.out.println(data.getTime());
		
		//Formata a data
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: "+formataData.format(data));
		
		//Formata a hora
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: "+hora.format(data));
		
		//Formatar data e hora
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.println("Data e hora: "+dtHora.format(data));
		
		//Data completa
		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data brasileira: "+dfFull.format(data));
		
		//Data sem o dia descrito
		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia descrito: "+dfLong.format(data));
		
		//Data resumida 1
		DateFormat dfResumida1= DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data resumida1 : "+dfResumida1.format(data));
		
		//Data resumida 2
		DateFormat dfResumida2= DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data resumida2 : "+dfResumida2.format(data));
		
		
	}
	
	
}
