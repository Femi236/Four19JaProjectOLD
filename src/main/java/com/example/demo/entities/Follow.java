package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(FollowID.class)
@Table(name = "follow")
public class Follow {
    @Id
    @Column(name = "follower")
    private long follower;

    @Id
    @Column(name = "followed")
    private long followed;

    public Follow() {
    }

    public Follow(long follower, long followed) {
        this.follower = follower;
        this.followed = followed;
    }

    public long getFollower() {
        return follower;
    }

    public void setFollower(long follower) {
        this.follower = follower;
    }

    public long getFollowed() {
        return followed;
    }

    public void setFollowed(long followed) {
        this.followed = followed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Follow follow = (Follow) o;
        return follower == follow.follower
                && followed == follow.followed;
    }
}
