package com.tistory.hide1825.criminalintent;

import android.support.v4.app.Fragment;

import java.util.Date;

/**
 * Created by HyunSeungJoon on 14/7/16.
 */
public class DatePickerActivity extends SingleFragmentActivity {

    private static final String EXTRA_DATE = "com.tistory.hide1825.criminalintent.date";


    @Override
    protected Fragment createFragment() {

        Date date = (Date) getIntent().getSerializableExtra(CrimeFragment.EXTRA_DATE);

        return DatePickerFragment.newInstance(date);
    }
}
