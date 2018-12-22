package com.salmon.TO;



import javax.persistence.*;
import java.io.Serializable;



@Table(name = "PDFCORE")
@Entity(name = "pdfcore")
public class PdfCore implements Serializable {
    @Id
    @SequenceGenerator(name = "PDFCORE_SEQ",sequenceName = "PDFCORE_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "PDFCORE_SEQ")
    private long id;

    @Column(name = "TITLE",columnDefinition = "CHAR(50)")
    private String title;

    @Column(name = "UNIQUEHASH",columnDefinition ="CHAR(100)" )
    private String uniqueHash;

    @Column(name = "EXTERNALLINK",columnDefinition ="CHAR(100)")
    private String externalLink;

    @Column (name = "TAGS",columnDefinition = "CHAR(300)")
    private String tags;

    @Column(name = "DATE",columnDefinition = "CHAR(50)")
    private String date;

    @Column(name = "USERNAME",columnDefinition = "CHAR(50)")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniqueHash() {
        return uniqueHash;
    }

    public void setUniqueHash(String uniqueHash) {
        this.uniqueHash = uniqueHash;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

}

