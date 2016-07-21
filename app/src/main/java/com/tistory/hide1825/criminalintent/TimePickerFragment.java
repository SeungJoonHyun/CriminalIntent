package com.tistory.hide1825.criminalintent;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TimePicker;

/**
 * Created by HyunSeungJoon on 12/7/16.
 */
public class TimePickerFragment extends DialogFragment {

    private TimePicker timePickerDialog;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_time,null);
        timePickerDialog = (TimePicker) view.findViewById(R.id.dialog_time_picker);

        int hour = timePickerDialog.getCurrentHour();
        int min = timePickerDialog.getCurrentMinute();

        return new TimePickerDialog(getActivity(),null,hour,min, DateFormat.is24HourFormat(getActivity()));
    }
}
