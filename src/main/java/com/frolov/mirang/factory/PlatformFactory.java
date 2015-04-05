package com.frolov.mirang.factory;

import com.frolov.mirang.entity.Platform;
import com.frolov.mirang.entity.User;
import com.frolov.mirang.entity.Wish;

import java.util.ArrayList;
import java.util.List;

public class PlatformFactory {

    public static Platform create() {
        Platform platform = new Platform();

        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(UserFactory.create());
        }
        platform.setUserList(users);

        List<Wish> wishs = new ArrayList<Wish>();
        for (int i = 0; i < 10; i++) {
            wishs.add(WishFactory.create());
        }
        platform.setWishList(wishs);

        return platform;
    }

}
