package com.tistory.hide1825.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by HyunSeungJoon on 6/7/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
