package com.creed.project.testApp.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestProcessor implements ItemProcessor<String, String> {

    public TestProcessor() { super(); }

    @Override
    public String process(String s) throws Exception {
        s.toUpperCase();

        return s;
    }
}
