public class Node {
   private Event data;
   private Node next, prev;

   public Node(Event data) {
      this.data = data;
      next = null;
      prev = null;
   }

   public Event getData(){
      return data;
   }

   public Node getNext(){
      return next;
   }

   public Node getPrev(){
      return prev;
   }

   public void setNext(Node next){
      this.next = next;
   }

   public void setPrev(Node prev){
      this.prev = prev;
   }
}
