package id.ipaddr.androidlibrarygradlecourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityToDisplayJoke extends AppCompatActivity {

    public static final String MSG = "id.ipaddr.androidlibrarygradlecourse.ActivityToDisplayJoke.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_display_joke);
        TextView tv = (TextView)findViewById(R.id.text_joke);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(MSG)){
            String msg = intent.getStringExtra(MSG);
            tv.setText(msg);
        }

    }
}
