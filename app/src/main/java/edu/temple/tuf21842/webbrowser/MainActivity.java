package edu.temple.tuf21842.webbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class MainActivity extends Activity {
    private WebPage webPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBar((Toolbar)findViewById(R.id.tools));
        webPage = new WebPage();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.web_frame, webPage)
                .commit();
    }
}
