package com.example.anupamdeb.livetv;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FeaturedPrograms extends AppCompatActivity {

    TextView featureTextView;
    ListView listView;
    ArrayAdapter<String> adapter;

    String newsChennelPrograms[] = { "FeaturesPrograms", "Chennel Site"};

    String entertainmentChennelPrograms[] = { "FeaturesPrograms", "Chennel Site"};

    String sportsChennelPrograms[] = {"FeaturesPrograms","Chennel Site"};

    String chennelCategory;

    String[] urlsNewsSite = new String[]
                    {"","","",
                    "","","",
                    "","","",
                    "","","",
                    "","","",
                    "","","",
                    "",""};

    String[] urlsFeaturedProgramsSite = new String[]
                    {"https://www.youtube.com/user/CH71TV/videos","https://www.youtube.com/channel/UCAz6rveBalVnE6qTmfQnvyQ/videos","https://www.youtube.com/channel/UCYqujAD5831EywH1jldBu5w/videos",
                    "https://www.youtube.com/channel/UCl13d2BTcnn_wQmlpWV_Ctw/videos","https://www.youtube.com/user/independent24tube/videos","https://www.youtube.com/channel/UCKlhfq1ILoAFav7iw5iCnfA/videos",
                    "https://www.youtube.com/channel/UCCNGtLTGyYKm6RhVzrnyPCA/videos","https://www.youtube.com/channel/UCUzLhSDcbap43EyqHoWlGeg/videos","https://www.youtube.com/user/channel24web/videos",
                    "https://www.youtube.com/channel/UCR0hSGudjeZfnGL3uodU9Sw/videos","https://www.youtube.com/channel/UClVZ6GRSWj2oEUQQCW_xdaw/videos","https://www.youtube.com/user/etvbanglaindia/videos",
                    "https://www.youtube.com/user/colorstv/videos","https://www.youtube.com/user/zeetv/videos","https://www.youtube.com/channel/UCEGpbgwmS9pHXksqWrGIOgQ/videos",
                    "https://www.youtube.com/user/AlJazeeraEnglish/videos","https://www.youtube.com/user/skynews/videos","https://www.youtube.com/user/DiscoveryNetworks/videos",
                    "https://www.youtube.com/user/AnimalPlanetTV/videos","https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig"};

    String[] urlsChennelSite = new String[]
                    {"http://www.ekattor.tv/","http://www.channelionline.com/","http://www.ntvbd.com/",
                    "http://www.satv.tv/","http://www.independent24.tv/","http://www.atnnewstv.com/",
                    "http://gazitv.com/test/","http://www.jamunatv.net/","http://www.channel24bd.tv/",
                    "http://www.rtvonline.com/","https://www.facebook.com/Asiantvbd/","http://www.colorsbangla.com/",
                    "http://www.colorstv.com/in/","http://www.ozee.com/zeetv","http://edition.cnn.com/",
                    "http://www.aljazeera.com/","http://news.sky.com/","https://www.discovery.co.za/",
                    "www.animalplanet.com/","https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured_programs);

        listView = (ListView) findViewById(R.id.myListView);
        chennelCategory = getIntent().getExtras().getString("Chennel_CategoryWise_Features");
        getProgramsByCategoryChennel(chennelCategory);
    }

    public void getProgramsByCategoryChennel(String chennelCategory)
    {
        switch(chennelCategory)
        {
            case "n":
                //Toast.makeText(getApplicationContext(),"from "+chennelCategory,Toast.LENGTH_LONG).show();

                adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,newsChennelPrograms);
                listView.setAdapter(adapter);
                // Register the ListView  for Context menu
                registerForContextMenu(listView);
                newsChennelFeaturesClick();
                break;
            case "e":
                //Toast.makeText(getApplicationContext(),"from "+chennelCategory,Toast.LENGTH_LONG).show();
                adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,entertainmentChennelPrograms);
                listView.setAdapter(adapter);
                // Register the ListView  for Context menu
                registerForContextMenu(listView);
                entertainmentChennelFeaturesClick();
                break;

            case "sp":
                //Toast.makeText(getApplicationContext(),"from "+chennelCategory,Toast.LENGTH_LONG).show();
                adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sportsChennelPrograms);
                listView.setAdapter(adapter);
                // Register the ListView  for Context menu
                registerForContextMenu(listView);
                sportsChennelFeaturesClick();
                break;
        }
    }

    public void newsChennelFeaturesClick()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                newsChennelListViewItemClicked(position);

            }
        });
    }

    public void entertainmentChennelFeaturesClick()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //tapped working done
                entertainmentChennelListViewItemClicked(position);
            }
        });
    }

    public void sportsChennelFeaturesClick()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //tapped working done
                sportsChennelListViewItemClicked(position);
            }
        });
    }



    public int getchennelPostionInGridView()
    {
        return getIntent().getExtras().getInt("Chennel_Postion_In_GridView");
    }



    public void newsChennelListViewItemClicked(int position)
    {
        int chennelPostionInGridView = getchennelPostionInGridView();
        switch (newsChennelPrograms[position])
        {
            case "News":
                newsSite(chennelPostionInGridView);
                break;

            case "FeaturesPrograms":
                programsSite(chennelPostionInGridView);
                break;
            case "Chennel Site":

                chennelSite(chennelPostionInGridView);
                break;

        }
    }

    public void entertainmentChennelListViewItemClicked(int position)
    {
            //tapped Working done

        int chennelPostionInGridView = getchennelPostionInGridView();
        switch (entertainmentChennelPrograms[position])
        {
            case "EntertainmentNews":
                newsSite(chennelPostionInGridView);
                break;
            case "FeaturesPrograms":
                programsSite(chennelPostionInGridView);
                break;

            case "Chennel Site":

                chennelSite(chennelPostionInGridView);
                break;

        }
    }

    public void sportsChennelListViewItemClicked(int position)
    {
        //tapped Working done

        int chennelPostionInGridView = getchennelPostionInGridView();
        switch (sportsChennelPrograms[position])
        {

            case "Sports News":
                newsSite(chennelPostionInGridView);
                break;

            case "FeaturesPrograms":
                programsSite(chennelPostionInGridView);
                break;

            case "Chennel Site":
                chennelSite(chennelPostionInGridView);
                break;

        }
    }


    public void newsSite(int chennelPostionInGridView)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(urlsNewsSite[chennelPostionInGridView]));
        startActivity(intent);
    }

    public void programsSite(int chennelPostionInGridView)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(urlsFeaturedProgramsSite[chennelPostionInGridView]));
        startActivity(intent);
    }

    public void chennelSite(int chennelPostionInGridView)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(urlsChennelSite[chennelPostionInGridView]));
        startActivity(intent);
    }

}
