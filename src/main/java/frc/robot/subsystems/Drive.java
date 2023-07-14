// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package Drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class Drive extends SubsystemBase {

  CANSparkMax motor1;
  public Drive() {

    motor1 = new CANSparkMax(0, CANSparkMaxLowLevel);

  }

  public void drive(double speed){
    motor1.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
