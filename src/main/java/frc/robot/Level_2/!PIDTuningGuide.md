# PIDTuningGuide.md

```md
# PID Tuning Guide

## What is PID?

PID uses sensor feedback (usually an encoder) to help a mechanism reach a target.

Examples:

- Position PID → Intake tilt position
- Velocity PID → Intake roller speed

Error = Target - Current

The PID controller uses this error to adjust motor output.

---

## Position PID vs Velocity PID

### Position PID
Moves a mechanism to a specific location.

Examples:
- Intake tilt
- Elevator
- Arm

### Velocity PID
Maintains a specific speed.

Examples:
- Intake rollers
- Shooter flywheel

---

## Tuning PID

### Step 1

Start with:

- I = 0
- D = 0

### Step 2

Choose a small P value.

### Step 3

Run the mechanism and observe what happens.

### Step 4

Increase P slowly until the mechanism reaches the target quickly.

### Step 5

If the mechanism shakes, oscillates, or overshoots:

**P is too high.**

Reduce p slightly or increase d slightly while keeping p the same.

---

## Common Issues

**Moves very slowly**
- P too low

**Overshoots target**
- P too high

**Constantly oscillates**
- P too high

**Never reaches target**
- P too low

---

## Checkoff:

**At the end of level 2, you should be able to answer these questions:**

1. What is PID?
2. What is encoder feedback?
3. Position PID vs Velocity PID
4. What does P do?
5. How do you know when P is too high?
6. How do you know when P is too low?
