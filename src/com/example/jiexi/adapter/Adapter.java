package com.example.jiexi.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jiexi.Data_head;

public class Adapter extends BaseAdapter{

	List<Data_head> data_heads;
	Context mContext;
	public Adapter(List<Data_head> data_heads, Context mContext) {
		super();
		this.data_heads = data_heads;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data_heads.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		return view;
	}

	class Holder{
		TextView tv_name;
		ImageView siv_img;
	} 
}
