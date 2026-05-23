import interf.ProfessionAbstractFatory;
import interf.TraineeProfessionAbstractFatory;

public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeProfessionAbstractFatory();
        } else {
            return new ProfessionAbstractFatory();
        }
    }
}
