package model;

public interface CRUDInterface {
    public String read();
    public void updateById(String id);
    public void deleteById(String id);
}
