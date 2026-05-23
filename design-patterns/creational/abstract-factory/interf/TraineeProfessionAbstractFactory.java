package interf;

import AbstractFactory;
import impl.TraineeTeacher;
import impl.TranieeEngineer;

public class TraineeProfessionAbstractFatory extends AbstractFactory{

    @Override
    public Profession getProfession(String professionType) {
        if (professionType == null)
            return null;

        if (professionType.equalsIgnoreCase("Trainee Engineer")) {
            return new TranieeEngineer();
        } else if (professionType.equalsIgnoreCase("Trainee Teacher")) {
            return new TraineeTeacher();
        }
        return null;

    }
    
}
