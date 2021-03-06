package com.peigongdh.gameinner.browserquest.domain.message;

import com.peigongdh.gameinner.browserquest.common.Constant;

import java.util.ArrayList;
import java.util.List;

public class Kill implements SerializeAble {

    private int mobKind;

    public Kill(int mobKind) {
        this.mobKind = mobKind;
    }

    @Override
    public List<Object> serialize() {
        List<Object> list = new ArrayList<>();
        list.add(Constant.TYPES_MESSAGES_KILL);
        list.add(this.mobKind);
        return list;
    }
}
