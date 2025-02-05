public class Message extends Event {

   Host src;
   int dest;

   public Message(Host src, int dest) {
      super();
      this.src = src;
      this.dest = dest;
   }

   @Override
   public void setInsertionTime(int currentTime) {
      this.insertionTime = currentTime;
   }

   @Override
   public void handle() {
      switch ("") {
         case "request":
            break;
         case "response":
            src.receive(this);
            break;
         default:
            break;
      }
   }

   public String getMessage() {
      String message = "";
      return message;
   }

   public int getSrcAddress() {
      return src.getHostAddress();
   }

   public int getDestAddress() {
      return dest;
   }

   public void setNextHop(Host nextHop, int distance) {
      src = nextHop;


   }

   @Override
   public void cancel() {
      System.err.println("you can't cancel message");
   }

}
