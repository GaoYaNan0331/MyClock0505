package com.baway.myfristclock0505;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * data:2017/5/5
 * author:高亚男(Administrator)
 * function:
 */

public class JsonLog { public static void printJson(String tag, String msg, String headString) {

    String message;

    try {
        if (msg.startsWith("{")) {
            JSONObject jsonObject = new JSONObject(msg);
            message = jsonObject.toString(KLog.JSON_INDENT);
        } else if (msg.startsWith("[")) {
            JSONArray jsonArray = new JSONArray(msg);
            message = jsonArray.toString(KLog.JSON_INDENT);
        } else {
            message = msg;
        }
    } catch (JSONException e) {
        message = msg;
    }

    Util.printLine(tag, true);
    message = headString + KLog.LINE_SEPARATOR + message;
    String[] lines = message.split(KLog.LINE_SEPARATOR);
    for (String line : lines) {
        Log.d(tag, "║ " + line);
    }
    Util.printLine(tag, false);
}
}
