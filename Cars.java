public class Cars {

    private String name;
    private String color;
    private int weight;
    private int maxspeed;

    public static void yourCar(){
        System.out.println("Ваша машина: ");
    }
    public Cars(String name, String color, int weight, int maxspeed){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.maxspeed = maxspeed;
        getCar();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void getCar(){
        System.out.println(name + " цвета " + color + " весом " + weight + " с максимальной скоростью " + maxspeed + ", все верно?");
    }

}
