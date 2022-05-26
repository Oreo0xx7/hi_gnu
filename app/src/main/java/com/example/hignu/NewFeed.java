/*package com.example.hignu;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class NewFeed extends StringRequest {

    final static private String URL = "http://wpdls0027.dothome.co.kr/issue1.php";
    private static final int numFD = 1;
    private Map<String, String> map;
    public NewFeed(Integer numFD, String titleFD, String nickFD, Boolean secretFD, String contentFD, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("numFD", numFD+"");
        map.put("titleFD", titleFD);
        map.put("nickFD", nickFD);
        map.put("secretFD", secretFD+"");
        map.put("contentFD", contentFD);
    }

    public NewFeed(Integer numFD, String titleFD, String nickFD, Boolean secretFD, String contentFD, Response.Listener<String> responseListenter) {
        super(numFD, titleFD, nickFD, secretFD, contentFD, responseListenter);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
*/