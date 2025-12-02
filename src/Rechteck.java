public class Rechteck {
	// Attribute
	private Punkt startpunkt;
	private double hoehe;
	private double breite;
	
	// Konstruktoren
	public Rechteck(Punkt start, double h, double b) {
		this.startpunkt = start;
		this.hoehe = h;
		this.breite = b;
	}
	
	public Rechteck(double xstart, double ystart, double h, double b) {
		this(new Punkt(xstart, ystart), h ,b);
	}
	
	// Methoden
	public Punkt getStartpunkt() {
		return this.startpunkt;
	}
	
	public double getHoehe() {
		return this.hoehe;
	}
	
	public double getBreite() {
		return this.breite;
	}
	
	
	public double berechneFlaeche() {
		return breite*hoehe;
	}
	
	public double berechneUmfang() {
		return (2*breite)+(2*hoehe);
	}
	
	
	public void versetzen(double xNeu, double yNeu) {
		this.startpunkt.versetzen(xNeu, yNeu);
	}
	
	public void verschieben(double dx, double dy) {
		this.startpunkt.verschieben(dx, dy);
	}
	
	
	public String toString() {
		return "h: "+this.hoehe+" b: "+this.breite;
	}
	
	public boolean equals(Rechteck r) {
		return (startpunkt.equals(r.startpunkt) && hoehe == r.getHoehe() && breite == r.getBreite());
	}
	
	// Zusatzaufgaben
	public String getEckpunkte() {
		// Starte unten links, oben links, oben rechts, unten rechts
		
		// Moeglichkeit die als Array oder so rueckzugeben
		Punkt UL = this.startpunkt;
		Punkt OL = new Punkt(this.startpunkt.getx(),this.startpunkt.gety()+hoehe);
		Punkt OR = new Punkt(this.startpunkt.getx()+breite, this.startpunkt.gety()+hoehe);
		Punkt UR = new Punkt(this.startpunkt.getx()+breite, this.startpunkt.gety());
		String ret = "Eckpunkte:"+
		OL.toString() + "----" + OR.toString()+
		"|\t\t|"+
		UL.toString() + "----" + UR.toString();
		
		return ret;
	}
	
    // 2. Spiegeln an der x-Achse
    public void spiegelnX() {
        double yNeu = -startpunkt.gety() - hoehe; 
        startpunkt.versetzen(startpunkt.getx(), yNeu);
    }

    // 3. Spiegeln an der y-Achse
    public void spiegelnY() {
        double xNeu = -startpunkt.getx() - breite;
        startpunkt.versetzen(xNeu, startpunkt.getx());
    }

    // 4. Testen, ob zwei Rechtecke gemeinsame Punkte haben
    public boolean schneidet(Rechteck r) {
        // einfache Achsen-parallele Rechteck-Kollision
        boolean keineUeberschneidung =
            startpunkt.getx() + breite < r.startpunkt.getx() ||
            r.startpunkt.getx() + r.breite < startpunkt.getx() ||
            startpunkt.gety() + hoehe < r.startpunkt.gety() ||
            r.startpunkt.gety() + r.hoehe < startpunkt.gety();

        return !keineUeberschneidung;
    }
}
