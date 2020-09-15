package waitingqueue; // this still frustrates me

import java.util.LinkedList;

final class Queue { // not sure if I'd want a static class here, but I'm still going to complain
                    // that I don't even have the option to do so
    LinkedList<Taxi> queue;

    Queue() {
        queue = new LinkedList<Taxi>();
    }

    void Enter(Taxi _taxi) {
        queue.addLast(_taxi);
    }

    Taxi Leave() {
        return queue.removeFirst();
    }
}