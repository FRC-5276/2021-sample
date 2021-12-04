package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

public class TeleopCommand  extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final DriveTrainSubsystem m_subsystem;
    XboxController controller = new XboxController(1);
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public TeleopCommand(DriveTrainSubsystem subsystem) {
      m_subsystem = subsystem;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(subsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      m_subsystem.drive(controller.getY(Hand.kLeft), controller.getY(Hand.kRight));
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      m_subsystem.drive(0, 0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }
  
