import java.util.Objects;

public class Article {
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;
	private static final int defaultTVA = 21;
	private static int nbrArticle = 0;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
		if (reference == null) throw new IllegalArgumentException("Reference invalide");
		if (reference.isEmpty()) throw new IllegalArgumentException("Reference invalide");
		if (nom == null) throw new IllegalArgumentException("Nom invalide");
		if (nom.isEmpty()) throw new IllegalArgumentException("Nom invalide");
		if (prixHTVA < 0) throw new IllegalArgumentException("Prix invalide");
		if (tauxTVA < 0 || tauxTVA > 100) throw new IllegalArgumentException("Taux TVA invalide");
		setTauxTVA(tauxTVA);
		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
		nbrArticle++;
	}
	
	public Article(String reference, String nom, String description, double prixHTVA) {
		this(reference,nom,description,prixHTVA,defaultTVA);
	}

	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}
	
	public void setPrixHTVA(double prixHTVA) {
		this.prixHTVA = prixHTVA;
	}

	public double getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public static int getNbrArticle() { return nbrArticle; }

	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Article article = (Article) o;
		return reference.equals(article.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
	}
}
