package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        CherelButton cherelButton = new CherelButton();

        TVRemotr tvRemotr = new TVRemotr(new PowerButton(), new ChannelDownButton(),
                new CherelButton(), new VolumeUpButton(), new VolumeDownButton());

        tvRemotr.onPressedB();
        tvRemotr.oup();
        tvRemotr.oD();

        System.out.println();

        tvRemotr.ouPressedChannel();
        tvRemotr.ouPressedUpChannel();

        System.out.println();

        tvRemotr.onPressedVolumeUpButton();
        tvRemotr.onUpVolumeUpButton();

        tvRemotr.onPressedVolumeDownButton();
        tvRemotr.onDownVolumeDownButton();

    }
}