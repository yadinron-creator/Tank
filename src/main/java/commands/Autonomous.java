package commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Tank;

public class Autonomous extends SequentialCommandGroup {

    public Autonomous() {
        addCommands(
                new Drive(Tank.getInstance(), 0.3, 0.3).withTimeout(0.5),
                new Drive(Tank.getInstance(), 0.5, 0).withTimeout(1.5),
                new Drive(Tank.getInstance(), 0.2, 2).withTimeout(0.8)
        );
    }
}
