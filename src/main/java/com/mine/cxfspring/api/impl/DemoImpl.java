package com.mine.cxfspring.api.impl;

import com.mine.cxfspring.api.DemoApi;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoImpl implements DemoApi {

    @Override
    public String getDemo(String id) {
        return "Demo " + id;
    }

    @Override
    public List<String> getAllDemos() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("cvb");

        return list;
    }
}
