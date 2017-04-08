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
    String entertainmentChennelPrograms[] = {"News", "Drama", "Movies", "Music", "Chennel Site"};
    String newsChennelPrograms[] = {"News", "Programs", "Chennel Site"};
    String sportsChennelPrograms[] = {};
    String chennelCategory;

    String[] urlsChennelSite = new String[]
            {
                    "","","http://www.ntvbd.com/",
                    "","","http://www.atnnewstv.com/?app=home",
                    "https://www.cnn.com","",""
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

            case "Programs":

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
            case "News":
            case "Drama":
            case "Movies":
            case "Music":
            case "Chennel Site":

                chennelSite(chennelPostionInGridView);
                break;

        }
    }
    public void chennelSite(int chennelPostionInGridView)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(urlsChennelSite[chennelPostionInGridView]));
        startActivity(intent);
    }



    public void test()
    {
        Toast.makeText(getApplicationContext(),"from test method",Toast.LENGTH_LONG).show();
    }


}
