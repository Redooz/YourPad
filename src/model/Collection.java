package model;

import java.util.Stack;

/**
 * It's a collection of pads.
 */
public class Collection extends Component implements CRUDInterface {
    private Stack<Pad> pads;

    public Collection() {
        pads = new Stack<>();
    }

    public Collection(Stack<Pad> pads) {
        this.pads = pads;
    }
    
    @Override
    public void add(Component component){
        pads.add((Pad)component);
    }

    @Override
    // Reading the information of the pads in the collection.
    public String read() {
        String collectionInfo = "";
        for (Pad pad : pads) {
            collectionInfo += pad.read()+"\n\n-·-·-·-·-·-·-·-·-·-·-·-·-·-·-·-·\n";
        }
        return collectionInfo;
    }

    @Override
    // Updating the pad with the given id.
    public void updateById(String id, Component component) {
        if (component instanceof Page) {
            for (int i = 0; i < pads.size(); i++) {
                if (pads.get(i).getId() == id) {
                    pads.set(i, (Pad) component);
                }                          
            }
        }    
    }

    @Override
    // Deleting the pad with the given id.
    public void deleteById(String id, Component component) {
        if (component instanceof Pad) {
            for (int i = 0; i < pads.size(); i++) {
                if (pads.get(i).getId() == id) {
                    pads.remove(i);
                }                          
            }
        }
    }

    public Stack<Pad> getPads() {
        return this.pads;
    }

    public void setPads(Stack<Pad> pads) {
        this.pads = pads;
    }
    
}
