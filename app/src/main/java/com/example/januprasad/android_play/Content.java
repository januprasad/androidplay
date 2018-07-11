package com.example.januprasad.android_play;

import java.util.ArrayList;
import java.util.List;

public class Content extends BaseContent {
    List<String> notes;

    public static Content makeOneInstance() {
        Content content = new Content();
        List<String> strings = new ArrayList<>();
        strings.add("Android");
        strings.add("Ios");
        strings.add("Windows");
        content.notes = strings;
        return content;
    }
}
