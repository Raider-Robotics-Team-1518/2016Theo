package org.usfirst.frc.team1518.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.TalonSRX;
/**
 * This is a demo program showing how to use Mecanum control with the RobotDrive class.
 */
public class Robot extends SampleRobot {
	
    RobotDrive robotDrive;
    Joystick stick;
    JoystickButton button5; 
    JoystickButton button3;

    // Channels for the wheels
    final int frontLeftChannel	= 2;
    final int rearLeftChannel	= 3;
    final int frontRightChannel	= 5;
    final int rearRightChannel	= 4;
    
    // The channel on the driver station that the joystick is connected to
    final int joystickChannel	= 0;

    public Robot() {
        robotDrive = new RobotDrive(frontLeftChannel, rearLeftChannel, frontRightChannel, rearRightChannel);
    	robotDrive.setInvertedMotor(MotorType.kFrontRight, true);	// invert the right side motors
    	robotDrive.setInvertedMotor(MotorType.kRearRight, true);		// you may need to change or remove this to match your robot
        robotDrive.setExpiration(0.1);

        stick = new Joystick(joystickChannel);
        button5 = new JoystickButton(stick, 5);
        button3 = new JoystickButton(stick, 3);
    }
   // Lift Motors
    
    final int liftMotor = 8;
   
   // 
    /**
     * Runs the motors with Mecanum drive.
     */
    public void operatorControl() {
        robotDrive.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
        	
        	// Use the joystick X axis for lateral movement, Y axis for forward movement, and Z axis for rotation.
        	// This sample does not use field-oriented drive, so the gyro input is set to zero.
            robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);
            
            Timer.delay(0.005);	// wait 5ms to avoid hogging CPU cycles
     /**
     *     
     
     if (button5.get() == true ) {
      mpublic TalonSRX(final int 8)
     
            } */
        }
  
    }
    
}
