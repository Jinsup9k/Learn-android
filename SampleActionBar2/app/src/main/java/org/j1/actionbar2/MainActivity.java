package org.j1.actionbar2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        View view = menu.findItem(R.id.menu_search).getActionView();
        if (view != null) {
            EditText editText = view.findViewById(R.id.editText);

            if (editText != null) {
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        String text = v.getText().toString();
                        Toast.makeText(getApplicationContext(), "입력됨 : " + text, Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
            }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}