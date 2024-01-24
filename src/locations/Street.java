package locations;

public class Street extends Location{
    private Tree tree;
    public Street(){
        super("Улица");
        tree = new Tree(20);
    }
    public Tree getTree(){
        return tree;
    }

    @Override
    public String toString(){
        return "улицу";
    }
}



