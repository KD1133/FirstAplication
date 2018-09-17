package kd113.firstaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView mTextView3 = (TextView) findViewById(R.id.textView3);
                EditText mEditText1 = (EditText) findViewById(R.id.editText1);
                EditText mEditText2 = (EditText) findViewById(R.id.editText2);
                String name = mEditText1.getText().toString();
                String surname = mEditText2.getText().toString();
                mTextView3.setText("Hello " + name + " " + surname);
            }
        });
    }

}

