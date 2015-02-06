package com.example.jiexi;

public class Data {
	private String total;
	private String per_page;
	private String current_page;
	private String last_page;
	private String data;
	
	private String content;
	private String group_id;
	private String stickied;
	private String created_at;
	private String id;
	private String up;
	private String total_replies;
	private String visits;
	
	private String author;
		private String author_id;
		private String username;
		private String avatar;
		private String medal_id;
		private String medal_desc;
	private String group;
			private String group_id2;
			private String group_title;
	private String replies;
	private String attachments;
			private String url;
			private String mime;
			private String width;
			private String height;
			private String thumb;
	private String last_up_users;
				private String last_up_users_id;
				private String last_up_users_username;
				private String last_up_users_avatar;
				private String last_up_users_medal_id;
				private String last_up_users_medal_desc;
				public Data(String total, String per_page, String current_page,
						String last_page, String data, String content,
						String group_id, String stickied, String created_at,
						String id, String up, String total_replies,
						String visits, String author, String author_id,
						String username, String avatar, String medal_id,
						String medal_desc, String group, String group_id2,
						String group_title, String replies, String attachments,
						String url, String mime, String width, String height,
						String thumb, String last_up_users,
						String last_up_users_id, String last_up_users_username,
						String last_up_users_avatar,
						String last_up_users_medal_id,
						String last_up_users_medal_desc) {
					super();
					this.total = total;
					this.per_page = per_page;
					this.current_page = current_page;
					this.last_page = last_page;
					this.data = data;
					this.content = content;
					this.group_id = group_id;
					this.stickied = stickied;
					this.created_at = created_at;
					this.id = id;
					this.up = up;
					this.total_replies = total_replies;
					this.visits = visits;
					this.author = author;
					this.author_id = author_id;
					this.username = username;
					this.avatar = avatar;
					this.medal_id = medal_id;
					this.medal_desc = medal_desc;
					this.group = group;
					this.group_id2 = group_id2;
					this.group_title = group_title;
					this.replies = replies;
					this.attachments = attachments;
					this.url = url;
					this.mime = mime;
					this.width = width;
					this.height = height;
					this.thumb = thumb;
					this.last_up_users = last_up_users;
					this.last_up_users_id = last_up_users_id;
					this.last_up_users_username = last_up_users_username;
					this.last_up_users_avatar = last_up_users_avatar;
					this.last_up_users_medal_id = last_up_users_medal_id;
					this.last_up_users_medal_desc = last_up_users_medal_desc;
				}
				public Data() {
					// TODO Auto-generated constructor stub
				}
				@Override
				public String toString() {
					return "Data [total=" + total + ", per_page=" + per_page
							+ ", current_page=" + current_page + ", last_page="
							+ last_page + ", data=" + data + ", content="
							+ content + ", group_id=" + group_id
							+ ", stickied=" + stickied + ", created_at="
							+ created_at + ", id=" + id + ", up=" + up
							+ ", total_replies=" + total_replies + ", visits="
							+ visits + ", author=" + author + ", author_id="
							+ author_id + ", username=" + username
							+ ", avatar=" + avatar + ", medal_id=" + medal_id
							+ ", medal_desc=" + medal_desc + ", group=" + group
							+ ", group_id2=" + group_id2 + ", group_title="
							+ group_title + ", replies=" + replies
							+ ", attachments=" + attachments + ", url=" + url
							+ ", mime=" + mime + ", width=" + width
							+ ", height=" + height + ", thumb=" + thumb
							+ ", last_up_users=" + last_up_users
							+ ", last_up_users_id=" + last_up_users_id
							+ ", last_up_users_username="
							+ last_up_users_username
							+ ", last_up_users_avatar=" + last_up_users_avatar
							+ ", last_up_users_medal_id="
							+ last_up_users_medal_id
							+ ", last_up_users_medal_desc="
							+ last_up_users_medal_desc + "]";
				}
				public String getTotal() {
					return total;
				}
				public void setTotal(String total) {
					this.total = total;
				}
				public String getPer_page() {
					return per_page;
				}
				public void setPer_page(String per_page) {
					this.per_page = per_page;
				}
				public String getCurrent_page() {
					return current_page;
				}
				public void setCurrent_page(String current_page) {
					this.current_page = current_page;
				}
				public String getLast_page() {
					return last_page;
				}
				public void setLast_page(String last_page) {
					this.last_page = last_page;
				}
				public String getData() {
					return data;
				}
				public void setData(String data) {
					this.data = data;
				}
				public String getContent() {
					return content;
				}
				public void setContent(String content) {
					this.content = content;
				}
				public String getGroup_id() {
					return group_id;
				}
				public void setGroup_id(String group_id) {
					this.group_id = group_id;
				}
				public String getStickied() {
					return stickied;
				}
				public void setStickied(String stickied) {
					this.stickied = stickied;
				}
				public String getCreated_at() {
					return created_at;
				}
				public void setCreated_at(String created_at) {
					this.created_at = created_at;
				}
				public String getId() {
					return id;
				}
				public void setId(String id) {
					this.id = id;
				}
				public String getUp() {
					return up;
				}
				public void setUp(String up) {
					this.up = up;
				}
				public String getTotal_replies() {
					return total_replies;
				}
				public void setTotal_replies(String total_replies) {
					this.total_replies = total_replies;
				}
				public String getVisits() {
					return visits;
				}
				public void setVisits(String visits) {
					this.visits = visits;
				}
				public String getAuthor() {
					return author;
				}
				public void setAuthor(String author) {
					this.author = author;
				}
				public String getAuthor_id() {
					return author_id;
				}
				public void setAuthor_id(String author_id) {
					this.author_id = author_id;
				}
				public String getUsername() {
					return username;
				}
				public void setUsername(String username) {
					this.username = username;
				}
				public String getAvatar() {
					return avatar;
				}
				public void setAvatar(String avatar) {
					this.avatar = avatar;
				}
				public String getMedal_id() {
					return medal_id;
				}
				public void setMedal_id(String medal_id) {
					this.medal_id = medal_id;
				}
				public String getMedal_desc() {
					return medal_desc;
				}
				public void setMedal_desc(String medal_desc) {
					this.medal_desc = medal_desc;
				}
				public String getGroup() {
					return group;
				}
				public void setGroup(String group) {
					this.group = group;
				}
				public String getGroup_id2() {
					return group_id2;
				}
				public void setGroup_id2(String group_id2) {
					this.group_id2 = group_id2;
				}
				public String getGroup_title() {
					return group_title;
				}
				public void setGroup_title(String group_title) {
					this.group_title = group_title;
				}
				public String getReplies() {
					return replies;
				}
				public void setReplies(String replies) {
					this.replies = replies;
				}
				public String getAttachments() {
					return attachments;
				}
				public void setAttachments(String attachments) {
					this.attachments = attachments;
				}
				public String getUrl() {
					return url;
				}
				public void setUrl(String url) {
					this.url = url;
				}
				public String getMime() {
					return mime;
				}
				public void setMime(String mime) {
					this.mime = mime;
				}
				public String getWidth() {
					return width;
				}
				public void setWidth(String width) {
					this.width = width;
				}
				public String getHeight() {
					return height;
				}
				public void setHeight(String height) {
					this.height = height;
				}
				public String getThumb() {
					return thumb;
				}
				public void setThumb(String thumb) {
					this.thumb = thumb;
				}
				public String getLast_up_users() {
					return last_up_users;
				}
				public void setLast_up_users(String last_up_users) {
					this.last_up_users = last_up_users;
				}
				public String getLast_up_users_id() {
					return last_up_users_id;
				}
				public void setLast_up_users_id(String last_up_users_id) {
					this.last_up_users_id = last_up_users_id;
				}
				public String getLast_up_users_username() {
					return last_up_users_username;
				}
				public void setLast_up_users_username(String last_up_users_username) {
					this.last_up_users_username = last_up_users_username;
				}
				public String getLast_up_users_avatar() {
					return last_up_users_avatar;
				}
				public void setLast_up_users_avatar(String last_up_users_avatar) {
					this.last_up_users_avatar = last_up_users_avatar;
				}
				public String getLast_up_users_medal_id() {
					return last_up_users_medal_id;
				}
				public void setLast_up_users_medal_id(String last_up_users_medal_id) {
					this.last_up_users_medal_id = last_up_users_medal_id;
				}
				public String getLast_up_users_medal_desc() {
					return last_up_users_medal_desc;
				}
				public void setLast_up_users_medal_desc(String last_up_users_medal_desc) {
					this.last_up_users_medal_desc = last_up_users_medal_desc;
				}
}
