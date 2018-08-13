package my.edu.utem.mycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.number_textView);
    }

    public void incrementPressed(View view) {
        counter++;
        textView.setText(counter+"");

    }
    public void decrementPressed(View view) {

       if (counter ==0){
           Toast.makeText(MainActivity.this, "Number cannot less than 0", Toast.LENGTH_LONG).show();
       }else {
           counter--;
           textView.setText(counter + "");
       }
    }

    public void resetPressed(View view) {
        counter=0;
        textView.setText(counter+"");
    }
}
