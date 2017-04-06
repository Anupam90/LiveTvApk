package com.example.anupamdeb.livetv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FeatureActivity extends AppCompatActivity {

    Button btnLive;
    Button btnFeatured;

    String[] urls = new String[]
                    {" "," ","https://youtu.be/FUx_JX6u-r0",
                    " "," ","https://www.youtube.com/watch?v=cvwqf_oSwNQ&feature=youtu.be",
                    "https://youtu.be/gXVLMWv-W1A"," "," "};

    public void liveOnClick(View view)
    {

        int position = getIntent().getExtras().getInt("tag_id");
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(urls[position]));
        startActivity(intent);

        //Toast.makeText(getApplicationContext(),"tapped",Toast.LENGTH_LONG).show();
    }

    public void featuredOnClick(View view)
    {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        btnLive = (Button) findViewById(R.id.btnLive);
        btnFeatured = (Button) findViewById(R.id.btnFeature);


    }
}
