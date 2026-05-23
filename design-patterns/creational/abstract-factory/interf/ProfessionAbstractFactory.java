package interf;

import impl.Engineer;
import impl.Teacher;

public class ProfessionAbstractFatory extends AbstractFactory {

    @Override
    public Profession getProfession(String professionType) {
        if (professionType == null)
            return null;

        if (professionType.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (professionType.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }
        return null;

    }

}
