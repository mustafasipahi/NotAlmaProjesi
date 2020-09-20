package com.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_note")
public class Note extends BaseEntity{

    @Column(name = "title")
    private String title;

    @Column(name = "content",length = 999999999)
    private String content;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate = new Date();

    @Column(name = "user_id")
    private Long userId;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", userId=" + userId +
                '}';
    }
}
