package airport;

import airplane.Airplane;
import storage.Storage;

public class Airport {
    public void airportDispatcher() {
        while (Storage.allAirplanesName.size() != 0) {
            for (int i = 0; i < Storage.runways.length; i++) {
                if (Storage.runways[i] == "") {
                    Thread thread = new Thread(new Airplane(Storage.allAirplanesName.get(0), i));
                    Storage.runways[i] = Storage.allAirplanesName.get(0);
                    Storage.allAirplanesName.remove(0);
                    thread.start();
                }
            }
        }
    }
}
