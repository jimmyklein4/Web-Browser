package edu.temple.tuf21842.webbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements WebPage.WebpageListener{
    private WebPage webPage;
    private ArrayList<WebPage> allPages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        allPages = new ArrayList<>();
        setContentView(R.layout.activity_main);
        setActionBar((Toolbar)findViewById(R.id.tools));
        webPage = new WebPage();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.web_frame, webPage)
                .commit();

        allPages.add(webPage);

        Button prevButton = (Button) findViewById(R.id.prev_page);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(allPages.size() > 1){
                    //TODO go back to prev webpage in list
                }
            }
        });

        Button nextButton = (Button) findViewById(R.id.next_page);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(allPages.size() > 1){
                    //TODO go to the next page in the list
                }
            }
        });

        ImageButton newPageButton = (ImageButton) findViewById(R.id.new_page);
        newPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO add a new page to the list
            }
        });
    }

    @Override
    public void goToNewPage(String URL) {

    }
}
