package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")

public class Ogrenci {
	
	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}
     @GetMapping("/listele")
	public List<String> listele(){
	   return OGRENCILER;	
	}

}
