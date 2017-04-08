package com.example.anupamdeb.livetv;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    boolean haveNetworkConnection = false;
    int tappedCounter;

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }



    public void atnNewsOnClick(View view)
    {
        haveNetworkConnection = haveNetworkConnection();
        if(haveNetworkConnection==true)
        {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this,FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(HomeActivity.this,"Please check Data or wifi connection",Toast.LENGTH_LONG).show();
        }
    }

    public void cnnNewsOnClick(View view)
    {
        haveNetworkConnection = haveNetworkConnection();
        if(haveNetworkConnection==true)
        {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this,FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(HomeActivity.this,"Please check Data or wifi connection",Toast.LENGTH_LONG).show();
        }
    }

    public void ntvOnClick(View view)
    {
        haveNetworkConnection = haveNetworkConnection();
        if(haveNetworkConnection==true)
        {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this,FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(HomeActivity.this,"Please check Data or wifi connection",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }
}
