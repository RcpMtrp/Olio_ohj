public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        isOn = false;
        channel = 1;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void setChannel(int newChannel) {
        channel = ((newChannel - 1) % 10) + 1;
    }

    public int getChannel() {
        return channel;
    }
}
