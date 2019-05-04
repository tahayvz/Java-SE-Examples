package egitimtwo;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayListTutorial {

public static void main(String[] args){
	ArrayList<String> list=new ArrayList<String>();
	list.add("Hello");
	list.add("World");
	System.out.println(list);
	list.add("taha yavuz");
	list.add("omer yavuz");
	System.out.println(list);
	list.remove("omer yavuz");
	System.out.println(list);
	
	if(list.contains("taha yavuz")){
	System.out.println("taha yavuz is a member");
	}
	
	System.out.println("size of list: "+list.size()+ " is empty: "+list.isEmpty());
	
	Iterator<String> iter =list.iterator();
	while(iter.hasNext()){
	System.out.println(iter.next());
	}
	
/*iter methods 
public boolean hasNext();
public object next();
public void remove();
*/

ArrayList<String> languages= new ArrayList<String>();
languages.add("java");
languages.add("swift");
languages.add("javascript");
languages.add("java");

Iterator<String> i=languages.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}

//lists are subtype of collection. listler içerdiði elementlerin sýrasýný korur ve elle sýralanabilir
//Arraylist ve linkedlist ler var
list.set(0, "Turkey");
list.set(1, "Istanbul");
list.set(2, "Yalova");
System.out.println(list);
list.remove(1);
System.out.println(list);
//arraylist random eklemede hýzlý fakat listenin ortalarýna eklemede yavaþtýr

HashSet<String> salesRegion =new HashSet<String>();
salesRegion.add("taha");
salesRegion.add("istanbul"); //add all valid salesRegion
salesRegion.add("yalova");
salesRegion.add("yavuz");//has no effect -duplicate element
System.out.println(salesRegion);
//HashSet eklendiði þekilde deðil depolandýðý þekilde sýralanýr

TreeSet<Integer> tree=new TreeSet<Integer>();
tree.add(88);
tree.add(53);
tree.add(66);
tree.add(12);
Iterator<Integer> iter2=tree.iterator();
while(iter2.hasNext()) {
	System.out.println(iter2.next()+" ");
}
Set orderedSet = new TreeSet();
orderedSet.add("A");
orderedSet.add("3");
orderedSet.add("b");
System.out.println(orderedSet);
//order of unicode characters (they are ordered as numbers, capital letters, and then lower case letters).

ArrayBlockingQueue queue=new ArrayBlockingQueue(5);
queue.offer("omer yavuz");
queue.offer("tha yavuz");
queue.offer("bnymn yavuz");
queue.offer("xx yavuz");
queue.offer("yy yavuz");
queue.offer("not added queue at capacity"); 
System.out.println(queue);
String superHero=(String) queue.poll(); //remove() first element
System.out.println(superHero);
String nextHero=(String)queue.peek(); //elemenet() show first element
System.out.println(nextHero);

String superHero2=(String) queue.poll(); //remove() first element
System.out.println(superHero2);
String nextHero2=(String)queue.peek(); //elemenet() show first element
System.out.println(nextHero2);

ArrayDeque deque=new ArrayDeque();
deque.offerFirst("aaa");
deque.offerFirst("bbb");//could also call addFirst()
deque.offerFirst("ccc");
deque.offerFirst("ddd");
deque.offerFirst("eee");
deque.offerFirst("fff");
System.out.println(deque);
System.out.println(deque.pollLast());//removeFirst()
System.out.println(deque.pollFirst());//removeLast()
System.out.println(deque);
System.out.println(deque.pop());//removeLast()
System.out.println(deque);

Map map=new HashMap();
MyDate birthday=new MyDate(1,1,1991);
MyDate xday=new MyDate(6,7,1992);
MyDate yday=new MyDate(4,15,1993);
map.put("birthday",birthday); //key-value pairs are used to "add"
map.put("xday",xday);
map.put("yday",yday);
MyDate d= (MyDate)map.get("birthday"); //get a value by key
map.remove("xday");
System.out.println(map);
System.out.println(map.get("birthday"));
if(map.containsKey("birthday"))
	System.out.println("my birthday is a key in the map");
if(map.containsValue(yday))
	System.out.println("my yday is a value in the map");
System.out.println(map);
Set s=map.keySet();
System.out.println(s);
Collection c=map.values();
System.out.println(c);


}
}