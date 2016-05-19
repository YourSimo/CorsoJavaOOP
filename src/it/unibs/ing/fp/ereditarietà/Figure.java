import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};

public abstract class Figure {
  Color penna = Color.black;
  tipiTratto spessore = tipiTratto.normale;
   
   public Figure() 
  {
	  //potenziali importanti azioni di inizializzazione
	  //...
	  System.out.println("costruttore figure");
  }
  
  abstract double perimetro();
  
  public Figure(Color c, tipiTratto tratto)
  {   this();
	  penna = c; spessore=tratto;
	  System.out.println("costruttore figure2");
  }
  
  //altre caratteristiche in comune a tutte le figure ...
  //......
  
}
