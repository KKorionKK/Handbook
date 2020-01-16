package uberflask.russian.manual;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.google.android.material.button.MaterialButton;

public class HomeFragment extends Fragment {

    Button mSendButton;
    Button mSendButton2;
    public static TextView data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mSendButton = (Button) getActivity().findViewById(R.id.task1_button);
        data = (TextView) getActivity().findViewById(R.id.dataText);

        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData process = new fetchData();
                process.execute();
            }
        });
        mSendButton2 = (Button) getActivity().findViewById(R.id.task2_button);

        mSendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (! Python.isStarted()) {
                    Python.start(new AndroidPlatform(getActivity()));
                }
                Python py = Python.getInstance();
                PyObject pyf = py.getModule("parse");
                PyObject obj = pyf.callAttr("wikiaParsing");

                Toast.makeText(getActivity(), obj.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        }
    }

