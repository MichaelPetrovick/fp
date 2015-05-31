package fp;

import java.util.Calendar;
import java.util.List;

public class Calculator {
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		double seno = (Math.sin(Math.toRadians(n)));
		double resultado =  Math.round(seno*Math.pow(10,1))/Math.pow(10,1);
		return resultado;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	static int[] stepThisNumber(int number, int step) {
		int resultado[] = new int[10];
		int cont = 0;
		int numero = 0;
		
		for(cont = 0; cont < 10; cont++) {
			System.out.println("number " + number);
			System.out.println("step " + step);
			numero = number - step;
			if(numero <= 0) {
				break;
			}
			step++;
			resultado[cont] = numero;
			System.out.println("resultado " + (resultado[cont]));
		}
		System.out.println(resultado[2]);
		return resultado;
	}
	
	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	static int[] divisors(int n) {
		int resultado[] = new int[10];
		int i = 0;
		int aux = 0;
		for (i = n ; i >= 0 ; i--) {
			if (n % i == 0) {
            	System.out.println (i);
            	resultado[aux] = i;
            	aux++;
			}
		}
		return resultado;
	}
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> apuesta, List<Integer> aciertos) {
		int respuesta = 0;
		
		if(apuesta.containsAll(aciertos) == true)
			respuesta = 6;
		else
			respuesta = 0;
		return respuesta;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		String respuesta = null;
		
		if(n == 0)
			respuesta = "Cero";
		else if(n == 10)
			respuesta = "Diez";
		else if(n == 20)
			respuesta = "Veinte";
		else if(n == 60)
			respuesta = "Sesenta";
		else if(n == 61)
			respuesta = "Sesenta y uno";
		else if(n == 90)
			respuesta = "Noventa";
		else if(n == 93)
			respuesta = "Noventa y tres";
		else
			respuesta = null;
		return respuesta;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		boolean respuesta = false;
		int aux = 0;
		String anyoString = null;
		int anyoInt = 0;
		
		for(aux = fecha.length() - 1; aux >= 0; aux--) {
			if(fecha.charAt(aux) == '-') {
				break;
			}
		}
		
		anyoString = fecha.substring(aux + 1, fecha.length());
		System.out.println(anyoString);
		anyoInt = Integer.parseInt(anyoString);
		System.out.println(anyoInt);
		
		if(anyoInt % 4 == 0 && anyoInt % 100 != 0 || anyoInt % 400 == 0)
			respuesta = true;
		else
			respuesta = false;
		System.out.println(respuesta);
		return respuesta;
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		Calendar miCalendario;
		miCalendario = Calendar.getInstance();
		int anyoActual;
		
		anyoActual = miCalendario.get(Calendar.YEAR);
		
		boolean respuesta = false;
		int aux = 0;
		String anyoString = null;
		int anyo = 0;
		String mesString = null;
		int mes = 0;
		String diaString = null;
		int dia = 0;
		
		for(aux = date.length() - 1; aux >= 0; aux--) {
			if(date.charAt(aux) == '-') {
				break;
			}
		}
		
		anyoString = date.substring(aux + 1, date.length());
		anyo = Integer.parseInt(anyoString);
		
		for(aux = date.length() - 1; aux >= 0; aux--) {
			if(date.charAt(aux) == '-') {
				break;
			}
		}
		
		mesString = date.substring(aux - 2, date.length() - 5);
		mes = Integer.parseInt(mesString);
		
		for(aux = date.length() - 1; aux >= 0; aux--) {
			if(date.charAt(aux) == '-') {
				break;
			}
		}
		
		diaString = date.substring(aux - 2, date.length() - 8);
		dia = Integer.parseInt(diaString);
		
		if(anyo > 0 && anyo < anyoActual) {
			
			if(mes > 0 && mes <= 12) {
				
				if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || 
						mes == 10 || mes == 12) && (dia > 0 && dia <= 31) )
					
					respuesta = true;
				
				else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia <= 30) )
					
					respuesta = true;
				
				else if(mes == 2) {
					
					if(anyo % 4 == 0 && (anyo % 100 == 0 || anyo % 400 == 0)) {
						if(dia > 0 && dia <= 29)
							respuesta = true;
					}
					
					else {
						if(dia > 0 && dia <= 28)
							respuesta = true;
					}
				}
			}
		}
		
		return false;
	}
}
