package Model_Manga;

import java.util.Date;


public class Managa {
	private long id;
	private String id_manga;
	private String name_manga;
	private String type_manga;
	private int chap_manga;
	private String status;
	private String description;
	private Date year_manga;
	private String author;
	private String image_manga;
	private String root_manga;
	private int rate_manga;
	
	public Managa() {
		
	}
	
	public Managa(String id_manga, String name_manga, String type_manga, int chap_manga, String status,
			String description, Date year_manga, String author, String image_manga, String root_manga, int rate_manga) {
		this.id_manga = id_manga;
		this.name_manga = name_manga;
		this.type_manga = type_manga;
		this.chap_manga = chap_manga;
		this.status = status;
		this.description = description;
		this.year_manga = year_manga;
		this.author = author;
		this.image_manga = image_manga;
		this.root_manga = root_manga;
		this.rate_manga = rate_manga;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_manga() {
		return id_manga;
	}

	public void setId_manga(String id_manga) {
		this.id_manga = id_manga;
	}

	public String getName_manga() {
		return name_manga;
	}

	public void setName_manga(String name_manga) {
		this.name_manga = name_manga;
	}

	public String getType_manga() {
		return type_manga;
	}

	public void setType_manga(String type_manga) {
		this.type_manga = type_manga;
	}

	public int getChap_manga() {
		return chap_manga;
	}

	public void setChap_manga(int chap_manga) {
		this.chap_manga = chap_manga;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getYear_manga() {
		return year_manga;
	}

	public void setYear_manga(Date year_manga) {
		this.year_manga = year_manga;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage_manga() {
		return image_manga;
	}

	public void setImage_manga(String image_manga) {
		this.image_manga = image_manga;
	}

	public String getRoot_manga() {
		return root_manga;
	}

	public void setRoot_manga(String root_manga) {
		this.root_manga = root_manga;
	}

	public int getRate_manga() {
		return rate_manga;
	}

	public void setRate_manga(int rate_manga) {
		this.rate_manga = rate_manga;
	}
	
	

}
