package pe.edu.certus.tps.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.edu.certus.tps.ut.Calculadora;

public class CalculadoraTest 
{
	
	private final Calculadora calculadora = new Calculadora();
	private static double numero1 = 20;
	private static double numero2 = 40;
	
	
	@BeforeAll
	public static void primeroTodo()
	{
		System.out.println("Inició a las " + new Date());
		System.out.println("Cargar los números "+"\n Número 1 = " + numero1 +"\n Numero 2 = "+numero2);
	}
	
	@BeforeEach
	public  void antesCadaPrueba()
	{
		System.out.println("Realizar cada operación");
		
	}
	
	@AfterEach
	public  void despuesCadaPrueba()
	{
		System.out.println("Después de cada operación");
		
	}
	
	@AfterAll
	public static void despuesTodo()
	{
		System.out.println("Finalizó a las " + new Date());
	}
	
	
	@Test
	public void restaTest()
	{
		assertEquals(-20, calculadora.resta(numero1, numero2));
	}
	
	@Test
	public void multiplicaTest()
	{
		assertEquals(800, calculadora.multiplicacion(numero1, numero2));
	}
	
	@Test
	public void divisionTest()
	{
		assertEquals(0.5, calculadora.division(numero1, numero2));
	}
	
	
	@Test
	public void sumaTest()
	{
		assertEquals(20, calculadora.suma(numero1, numero2));
	}
	
	

}
