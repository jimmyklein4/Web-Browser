package edu.temple.tuf21842.webbrowser;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebPage extends Fragment {

    private OnFragmentInteractionListener mListener;
    private final String TAG = "WebPage";
    public WebPage() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        try {
//            WebView web = (WebView) getView().findViewById(R.id.web);
//            web.setWebViewClient(new WebViewClient());
//            web.loadUrl("https://google.com/");
//        } catch(NullPointerException e){
//            Log.d(TAG, e.toString());
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_web_page, container, false);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name

    }
}
