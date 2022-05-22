package model;

import java.util.ArrayList;

/**
 * Pad is a class that represents a pad with a title and a list of pages
 */
public class Pad extends Component implements CRUDInterface{
    private String title;
    private ArrayList<Page> pages;

    public Pad() {
        super();
        title = "";
        pages = new ArrayList<>();
    }

    public Pad(String id, String title, ArrayList<Page> pages) {
        super(id);
        this.title = title;
        this.pages = pages;
    }

    @Override
    // Adding a page to the pad.
    public void add(Component component){
        pages.add((Page)component);
    }

    @Override
    // A method that returns a String with the information of the pad.
    public String read() {
        String padInfo = title+"\n";
        for (Page page : pages) {
            padInfo += page.toString()+"\n\n-·-·-·-·-·-·-·-·-·-·-·-·-·-·-·-·\n";
        }

        return padInfo;
    }

    @Override
    // Updating the page with the given id.
    public void updateById(String id, Component component) {
        if (component instanceof Page) {
            for (int i = 0; i < pages.size(); i++) {
                if (pages.get(i).getId() == id) {
                    pages.set(i, (Page) component);
                }                          
            }
        }
    }

    @Override
    // Deleting a page from the pad with the given id.
    public void deleteById(String id, Component component) {
        if (component instanceof Page) {
            for (int i = 0; i < pages.size(); i++) {
                if (pages.get(i).getId() == id) {
                    pages.remove(i);
                }                          
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Page> getPages() {
        return this.pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

}
