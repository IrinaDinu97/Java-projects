public abstract class Animal{
    public String nume;
    public int varsta;
    
   public String getNume(){
        return this.nume;
    }
   public void setNume(String nume){
        if (nume == null) {
            return;
        }
        this.nume = nume;
    } 
   public int getVarsta(){
       return this.varsta;
    
    }
   public void setVarsta(int varsta){
       this.varsta=varsta;
    
    }
   @Override
    public String toString(){
        return nume +" "+varsta;
    }
} 
