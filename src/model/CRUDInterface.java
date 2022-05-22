package model;

public interface CRUDInterface {
    public void add(Component component);
    public String read();
    public void updateById(String id, Component component);
    public void deleteById(String id, Component component);
}
