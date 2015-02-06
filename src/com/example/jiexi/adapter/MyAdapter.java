package com.example.jiexi.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jiexi.Data;
import com.example.jiexi.R;
import com.example.jiexi.listener.ongetimglistener;
import com.example.jiexi.task.MyTask;

public class MyAdapter extends BaseAdapter {

	List<Data> datas;
	Context mContext;

	public MyAdapter(List<Data> mDatas, Context mContext) {
		super();
		this.datas = mDatas;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return datas.size();
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
		final Holder holder;

		if (view == null) {
			view = LayoutInflater.from(mContext).inflate(
					R.layout.friends_circle_item, null);
			holder = new Holder();
			holder.friends_name = (TextView) view
					.findViewById(R.id.friends_name);
			holder.content=(TextView) view.findViewById(R.id.content);
			holder.place=(TextView) view.findViewById(R.id.place);
			holder.time=(TextView) view.findViewById(R.id.time);
			holder.zan_name=(TextView) view.findViewById(R.id.zan_name);
			holder.tv_comment_name=(TextView) view.findViewById(R.id.tv_comment_name);
			holder.tv_comment_content=(TextView) view.findViewById(R.id.tv_comment_content);
			holder.tv_comment_huifu=(TextView) view.findViewById(R.id.tv_comment_huifu);
			holder.others=(TextView) view.findViewById(R.id.others);
			
			holder.review=(ImageView) view.findViewById(R.id.review);
			holder.fridens_image=(ImageView) view.findViewById(R.id.friends_image);
			view.setTag(holder);
		}else{
			holder=(Holder) view.getTag();
		}
		Data data=datas.get(position);
		holder.friends_name.setText(data.getUsername());
		holder.content.setText(data.getContent());
		holder.place.setText(data.getAuthor_id());
		holder.time.setText(data.getCreated_at());
		holder.zan_name.setText(data.getMedal_id());
		holder.tv_comment_content.setText(data.getReplies());
		holder.tv_comment_name.setText(data.getId());
		
		holder.fridens_image.setTag(data.getAvatar());
		final String uri = data.getAvatar();
		if (uri.equals(data.getAvatar())) {
			new MyTask(new ongetimglistener() {
				public void ongetimg(Bitmap bit) {
					if (holder.fridens_image.getTag() != null
							&& holder.fridens_image.getTag().equals(uri)) {
						holder.fridens_image.setImageBitmap(bit);
					}
				}
			}).execute(uri);
		}
		return view;
	}

	class Holder {
		TextView head_name, friends_name, content, place, time, zan_name,
				tv_comment_name, tv_comment_content, others, tv_comment_huifu;
		ImageView head_image, fridens_image, review, good_img, comment_img,
				zan_image, line;
	}

}
