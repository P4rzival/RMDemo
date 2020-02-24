package com.github.p4rzival.rmdemo.teambio.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            String returnVar = "0";
            SectionsPagerAdapter SPA;
            for(int i = 0; i < SPA.getCount(); i++) {
                if(toString(SPA.getPageTitle(i)).contains("Taseen"))
                {
                    returnVar = "Hey I'm Taseen, a member of the Radius Message dev team, this is a test application for Sprint 0 so we can all get familiar with the commit work process";
                }
            }
            return returnVar;
    }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}