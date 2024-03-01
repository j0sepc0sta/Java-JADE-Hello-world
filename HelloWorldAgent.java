import jade.core.Agent;
import java.util.Iterator;

@SuppressWarnings("serial")
public class HelloWorldAgent extends Agent {
    @SuppressWarnings("unchecked")
    protected void setup(){
        System.out.println("Hello World i'm an agent");
        System.out.println("My local name is "+getAID().getLocalName());
        System.out.println("My GUI is "+getAID().getName());
        System.out.println("My adresses are: ");
        Iterator it =getAID().getAllAddresses();
        while (it.hasNext())
            System.out.println("- "+it.next());
        System.out.println("My adresses are: ");
        Object[] args = getArguments();
        if (args != null)
            for (int i=0;i<args.length;i++)
                System.out.println("- "+args[i]);
        doDelete();
    }
}