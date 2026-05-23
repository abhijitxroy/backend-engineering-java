import interf.Profession;

public class Main {
    public static void main(String[] args) {
    
        Profession profession =  FactoryMethod.getProfession("devops");
        profession.work();
        
    }
}
