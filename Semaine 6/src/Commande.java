import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Commande {
	private ArrayList<LigneDeCommande> articles;
	private LocalDate date;
	
	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<>();
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+" \n";

		for (LigneDeCommande l: articles) {
			infosCommande +="\n"+l;
		}
		infosCommande += "\n"+ "PRIX TOTAL = "+calculerPrixTotal();
		return infosCommande;
	}

	public void ajouter(Article a){
		LigneDeCommande l = new LigneDeCommande(a);
		if(articles.contains(l)){
			for (LigneDeCommande ligne: articles) {
				if (ligne.equals(l)){
					int q = ligne.getQuantite()+1;
					ligne.setQuantite(q);
				}
			}
		}else {
			articles.add(l);
		}
	}

	public void ajouter(Article a, int qtt){
		LigneDeCommande l = new LigneDeCommande(a);
		if(articles.contains(l)){
			for (LigneDeCommande ligne: articles) {
				if (ligne.equals(l)){
					int q = ligne.getQuantite()+qtt;
					ligne.setQuantite(q);
				}
			}
		}else {
			articles.add(l);
		}
	}

	public double calculerPrixTotal(){
		double prixTotal = 0;
		for (LigneDeCommande l: articles) {
			prixTotal += l.prixTotal();
		}
		return prixTotal;
	}
}
