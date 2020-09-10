import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        Adapost adapost = Adapost.getInstance();
        
        while(true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+"); 
                
                switch (input[0].toUpperCase()) {
                    case "ADAUGA_ANIMAL" : adauga(input); break;
                    case "AFIS TIP_ANIMAL" : adapost.afiseaza_tipAnimal(); break;
                    case "AFIS" : adapost.afiseazaAnimale(); break;
                    case "AFIS_DOMESTICE" : adapost.afiseazaAnimaleDomestice(); break;
                    case "AFIS_SORT" : adapost.afiseazaSortat(); break;
                    case "ADOPTA" : adapost.adoptaAnimal(input[1]); break;
                    case "EXIT" : System.exit(0); break;
                    default : System.err.println("Comanda este invalida");
                }
            
            } catch (Exception e) {
                System.err.println(e);
            }
        }    
    }
    
   
    private static void adauga(String [] input) throws NameAlreadyExistsException {
        String tip = input[1];
        String nume = input[2];
        int varsta = Integer.parseInt(input[3]);
        
        
       
         if (tip.equalsIgnoreCase("animalDomestic")) {
            boolean deInterior = Boolean.parseBoolean(input[4]);
            boolean deExterior = Boolean.parseBoolean(input[5]);
            boolean inf = Boolean.parseBoolean(input[6]);
            Adapost.getInstance().adaugaAnimal(new Domestic(nume ,varsta, deInterior,deExterior,inf));
        } else if (tip.equalsIgnoreCase("animalSalbatic")) {
            int grad = Integer.parseInt(input[7]);
            Adapost.getInstance().adaugaAnimal(new Salbatic(nume, varsta,grad));
        }
    }
}

