package com.sudhirkhanger.app.reportcard;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ReportCardActivityFragment extends Fragment {

    private static final String LOG_TAG = ReportCardActivityFragment.class.getSimpleName();

    public ReportCardActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_report_card, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.textview);

        int CS=0;
        ReportCard reportCard = new ReportCard(100, 100, 100, 100, 100, "ZAIN KALIM", 292);
        reportCard.setChemistryMarks(76);
        reportCard.setMathMarks(58);
        reportCard.setEnglishMarks(48);
        reportCard.setPhysicsMarks(59);
        reportCard.setSocialMarks(59);

        Log.d(LOG_TAG, reportCard.toString());

        textView.setText(reportCard.displayResult());

        return rootView;
    }
}
