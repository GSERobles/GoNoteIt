package eu.napcode.gonoteit.model.note;

import eu.napcode.gonoteit.dao.NoteEntity;

public class NoteModel {

    public NoteModel() {
    }

    public NoteModel(NoteEntity noteEntity) {
        this.id = noteEntity.getId();
        this.title = noteEntity.getTitle();
        this.content = noteEntity.getContent();
    }

    private String id;
    private String title;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
