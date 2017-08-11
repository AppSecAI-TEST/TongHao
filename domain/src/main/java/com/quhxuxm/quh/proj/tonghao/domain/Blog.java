package com.quhxuxm.quh.proj.tonghao.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BLOG")
public class Blog {
    @Id
    @Column(name = "_ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "BLOG_LABEL",
            joinColumns = { @JoinColumn(name = "BLOG_ID",
                    referencedColumnName = "_ID") },
            inverseJoinColumns = { @JoinColumn(name = "LABEL_ID",
                    referencedColumnName = "_ID") })
    private Set<Label> labels;
    @OneToMany(mappedBy = "blog",
            fetch = FetchType.LAZY)
    private List<Artical> articals;
    @Column(name = "TITLE",
            nullable = true,
            length = 255)
    private String title;
    @Column(name = "DESCRIPTION",
            nullable = true,
            length = 255)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public Set<Label> getLabels() {
        return labels;
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }

    public List<Artical> getArticals() {
        return articals;
    }

    public void setArticals(List<Artical> articals) {
        this.articals = articals;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
