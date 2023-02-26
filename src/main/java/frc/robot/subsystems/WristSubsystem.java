// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import frc.robot.Robot;

public class WristSubsystem extends SubsystemBase {
  /** Creates a new WristSubsystem. */

  private CANSparkMax wristMotor = new CANSparkMax(Constants.WristMotors.m_wristMotor, MotorType.kBrushless);

  public WristSubsystem() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void setMotorSpeed(double opRightStickY) {
  wristMotor.set(opRightStickY);
}



 
}
