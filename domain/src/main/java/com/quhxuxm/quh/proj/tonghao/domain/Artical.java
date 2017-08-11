package com.quhxuxm.quh.proj.tonghao.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "ARTICAL")
public class Artical {
    @Id
    @GeneratedValue
    @Column(name = "_ID")
    private Long id;
    @Column(name = "CONTENT_ID",
            nullable = false)
    private Long contentId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    @Column(name = "TITLE",
            nullable = false,
            length = 255)
    private String title;
    @Column(name = "SUMMARY",
            nullable = false,
            length = 255)
    private String summary;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ARTICAL_LABEL",
            joinColumns = @JoinColumn(name = "ARTICAL_ID",
                    referencedColumnName = "_ID"),
            inverseJoinColumns = @JoinColumn(name = "LABEL_ID",
                    referencedColumnName = "_ID"))
    private Set<Label> labels;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Label> getLabels() {
        return labels;
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }
}
