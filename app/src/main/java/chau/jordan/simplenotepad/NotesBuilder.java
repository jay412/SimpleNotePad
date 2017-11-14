package chau.jordan.simplenotepad;

/**
 * Created by Jordan on 11/6/2017.
 */

public class NotesBuilder {

    private String title,
    content;

    public NotesBuilder(){
    }

    public NotesBuilder(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
