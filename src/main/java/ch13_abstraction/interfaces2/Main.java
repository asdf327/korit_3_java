package ch13_abstraction.interfaces2;

public class Main {
    public static void main(String[] args) {
        TVRemoteControl tvRemoteControl = new TVRemoteControl(new PowerButton(),
                new VolumeUpButton(), new VolumeDownButton(),
                new ChannelUpButton(), new ChannelDownButton());

        tvRemoteControl.onPressedPowerButton();
        tvRemoteControl.onPressedVolumeUpButton();
        tvRemoteControl.onUpVolumeUpButton();
        tvRemoteControl.onPressedVolumeDownButton();
        tvRemoteControl.onDownVolumeDownButton();
        tvRemoteControl.onPressedChannelUpButton();
        tvRemoteControl.onUpChannelUpButton();
        tvRemoteControl.onPressedChannelDownButton();
        tvRemoteControl.onDownChannelDownButton();

        System.out.println();

        ACController acController = new ACController(new TempUpButton(), new TempDownButton(),
                new PowerButton());

        acController.onPressedPowerButton();
        acController.onTempDownButton();
        acController.onPressedTempDownButton();

        System.out.println();

        acController.onUpTempUpButton();
        acController.onPressedTempUpButton();

        System.out.println();

        acController.onPressedPowerButton();
    }
}
