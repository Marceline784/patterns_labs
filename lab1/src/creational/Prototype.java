package creational;

public class Prototype implements Cloneable{

    public String name;

    public Prototype(String name){
        this.name = name;
    }

    public Prototype clone(){

        try{
            return (Prototype) super.clone();
        }
        catch(Exception e){
            return null;
        }

    }

}