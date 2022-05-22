package model;

// A class that is used to create objects that represent a page.
public class Page {
    private String id,header,body,footer;

    public Page() {
        id = "";
        header = "";
        body = "";
        footer = "";
    }

    public Page(String id, String header, String body, String footer) {
        this.id = id;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public Page(String id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return this.footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return 
            "Id: " + getId() + "\n" +
            getHeader() + "\n" +
            getBody() + "\n" +
            getFooter() + "\n";
    }

    
}
