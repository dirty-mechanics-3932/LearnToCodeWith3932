package frc.robot.Level_2;

public final class IntakeConstants {

    // TODO:Find the CAN IDs from Phoenix Tuner or REV Hardware Client.
    public static final int TILT_MOTOR_ID = 0;
    public static final int ROLLER_MOTOR_ID = 0;

    /*
     * Position PID constants.
     */

    // TODO: Tune these position PID values for your intake tilt motor. The I value should usually be zero for position control.
    public static final double kPositionP = 0.0;
    public static final double kPositionI = 0.0;
    public static final double kPositionD = 0.0;

    /*
     * Velocity PID constants.
     */

    // TODO: Tune these values for your intake spin motor. The I value should usually be zero for velocity control.
    // QUESTION: Why are these values usually different from velocity PID values
    public static final double kVelocityP = 0.0;
    public static final double kVelocityI = 0.0;
    public static final double kVelocityD = 0.0;


    // TODO: Find the target position for your intake tilt motor when the intake is fully extended. 
    // This can be found by moving the intake to the desired position and reading the position from Phoenix Tuner or REV Hardware Client. */
    public static final double EXTENDED_POSITION = 0;

    // TODO: Input the target speed your intake spin motor needs to reach from a scale of 0 to 1 (Example: 0.55 = 55% of max speed)
    public static final double TARGET_RPS = 0;
}
