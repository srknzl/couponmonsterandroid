package com.example.couponmonster.ui.onlinepeople;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.couponmonster.AppState;

public class OnlinePeopleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OnlinePeopleViewModel() {
        mText = new MutableLiveData<>();

        mText.setValue(AppState.getInstance().onlinePeople.size() + " Online Users");
    }

    public LiveData<String> getText() {
        return mText;
    }
}