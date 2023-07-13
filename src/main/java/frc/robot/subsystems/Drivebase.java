package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class Drivebase extends SubsystemBase {
  private CANSparkMax motor;

  public Drivebase() {
    motor = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveForward() {
    motor.set(0.2); // Set the motor speed to make the robot drive forward
  }
}
