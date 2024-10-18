public class Gem implements gameObject{
    private String name;

    public Gem(String name) {
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

}
