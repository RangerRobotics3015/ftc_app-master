package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ngiancursioiscool on 9/29/2015. Yeah
 */
public class ExampleDriveForward extends LinearOpMode {

    boolean loop=true;
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        //reverse direction of right
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        // Wait for the start button to be pressed
        waitForStart();
//

            //Set the motors to drive the robot forward
            leftMotor.setPower(0.5);
            rightMotor.setPower(0.5);

            //Wait for 7 seconds
            sleep(7000);
            //Stops

            //Begin turn
            while (loop=true) {
            leftMotor.setPower(.5);
            rightMotor.setPower(0);
            sleep(2000);
            leftMotor.setPower(.5);
            rightMotor.setPower(.5);
            sleep(3000);
            leftMotor.setPower(0);
            rightMotor.setPower(0);
                //new data more than before

            //End
        }
        }


}
