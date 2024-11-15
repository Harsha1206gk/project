package com.sece;

public class inventory {

}

class PackageDeliveryThread extends Thread {
    private Package pkg;
    private CourierService service;

    public PackageDeliveryThread(Package pkg, CourierService service) {
        this.pkg = pkg;
        this.service = service;
    }

    @Override
    public void run() {
        try {
            // Simulate delivery delay
            Thread.sleep(2000);
            service.updateStatus(pkg.getTrackingNumber(), DeliveryStatus.DELIVERED);
        } catch (InterruptedException | Exception e) {
            e.printStackTrace();
        }
    }
}
