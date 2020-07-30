package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long commentID;

    private long commenter;

    private String comment;

    private long post;

    public Comment () {
    }

    public Comment(long commentID, long commenter, String comment, long post) {
        this.commentID = commentID;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return commentID == comment1.commentID &&
                commenter == comment1.commenter &&
                post == comment1.post &&
                comment.equals(comment1.comment);
    }
}
