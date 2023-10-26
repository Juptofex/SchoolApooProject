import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Commande {
	private ArrayList<Article> articles;
	private LocalDate date;
	
	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<Article>();
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+" \n";

		for (Article a: articles) {
			infosCommande +="\n"+a;
		}
		infosCommande += "\n"+ "PRIX TOTAL = "+calculerPrixTotal();
		return infosCommande;
	}

	public void ajouter(Article a){
		articles.add(a);
	}

	public double calculerPrixTotal(){
		double prixTotal = 0;
		for (Article a: articles) {
			prixTotal += a.calculerPrixTVAComprise();
		}
		return prixTotal;
	}
}
