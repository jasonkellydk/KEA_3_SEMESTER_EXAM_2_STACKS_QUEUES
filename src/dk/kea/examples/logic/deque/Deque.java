package dk.kea.examples.logic.deque;

import dk.kea.examples.logic.CSVReader;
import dk.kea.examples.logic.Node;
import dk.kea.examples.logic.deque.threads.DequeThread;
import java.util.ArrayList;
import java.util.LinkedList;

public class Deque extends Thread
{
    private LinkedList<Node> deque = new LinkedList<>();

    private CSVReader csvReader = new CSVReader();

    private ArrayList<Node> arrayList = csvReader.nodeArrayList();

    public void deque(String firstLetter)
    {
        Builder();
        String filterLetter= firstLetter.toUpperCase();

        DequeThread dequeThreadStart = new DequeThread(filterLetter, deque, false);
        DequeThread dequeThreadLast = new DequeThread(filterLetter, deque, true);

        dequeThreadStart.start();
        dequeThreadLast.start();
    }

    private void Builder()
    {
        deque.addAll(arrayList);
    }
}
