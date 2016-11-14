package edu.temple.tuf21842.webbrowser;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class WebPage extends Fragment {

    private WebpageListener mListener;
    private View v;
    private final String TAG = "WebpageFragment";

    public WebPage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =inflater.inflate(R.layout.fragment_web_page, container, false);
        Bundle args = getArguments();
        String url = args.getString("URL");
        final WebView web = (WebView) v.findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);

        Button goButton = (Button) v.findViewById(R.id.go_button);
        final EditText URLbar = (EditText) v.findViewById(R.id.URL_bar);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newURL = URLbar.getText().toString();
                if(!newURL.startsWith("http")){
                    newURL = "http://" + newURL;
                }
                web.loadUrl(newURL);
                InputMethodManager inputManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(v.getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
            }
        });

        return v;
    }

    public interface WebpageListener {
        void goToNewPage(String URL);
    }
}
