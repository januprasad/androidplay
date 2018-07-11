package com.example.januprasad.android_play;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

public class NotesRepository {


    private static NotesRepository instance;

    public static NotesRepository getInstance() {
        return instance;
    }

    public LiveData<Content> getNotes() {

        MutableLiveData<Content> contentLiveData = new MutableLiveData<>();
        contentLiveData.setValue(Content.makeOneInstance());
        return contentLiveData;

    }
}
