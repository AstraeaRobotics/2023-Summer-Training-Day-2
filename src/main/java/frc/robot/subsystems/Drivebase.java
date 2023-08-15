// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class Drivebase extends SubsystemBase {
  /** Creates a new Drivebase. */
  
  CANSparkMax rMotor, lMotor;
  public Drivebase() {
    rMotor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    lMotor = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  }

  public void drive(double speed) {
    rMotor.set(speed);
    lMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
