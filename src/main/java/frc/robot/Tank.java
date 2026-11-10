package frc.robot;

import com.revrobotics.spark.SparkLowLevel;
import com.spikes2212.util.smartmotorcontrollers.SparkWrapper;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Tank extends SubsystemBase {

    private static Tank instance;

    public static Tank getInstance() {
        if (instance == null) {
            instance = new Tank(
                    SparkWrapper.createSparkMax(RobotMap.CAN.LEFT_1, SparkLowLevel.MotorType.kBrushless),
                    SparkWrapper.createSparkMax(RobotMap.CAN.LEFT_2, SparkLowLevel.MotorType.kBrushless),
                    SparkWrapper.createSparkMax(RobotMap.CAN.RIGHT_1, SparkLowLevel.MotorType.kBrushless),
                    SparkWrapper.createSparkMax(RobotMap.CAN.RIGHT_2, SparkLowLevel.MotorType.kBrushless)
            );
        }
        return instance;
    }

    private final MotorController left1;
    private final MotorController left2;
    private final MotorController right1;
    private final MotorController right2;

    private Tank(MotorController left1, MotorController left2, MotorController right1, MotorController right2) {
        this.left1 = left1;
        this.left2 = left2;
        this.right1 = right1;
        this.right2 = right2;
    }

    public void setRightSpeed(double speed) {
        right1.set(speed);
        right2.set(speed);
    }

    public void setLeftSpeed(double speed) {
        left1.set(-speed);
        left2.set(- speed);
    }

    public void stop() {
        left1.stopMotor();
        left2.stopMotor();
        right1.stopMotor();
        right2.stopMotor();
    }
}