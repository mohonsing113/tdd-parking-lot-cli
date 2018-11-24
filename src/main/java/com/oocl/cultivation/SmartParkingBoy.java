package com.oocl.cultivation;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkingLotCenter parkingLotCenter) {
        super(parkingLotCenter);
    }

    @Override
    public Optional<ParkingLot> selectParkingLot() {
        return parkingLotCenter.getParkingLots().stream()
                .max(Comparator.comparing(ParkingLot::getAvailableParkingPosition));
    }
}
