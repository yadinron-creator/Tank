package frc.robot;

import com.spikes2212.util.PlaystationControllerWrapper;
import commands.Drive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {
    private final PlaystationControllerWrapper controller;

    public OI() {
        controller = new PlaystationControllerWrapper(0);
        configureController();
    }

    private void configureController() {
        JoystickButton squareButton = controller.getSquareButton();
        squareButton.whileTrue(new Drive(Tank.getInstance(), 0.2, 0.2));

        JoystickButton circleButton = controller.getCircleButton();
        circleButton.debounce(0.1).toggleOnTrue(new Drive(Tank.getInstance(), 0.467, 0.2));

    }
}