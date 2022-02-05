package console;

public class ConsoleOutput {
    public void goToRunway(String airplaneModel, int runway) {
        System.out.println("The " + airplaneModel + " aircraft enters the runway number " + runway + ".");
    }

    public void planeTookOff(String airplaneModel, int runway) {
        System.out.println("The " + airplaneModel + " plane took off from the runway number " + runway + ".");
    }

    public void planeEnteredTheRunway(String airplaneModel, int runway) {
        System.out.println("The " + airplaneModel + " aircraft is on the runway number " + runway + ". Prepare for takeoff.");
    }

    public void runwayClear(int runway) {
        System.out.println("The runway number " + runway + " is empty.");
    }
}
