package com.peigongdh.gameinner.browserquest.domain.message;

import com.peigongdh.gameinner.browserquest.common.Constant;

import java.util.ArrayList;
import java.util.List;

public class Damage implements SerializeAble {

    private int entityId;

    private int points;

    public Damage(int entityId, int points) {
        this.entityId = entityId;
        this.points = points;
    }

    @Override
    public List<Object> serialize() {
        List<Object> list = new ArrayList<>();
        list.add(Constant.TYPES_MESSAGES_DAMAGE);
        list.add(this.entityId);
        list.add(this.points);
        return list;
    }
}
