public class RechteckTester {
    public static void main(String[] args) {
    	// Test mit Punkt -> Konstruktor
        Punkt p1 = new Punkt (5, 7);
        Rechteck r1 = new Rechteck(p1,3,4);
        System.out.println("Rechteck 1 erzeugt");
        System.out.println("Punkt p1: " + p1.toString());
        System.out.println("b/h: " + r1.toString());
        
        // TEst ohne Punkt Konstruktor
        Rechteck r2 = new Rechteck(2,4,3,4);
        System.out.println("Rechteck 2 erzeugt");
        System.out.println("Punkt p2: " + r2.getStartpunkt().toString());
        System.out.println("b/h: " + r2.toString());
        
        // Vergleiche r1 mit r2
        System.out.println("1. und 2. Punkt vergleichen: "); 
        if (r1 == r2) { 
        	System.out.println("r1 und r2 zeigen auf gleiches Rechteck-Objekt"); 
        } else { 
        	System.out.println("r1 und r2 zeigen auf verschiedene Rechteck-Objekte"); 
        }
        
        if (r1.equals(r2)) { 
        	System.out.println("r1 und r2 haben gleiche Koordinaten und Eigenschaften"); 
        } else { 
        	System.out.println("r1 und r2 haben verschiedenen Koordinaten und/oder Eigenschaften"); 
        }
        
        // Punkt 3
        Punkt p3 = new Punkt (6, 9);
        Rechteck r3 = new Rechteck(p3,3,4);
        System.out.println("Rechteck 3 erzeugt");
        System.out.println("Punkt p3: " + p3.toString());
        System.out.println("b/h: " + r3.toString());
        System.out.println("3. Punkt: " + p3.toString());
        p1.verschieben(1, 2);
        
        if (r1.equals(r3)) { 
        	System.out.println("r1 und r3 haben gleiche Koordinaten und Eigenschaften"); 
        } else { 
        	System.out.println("r1 und r3 haben verschiedenen Koordinaten und/oder Eigenschaften"); 
        }
        
        // Display und Ausgabe
        System.out.println("Erzeuge das Display-Fenster (400x500)...");
        Display1 anzeige = new Display1 (400, 500);
        
        System.out.println("r3 wird jetzt grafisch angezeigt.");
        anzeige.show(r3);
        

    }

}