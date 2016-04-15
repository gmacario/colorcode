package it.solarma.android.colorcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when one of the buttons at top is clicked.
     */
    public void chooseFunction(View view) {
        // TODO
        // Button nameField = (Button) findViewById(R.id.name_field);
        // Editable nameEditable = nameField.getText();
        Button button = (Button) view;
        // String text = button.getText();
        // showSomething(text);
    }

    public void chooseFunc1(View view) {
        showSomething("alpha");
    }

    public void chooseFunc2(View view) {
        showSomething("bravo");
    }

    public void chooseFunc3(View view) {
        showSomething("charlie");
    }

    public void chooseFunc4(View view) {
        showSomething("delta");
    }

    public void chooseFunc5(View view) {
        showSomething("echo");
    }

    /**
     * Displays the given score for Team A.
     */
    public void showSomething(String text) {
        TextView scoreView = (TextView) findViewById(R.id.textView_func1);
        //scoreView.setText(String.valueOf(score));
        scoreView.setText(text);
    }
}
