package airplane;

import console.ConsoleOutput;
import storage.Storage;

import java.util.Objects;

public class Airplane extends Thread {
    String planeName;
    int runway;

    ConsoleOutput consoleOutput = new ConsoleOutput();

    public Airplane(String name, int runway) {
        planeName = name;
        this.runway = runway + 1;
    }

    private void removeAirplane() {
        for (int i = 0; i < Storage.allAirplanesName.size(); i++) {
            if (Objects.equals(Storage.allAirplanesName.get(i), planeName)) {
                Storage.allAirplanesName.remove(i);
            }
        }
    }

    @Override
    public void run() {
        try {
            consoleOutput.goToRunway(planeName, runway);
            Thread.sleep(3000);
            consoleOutput.planeEnteredTheRunway(planeName, runway);
            Thread.sleep(3000);
            consoleOutput.planeTookOff(planeName, runway);
            Thread.sleep(3000);
            consoleOutput.runwayClear(runway);
            removeAirplane();
            Thread.interrupted();
            Storage.runways[runway - 1] = "";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
