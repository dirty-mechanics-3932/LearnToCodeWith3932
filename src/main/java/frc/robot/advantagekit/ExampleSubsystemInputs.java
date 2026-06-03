package frc.robot.advantagekit;

import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.RotationsPerSecond;
import static edu.wpi.first.units.Units.RotationsPerSecondPerSecond;
import static edu.wpi.first.units.Units.Volts;

import org.littletonrobotics.junction.AutoLog;

import edu.wpi.first.units.measure.AngularAcceleration;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Current;
import edu.wpi.first.units.measure.Voltage;

@AutoLog
public class ExampleSubsystemInputs {
    public AngularVelocity motorVelocity = RotationsPerSecond.of(0);
    public AngularAcceleration motorAcceleration = RotationsPerSecondPerSecond.of(0);
    public Voltage motorVoltage = Volts.of(0);
    public Current motorStatorCurrent = Amps.of(0);
}
