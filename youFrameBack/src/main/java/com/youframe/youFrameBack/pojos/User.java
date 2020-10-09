package com.youframe.youFrameBack.pojos;

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.Table;

//import org.springframework.data.annotation.*;
import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
	
	
	private Integer imgid;
		private byte[] image;
		 
		
		

		    public User() {
			super();
		}



			public User(Integer imgid, byte[] image) {
			super();
			this.imgid = imgid;
			this.image = image;
		}



			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="")
		public Integer getImgid() {
			return imgid;
		}



		public void setImgid(Integer imgid) {
			this.imgid = imgid;
		}


       @Lob
		public byte[] getImage() {
			return image;
		}



		public void setImage(byte[] image) {
			this.image = image;
		}



		@Override
		public String toString() {
			return "User [imgid=" + imgid + ", image=" + Arrays.toString(image) + "]";
		}
		 
		 

}
