public class Flight {
    private Passenger head;

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newPassenger);
        }
    }

    public void removePassenger(String name) {
        if (head == null) return;

        if (head.getName().equals(name)) {
            head = head.getNext();
            return;
        }

        Passenger current = head;
        Passenger prev = null;
        while (current != null && !current.getName().equals(name)) {
            prev = current;
            current = current.getNext();
        }

        if (current != null) {
            prev.setNext(current.getNext());
        }
    }

    public void displayPassengers() {
        Passenger current = head;
        while (current != null) {
            System.out.println(current.getName());
            current = current.getNext();
        }
    }
}
