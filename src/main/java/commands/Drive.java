package commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Tank;

public class Drive extends Command {

    Tank tank;
    double leftSpeed, rightSpeed;

    public Drive(Tank tank, double leftSpeed, double rightSpeed) {
        addRequirements(tank);
        this.tank = tank;
        this. leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
    }

    @Override
    public void execute() {
        tank.setRightSpeed(rightSpeed);
        tank.setLeftSpeed(leftSpeed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        tank.stop();
    }
}