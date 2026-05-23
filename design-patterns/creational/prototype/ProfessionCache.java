package creational.prototype;

import java.util.Hashtable;

public class ProfessionCache {
    
    private static Hashtable<Integer, Profession> map = new Hashtable<>();

    public static Profession getNewClProfession(int id){
        Profession cachedProfessionInstance = map.get(id);
        return (Profession) cachedProfessionInstance.cloneObject();
    }

    public static void loadProfessionCache(){
        Doctor doctor1 = new Doctor();
        doctor1.id = 1;
        map.put(doctor1.id, doctor1);


        Teacher teacher1 = new Teacher();
        teacher1.id = 2;
        map.put(teacher1.id, teacher1);

        
    }
}
