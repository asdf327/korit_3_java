package ch13_abstraction.interfaces2;

public class ACController{
    private TempUpButton tempUpButton;
    private TempDownButton tempDownButton;
    private PowerButton powerButton;

    public ACController(TempUpButton tempUpButton, TempDownButton tempDownButton, PowerButton powerButton) {
        this.tempUpButton = tempUpButton;
        this.tempDownButton = tempDownButton;
        this.powerButton = powerButton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedTempUpButton(){
        tempUpButton.onUp();
    }

    public void onUpTempUpButton(){
        tempUpButton.onPressed();
    }

    public void onPressedTempDownButton(){
        tempDownButton.Down();
    }

    public void onTempDownButton(){
        tempDownButton.onPressed();
    }
}
