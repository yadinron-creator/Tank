package commands;

import edu.wpi.first.wpilibj2.command.Command;
import subsystem.Shooter;

public class Shoot extends Command {

    private final Shooter shooter;
    static final double SPEED = 0.2;

    public Shoot(Shooter shooter) {
        this.shooter = shooter;
        addRequirements(shooter);
    }

    @Override
    public void execute() {

        shooter.setSpeed(SPEED);
    }

    @Override
    public boolean isFinished() {

        return false;
    }

    @Override
    public void end(boolean interrupted) {

        shooter.end();
    }
}