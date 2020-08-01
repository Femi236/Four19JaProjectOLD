package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "comment_id")
    private long commentID;

    @Column(name = "commenter")
    private long commenter;

    @Column(name = "comment")
    private String comment;

    @Column(name = "post")
    private long post;

    public Comment() {
    }

    public Comment(long commenter, String comment, long post) {
        this.commenter = commenter;
        this.comment = comment;
        this.post = post;
    }

    public long getCommentID() {
        return commentID;
    }

    public void setCommentID(long commentID) {
        this.commentID = commentID;
    }

    public long getCommenter() {
        return commenter;
    }

    public void setCommenter(long commenter) {
        this.commenter = commenter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getPost() {
        return post;
    }

    public void setPost(long post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comment comment1 = (Comment) o;
        return commentID == comment1.commentID
                && commenter == comment1.commenter
                && post == comment1.post
                && comment.equals(comment1.comment);
    }
}
