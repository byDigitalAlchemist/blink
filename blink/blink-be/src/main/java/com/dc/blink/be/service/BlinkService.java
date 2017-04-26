package com.dc.blink.be.service;

import java.util.ArrayList;
import java.util.List;

import com.dc.blink.entity.Blink;

public class BlinkService {
	List<Blink> blinks = new ArrayList<>();
	
	
	public BlinkService(){
		Blink blink1 = new Blink(1L,"America's least favorite airline (hint: it's not United)","CNN", "http://i2.cdn.cnn.com/cnnnext/dam/assets/160428220546-cnnmoney-spirit-airlines-large-tease.jpg");
		Blink blink2 = new Blink(2L,"Country backs down on border wall funding","BBC", "https://ichef.bbci.co.uk/news/624/cpsprodpb/1823E/production/_95787889_wall_getty976.jpg");
		Blink blink3 = new Blink(3L,"Was offered Rs10 bn to hold silence on Panama case: PTI Chairperson Imran Khan","GEO", "https://www.geo.tv/assets/uploads/updates/2017-04-26/l_139372_061700_updates.jpg");
		Blink blink4 = new Blink(4L,"With Baby in Tow, a Star Returns to Tennis — and Her Roots","NTYIMES", "https://static01.nyt.com/images/2017/04/26/sports/26AZARENKA-jp1/26AZARENKA09-largeHorizontal375.jpg");
		Blink blink5 = new Blink(5L,"Mob robs train","YHOO", "https://s.yimg.com/uu/api/res/1.2/.UpZsOSj4rxl0qsJ85LjEQ--/Zmk9c3RyaW07aD0zODY7cHlvZmY9MDtxPTgwO3c9NDQwO3NtPTE7YXBwaWQ9eXRhY2h5b24-/http://l.yimg.com/yp/offnetwork/e9e61f774b7ea3bce6ffc78e4601f563");
		Blink blink6 = new Blink(6L,"Women's division revolts against Charlotte","WWE", "http://www.wwe.com/f/styles/wwe_16_9_l/public/all/2017/04/141_SD_04252017jg_0541--8852969589f991086153f5be947d7d50.jpg");
		
		blinks.add(blink1);
		blinks.add(blink2);
		blinks.add(blink3);
		blinks.add(blink4);
		blinks.add(blink5);
		blinks.add(blink6);
	}
	
	// returns a list of all users
	public List<Blink> getAllBlinks() {
		return blinks;
	}

	// returns a single user by id
	public Blink getBlink(int id) {
		return blinks.get(id);
	}

	// creates a new user
	public Blink createBlink(String name, String email) {
		return null;
	}

	// updates an existing user
	public Blink updateBlink(String id, String name, String email) {
		return null;
	}

}
