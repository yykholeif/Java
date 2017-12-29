//stacks (LIFO)

Stack newsFeed = new Stack();
newsFeed.push("Morning news");
newsFeed.push("Afternoon news");
newsFeed.push("Evening news");
String breakingNews = (String) newsFeed.pop();
System.out.println(breakingNews);

String peekNews = (String) newsFeed.peek();

//Queue (FIFO)

Queue orders = new LinkedList();
orders.add("Order1");
orders.add("Order2");
orders.add("Order3");
System.out.print(orders.poll());
System.out.print(orders.poll());
System.out.print(orders.poll());

//Generics remove the need to cast

ArrayList<String> listOfStrings = new ArrayList();

List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);

List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast

//Hashmaps to prevent need for iteration

public class Book{
   String title;
   String author;
   int numOfPages;
   int publishedYear;
   int edition;
   String ISBN;
}

public class Library{
   HashMap<String, Book> allBooks;
}

Book taleOfTwoCities = new Book();
allBooks.put("9781539687399", taleOfTwoCities);

Book findBookByISBN(String isbn){
   Book book = allBooks.get(isbn);
   return book;
}
