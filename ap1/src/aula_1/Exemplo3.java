
package aula_1;
import java.util.Scanner;

public class Exemplo3 {

      public static void main(String[] args){
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
                
             
        String nome;
        float n1,n2,n3,media;
    
            //processamento de dados
        System.out.println("*-- Calculadora Simples --*");
        System.out.println("-----------------------------");
        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = entrada.nextFloat();
        
        media = (n1+n2+n3)/3;
        
       //saida de dados 
        
        System.out.print("Senhor " + nome );
        System.out.println(" a sua media e:  " + media );
        
        
      }
    
}
