package dk.kea.examples.logic;

import java.util.*;

public class QueueFilter
{
    LinkedList<Node> queue = new LinkedList<>();

    CSVReader csvReader = new CSVReader();

    ArrayList<Node> arrayList = csvReader.nodeArrayList();

    public void queueTrue(String firstLetter)
    {
        Builder();
        String filterLetter= firstLetter.toUpperCase();

        while (queue.peekFirst() != null) {
            String Letter = String.valueOf(queue.peekFirst().getCity().charAt(0));

            if (Letter.equals(filterLetter)) {
                System.out.println(queue.pollFirst().getCity());

                continue;
            }

            queue.pollFirst();
        }
    }

    private void Builder()
    {
        queue.addAll(arrayList);
    }
}
