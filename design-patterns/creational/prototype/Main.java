package creational.prototype;

public class Main {
    
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession docProfession1 = ProfessionCache.getNewClProfession(1);
        System.out.println(docProfession1);

        Profession teacherProfession1 = ProfessionCache.getNewClProfession(2);
        System.out.println(teacherProfession1);

        Profession docProfession2 = ProfessionCache.getNewClProfession(1);
        System.out.println(docProfession2);
    }
    
}

