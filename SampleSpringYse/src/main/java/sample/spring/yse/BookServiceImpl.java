package sample.spring.yse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service�� Controller�� DAO�� �����ϴ� ������ �ϰ� �ִ�.
@Service
public class BookServiceImpl {
	@Autowired
	BookDao bookDao;
	
/*	
 * @Autowired: �ʿ��� ���� ��ü�� 'Ÿ��'�� �ش��ϴ� ���� ã�� �����Ѵ�. (�Ѹ���� ������ �����ϴ� ������̼�)
 * xml(�Ƹ��� root-context.xml)�� ����Ͽ� ������ �ʿ� ����, Autowired�� ���� BookDao�� ��ü Ÿ�԰� ��ġ�ϴ� Bean�� �ڵ����� ������
	
*/
}
