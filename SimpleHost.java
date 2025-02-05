public class SimpleHost extends Host {

   public SimpleHost() {
      super();
   }

   public void sendPings(int destAddr, int interval, int duration) {
      System.out.printf("[%dts] Host %d: Sent ping to host %d%n",interval,this.getHostAddress(),destAddr);
      Message process = new Message(this, destAddr);
      this.newTimer(duration);
      this.sendToNeighbor(process);
      
   }

   @Override
   protected void receive(Message msg) {
      
   }








































   //unecessary
   @Override
   protected void timerExpired(int eventId) {
      System.out.println("Timer expired: " + eventId);
   }

   @Override
   protected void timerCancelled(int eventId) {
      System.out.println("Timer cancelled: " + eventId);
   }

}
