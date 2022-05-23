package model;

/**
 * A class that is used to create objects that represent a page.
 */
public class Page extends Component{
    private String header,body,footer;

    public Page() {
        super();
        header = "";
        body = "";
        footer = "";
    }

    public Page(String id, String header, String body, String footer) {
        super(id);
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public Page(String id, String header, String body) {
        super(id);
        this.header = header;
        this.body = body;
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
    public String read() {
        return 
            super.toString() +
            getHeader() + "\n" +
            getBody() + "\n" +
            getFooter() + "\n";
    }

    
}
