package it.solarma.android.colorcode;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        showSomething("Color Code\nCopyright 2016, Gianpaolo Macario");
    }

//    /**
//     * This method is called when one of the buttons at top is clicked.
//     */
//    public void chooseFunction(View view) {
//        // TODO
//        // Button nameField = (Button) findViewById(R.id.name_field);
//        // Editable nameEditable = nameField.getText();
//        Button button = (Button) view;
//        // String text = button.getText();
//        // showSomething(text);
//    }

    public void chooseFunc1(View view) {
        showSomething("Function 1\nShow Value",1);
    }

    public void chooseFunc2(View view) {
        showSomething("Function 2\nShow Color",2);
    }

    public void chooseFunc3(View view) {
        showSomething("Function 3\nNominal Values",3);
    }

    public void chooseFunc4(View view) {
        showSomething("Function 4\nFind the Wrong Color",4);
    }

    public void chooseFunc5(View view) {
        showSomething("Function 5\nFind the Missing Color",5);
    }

    public void chooseFunc6(View view) {
        showSomething("Color Code\nCopyright 2016, Gianpaolo Macario",6);
    }

    /**
     * Displays the given score for Team A.
     */
    public void showSomething(String text,int choice) {
        TextView scoreView;
        if(choice == 1 || choice == 6)
        {
          scoreView = (TextView) findViewById(R.id.textView_func1);   
        }
        else if(choice == 2)
        {
          scoreView = (TextView) findViewById(R.id.textView_func2);   
        }  
        else if(choice == 3)
        {
          scoreView = (TextView) findViewById(R.id.textView_func3);   
        }   
        else if(choice == 4)
        {
          scoreView = (TextView) findViewById(R.id.textView_func4);   
        }   
        else if(choice == 5)
        {
          scoreView = (TextView) findViewById(R.id.textView_func5);   
        }   
        //scoreView.setText(String.valueOf(score));
        scoreView.setText(text);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://it.solarma.android.colorcode/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://it.solarma.android.colorcode/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
