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

    String newsChennelPrograms[] = {"News", "FeaturesPrograms", "Chennel Site"};

    String entertainmentChennelPrograms[] = {"EntertainmentNews", "FeaturesPrograms", "Chennel Site"};

    String sportsChennelPrograms[] = {"Sports News","FeaturesPrograms","Chennel Site"};

    String chennelCategory;

    String[] urlsNewsSite = new String[]
            {
                    "https://www.youtube.com/channel/UCJx_Cy4EqFO4FRPAJDLnweA","http://www.channelionline.com/category/%E0%A6%AC%E0%A6%BF%E0%A6%A8%E0%A7%8B%E0%A6%A6%E0%A6%A8/","http://www.ntvbd.com/video/entertainment",
                    "http://www.satv.tv/topics/popular-news-nca/","http://www.independent24.tv/Entertainment/%E0%A6%AC%E0%A6%BF%E0%A6%A8%E0%A7%8B%E0%A6%A6%E0%A6%A8","http://www.atnnewstv.com/?app=news_uncut",
                    "http://edition.cnn.com/regions","http://www.bbc.com/news","http://www.aljazeera.com/news/",
                    "https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","http://www.iplt20.com/news",
                    "http://www.jamunatv.net/category/Jamuna-News","http://maasranga.tv/?page_id=4596",""
            };

    String[] urlsFeaturedProgramsSite = new String[]
            {
                    "https://www.youtube.com/channel/UCJx_Cy4EqFO4FRPAJDLnweA","https://www.youtube.com/results?search_query=bangla+natok+","http://www.ntvbd.com/video/",
                    "http://www.satv.tv/topics/popular-programs/","http://www.independent24.tv/Video/%E0%A6%AD%E0%A6%BF%E0%A6%A1%E0%A6%BF%E0%A6%93","http://www.atnnewstv.com/?app=view_program_list",
                    "http://edition.cnn.com/videos","http://www.bbc.com/news/video_and_audio/headlines","http://www.aljazeera.com/programmes/",
                    "https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","http://www.iplt20.com/video",
                    "http://www.jamunatv.net/event_news","http://maasranga.tv/?page_id=5121",""
            };

    String[] urlsChennelSite = new String[]
            {
                    "http://www.ekattor.tv/","http://www.channelionline.com/","http://www.ntvbd.com/",
                    "http://www.satv.tv/","http://www.independent24.tv","http://www.atnnewstv.com/?app=home",
                    "https://www.cnn.com","http://www.bbc.com/","http://www.aljazeera.com/",
                    "https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","https://twitter.com/ten_sports?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor","http://www.iplt20.com/",
                    "http://www.jamunatv.net/","http://maasranga.tv/","http://www.channel24bd.tv/"
            };



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
