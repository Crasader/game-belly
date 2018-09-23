package com.peigongdh.gameinner.browserquest.domain.message;

import com.alibaba.fastjson.JSON;
import com.peigongdh.gameinner.browserquest.common.Constant;

import java.util.ArrayList;
import java.util.List;

public class Blink implements SerializeAble {

    private String itemId;

    public Blink(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String serialize() {
        List<Object> list = new ArrayList<>();
        list.add(Constant.TYPES_MESSAGES_DESTROY);
        list.add(this.itemId);
        return JSON.toJSONString(list);
    }
}