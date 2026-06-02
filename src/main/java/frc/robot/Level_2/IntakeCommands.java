package frc.robot.Level_2;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class IntakeCommands {

    private final IntakeSubsystem intake;

    public IntakeCommands(IntakeSubsystem intake) {
        this.intake = intake;
    }

    /*
     * Activity 1
     *
     * Create a command that extends the intake.
     *
     * QUESTION:
     * What causes this command to finish?
     */
    public Command extendIntake() {

        return Commands.run(
                () -> {

                    intake.moveToPosition(
                            _____ // Fill in: Fully extended position constant
                    );

                },
                intake)

                .until(
                        _____ // Fill in: Condition for intake extension
                )

                .finallyDo(
                        interrupted -> intake.stopAll());
    }

    /*
     * Activity 2
     *
     * Create a command that spins rollers.
     */
    public Command spinRollers() {

        return Commands.run(
                () -> {

                    intake.runAtVelocity(
                            _____ // Fill in: Target roller speed constant
                    );

                },
                intake)

                .until(
                        _____ // Fill in: Condition for roller reaching speed
                );
    }

    /*
     * Activity 3
     *
     * Create a wait command.
     *
     * HINT:
     * Use Commands.waitUntil(...)
     */
    public Command waitForSpeed() {

        return Commands.waitUntil(
                _____ // Fill in: Condition for roller reaching speed
        );
    }

    /*
     * Activity 4
     *
     * Log when intake is ready.
     */
    public Command logReady() {

        return Commands.runOnce(
                () -> {

                    /*
                     * TODO:
                     * Print:
                     *
                     * READY FOR NOTE
                     */

                });
    }

    /*
     * Activity 5
     *
     * Build a sequence.
     *
     * QUESTION:
     * Why does .andThen() wait for the previous command?
     */
    public Command intakeSequence() {

        return extendIntake()

                .andThen(
                        _____ // Fill in: Command that spins rollers
                )

                .andThen(
                        _____ // Fill in: Command that waits for roller speed
                )

                .andThen(
                        _____ // Fill in: Command that logs readiness
                );
    }

    /*
     * FINAL CHALLENGE
     *
     * Create a command called:
     *
     * scorePrepSequence()
     *
     * Requirements:
     *
     * 1. Extend intake.
     * 2. Wait for extension.
     * 3. Spin rollers.
     * 4. Wait for speed.
     * 5. Log readiness.
     * 6. End correctly.
     */
}
```

