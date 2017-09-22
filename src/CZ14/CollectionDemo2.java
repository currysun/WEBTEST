package CZ14;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * 集合：集合是存储对象数据的集合容器。
 * 
 * 引入容器概念
 * 
 * 集合比数组的优势：
 * 		1.集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据。
 * 		2.集合的长度是会放声变化的，数组长度是固定的
 * 
 * --------| Collection 单列集合的根接口
 * 	----------| List 如果是实现了List接口的集合类，具备特点：有序，可重复。
 * 	----------| Set	 如果是实现了Set接口的集合类，具备特点：无序，不可重复
 * 
 * 掌握Collection 接口中的所有方法：
 * 		增加
 * 			add(E e) 
 * 			addAll(Collection<? extends E> c) 

 * 
 * 		删除
 * 			clear() 
 *   		remove(Object o)      
 			boolean removeAll(Collection<?> c)     
 			boolean retainAll(Collection<?> c)  

 * 
 * 		查看
 * 			size()
 * 		判断
 * 			contains(Object o) 
 * 			containsAll(Collection<?> c) 
 * 			equals(Object o) 
 * 			hashCode() 
 * 			isEmpty() 
 * 
 * 		迭代
 * 			iterator() 
 * 			toArray()
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 接口不能创建对象 Collection c=new Collection();，那要怎么样才能使用Collection的方法。
		Collection c=new ArrayList();
		Collection c2=new ArrayList();
		c.add("abc");
		c.add(1);
		c.add(5.6);
		c2.add("curry");
		c2.add("abc");
		/*
		 * 增加方法
		c2.add("curry");
		c2.add("durant");
		c.addAll(c2);
		
		删除方法
		c2.clear();
		删除集合中指定的元素，删除成功返回true，否则false
		c.remove("abc");
		
		删除c集合与c2集合中的交集元素
		c.removeAll(c2);
		
		保留交集元素，其余删除
		c.retainAll(c2);
		*/
		int n=c.size();
		System.out.println(c);
		System.out.println("集合的数量"+n);
	}

}
