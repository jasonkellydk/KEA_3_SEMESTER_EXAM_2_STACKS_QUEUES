package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.StackFilter;

public class StackExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate an stack";
    }

    @Override
    public String getName()
    {
        return "Stack example";
    }

    @Override
    public void runExample()
    {
        StackFilter stack = new StackFilter();
        stack.stackTrue("b");
    }
}
