package com.example.demo.Entity;

import java.io.Serializable;

public class FollowID implements Serializable {
    private long follower;
    private long followed;

    public FollowID(long follower, long followed) {
        this.follower = follower;
        this.followed = followed;
    }
}