package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Relation")
public class Relations {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", updatable = false, nullable = false)
		private Long id;
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "user_id")
		private Users user;
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "film_id")
		private FilmsEntity filmsEntity;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Users getUser() {
			return user;
		}
		public void setUser(Users user) {
			this.user = user;
		}
		public FilmsEntity getFilmsEntity() {
			return filmsEntity;
		}
		public void setFilmsEntity(FilmsEntity filmsEntity) {
			this.filmsEntity = filmsEntity;
		}
		
		
}
