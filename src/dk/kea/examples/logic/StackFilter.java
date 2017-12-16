package dk.kea.examples.logic;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackFilter
{
    LinkedList<Node> stack = new LinkedList<>();

    CSVReader csvReader = new CSVReader();

    ArrayList<Node> arrayList = csvReader.nodeArrayList();

    public void stackTrue(String firstLetter)
    {
        Builder();
        String filterLetter = firstLetter.toUpperCase();

        while (stack.peekLast() != null) {
            String Letter = String.valueOf(stack.peekLast().getCity().charAt(0));

            if (Letter.equals(filterLetter)) {
                System.out.println(stack.pollLast().getCity());

                continue;
            }

            stack.pollLast();
        }
    }

    private void Builder()
    {
        stack.addAll(arrayList);
    }
}
