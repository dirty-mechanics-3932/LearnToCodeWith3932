package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.Autos;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */

public class RobotContainer {

  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

    // ── Active level ────── ────────────────────────────────────────────────────
    // Change this to unlock the bindings for each level.
    // Only one level should be active at a time.
    private static final Level ACTIVE_LEVEL = Level.LEVEL_1;

    // ── Level enum ────────────────────────────────────────────────────────────
    // Each entry represents one level of the curriculum.
    // New levels get added here as you progress.
    public enum Level {
        LEVEL_1
        // LEVEL_2,
        // LEVEL_3
    }

    // ── Subsystems ────────────────────────────────────────────────────────────
    // Your turn — declare IntakeSubsystem here.
    // Example: private final ExampleSubsystem example = new ExampleSubsystem();
    //
    // private final IntakeSubsystem _________ = new _________();

    // ── Controllers ───────────────────────────────────────────────────────────
    // Port 0 = driver, port 1 = operator.
    // Example (done for you):
    private final CommandXboxController operatorController =
        new CommandXboxController(1);

    // ── Constructor ───────────────────────────────────────────────────────────
    public RobotContainer() {
        configureBindings();
    }

    // ── Bindings ──────────────────────────────────────────────────────────────
    private void configureBindings() {

        // LEVEL_1 — Intake tilt
        // whileTrue: runs the command while the button is held, stops on release.
        // onTrue:    starts the command on press, does NOT stop on release.
        //
        // Example (done for you — but it won't compile until you declare the subsystem above):
        // operatorController.rightBumper().whileTrue(intake.cmdTiltForward());
        //
        // Your turn — bind cmdTiltForward() and cmdTiltBackward() to two buttons.
        // Wrap them in the if-block so they only activate at the right level:
        if (ACTIVE_LEVEL == Level.LEVEL_1) {
            // operatorController._________().whileTrue(_________.cmdTiltForward());
            // operatorController._________().whileTrue(_________.cmdTiltBackward());
        }

        // Future levels get their own if-block here:
        // if (ACTIVE_LEVEL == Level.LEVEL_2) {
        //     ...
        // }
    }

     /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}