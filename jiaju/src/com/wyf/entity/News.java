package com.wyf.entity;

import java.util.Date;

public class News {
	private int newsId;
	private Date newsDate;
	private String newsTitle;
	private String newsContent;
	private int newsClassId;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public Date getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public int getNewsClassId() {
		return newsClassId;
	}
	public void setNewsClassId(int newsClassId) {
		this.newsClassId = newsClassId;
	}
	public News(int newsId, Date newsDate, String newsTitle,
			String newsContent, int newsClassId) {
		super();
		this.newsId = newsId;
		this.newsDate = newsDate;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.newsClassId = newsClassId;
	}
	public News() {
		super();
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsDate=" + newsDate
				+ ", newsTitle=" + newsTitle + ", newsContent=" + newsContent
				+ ", newsClassId=" + newsClassId + "]";
	}
	
}
