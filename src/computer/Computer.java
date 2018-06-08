
package computer;


public class Computer {

    
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {
        
    }
    
    public Computer(double processTact, double memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    public double getPrcessTact() {
        return processTact;
    }

    public void setPrcessTact(double processTact) {
        this.processTact = processTact;
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
