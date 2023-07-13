// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;


public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */
  CANSparkMax motor;
  
  public MotorSubsystem() {
    motor = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double speed) {
    motor.set(speed);
  }
}
