package com.example.januprasad.android_play;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

public class NotesViewModel extends AndroidViewModel {
    LiveData<Content> notes;

    public NotesViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
         notes = NotesRepository.getInstance().getNotes();
    }


}
