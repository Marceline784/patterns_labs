package creational;

public class Builder {

    public House buildHouse(){

        House house = new House();
        house.walls = "Brick walls";
        house.roof = "Wood roof";

        return house;
    }

    public static class House{

        public String walls;
        public String roof;

    }

}