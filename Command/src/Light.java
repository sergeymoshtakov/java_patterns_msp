public class Light {
    private boolean lightOn;
    public Light(){
        lightOn = false;
    }
    public void turnOn(){
        if(!lightOn){
            lightOn = true;
            System.out.println("Light is on");
        }
    }

    public void turnOff(){
        if(lightOn){
            lightOn = false;
            System.out.println("Light is off");
        }
    }
}
