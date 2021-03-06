package com.example.anupamdeb.livetv;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    public void ekattorOnCLick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void iOnCLick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void ntvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void saTvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void independentTvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void atnNewsOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void gtvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void jamunaOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void chen24NewsOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void rtvbdOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void asiantvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void colorsbanglaOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void colorsOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void zeetvOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void cnnOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }


    public void aljazeeraOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void skynewsOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "n");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void discoveryOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void animalplanetOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }

    public void moreOnClick(View view) {
        haveNetworkConnection = haveNetworkConnection();
        if (haveNetworkConnection == true) {
            ImageButton tag = (ImageButton) view;
            int tappedCounter = Integer.parseInt(tag.getTag().toString());
            //Toast.makeText(getApplicationContext(),""+tappedCounter,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, FeatureActivity.class);
            intent.putExtra("tag_id", tappedCounter);
            intent.putExtra("Chennel_Category", "e");
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemId:
                haveNetworkConnection = haveNetworkConnection();
                if (haveNetworkConnection == true)
                {
                    Intent intent = new Intent(HomeActivity.this, AboutUs.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(HomeActivity.this, "Please check Data or wifi connection", Toast.LENGTH_LONG).show();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
