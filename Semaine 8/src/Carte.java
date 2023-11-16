import java.util.ArrayList;

public class Carte {
    private ArrayList<Boisson> boissons;

    public Carte() {
        boissons = new ArrayList<>();
    }

    public boolean contient(Boisson boisson) {
        if (boisson == null) return false;
        for (Boisson boisson1 : boissons) {
            if (boisson1.equals(boisson)) return true;
        }
        return false;
    }

    public boolean ajouter(Boisson boisson) {
        if (boisson == null) return false;
        if (this.contient(boisson)) return false;
        boissons.add(boisson);
        return true;
    }

    public boolean retirer(Boisson boisson) {
        if (boisson == null) return false;
        if (!this.contient(boisson)) return false;
        boissons.remove(boisson);
        return true;
    }

    public int nombreDeBoissons() {
        return boissons.size();
    }

    @Override
    public String toString() {
        String texte = "Carte : \n";
        for (Boisson boisson : boissons) {
            texte += boisson+"\n";
        }
        return texte;
    }
}
