package com.frolov.mirang;

import com.frolov.mirang.entity.User;
import com.frolov.mirang.entity.Wish;
import com.frolov.mirang.factory.UserFactory;
import com.frolov.mirang.factory.WishFactory;
import org.boon.Boon;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to Mirang");

        User user = UserFactory.create();
        Wish wish = WishFactory.create();
        System.out.println(Boon.toPrettyJson(user));
        System.out.println(Boon.toPrettyJson(wish));
    }

}
