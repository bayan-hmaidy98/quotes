package quotes;

public class ApiQuotes {
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ApiQuotes(String author, String body) {
        this.author = author;
        this.body = body;
    }

    String author;
    String body;
}
