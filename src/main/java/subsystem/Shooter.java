package subsystem;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private final MotorController shoot1;
    private final MotorController shoot2;
    private final MotorController shoot3;
    private final MotorController shoot4;

    public Shooter(MotorController shoot1, MotorController shoot2, MotorController shoot3, MotorController shoot4) {
        this.shoot1 = shoot1;
        this.shoot2 = shoot2;
        this.shoot3 = shoot3;
        this.shoot4 = shoot4;
    }

    public void setSpeed(double speed) {
        shoot1.set(speed);
        shoot2.set(speed);
        shoot3.set(speed);
        shoot4.set(speed);
    }

    public void end() {
        shoot1.stopMotor();
        shoot2.stopMotor();
        shoot3.stopMotor();
        shoot4.stopMotor();
    }
}
