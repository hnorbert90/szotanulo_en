
package Tools;


public abstract class ThreadControll implements Runnable {
   private Thread t;
   private final String threadName="Thread";


   @Override
   public abstract void run();

   public void start () {
        
      if (t == null) {
         t = new Thread ((Runnable) this, threadName);
         t.start ();
      }
   }
}
