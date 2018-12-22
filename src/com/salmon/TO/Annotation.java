package com.salmon.TO;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "ANNOTATION")
@Entity(name = "annotation")
public class Annotation implements Serializable {
    @Id
    @SequenceGenerator(name = "ANNOTATE_SEQ",sequenceName = "ANNOTATE_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "ANNOTATE_SEQ")
    private long id;

    @Column(name = "POSITION",columnDefinition = "CHAR(150)")
    private String position;

    @Column(name = "COMMMENT",columnDefinition = "CHAR(150)")
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
