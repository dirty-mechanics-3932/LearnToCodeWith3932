package frc.robot.Level_1;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Level_1.Constants.IntakeConstants;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class IntakeSubsystem extends SubsystemBase {

    // ── Hardware fields ───────────────────────────────────────────────────────
    // Declare your motor controller and limit switch here.
    // These are private — nothing outside this class should touch them directly.
    //
    // Example (done for you):
    private final SparkFlex tiltMotor;
    //
    // Your turn — declare the limit switch:
    // private final DigitalInput _________;

    // ── Constructor ───────────────────────────────────────────────────────────
    // The constructor runs once when the robot boots.
    // Instantiate (create) your hardware objects here using the IDs from Constants.
    //
    // Example (done for you):
    public IntakeSubsystem() {
        tiltMotor = new SparkFlex(IntakeConstants.INTAKE_MOTOR_ID, MotorType.kBrushless);
        //
        // Your turn — instantiate the limit switch using IntakeConstants.LIMIT_SWITCH_DIO_PORT:
        limitSwitch = new <PLACEHOLDER>(_________);
    }

    // ── Private hardware methods ──────────────────────────────────────────────
    // These are the raw actions — commands will call these.
    // Keep them private so only this subsystem can use them directly.

    // Example (done for you):
    private void tiltForward() {
        tiltMotor.set(IntakeConstants.INTAKE_SPEED);
    }

    // Your turn — write tiltBackward(). Hint: negative speed reverses direction.
    private void tiltBackward() {
        // ...
    }

    // Your turn — write stop(). Hint: what speed makes a motor stop?
    private void stop() {
        // ...
    }

    // ── Sensor reading ────────────────────────────────────────────────────────
    // Your turn — write atLimit().
    // It should return true when the arm has hit the limit switch.
    // Hint: DigitalInput.get() returns true when the circuit is OPEN.
    //       If your switch is normally-open, you'll need to invert the result.
    public boolean atLimit() {
        // ...
        return false; // replace this
    }

    // ── Commands ──────────────────────────────────────────────────────────────
    // Each method returns a Command. RobotContainer will bind these to buttons.
    // `this` tells the scheduler that this subsystem is required by the command.

    // Example (done for you):
    // Commands.run()   → calls a method repeatedly every 20ms
    // .until()         → stops the command when a condition becomes true
    // .finallyDo()     → always runs when the command ends (interrupted or not)
    public Command cmdTiltForward() {
        return Commands.run(this::tiltForward, this)
            .until(this::atLimit)
            .finallyDo(this::stop);
    }

    // Your turn — write cmdTiltBackward().
    // It should run tiltBackward() continuously and stop the motor when done.
    // No .until() needed — backward movement should always be allowed.
    public Command cmdTiltBackward() {
        // ...
        return null; // replace this
    }

    // Your turn — write cmdStop().
    // Hint: use Commands.runOnce() instead of Commands.run() — it fires once and finishes.
    public Command cmdStop() {
        // ...
        return null; // replace this
    }

    // ── Periodic ─────────────────────────────────────────────────────────────
    // Runs every 20ms automatically. Use for telemetry, not control logic.
    @Override
    public void periodic() {
        // Optional: SmartDashboard.putBoolean("Intake at limit", atLimit());
    }
}