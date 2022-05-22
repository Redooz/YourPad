package model;

public interface CRUDInterface {
    public void read();
    public void updateById(String id);
    public void deleteById(String id);
}
