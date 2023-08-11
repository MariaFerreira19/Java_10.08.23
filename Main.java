import java.util.Scanner;
//Scanner é a classe do Java utilizada para ler variáveis via console
public class Main
{
	public static void main(String[] args) {
	    double preco_prod, aumento, novo_preco;
	    Scanner ent = new Scanner(System.in);
		System.out.println("Preço e classificação de produto");
		System.out.println("Digite o preço do produto: ");
		preco_prod = ent.nextDouble ();
		if(preco_prod <= 50){aumento = 0.05 * preco_prod; }
		else if (preco_prod <= 100){aumento = 0.10 * preco_prod; }
		    else { aumento = 0.15 * preco_prod; }
		novo_preco = preco_prod + aumento;
		if (novo_preco <= 80){System.out.println ("Novo preço - R$" + novo_preco +
		" - BARATO");}
		else if(novo_preco <= 120){
		    System.out.println("Novo preço - R$" + novo_preco +
		" - NORMAL");}
		else if(novo_preco <= 200){
		    System.out.println("Novo preço - R$" + novo_preco +
		" - CARO");}
	}
}
