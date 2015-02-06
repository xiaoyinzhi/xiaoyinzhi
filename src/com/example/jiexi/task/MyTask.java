package com.example.jiexi.task;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import com.example.jiexi.listener.ongetimglistener;

public class MyTask extends AsyncTask<String, Void, Bitmap> {

	public ongetimglistener onget;

	public MyTask(ongetimglistener ongetimg) {
		// TODO Auto-generated constructor stub
		this.onget = ongetimg;
	}

	@Override
	protected Bitmap doInBackground(String... params) {
		// TODO Auto-generated method stub
		String uri = params[0];
//		System.out.println(uri);
		URL url;
		try {
			url = new URL(uri);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStream in = conn.getInputStream();
			Bitmap bit = BitmapFactory.decodeStream(in);
			
			System.out.println(bit);

			return bit;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void onPostExecute(Bitmap result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		onget.ongetimg(result);
	}
}
