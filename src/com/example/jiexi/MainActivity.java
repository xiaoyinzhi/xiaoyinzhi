package com.example.jiexi;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jiexi.adapter.MyAdapter;

public class MainActivity extends Activity {

	String path = "http://192.172.10.83:8080/Json/new.json";
	HttpsURLConnection url;

	MyAdapter adapter;
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (ListView) findViewById(R.id.lv_main);

		URL url;
		try {
			url = new URL(path);
			HttpURLConnection conn = ((HttpURLConnection) url.openConnection());
			conn.setRequestMethod("POST");

			InputStream in = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String str = "";
			StringBuffer sb = new StringBuffer();
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
			br.close();
			in.close();

			System.out.println(sb.toString());

			JSONObject object = new JSONObject(sb.toString());
			String total = null;
			String per_page = null;
			String current_page = null;
			String last_page = null;

			List<Data> datas = new ArrayList<Data>();
			total = object.getString("total");
			per_page = object.getString("per_page");
			current_page = object.getString("current_page");
			last_page = object.getString("last_page");

			JSONArray array = object.getJSONArray("data");
			for (int i = 0; i < object.length(); i++) {
				JSONObject object2 = array.getJSONObject(i);

				Data data = new Data();
				data.setContent(object2.getString("content"));
				data.setGroup_id(object2.getString("group_id"));
				data.setStickied(object2.getString("stickied"));
				data.setCreated_at(object2.getString("created_at"));
				data.setId(object2.getString("id"));
				data.setUp(object2.getString("up"));
				data.setTotal_replies(object2.getString("total_replies"));
				data.setVisits(object2.getString("visits"));

				JSONObject object3 = object2.getJSONObject("author");
				data.setAuthor_id(object3.getString("id"));
				data.setUsername(object3.getString("username"));
				data.setAvatar(object3.getString("avatar"));
				data.setMedal_id(object3.getString("medal_id"));
				data.setMedal_desc(object3.getString("medal_desc"));
				JSONObject object4 = object2.getJSONObject("group");
				data.setGroup_id2(object4.getString("id"));
				data.setGroup_title(object4.getString("title"));
				@SuppressWarnings("unused")
				JSONArray array2 = object2.getJSONArray("replies");
				JSONArray array3 = object2.getJSONArray("attachments");
				for (int j = 0; j < array3.length(); j++) {
					JSONObject object5 = array3.getJSONObject(j);
					data.setUrl(object5.getString("url"));
					data.setMime(object5.getString("mime"));
					data.setWidth(object5.getString("width"));
					data.setHeight(object5.getString("height"));
					data.setThumb(object5.getString("thumb"));
				}
				JSONArray array4 = object2.getJSONArray("last_up_users");
				for (int f = 0; f < array4.length(); f++) {
					JSONObject object5 = array4.getJSONObject(f);
					data.setLast_up_users_id(object5.getString("id"));
					data.setLast_up_users_avatar(object5.getString("username"));
					data.setLast_up_users_medal_id(object5
							.getString("medal_id"));
					data.setLast_up_users_medal_desc(object5
							.getString("medal_desc"));

					data.setTotal(total);
					data.setPer_page(per_page);
					data.setCurrent_page(current_page);
					data.setLast_page(last_page);

				}
				datas.add(data);
			}
			adapter = new MyAdapter(datas, this);
			lv.setAdapter(adapter);

			System.out.println(datas);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
