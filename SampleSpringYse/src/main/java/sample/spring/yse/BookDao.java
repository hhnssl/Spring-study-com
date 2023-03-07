package sample.spring.yse;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate; // MyBatis 쿼리문을 실행하는 역할

	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map); // book_SQL.xml에서 namespace=book, id=insert해서 book.insert
		// MyBatis는 namespace+id 조합으로 쿼리를 찾아서 수행함.
	}

//	책 상세 메소드
	public Map<String, Object> selectDetail(Map<String, Object> map) {
//		실제 쿼리문 실행
		return this.sqlSessionTemplate.selectOne("book.select_detail", map); //(쿼리아이디, 조건)
	}


}
