package frc.robot.advantagekit;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  private final PWMSparkMax motor = new PWMSparkMax(0);
  private final Encoder encoder = new Encoder(0, 1);
  private final PIDController pid = new PIDController(0.1, 0.0, 0.0);

  private double maxVelocity = 3000.0;
  private double maxAcceleration = 1000.0;

  private double goalVelocity = 0.0;
  private double currentSetpoint = 0.0;

  public ExampleSubsystem() {
    encoder.setDistancePerPulse(1.0);
    pid.setTolerance(50.0);
  }

  public void setVelocity(double velocity) {
    goalVelocity = MathUtil.clamp(velocity, -maxVelocity, maxVelocity);
  }

  public void setMaxVelocity(double maxVelocity) {
    this.maxVelocity = maxVelocity;
  }

  public void setMaxAcceleration(double maxAcceleration) {
    this.maxAcceleration = maxAcceleration;
  }

  @Override
  public void periodic() {
    double maxStep = maxAcceleration * 0.02;
    currentSetpoint = MathUtil.clamp(
        goalVelocity,
        currentSetpoint - maxStep,
        currentSetpoint + maxStep
    );

    double output = pid.calculate(encoder.getRate(), currentSetpoint);
    motor.set(MathUtil.clamp(output, -1.0, 1.0));
  }
}