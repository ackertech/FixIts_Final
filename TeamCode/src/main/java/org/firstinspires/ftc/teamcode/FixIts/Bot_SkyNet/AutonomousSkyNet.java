package org.firstinspires.ftc.teamcode.FixIts.Bot_SkyNet;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.FixIts.Bot_DentalHealth.DentalHealth_Alen2;

@Autonomous (name = "Skynet Auto")

public class AutonomousSkyNet extends LinearOpMode {

    //Specify the robot class to construct
    Skynet_Sarah Bot = new Skynet_Sarah();

    //We are adding in the code that is personal to the robot here
    @Override

    public void runOpMode() throws InterruptedException {

        Bot.initRobot(hardwareMap);

        telemetry.addLine("Awaiting start");
        telemetry.update();

        //waiting for drive to press start on drive control system
        waitForStart();



    while(

    opModeIsActive())

    {


        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        //We are now at the top left corner of the square

        telemetry.addLine("Turning Right");
        telemetry.update();
        Bot.turnRight(1);
        sleep(1000);
        Bot.stopMotors();

        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        //We are at the top right corner of the square

        telemetry.addLine("Turning Right");
        telemetry.update();
        Bot.turnRight(0.5);
        sleep(1000);
        Bot.stopMotors();

        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        //We are at the bottom right corner of the square

        telemetry.addLine("Turning Right");
        telemetry.update();
        Bot.turnRight(1);
        sleep(1000);
        Bot.stopMotors();

        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        //We are at the bottom left corner of the square

        telemetry.addLine("Turning Left");
        telemetry.update();
        Bot.turnLeft(1);
        sleep(1000);
        Bot.stopMotors();

        telemetry.addLine("Driving Backward");
        telemetry.update();
        Bot.driveBackward(1);
        sleep(1000);
        Bot.stopMotors();

        // Stay in the loop until drive says stop
        requestOpModeStop();

    }

    idle();

    }
}

