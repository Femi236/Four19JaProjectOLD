package com.example.demo.entities;

import java.io.Serializable;

public class FollowID implements Serializable {
    private long follower;
    private long followed;

    public FollowID() {

    }

    public FollowID(long follower, long followed) {
        this.follower = follower;
        this.followed = followed;
    }
}
