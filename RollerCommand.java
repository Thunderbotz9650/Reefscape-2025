package frc.robot.subsystems;

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANRollerSubsystem;
import java.util.function.DoubleSupplier;

//Command to run the roller with joystick inputs
public class RollerCommand extends Command {
    private final DoubleSupplier forward;
    private final DoubleSupplier reverse; 

    //private final CANRollerSubsystem rollerSubsystem;
    private final CANRollerSubsystem rollerSubsystem;

    public RollerCommand(
        DoubleSupplier forward, DoubleSupplier reverse, CANRollerSubsystem rollerSubsystem) {
            this.forward = forward;
            this.reverse = reverse;
            this.rollerSubsystem = rollerSubsystem;

            addRequirements(this.rollerSubsystem);

        
    
}


public void Roller  (double forward, double reverse) {
    Roller.set(forward - reverse);


}
