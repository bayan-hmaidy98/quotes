package quotes;

public class Quotes {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String author;
    String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
