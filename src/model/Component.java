package model;

public class Component{
    protected String id;

    public Component() {
        id = "";
    }

    public Component(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: "+ getId() + "\n";
    }

}