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
                    {"https://www.youtube.com/user/CH71TV","https://www.youtube.com/channel/UCAz6rveBalVnE6qTmfQnvyQ","https://www.youtube.com/channel/UCYqujAD5831EywH1jldBu5w",
                    "https://www.youtube.com/channel/UCl13d2BTcnn_wQmlpWV_Ctw","https://www.youtube.com/user/independent24tube","https://www.youtube.com/channel/UCKlhfq1ILoAFav7iw5iCnfA",
                    "https://www.youtube.com/channel/UCCNGtLTGyYKm6RhVzrnyPCA","https://www.youtube.com/channel/UCUzLhSDcbap43EyqHoWlGeg","https://www.youtube.com/user/channel24web",
                    "https://www.youtube.com/channel/UCR0hSGudjeZfnGL3uodU9Sw","https://www.youtube.com/channel/UClVZ6GRSWj2oEUQQCW_xdaw","https://www.youtube.com/user/etvbanglaindia",
                    "https://www.youtube.com/user/colorstv","https://www.youtube.com/user/zeetv","https://www.youtube.com/channel/UCEGpbgwmS9pHXksqWrGIOgQ",
                    "https://www.youtube.com/user/AlJazeeraEnglish","https://www.youtube.com/user/skynews","https://www.youtube.com/user/DiscoveryNetworks",
                    "https://www.youtube.com/user/AnimalPlanetTV","https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig"};

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
        intent.setData(Uri.parse("http://edition.cnn.com/weather"));
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
