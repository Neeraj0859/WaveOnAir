package wave.onair.fragements;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import wave.onair.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class status extends Fragment implements View.OnClickListener {
    private TextView mix, hindi, english, punjabi, gujarati;

    public status() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status_fragement, container, false);
        initIDs(view);
        return view;
    }

    private void initIDs(View view) {
        mix = view.findViewById(R.id.all_btn);
        hindi = view.findViewById(R.id.hindi_btn);
        english = view.findViewById(R.id.english_btn);
        punjabi = view.findViewById(R.id.punjabi_btn);
        gujarati = view.findViewById(R.id.gujarati_btn);

        mix.setOnClickListener(this);
        hindi.setOnClickListener(this);
        english.setOnClickListener(this);
        punjabi.setOnClickListener(this);
        gujarati.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.all:
                break;
            case R.id.hindi_btn:
                break;
            case R.id.english_btn:
                break;
            case R.id.punjabi_btn:
                break;
            case R.id.gujarati_btn:
                break;
        }
    }
}
