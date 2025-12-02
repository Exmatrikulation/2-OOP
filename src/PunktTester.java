public class PunktTester {
    public static void main(String[] args) {
        Punkt p1 = new Punkt (5, 7);
        System.out.println("Punkt 1 erzeugt");
        System.out.println("x = " + p1.getx());
        System.out.println("y = " + p1.gety());
        
        Punkt p2 = new Punkt (0, 0);
        System.out.println("Punkt 2 erzeugt");
        System.out.println("x = " + p2.getx());
        System.out.println("y = " + p2.gety());
        
        System.out.println("2. Punkt: " + p2.toString());
        
        p2.versetzen (3, 3);
        System.out.println("2. Punkt: " + p2.toString());
        p2.verschieben(2 ,4);
        System.out.println("2. Punkt: " + p2.toString());
        
        System.out.println("1. und 2. Punkt vergleichen: "); 
        if (p1 == p2) { 
        	System.out.println("p1 und p2 zeigen auf gleiches Punkt-Objekt"); 
        } else { 
        	System.out.println("p1 und p2 zeigen auf verschiedene Punkt-Objekte"); 
        }
        
        if (p1.equals(p2)) { 
        	System.out.println("p1 und p2 haben gleiche Koordinaten"); 
        } else { 
        	System.out.println("p1 und p2 haben verschiedenen Koordinaten"); 
        }
        
        Punkt p3 = new Punkt (6, 9);
        System.out.println("3. Punkt: " + p3.toString());
        p1.verschieben(1, 2);
        
        if (p1.equals(p3)) { 
        	System.out.println("p1 und p3 haben gleiche Koordinaten"); 
        } else { 
        	System.out.println("p1 und p3 haben verschiedenen Koordinaten"); 
        }
        
        
        System.out.println("Erzeuge das Display-Fenster (400x500)...");
        Display anzeige = new Display (400, 500);
        
        System.out.println("p3 (6, 9) wird jetzt grafisch angezeigt.");
        anzeige.show(p3);
        

    }

}