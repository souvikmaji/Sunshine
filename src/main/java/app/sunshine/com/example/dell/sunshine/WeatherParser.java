package app.sunshine.com.example.dell.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by DELL on 14/02/2015.
 */
public class WeatherParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {

        // parsing code here
        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        return jsonObject
                .getJSONArray("list")
                .getJSONObject(dayIndex)
                .getJSONObject("temp")
                .getDouble("max");

    }

    public  static String getCity(String weatherJsonStr)
            throws JSONException{

        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        String city = jsonObject.getString("city");
        JSONObject jsonObject1 = new JSONObject(city);
         return jsonObject1.getString("name");


    }


}
