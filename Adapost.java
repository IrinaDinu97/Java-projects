import java.util.*;

public class Adapost {
    private Map<String, Animal> map = new HashMap<>();
    
    private Adapost() {
    }
    private static Adapost Singleton;
    
    public static Adapost getInstance() {
        if (Singleton == null) {
            Singleton = new Adapost();
        }
        return Singleton;
    }
    
    public void adaugaAnimal(Animal a) throws NameAlreadyExistsException {
        if(map.size() < 2) {
            map.put(a.nume, a);
        } else {
            throw new NameAlreadyExistsException();
        }
    }
    
    public void afiseaza_tipAnimal() {
        for (String nume : map.keySet()) {
            Animal a = map.get(nume);
            if(a instanceof Domestic) {
                System.out.println("Animal domestic!");
            } else if(a instanceof Salbatic) {
                System.out.println("Animal salbatic!");
            }
        }
    }
    
    public void afiseazaAnimale() {
        for (String nume : map.keySet()) {
            // "a" este valoarea asociata in map-ul "map" cheii "nume"
            Animal a = map.get(nume);
            System.out.println(a);
        }
    }
    
    public void afiseazaAnimaleDomestice() {
        for (String nume : map.keySet()) {
            Animal a = map.get(nume);
            if (a instanceof Domestic) {
                System.out.println(a);
            }
        }
    }
    
    public void afiseazaAnimaleSalbatice() {
        for (String nume : map.keySet()) {
            Animal a = map.get(nume);
            if (a instanceof Salbatic) {
                System.out.println(a);
            }
        }
    }
    
    public void afiseazaSortat() {
        Comparator<Animal> comp = (a1, a2) -> a1.varsta - a2.varsta;
        
        List<Animal> copy = new ArrayList<>();
        for (String nume : map.keySet()) {
            copy.add(map.get(nume));
        }
        
        Collections.sort(copy, comp);
        copy.forEach(System.out::println);//e->System.out.println(e)
    }
    
    public void adoptaAnimal(String nume) {
        map.remove(nume);// va sterge din "map" perechea cu cheia "nume"
    }
    
}

