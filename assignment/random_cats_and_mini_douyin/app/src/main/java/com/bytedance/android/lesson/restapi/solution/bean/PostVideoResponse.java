package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    private Object result;
    private String url;
    private boolean success;

    public Object getResult() {
        return result;
    }

    public String getUrl() {
        return url;
    }
}
