package creational;

public class AbstractFactory {

    public Button createButton(String type){

        if(type.equals("windows")){
            return new Button("Windows Button");
        }

        return new Button("Mac Button");
    }

    public static class Button{

        String name;

        public Button(String name){
            this.name = name;
        }

        public void paint(){
            System.out.println(name);
        }

    }

}