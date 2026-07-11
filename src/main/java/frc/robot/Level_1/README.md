# Level 1 — Movement

**End goal:** A intake subsystem that tilts an intake arm forward and backward using motor control,
triggered by a button, and stopped automatically by a limit switch.

---

## Read these files in order

| Step | File | What you'll learn |
|------|------|-------------------|
| 1 | `Constants.java` | How to organize hardware IDs and config values |
| 2 | `subsystems/IntakeSubsystem.java` | How to wrap a motor in a subsystem |
| 2 | `RobotContainer.java` | How to bind commands to buttons |

---

## How to run

1. Open this project in WPILib VS Code
2. Deploy to robot: `Ctrl+Shift+P` → **WPILib: Deploy Robot Code**
3. Use Shuffleboard to verify limit switch state before running motors

---
