package com.cafe24.jblog.vo;

public class BlogVo {
	private String blogId;
	private String title;
	private String logo;

	public BlogVo() {}
	
	public BlogVo(String blogId, String title, String logo) {
		this.blogId = blogId;
		this.title = title;
		this.logo = logo;
	}

	public String getBlogId() {
		return blogId;
	}
	
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
