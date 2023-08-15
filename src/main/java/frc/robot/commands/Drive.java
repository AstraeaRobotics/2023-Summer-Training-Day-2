// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;

public class Drive extends CommandBase {
  Drivebase m_drivebase = new Drivebase();
  /** Creates a new Drive. */
  public Drive(Drivebase drivebase) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivebase);
  }

  // Called when the command is initially scheduled.
  // e.g. setpoints and goals
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  // constantly checking - logic
  @Override
  public void execute() {
    m_drivebase.drive(0.2); // put magic numbers in Constants
  }

  // Called once the command ends or is interrupted.
  // set motor speed back to zero once the input stops
  @Override
  public void end(boolean interrupted) {
    m_drivebase.drive(0); // put magic numbers in Constants
  }

  // Returns true when the command should end.
  // use logic to determine when the command should end (e.g. if it has reached a goal of x meters)
  // basically return false unless using it for the above purpose
  @Override
  public boolean isFinished() {
    return false;
  }
}
