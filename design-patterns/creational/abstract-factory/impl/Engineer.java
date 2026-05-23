package impl;

import interf.Profession;

public class Engineer implements Profession{

    @Override
    public void work() {
        System.out.println("Profession: Engineer");
    }
    
}
