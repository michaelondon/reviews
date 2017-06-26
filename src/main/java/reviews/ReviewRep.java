package reviews;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRep {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRep() {
    
	//Constructor: year, make, model, imageUrl, frame, review,
	Review review = new Review(12345, "2016"," Scott","Solace disc", "url", "/images/Solace.jpg"," Full-Carbon", "Full of poise on the descents.");
	reviewMap.put(review.getYear(),review);
	Review review2 = new Review(13579, "2014"," Specialized"," Secteur Elite","url","/images/Sector.JPG", "A1 Premium Aluminium", "Rough ride undermine its potential.");
	reviewMap.put(review2.getYear(),review2);
	Review review3 = new Review(17777, "1984"," Centurion"," LeMans","url", "/images/LeMans.JPG", "Steal", "Vintage road bike the strongest and lightest bike of it time ");
	reviewMap.put(review3.getYear(),review3);
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long year) {
    
		return reviewMap.get(year);
    }
}
