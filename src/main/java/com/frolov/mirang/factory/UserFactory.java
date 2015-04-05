package com.frolov.mirang.factory;

import com.frolov.mirang.Util;
import com.frolov.mirang.entity.User;
import com.thedeanda.lorem.Lorem;

public class UserFactory {

    public static User create() {
        User user = new User();
        user.setFirstName(Lorem.getFirstName());
        user.setLastName(Lorem.getLastName());
        user.setAge(20 + Util.RANDOM.nextInt(10 + 1));
        user.setCity(Lorem.getStateFull());
//        user.setCreated();
//        user.setPerformed();
        user.setCoins(Util.RANDOM.nextInt(100));
        return user;
    }

}
