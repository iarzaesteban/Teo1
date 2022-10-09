package teo1JFlex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jflexteo1 {
	
	public static void main(String[] args) throws Exception {
		try {
            // TODO code application logic here
            FileReader f = new FileReader("C://Users/Esteban/Desktop/Universidad/TeoriaComputacion/PrimeraEntrega/Prueba.txt");
            Lexico Lexer = new Lexico(f);
            
            Lexer.next_token();
            System.out.println("LExer "+Lexer);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
			e.printStackTrace();
		}

	}

}
