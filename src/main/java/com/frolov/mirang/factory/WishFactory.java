package com.frolov.mirang.factory;

import com.frolov.mirang.Util;
import com.frolov.mirang.entity.Wish;
import com.thedeanda.lorem.Lorem;

public class WishFactory {

    public static Wish create() {
        Wish wish = new Wish();
        wish.setAuthor(UserFactory.create());
        wish.setIntent(Lorem.getParagraphs(1, 1));
        wish.setCost(Util.RANDOM.nextInt(100));
        wish.setCity(Lorem.getStateFull());
        wish.setPerformer(UserFactory.create());
        return wish;
    }

}
