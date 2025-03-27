package ch13_abstraction.interfaces;

public class TVRemotr {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private  CherelButton cherelButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TVRemotr(PowerButton powerButton, ChannelDownButton channelDownButton,
                    CherelButton cherelButton, VolumeUpButton volumeUpButton,
                    VolumeDownButton volumeDownButton)
    {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.cherelButton = cherelButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    //필드를 이용한 메서드의 정의
    public void onPressedB(){
        powerButton.onPressed();
    }

    public void oup(){
        channelDownButton.onPressed();
    }

    public void oD(){
        cherelButton.OnDuwn();
    }

    public void ouPressedChannel(){
        cherelButton.onPressed();
    }

    public void ouPressedUpChannel(){
//        return channelDownButton.onUp();
        System.out.println(cherelButton.onUp());
    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton(){
        volumeUpButton.OnDuwn();
    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.OnDuwn();
    }


}
