package com.example.Sigma;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigmaActivity extends Activity {
    int n;
    EditText et_number_input;
    Button btn_sum;

    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        et_number_input = (EditText) findViewById(R.id.et_input_number);
        btn_sum = (Button) findViewById(R.id.btn_sum);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do
                {
                    try
                    {

                        n = Integer.parseInt(et_number_input.getText().toString());
                    }
                    catch(Exception e)
                    {
                        Toast.makeText(getApplication(), "Only Numbers!", Toast.LENGTH_SHORT).show();
                    }
                }

                while (n < 1);
                {
                    long answer = sigma(n);
                    // We needed a way to get rid of .0 at the end of any string but allow non-integral values to survive
                    Toast.makeText(getApplication(), String.valueOf(answer).replace("\\.0+$", ""), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

        public static long sigma(long m) {

            if (m <= 0) {
                return 0;
            } else {
                return m + sigma(m - 1);
            }
        }


}
