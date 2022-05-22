package model;

public interface CRUDInterface {
    public String read();
    public void updateById(String id, Component component);
    public void deleteById(String id, Component component);
}
