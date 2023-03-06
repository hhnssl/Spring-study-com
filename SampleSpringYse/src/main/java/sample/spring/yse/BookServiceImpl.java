package sample.spring.yse;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service는 Controller와 DAO를 연결하는 역할을 하고 있다.
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookDao bookDao;
	
/*	
 * @Autowired: 필요한 의존 객체의 '타입'에 해당하는 빈을 찾아 주입한다. (한마디로 의존성 주입하는 어노테이션)
 * xml(아마도 root-context.xml)에 명시하여 주입할 필요 없이, Autowired를 통해 BookDao의 객체 타입과 일치하는 Bean을 자동으로 주입함
*/
	
	@Override
	public String create(Map<String, Object> map) {
		int affectRowCount = this.bookDao.insert(map);
		if(affectRowCount == 1) {
			return map.get("book_id").toString();
		}
		return null;
	}
	
	
}
