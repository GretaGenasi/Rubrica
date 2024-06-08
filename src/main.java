import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Descrizione: Crea un programma che permetta di gestire una rubrica telefonica.
	 * Il programma dovrebbe consentire di aggiungere contatti, cercare contatti
	 * per nome e visualizzare tutti i contatti.
	 */
		
	Scanner sc = new Scanner(System.in);
	ArrayList<String> nomi = new ArrayList<String>();
	ArrayList<String> numeri = new ArrayList<String>();
	String risposta;

	while (true) {
		System.out.println("Menu:");
		System.out.println("1. Aggiungi contatto");
		System.out.println("2. Cerca contatto per nome");
		System.out.println("3. Visualizza tutti i contatti");
		System.out.println("4. Esci");
		System.out.print("Scegli un'opzione: ");
		int scelta = sc.nextInt();
		sc.nextLine(); // consuma il newline rimasto

		switch (scelta) {
		case 1:
			System.out.println("Inserisci il nome:");
			String nome = sc.nextLine();
			System.out.println("Inserisci il numero di telefono:");
			String numero = sc.nextLine();
			nomi.add(nome);
			numeri.add(numero);
			break;

		case 2:
			System.out.println("Inserisci il nome da cercare:");
			String nomeDaCercare = sc.nextLine();
			boolean trovato = false;
			for (int i = 0; i < nomi.size(); i++) {
				if (nomi.get(i).equalsIgnoreCase(nomeDaCercare)) {
					System.out.println("Nome: " + nomi.get(i) + ", Numero: " + numeri.get(i));
					trovato = true;
					break;
				}
			}
			if (!trovato) {
				System.out.println("Contatto non trovato.");
			}
			break;

		case 3:
			System.out.println("Tutti i contatti:");
			for (int i = 0; i < nomi.size(); i++) {
				System.out.println("Nome: " + nomi.get(i) + ", Numero: " + numeri.get(i));
			}
			break;

		case 4:
			System.out.println("Uscita dal programma.");
			sc.close();
			return;

		default:
			System.out.println("Opzione non valida. Riprova.");
			break;
		}
	}
}
}
