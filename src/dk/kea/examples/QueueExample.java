package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.QueueFilter;

public class QueueExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate an queue";
    }

    @Override
    public String getName()
    {
        return "Queue example";
    }

    @Override
    public void runExample()
    {
        QueueFilter queue = new QueueFilter();

        queue.queueTrue("b");
    }
}
