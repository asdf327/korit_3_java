package ch13_abstraction.interfaces2;

public class TVRemoteControl {
    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;

    public TVRemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton,
                           VolumeDownButton volumeDownButton,
                           ChannelUpButton channelUpButton,
                           ChannelDownButton channelDownButton)
    {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onUp();
    }

    public void onUpVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.Down();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public void onPressedChannelUpButton(){
        channelUpButton.onUp();
    }

    public void onUpChannelUpButton(){
        channelUpButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        channelDownButton.Down();
    }

    public void onDownChannelDownButton(){
        channelDownButton.onPressed();
    }
}
