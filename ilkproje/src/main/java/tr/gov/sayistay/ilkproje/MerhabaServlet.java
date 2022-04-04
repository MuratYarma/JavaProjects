package tr.gov.sayistay.ilkproje;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class MerhabaServlet {
	@RequestMapping(value = "/", method = RequestMethod.GET)
//	@GetMapping(value ="/") aynısı
	@ResponseBody
	public String deneme() {
		System.out.println("deneme cagrıldı");
		return "Merhaba Dunya";

	}

}
