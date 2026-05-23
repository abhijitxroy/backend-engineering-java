package creational.prototype;

public abstract class Profession implements Cloneable{
    
    public int id;
    public String name;

    abstract void show();

    public Object cloneObject(){

        Object cloneObject = null;
        try{
            cloneObject = super.clone();
        }catch(CloneNotSupportedException ex){
            ex.getMessage();
        }
       return cloneObject;
    }

}
