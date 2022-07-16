package JavaStart.ObjectPrograming1.Cabrio;

public class Cabrio {
    private String name;
    private String manufacturer;
    private int topSpeed;
    private boolean roof, isDriving;

    public Cabrio(String name, String manufacturer, int topSpeed, boolean roof, boolean isDriving) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.roof = roof;
        this.isDriving = isDriving;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public boolean isDriving() {
        return isDriving;
    }

    public void setDriving(boolean driving) {
        isDriving = driving;
    }

    public void openRoof(boolean isDriving){
        if(isDriving){
            System.out.println("Car is moving! You can't open the roof!");
        }else if(roof){
                System.out.println("Roof is already open!");
        }else{
            setRoof(true);
            System.out.println("Roof is open");
        }
    }

    public void closeRoof(boolean isDriving){
        if(isDriving){
            System.out.println("Car is moving! You can't close the roof!");
        }else if (!roof){
                System.out.println("Roof is already close!");
        }else{
            setRoof(false);
            System.out.println("Roof is closed!");
        }
    }
}
