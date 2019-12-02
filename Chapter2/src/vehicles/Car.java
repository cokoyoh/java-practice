package vehicles;

class Car {
    private String breaksCondition;

    void brake(int pedalPressure) {
        boolean useRegularBrakes;

        useRegularBrakes = checkForAntiLockBrakes(pedalPressure);

        if (useRegularBrakes) {
            useRegularBrakes();
        } else {
            useAtiLockBrakes();
        }
    }

    private boolean checkForAntiLockBrakes(int pressure) {
        return pressure > 100;
    }

    private void useRegularBrakes() {
        System.out.println("Using regular brakes");
    }

    private void useAtiLockBrakes() {
        System.out.println("Using anti-lock brakes");
    }
}
