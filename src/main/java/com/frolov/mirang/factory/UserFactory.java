package com.frolov.mirang.factory;

import com.frolov.mirang.Util;
import com.frolov.mirang.entity.User;
import com.frolov.mirang.entity.Wish;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;

public class UserFactory {

    public static User create() {
        User user = new User();
        user.setFirstName(Lorem.getFirstName());
        user.setLastName(Lorem.getLastName());
        user.setAge(20 + Util.RANDOM.nextInt(10 + 1));
        user.setCity(Lorem.getStateFull());
        user.setCreated(new ArrayList<Wish>());
        user.setPerformed(new ArrayList<Wish>());
        user.setCoins(Util.RANDOM.nextInt(100));
        return user;
    }

}
