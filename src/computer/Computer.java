
package computer;


public class Computer {
    
    private double prcessTact;
    private double memory;
    private int hardDrive;

    public double getPrcessTact() {
        return prcessTact;
    }

    public void setPrcessTact(double prcessTact) {
        this.prcessTact = prcessTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    public void info() {
        System.out.println("Process tact: " + getPrcessTact());
        System.out.println("Memory: " + getMemory());
        System.out.println("Hard drive: " + getHardDrive());
    }
    
}
