public class Koffer
{
   private String farbe;
   private int volumen;
   private boolean abschliessbar;
   
   public Koffer(String  neuFarbe, int neuVolumen, boolean neuAbschliessbar)
   {
       setFarbe(neuFarbe);
       setVolumen(neuVolumen);
       setAbschliessbar(neuAbschliessbar);
   }
   
   public Koffer()
   {
       setFarbe("UNKN");
       setVolumen(0);
       setAbschliessbar(false);
   }
   
   public String getFarbe()
   {
       return farbe;
   }
   
   public int getVolumen()
   {
       return volumen;
   }
   
   public boolean getAbschliessbar()
   {
       return abschliessbar;
   }
   
   public void setFarbe(String neuFarbe)
   {
       farbe = neuFarbe;
   }
   
   public void setVolumen(int neuVolumen)
   {
       volumen = neuVolumen;
   }
   
   public void setAbschliessbar(boolean neuAbschliessbar)
   {
       abschliessbar = neuAbschliessbar;
   }

    
    
    
    
    
}
