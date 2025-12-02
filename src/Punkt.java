public class Punkt {
    
    private double x;
    private double y;
    
    public Punkt (double xWert, double yWert) {
        x = xWert;
        y = yWert;
    }
    
    
    public Punkt () {
        x = 0;
        y = 0;
    }
    
    
    public double getx () {
        return x;
    }
    
    public double gety () {
        return y;
    }
    
    
    public void versetzen (double xNeu, double yNeu) {
        x = xNeu;
        y = yNeu;
    }
    
    public void verschieben (double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }
    
    
    public String toString () {
        return "(" + x + ", " + y + ")";
    }
    
    
    public boolean equals (Punkt p) {
        return (x == p.x)&& ( y == p.y) ;
    }
    
    // Zusatzaufgaben
    public void spiegelnX() {
    	this.y = -this.y; // Einfach -y oder --y/y
    }
    
    public void spiegelnY() {
    	this.x = -this.x;
    }
    
    public static double abstandZumUrsprung(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    // Winkel zwischen x-Achse und Verbindungsgerade (Theta)
    public static double winkelZurXAchse(double x, double y) {
        return Math.atan2(y, x); // liefert den Winkel im richtigen Quadranten
    }

}