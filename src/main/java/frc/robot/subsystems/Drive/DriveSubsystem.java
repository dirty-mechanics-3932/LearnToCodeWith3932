package frc.robot.subsystems.Drive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

import java.io.File;
import java.io.IOException;

import edu.wpi.first.wpilibj.Filesystem;
import swervelib.parser.SwerveParser;
import swervelib.SwerveDrive;
import swervelib.SwerveInputStream;
import edu.wpi.first.math.util.Units;

public class DriveSubsystem extends SubsystemBase {
    public DriveSubsystem(CommandXboxController driverController) {
        try {
            double maximumSpeed = Units.feetToMeters(4.5);
            File swerveJsonDirectory = new File(Filesystem.getDeployDirectory(),"swerve");
            SwerveDrive swerveDrive = new SwerveParser(swerveJsonDirectory).createSwerveDrive(maximumSpeed);

            SwerveInputStream driveInputStream = SwerveInputStream.of(swerveDrive, () -> driverController.getLeftY(), () -> driverController.getLeftX()).
                withControllerRotationAxis(() -> driverController.getRightX()).
                allianceRelativeControl(true);

            Command driveFieldOrientedCmd = run(() -> swerveDrive.driveFieldOriented(driveInputStream.get()));
            setDefaultCommand(driveFieldOrientedCmd);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}
