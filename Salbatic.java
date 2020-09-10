public class Salbatic extends Animal{
    
    public int grad;
   
    
    public int getGrad(){
       return this.grad;
    
    }
    public void setGrad(int grad){
       this.grad=grad;}
   
    
   public Salbatic(String nume,int varsta,int grad ) {
       if(grad==0){
        System.out.println("Animal salbatic pasnic");
    }else if(grad==5){
        System.out.println("Animal salbatic foarte periculos");
    }
        
        this.nume=nume;
        this.varsta=varsta;
        this.grad=grad;
    }
    @Override
    public String toString(){
        return nume +" "+varsta+" "+grad;
    }   
        
    
        
}
        
    

