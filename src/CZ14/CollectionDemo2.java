package CZ14;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * ���ϣ������Ǵ洢�������ݵļ���������
 * 
 * ������������
 * 
 * ���ϱ���������ƣ�
 * 		1.���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������͵����ݡ�
 * 		2.���ϵĳ����ǻ�����仯�ģ����鳤���ǹ̶���
 * 
 * --------| Collection ���м��ϵĸ��ӿ�
 * 	----------| List �����ʵ����List�ӿڵļ����࣬�߱��ص㣺���򣬿��ظ���
 * 	----------| Set	 �����ʵ����Set�ӿڵļ����࣬�߱��ص㣺���򣬲����ظ�
 * 
 * ����Collection �ӿ��е����з�����
 * 		����
 * 			add(E e) 
 * 			addAll(Collection<? extends E> c) 

 * 
 * 		ɾ��
 * 			clear() 
 *   		remove(Object o)      
 			boolean removeAll(Collection<?> c)     
 			boolean retainAll(Collection<?> c)  

 * 
 * 		�鿴
 * 			size()
 * 		�ж�
 * 			contains(Object o) 
 * 			containsAll(Collection<?> c) 
 * 			equals(Object o) 
 * 			hashCode() 
 * 			isEmpty() 
 * 
 * 		����
 * 			iterator() 
 * 			toArray()
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ӿڲ��ܴ������� Collection c=new Collection();����Ҫ��ô������ʹ��Collection�ķ�����
		Collection c=new ArrayList();
		Collection c2=new ArrayList();
		c.add("abc");
		c.add(1);
		c.add(5.6);
		c2.add("curry");
		c2.add("abc");
		/*
		 * ���ӷ���
		c2.add("curry");
		c2.add("durant");
		c.addAll(c2);
		
		ɾ������
		c2.clear();
		ɾ��������ָ����Ԫ�أ�ɾ���ɹ�����true������false
		c.remove("abc");
		
		ɾ��c������c2�����еĽ���Ԫ��
		c.removeAll(c2);
		
		��������Ԫ�أ�����ɾ��
		c.retainAll(c2);
		*/
		int n=c.size();
		System.out.println(c);
		System.out.println("���ϵ�����"+n);
	}

}
