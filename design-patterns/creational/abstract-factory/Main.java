import interf.AbstractFactory;
import interf.Profession;

public class Main {

    public static void main(String[] args) {
        
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession engg = abstractFactory.getProfession("Trainee Engineer");

        engg.work();
    }
    }
