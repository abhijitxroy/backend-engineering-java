package impl;

import interf.Profession;

public class Teacher implements Profession{

    @Override
    public void work() {
        System.out.println("Profession: Teacher");
    }
    
}
