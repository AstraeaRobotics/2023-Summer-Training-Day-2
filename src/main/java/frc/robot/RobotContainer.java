package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Drivebase;
import frc.robot.commands.Drive;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  private final Drivebase m_drivebase = new Drivebase();
  private final PS4Controller operator = new PS4Controller(0);
  private final JoystickButton r2 = new JoystickButton(operator, 0);

  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    r2.whileTrue(new Drive(m_drivebase));
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    // e.g. return new Drive(); (except Drive is not autonomous rn)
    return null;
  }
}
