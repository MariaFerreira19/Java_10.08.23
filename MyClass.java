import java.util.Scanner;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
      double R, C, A, V;
      //ent é um objeto (instância de uma classe) da classe Scanner
      Scanner ent = new Scanner(System.in);
      System.out.println("Comprimento, área e volume de um círculo");
      System.out.println("Digite o valor do raio da esfera: ");
      //Leitura da variável feita com objeto ent da classe Scanner
      R = ent.nextDouble(); //Converte a float
      //Math.pow(R,2) = R², Math.pow(R,3) = R³, Math.pi = 3,1415...
      C = 2 * Math.PI * R;
      A = Math.PI * Math.pow(R,2);
      V = (4/3) * Math.PI * Math.pow(R,3);
      System.out.printf("\nComprimento = %.2f", C);
      System.out.printf("\nÁrea = %.2f", A);
      System.out.printf("\nVolume = %.2f", V);
    }  
}