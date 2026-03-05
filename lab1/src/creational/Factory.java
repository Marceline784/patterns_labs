package creational;

public class Factory {

    public static String createAnimal(String type){

        if(type.equals("dog")){
            return "Dog created";
        }

        if(type.equals("cat")){
            return "Cat created";
        }

        return "Unknown animal";
    }

}