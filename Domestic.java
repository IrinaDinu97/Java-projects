public class Domestic extends Animal{
    
    public boolean deInterior;
    public boolean deExterior;
    public boolean inf;
    
    public boolean isDeInterior(){
        return this.deInterior;
    }
    
    public void setDeInterior(boolean deInterior){
        this.deInterior = deInterior;
    }
    
    public boolean isDeExterior(){
        return this.deExterior;
    }
    
    public void setDeExterior(boolean deExterior){
        this.deExterior = deExterior;
    }
    
    public Domestic(String nume, int varsta,boolean deInterior,boolean deExterior,boolean inf){
        
        if(inf==true){
            System.out.println("Animal de interior");
        }else {
            System.out.println("Animal de exterior");
        }
        this.nume=nume;
        this.varsta=varsta;
        this.deInterior=deInterior;
        this.deExterior=deExterior;
        
        }
        @Override
    public String toString(){
        return nume +" "+varsta+" "+deInterior+" "+deExterior;
    }       
}
        
        
    
    
    
    
   
    

