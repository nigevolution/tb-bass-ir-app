package com.tbbass.ir;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SupabaseService {

    public static String getIRList() {
        try {
            URL url = new URL("https://zyvqkqpdhwukbxmkgawa.supabase.co/rest/v1/irfiles");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("apikey", "sb_publishable_OT68Y68T113_9msiMlmeZg_ZIv-udl7");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) sb.append(line);
            br.close();
            return sb.toString();
        } catch (Exception e) {
            return "[]";
        }
    }
}
