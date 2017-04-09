package com.example.anupamdeb.livetv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class FeatureActivity extends AppCompatActivity {

    Button btnLive;
    Button btnFeatured;

    String[] urls = new String[]
                    {"http://www.bioscopelive.com/en/channel/ekattur-tv","http://www.bioscopelive.com/en/channel/channel-i","http://www.bioscopelive.com/en/channel/ntv",
                            "http://www.bioscopelive.com/en/channel/sa-tv","http://www.bioscopelive.com/en/channel/independent-tv","http://www.bioscopelive.com/en/channel/atn-news",
                    "http://www.freeintertv.com/view/id-200","http://www.bioscopelive.com/en/channel/bbc-world","http://www.freeintertv.com/view/id-3291/1-News-0-1",
                    "http://www.bioscopelive.com/en/channel/ten-sports-1","http://www.bioscopelive.com/en/channel/ten-sports","http://www.bioscopelive.com/en/channel/vivo-ipl-2017",
                    "http://www.bioscopelive.com/en/channel/jamuna-tv","http://www.bioscopelive.com/en/channel/maasranga-tv","http://www.bioscopelive.com/en/channel/channel-24"};

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
        String chennelCategory = getIntent().getExtras().getString("Chennel_Category");
        Intent intent;
        int position = getIntent().getExtras().getInt("tag_id");
        switch(chennelCategory)
        {
            case "n":
                //Toast.makeText(getApplicationContext(),chennelCategory+" feature tapped",Toast.LENGTH_LONG).show();

                intent = new Intent(FeatureActivity.this, FeaturedPrograms.class);
                intent.putExtra("Chennel_CategoryWise_Features", chennelCategory);
                intent.putExtra("Chennel_Postion_In_GridView", position);
                startActivity(intent);
                break;

            case "e":
                //Toast.makeText(getApplicationContext(),chennelCategory+" feature tapped",Toast.LENGTH_LONG).show();

                intent = new Intent(FeatureActivity.this, FeaturedPrograms.class);
                intent.putExtra("Chennel_CategoryWise_Features", chennelCategory);
                intent.putExtra("Chennel_Postion_In_GridView", position);
                startActivity(intent);
                break;

            case "sp":
                //Toast.makeText(getApplicationContext(),chennelCategory+" feature tapped",Toast.LENGTH_LONG).show();

                intent = new Intent(FeatureActivity.this, FeaturedPrograms.class);
                intent.putExtra("Chennel_CategoryWise_Features", chennelCategory);
                intent.putExtra("Chennel_Postion_In_GridView", position);
                startActivity(intent);
                break;

        }

    }

    public void onClickWorldWeather(View view)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://edition.cnn.com/"));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        btnLive = (Button) findViewById(R.id.btnLive);
        btnFeatured = (Button) findViewById(R.id.btnFeature);


    }
}
