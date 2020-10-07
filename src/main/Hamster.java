import java.util.ArrayList;
import java.util.List;

public class Hamster {
    protected String name;
    protected Burrow burrow;
    protected boolean isPet;
    HamsterSpecie hamsterSpecie;
    List <String> likesFood=new ArrayList<>();

    public Hamster(String name, boolean isPet, HamsterSpecie hamsterSpecie) {
    this.name=name;
    this.isPet=isPet;
    this.hamsterSpecie=hamsterSpecie;
    }

    public Hamster(String name, Burrow burrow) {
    this.name=name;
    this.burrow=burrow;
    }

    public String greet() {
        return name + (isPet? " is a pet " : " is a wild ") + hamsterSpecie + " hamster. ";
    }

    public String description() {
    if (likesFood.size()==0){
    return greet() + name + " doesn't like any food.";
    }
    if(likesFood.size()==1){
        return greet() + name + " likes " +  likesFood.size() + " type of food.";
    }
        return greet() + name + " likes " +  likesFood.size() + " types of food.";
    }

    public String getBurrowPosition()
    {

        return name + " has a burrow at longitude " + burrow.getLng() + " and latitude " + burrow.getLat();

    }
      public void setName(String name) {
        this.name = name;
    }
    public void setBurrow(Burrow burrow) {
        this.burrow =burrow;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setLikesFood(List<String> likesFood) {
        this.likesFood=likesFood;
    }

    public List<String> getLikesFood() {

        return likesFood;
    }
}

