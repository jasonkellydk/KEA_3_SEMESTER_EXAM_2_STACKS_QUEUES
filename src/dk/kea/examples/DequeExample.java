package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.deque.Deque;

public class DequeExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "THis example will demonstrate deques";
    }

    @Override
    public String getName()
    {
        return "Deque example";
    }

    @Override
    public void runExample()
    {
        Deque deque = new Deque();

        deque.deque("b");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
