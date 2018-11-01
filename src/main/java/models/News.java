package models;

public class News {
	
	public News() {}
	
	public News(String title, String annotation, String details, String photo, String publish, String status) {
		this.title = title;
		this.annotation = annotation;
		this.details = details;
		this.photo = photo;
		this.publish = publish;
		this.status = status;
	}
	
	private int id;
	private String title;
	private String annotation;
	private String details;
	private String photo;
	private String publish;
	private String status;
	
	public int getId() { return id; }
	public String getTitle() { return title; }
	public String getAnnotation() { return annotation; }
	public String getDetails() { return details; }
	public String getPhoto() { return photo; }
	public String getPublish() { return publish; }
	public String getStatus() { return status; }
	
	public void setId(int id) { this.id = id; }
	public void setTitle(String title) { this.title = title; }
	public void setAnnotation(String annotation) { this.annotation = annotation; }
	public void setDetails(String details) { this.details = details; }
	public void setPhoto(String photo) { this.photo = photo; }
	public void setPublis(String publish) { this.publish = publish; }
	public void setStatus(String status) { this.status = status; }	
	
}
