package br.com.workshopmongodb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.workshopmongodb.dto.AuthorDto;
import br.com.workshopmongodb.dto.CommentDto;

@Document
public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date data;
	private String title;
	private String body;
	private AuthorDto author;
	
	private List<CommentDto> comment = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(String id, Date data, String title, String body, AuthorDto author) {
		this.id = id;
		this.data = data;
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	

	public AuthorDto getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDto author) {
		this.author = author;
	}
	
	

	public List<CommentDto> getComment() {
		return comment;
	}

	public void setComment(List<CommentDto> comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", data=" + data + ", title=" + title + ", body=" + body + "]";
	}
	
	

}
