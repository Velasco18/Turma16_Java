package Entidades;

import java.util.Scanner;

public class Aviao {
	public String nomeFabricante;
    public String modelo;
    public String cor;
    
    public void nomeFabricante() {
    	Scanner leia = new Scanner(System.in);
    	System.out.println("Informe nome do fabricante");
		nomeFabricante = leia.next();
    }
    public void modelo() {
    	Scanner leia = new Scanner(System.in);
    	System.out.println("Informe Modelo do avi�o");
    	modelo = leia.next();
    }
    public void cor() {
    	Scanner leia = new Scanner(System.in);
    	System.out.println("Informe cor do avi�o");
    	cor = leia.next();
    }
    public void printarTela() {
    	System.out.println("\n nomeFabricante"+ nomeFabricante + " " +modelo+ " "+cor);
    }
    
   

}
