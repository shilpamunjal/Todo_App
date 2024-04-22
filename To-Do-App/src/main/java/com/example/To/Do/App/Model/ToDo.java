package com.example.To.Do.App.Model;


	
	import java.util.Date;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.persistence.GeneratedValue;

	@Entity
	@Table (name="todo")
	public class ToDo {
		@Id
		@GeneratedValue(strategy = GenerationType .AUTO)
		private Long id;
		@Column
		private String title;
		@Column
		private Date date;
		@Column
		private String status;
		public ToDo() {
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

}
