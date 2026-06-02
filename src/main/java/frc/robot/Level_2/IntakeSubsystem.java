# IntakeSubsystem.java

```java
package frc.robot.subsystems.intake;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    /*
     * TODO:
     * Instantiate the motors.
     *
     * HINT:
     * Look at Level 1 for how motors were created.
     */

    // private final SparkMax tiltMotor = ...
    // private final SparkMax rollerMotor = ...

    /*
     * Create PID controllers.
     *
     * QUESTION:
     * What does each PID controller control?
     */

    private final PIDController tiltPID =
            new PIDController(
                    IntakeConstants.kPositionP,
                    IntakeConstants.kPositionI,
                    IntakeConstants.kPositionD);

    private final PIDController rollerPID =
            new PIDController(
                    IntakeConstants.kVelocityP,
                    IntakeConstants.kVelocityI,
                    IntakeConstants.kVelocityD);

    public IntakeSubsystem() {}

    /*
     * TODO:
     * Return tilt encoder position.
     *
     * HINT:
     * Use the encoder attached to the tilt motor.
     */
    public double getTiltPosition() {
        return _____; // Fill in: Current tilt position
    }

    /*
     * TODO:
     * Return roller velocity.
     */
    public double getRollerVelocity() {
        return _____; // Fill in: Current roller velocity
    }

    /*
     * Position PID
     *
     * QUESTION:
     * Which value is the measurement?
     *
     * QUESTION:
     * Which value is the setpoint?
     */
    public void moveToPosition(double targetPosition) {

        double output =
                tiltPID.calculate(
                        _____, // Fill in: Method to get the current intake position
                        _____  // Fill in: Desired target position input
                );

        /*
         * TODO:
         * Send PID output to tilt motor.
         */
    }

    /*
     * Velocity PID
     *
     * QUESTION:
     * Why do we use velocity instead of position here?
     */
    public void runAtVelocity(double targetVelocity) {

        double output =
                rollerPID.calculate(
                        _____, // Fill in: Current roller velocity
                        _____  // Fill in: Desired target velocity
                );

        /*
         * TODO:
         * Send PID output to roller motor.
         */
    }

    /*
     * Check if intake is extended.
     *
     * QUESTION:
     * Why do we use a tolerance instead of checking equality?
     */
    public boolean intakeExtended() {

        return Math.abs(
                getTiltPosition()
                        - IntakeConstants.EXTENDED_POSITION)

                < _____; // Fill in: Position tolerance
    }

    /*
     * Check if roller reached speed.
     */
    public boolean rollerAtSpeed() {

        return Math.abs(
                getRollerVelocity()
                        - IntakeConstants.TARGET_RPS)

                < _____; // Fill in: Velocity tolerance
    }

    /*
     * Stop all intake motors.
     */
    public void stopAll() {

        /*
         * TODO:
         * Stop tilt motor.
         *
         * TODO:
         * Stop roller motor.
         */
    }

    @Override
    public void periodic() {

        SmartDashboard.putNumber(
                "Tilt Position",
                _____ // Fill in: Current tilt position
        );

        SmartDashboard.putNumber(
                "Roller Velocity",
                _____ // Fill in: Current roller velocity
        );

        /*
         * CHALLENGE:
         *
         * Add a SmartDashboard boolean called:
         *
         * Roller Ready
         *
         * that becomes true when the roller reaches speed.
         */
    }

    /*
     * CHECKPOINT QUESTION
     *
     * If the intake is below the target position,
     * should the PID output be positive or negative?
     *
     * Explain why.
     */
}
```
