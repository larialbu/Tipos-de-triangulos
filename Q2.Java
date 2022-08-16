import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    int lado1;
	int lado2;
    int lado3;
    
        System.out.println("digite o primeiro lado: ");  
	    lado1 = myObj.nextInt();  // ler o 1 lado

	    System.out.println("digite o segundo lado:  ");  
	    lado2 = myObj.nextInt();  // ler o 2 lado
	    
	    System.out.println("digite o terceiro lado: ");  
	    lado3 = myObj.nextInt();  // ler o 3 lado
	    
	    if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
	        System.out.println("o tipo do seutriângulo é equilátero.");
	    }else if (lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1){
	       System.out.println("o tipo do seu triângulo é isóceles.");
	    }else {
	        System.out.println("o tipo do seu triângulo é escaleno.");
	    }
 }
}
