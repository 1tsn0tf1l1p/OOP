import java.time.LocalTime;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(LocalTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public void delayFlight(int minutes) {
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }

    public void flightStatus() {
        System.out.println("Flight Number: " + this.flightNumber + ", Destination: " + this.destination + ", Departure: " + this.scheduledDeparture + ", Delay time: " + this.delayTime);
    }
}
