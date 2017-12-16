package dk.kea.examples.logic.deque.threads;

import dk.kea.examples.logic.Node;

import java.util.LinkedList;

public class DequeThread extends Thread
{
    private String filterLetter;

    private LinkedList<Node> deque = null;

    private Boolean last = false;

    public DequeThread(String filterLetter, LinkedList<Node> deque, Boolean last)
    {
        this.filterLetter = filterLetter;
        this.deque = deque;
        this.last = last;
    }

    public void run()
    {
        if (last) {
            while (deque.peekLast()!= null) {
                String Letter = String.valueOf(deque.peekLast().getCity().charAt(0));

                if (Letter.equals(filterLetter)) {
                    System.out.println("Thread2: "+deque.pollLast().getCity());

                    return;
                }

                deque.pollLast();
            }

            return;
        }

        while (deque.peekFirst()!= null) {
            String Letter = String.valueOf(deque.peekFirst().getCity().charAt(0));

            if (Letter.equals(filterLetter)) {
                System.out.println("Thread1: " + deque.pollFirst().getCity());

                return;
            }

            deque.pollFirst();
        }
    }
}