public class LinkedEventList implements FutureEventList {

   private Node head;
   private int size, curSimTime;

   public LinkedEventList() {
      head = null;
      size = 0;
      curSimTime = 0;
   }

   @Override
   public int size() {return size;}

   @Override
   public int capacity() {return size;}

   @Override
   public int getSimulationTime() {return curSimTime;}

   @Override
   public void insert(Event e) {
      e.setInsertionTime(curSimTime);
      if(head == null){
         head = new Node(e);
      } else {
         Node newNode = new Node(e);
         Node curNode = head;
         while(curNode.getNext() != null && newNode.getData().getArrivalTime() > curNode.getNext().getData().getArrivalTime()){
            curNode = curNode.getNext();
         }
         
         newNode.setNext(curNode.getNext());
         if (curNode.getNext() != null) {
            curNode.getNext().setPrev(newNode);
         }
         curNode.setNext(newNode);
         newNode.setPrev(curNode);
      }
      size++;
   }

   @Override
   public Event removeFirst() {
      if (head == null) {
         return null;
      }

      Event removedEvent = head.getData();
      head = head.getNext();
      if (head != null) {
         head.getPrev().setNext(null);
         head.setPrev(null);
      }
      size--;
      this.curSimTime = removedEvent.getArrivalTime();
      return removedEvent;
   }

   @Override
   public boolean remove(Event e) {
      Node current = head;
      Node removed;
      while (current != null) {
         if (current.getData().equals(e)) {
            removed = current;
            if (current.getPrev() != null)
               current.getPrev().setNext(current.getNext());
            if (current.getNext() != null)
               current.getNext().setPrev(current.getPrev());
            if (current == head)
               head = current.getNext();
            size--;
            removed.getData().cancel();
            return true;
         }
         current = current.getNext();
      }
      return false;
   }



   
}
