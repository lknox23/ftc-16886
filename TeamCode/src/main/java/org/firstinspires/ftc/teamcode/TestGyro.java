package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class TestGyro extends BaseRobot{
    private int stage =0;
    @Override
    public void init() {
        super.init();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {
        super.loop();
        switch(stage) {
            case 0:
                if (auto_drive(0.5, 10)){
                    reset_drive_encoders();
                    stage++;
                }
                break;
            default:
                break;
        }
    }
}
