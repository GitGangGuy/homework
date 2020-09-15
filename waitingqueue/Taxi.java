package waitingqueue;

final class Taxi {
    Passenger driver;
    Passenger[] passengers;

    Taxi(Passenger _driver, Passenger[] _passengers) {
        driver = _driver;
        passengers = _passengers;
    }
}