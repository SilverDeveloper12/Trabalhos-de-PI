package praticatriangulo;
import java.util.Scanner;

public class PraticaTriangulo{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int l1,l2,l3;
    System.out.print("Digite o valor do primeiro lado: ");
    l1 = input.nextInt();
    System.out.print("Digite o valor do segundo lado: ");
    l2 = input.nextInt();
    System.out.print("Digite o valor do terceiro lado: ");
    l3 = input.nextInt();
    
    if((l1 + l2 > l3) && (l2 + l3 > l1) && (l1 + l3 > l2)){
        System.out.print("E um triangulo! ");
        if((l1 == l2 ) && (l1 == l3) || (l2 == l3) && (l2 == l1) || (l3 == l1) && (l3 == l2)){
            System.out.println("do tipo equilatero");
            if((l1 == l2) && (l1 != l3) || (l2 == l3) && (l2 != l1) || (l3 == l2) && (l3 != l1)){
                System.out.println("do tipo isoceles");
            }
        
        }
    }else{
        System.out.println("Nao e um triangulo...");
    }
    
    }
}