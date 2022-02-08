import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int entry = 0;
		Book bookGroup[] = new Book[5];
		
		bookGroup[0] = new Book("Histórias de fantasma", "João do túmulo", "Terror", "13/10/2013", 1);
		bookGroup[1] = new Book("Tartarugas da ilha de Java", "James Gosling", "Biologia", "23/05/1995", 2);
		bookGroup[2] = new Book("Como curar depressão com palito de dente e chiclete", "Cleber Coach", "Auto Ajuda", "01/04/2040", 3);
		bookGroup[3] = new Book("Amor de verão", "Zé Paixão", "Romance", "12/06/2018", 4);
		bookGroup[4] = new Book("O mistério do ponto e vírgula desaparecido", "Maria esquecida", "Mistério", "23/07/2015", 5);
		
		
		do {
			System.out.println("Olá, bem vindo à biblioteca universiatária");
			System.out.println("Lista de livros: ");
			System.out.println();
			
			for (int i = 0 ; i < bookGroup.length ; i++) {
				System.out.println(bookGroup[i].bookDatails());
				System.out.println("----------------------------------------");
			}
			
			System.out.println("----------------------------------------");
			System.out.println("1 para alugar / 2 para devolver / 0 para sair");
			entry = input.nextInt();
			
			if (entry == 1) {
				System.out.print("Escolha o número do livro na prateleira para alugar: ");
				entry = input.nextInt();
				bookGroup[entry - 1].rent();
			}
			else if (entry == 2) {				
				System.out.print("Escolha o número do livro na prateleira para devolver: ");
				entry = input.nextInt();
				bookGroup[entry - 1].giveBack();
			}
			
			
		} while (entry != 0);
		
		input.close();
	}
}
