package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;

public class ExampleMethodCommand extends CommandBase {
  private final Drivebase drivebase;

  public ExampleMethodCommand(Drivebase drivebase) {
    this.drivebase = drivebase;
    addRequirements(drivebase);
  }

  @Override
  public void initialize() {
    // Perform any setup here
  }

  @Override
  public void execute() {
    // Access the method in the Drivebase subsystem
    drivebase.driveForward();
  }

  @Override
  public boolean isFinished() {
    // Return true when the command should end
    return false;
  }
}
