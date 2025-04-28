public class Aircraft {
    public final AircraftModels aircraftModel;
    public final double aircraftLength;
    public final int cruisingSpeed;
    public final double maxHeightFlight;
    public final int maxRangeFlight;
    public final int countBusinessSpaces;
    public final int countEconomySpaces;

    public Aircraft(
            AircraftModels aircraftModel, double aircraftLength,
            int cruisingSpeed, double maxHeightFlight,
            int maxRangeFlight, int countBusinessSpaces,
            int countEconomySpaces) {
        this.aircraftModel = aircraftModel;
        this.aircraftLength = aircraftLength;
        this.cruisingSpeed = cruisingSpeed;
        this.maxHeightFlight = maxHeightFlight;
        this.maxRangeFlight = maxRangeFlight;
        this.countBusinessSpaces = countBusinessSpaces;
        this.countEconomySpaces = countEconomySpaces;
    }

    public AircraftModels getAircraftModel() {
        return aircraftModel;
    }

    public double getAircraftLength() {
        return aircraftLength;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public double getMaxHeightFlight() {
        return maxHeightFlight;
    }

    public int getMaxRangeFlight() {
        return maxRangeFlight;
    }

    public int getCountBusinessSpaces() {
        return countBusinessSpaces;
    }

    public int getCountEconomySpaces() {
        return countEconomySpaces;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftModel=" + aircraftModel +
                ", aircraftLength=" + aircraftLength +
                ", cruisingSpeed=" + cruisingSpeed +
                ", maxHeightFlight=" + maxHeightFlight +
                ", maxRangeFlight=" + maxRangeFlight +
                ", countBusinessSpaces=" + countBusinessSpaces +
                ", countEconomySpaces=" + countEconomySpaces +
                '}';
    }
}
