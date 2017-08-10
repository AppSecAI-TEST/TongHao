package com.quhxuxm.quh.proj.tonghao.domain;

import javax.persistence.*;

@Entity
@Table(name = "LABEL")
public class Label {
    @Id
    @GeneratedValue
    @Column(name = "_ID")
    private Long id;
    @Column(name = "TEXT",
            nullable = false,
            unique = true,
            length = 5)
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
