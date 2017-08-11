package com.quhxuxm.quh.proj.tonghao.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "AUTHOR")
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "_ID")
    private Long id;
    @OneToMany(mappedBy = "author")
    private List<Blog> blogs;
    @Column(name = "NICK_NAME",
            nullable = false,
            unique = true,
            length = 255)
    private String nickName;
    @Column(nullable = false,
            name = "REGISTRATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;
    @Column(name = "LAST_LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Column(name = "DESCRIPTION",
            length = 255)
    private String description;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "AUTHOR_LABEL",
            joinColumns = @JoinColumn(name = "AUTHOR_ID",
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Label> getLabels() {
        return labels;
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
