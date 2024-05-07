package pe.edu.certus.tps.ut;

public class Calculadora 
{
	public static double suma(double numero1, double numero2)
	{
		return (numero1+numero2);
	}
	
	public static double resta(double numero1, double numero2)
	{
		return (numero1-numero2);
	}
	
	public static double multiplicacion(double numero1, double numero2)
	{
		return (numero1*numero2);
	}
	
	public static double division(double numero1, double numero2)
	{
		return (numero1/numero2);
	}
	
	
	public static void main (String [] args)
	{
		Calculadora calculadora = new Calculadora();
		double suma = 0.0, resta = 0.0, multiplicacion = 0.0, division = 0.0;
		suma = calculadora.suma(10, 20);
		resta = calculadora.resta(10, 20);
		multiplicacion = calculadora.multiplicacion(10, 20);
		division = calculadora.division(10, 20);
		System.out.println("La suma es : "+suma+"\n"+
		                   "Resta: " + resta+"\n"+
						   "Multiplicación: " +multiplicacion+"\n"+
		                   "Division: " +division);
				
	}

}
