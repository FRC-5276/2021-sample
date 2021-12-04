package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSubsystem extends SubsystemBase {

    /** Creates a new ExampleSubsystem. */
    // TalonSRX leftDrive;
    private TalonSRX leftDrive1 = new TalonSRX(Constants.LEFT_DRIVE_1);
    private TalonSRX leftDrive2 = new TalonSRX(Constants.LEFT_DRIVE_2);
    private TalonSRX rightDrive1 = new TalonSRX(Constants.RIGHT_DRIVE_1);
    private TalonSRX rightDrive2 = new TalonSRX(Constants.RIGHT_DRIVE_2);
    

    public DriveTrainSubsystem() {
        
    }

    public void drive(double leftPower, double rightPower){
        leftDrive1.set(ControlMode.PercentOutput, leftPower);
        leftDrive2.set(ControlMode.PercentOutput, leftPower);

        rightDrive1.set(ControlMode.PercentOutput, rightPower);
        rightDrive2.set(ControlMode.PercentOutput, rightPower);
    }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run

    }
  
    @Override
    public void simulationPeriodic() {
      // This method will be called once per scheduler run during simulation
    }
  }
  