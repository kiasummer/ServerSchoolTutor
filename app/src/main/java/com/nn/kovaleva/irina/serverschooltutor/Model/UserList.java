package com.nn.kovaleva.irina.serverschooltutor.Model;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class UserList extends JsonBaseResponse {
    public static final String TAG = "UserList";
    public ArrayList<User> userList = new ArrayList<>();

    @Override
    public JSONObject toJson() {
        JSONObject obj = super.toJson();
        JSONArray arr1 = new JSONArray();
        for (User userItem : userList) {
            arr1.put(userItem.toJson());
        }
        try {
            obj.put("users", arr1);
        } catch (JSONException e) {
            Log.e(TAG, "toJSONObject: JSONException: " + e.getMessage());
        }
        return obj;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void fromJson(JSONObject obj) throws JSONException {
        super.fromJson(obj);
        JSONArray arr1 = obj.getJSONArray("users");
        for (int i = 0; i < arr1.length(); i ++){
            User user = new User();
            user.fromJson(arr1.getJSONObject(i));
            userList.add(user);
        }
    }
}
