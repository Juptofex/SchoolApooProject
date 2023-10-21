
public class CercleDansLePlan {
	private double rayon;
	private Point centre;
	
	public CercleDansLePlan(double rayon, Point centre) {
		this.rayon = rayon;
		this.centre = centre;
	}

	public CercleDansLePlan(Point centre){
		this.rayon = 1.0;
		this.centre = centre;
	}

	public CercleDansLePlan(){
		rayon = 1.0;
		Point centre0 = new Point(0,0);
		centre = centre0;

	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public String toString() {
		return "Cercle de rayon : " + rayon + " de centre " + centre;
	}
	

}
