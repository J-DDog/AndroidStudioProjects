package activity.ctec.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StupidMorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid_morning);

        //Defining/Reference the button
        final Button stupidButton = (Button) findViewById(R.id.stupidButton);

        //Set its text to the default
        stupidButton.setText("I Do Nothing");

        stupidButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Set the text on button pressed.
                if(stupidButton.getText() == "I Do Nothing")
                {
                    stupidButton.setText("K, maybe I lied");
                }
                else
                {
                    stupidButton.setText("Stupid Button is Stupid!!");
                }

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid_morning, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
