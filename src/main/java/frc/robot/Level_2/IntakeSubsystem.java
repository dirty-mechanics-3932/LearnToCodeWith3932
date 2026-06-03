package frc.robot.Level_2;

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
        // return _____; TASK: Find a method to get the current tilt position + then uncomment the code
    }

    /*
     * TODO:
     * Return roller velocity.
     */
    public double getSpinVelocity() {
        // return _____; TASK: Find a method to get the current spin motor velocity + then uncomment the code
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

        /*  double output =
                tiltPID.calculate(
                    _____, TASK: Insert method to get the current intake position (Hint: You already made this method above!) + then uncomment
                    _____  TASK: Insert target position input + then uncomment
                );

         TODO: Write code to send the PID position output to tilt motor
         */
    }

    /*
     * Velocity PID
     *
     * QUESTION:
     * Why do we use velocity instead of position here?
     */
    public void runAtVelocity(double targetVelocity) {

        /* double output =
                rollerPID.calculate(
                    _____, TASK: Insert method to get the current intake spin velocity (Hint: You already made this method above!) + then uncomment
                    _____  TASK: Insert target velocity input + then uncomment
                );

        TODO: Send PID output to spin motor.
         */
    }

    /*
     * Check if intake is extended.
     *
     * QUESTION:
     * Why do we use a tolerance instead of checking equality?
     */
    public boolean isIntakeExtended() {

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
