package task23;

public class ATMLogic {

    private ATM aTM = new ATM();
    private DepositOperations depositOperations = new DepositOperations();

    public void startWorking() {
        while(true) {
            String dOrW = aTM.depositOrWithdraw();

//            String map = parking.printParkingMap();
//            parkomat.helloMessage(map);
//            Car car = parking.driveOut(newPlateNumber);
            if(dOrW == "D") {

                continue;
            } else if (dOrW == "W") {

                continue;
            }

//            int result = parking.driveIn(new Car(newPlateNumber));
//
//            if(result != -1) {
//                parkomat.showParkedPlace(result);
//            } else {
//                parkomat.showParkingFull();
//            }
        }
    }
}
