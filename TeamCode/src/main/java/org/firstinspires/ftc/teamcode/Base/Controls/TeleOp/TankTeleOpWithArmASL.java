package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Base.Mechanisms.ASLHand;
import org.firstinspires.ftc.teamcode.Base.Mechanisms.ArmHand;
import org.firstinspires.ftc.teamcode.Base.Robot.TankBot;

//@Disabled
@TeleOp(name = "TankBot Arm-ASL")

public class TankTeleOpWithArmASL extends TankTeleOpWithArmLinear {

    //TeleOp Driving Behavior Variables
    String ASLWord = "Hello";

    // Construct the Physical Bot based on the Robot Class
    public ASLHand ASL = new ASLHand();

    // TeleOp Loop Method.  This start AFTER clicking the Play Button on the Driver Station Phone

    @Override
    public void loop() {

        speedControl();
        driveControl();
        handControl();
        elbowControl();
        lazySusanControl();
        signASL();
        telemetryOutput();

    }


    /**  ********  ASL METHODS USING GAMEPAD 2 *************      **/

    public void signASL() {
        if (gamepad2.dpad_up) {
            Handy.raiseArm();
            Bruno.pause(1000);
            Handy.openWrist();
            ASLWord = "I Love MBCA";
            ASL.signSentence(ASLWord);
            Handy.closeWrist();
            Bruno.pause(1000);
            Handy.lowerArm();
        }
        else if (gamepad2.dpad_down) {
            Handy.raiseArm();
            Bruno.pause(1000);
            Handy.openWrist();
            ASLWord = "I Love Robots";
            ASL.signSentence(ASLWord);
            Handy.closeWrist();
            Bruno.pause(1000);
            Handy.lowerArm();
        }
        else if (gamepad2.dpad_right) {
            Handy.raiseArm();
            Bruno.pause(1000);
            Handy.openWrist();
            ASLWord = "Hello";
            ASL.signSentence(ASLWord);
            Handy.closeWrist();
            Bruno.pause(1000);
            Handy.lowerArm();
        }
        else if (gamepad2.dpad_left) {
            Handy.raiseArm();
            Bruno.pause(1000);
            Handy.openWrist();
            ASLWord = "Goodbye";
            ASL.signSentence(ASLWord);
            Handy.closeWrist();
            Bruno.pause(1000);
            Handy.lowerArm();

        }

    }




}
