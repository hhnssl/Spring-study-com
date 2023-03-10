package sample.spring.yse;

import java.util.List;
import java.util.Map;

//	책 입력 기능 서비스 클래스 메소드 생성
public interface BookService {

//	BookDao.insert 메소드를 실행시키는 (서비스) 메소드 시그니처
//	서비스 메소드는 BookServiceImpl 클래스에 작성할 것
	String create(Map<String, Object> map);

	
//	책 상세 서비스 인터페이스 메소드 시그니처
	Map<String, Object> detail(Map<String, Object> map);

// 책 정보 수정 시그
	boolean edit(Map<String, Object> map);

// 책 삭제 시그
	boolean remove(Map<String, Object> map);

// 책 목록 시그
	List<Map<String, Object>> list(Map<String, Object> map);
	
}
