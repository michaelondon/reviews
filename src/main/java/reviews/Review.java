package reviews;

public class Review {
		
		//Instance variables: year, make, model, imageUrl, frame, review,  
		private long year;
		private String make;
		private String model;
		private String imageUrl;
		private String frame;
		private String review;
		private String synopsis;
		private String tag;
		
		//Constructor
		public Review(long year, String make, String model, String imageUrl, String frame, String review, String synopsis, String tag){
		 this.year = year;
		 this.make = make;
		 this.model = model;
		 this.imageUrl = imageUrl;
		 this.frame = frame;
		 this.review = review;
		 this.synopsis = synopsis;
		 this.tag = tag;
		 
		}
		//Getters
		public long getYear() {
			return year;
		}
		public String getMake() {
			return make;
		}
		public String getModel() {
			return model;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public String getFrame() {
			return frame;
		}
		public String getReview() {
			return review;
		}
		public String getSynopsis() {
			return synopsis;
		}
		public String getTag() {
			return tag;
		}
		//public String toString() { 
		//	return "Id: "+ id + "Title: " + make;
		//}

	}


