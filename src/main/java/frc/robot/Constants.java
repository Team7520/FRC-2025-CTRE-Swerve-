package frc.robot;

public class Constants {
    public static class RampConstants {
        public static final int RampID = 43;
    }

    public static class ElevatorConstants {
        public static final int LEFT_MOTOR_ID = 41;
        public static final int RIGHT_MOTOR_ID = 42;
        public static final double SENSOR_TO_MECHANISM_RATIO = 27d/11d; // Units will be in inches
        public static final double MAX_HEIGHT = 60; // 60 inches

        // PID Constants
        public static final double kP = 2;
        public static final double kI = 0.0;
        public static final double kD = 0.0;
        public static final double kIz = 0.0;
        public static final double kFF = 0.0;

        // Motion Magic Constants
        public static final double MAX_VELOCITY = 6400; // 10 inches per second
        public static final double MAX_ACCELERATION = MAX_VELOCITY*2; // 20 inches per second squared
        public static final double MAX_JERK = MAX_ACCELERATION*4; // 60 inches per second cubed
        public static final double ALLOWABLE_ERROR = 0.5; // 0.5 inches

        public static final int CURRENT_LIMIT = 20;
        public static enum ElevatorPosition {
            GROUND(0),
            LOW(12),
            MID(36),
            HIGH(56);

            private final double height;

            ElevatorPosition(double height) {
                this.height = height;
            }

            public double getHeight() {
                return height;
            }
        }
    }

    public static class EndEffectorConstants {
        public static final int PIVOT_ID = 23;
        public static final int CONVEYOR_ID = 24;
        public static final double SENSOR_TO_MECHANISM_RATIO = 9d/400d;
        public static final double MAX_ANGLE = 135;
        public static final double MIN_ANGLE = 0;

        // PID Constants
        public static final double kP = 0.1;
        public static final double kI = 0.0;
        public static final double kD = 0.0;
        public static final double kIz = 0.0;
        public static final double kFF = 0.0;

        // MAX motion constants
        public static final double MAX_VELOCITY = 1000;
        public static final double MAX_ACCELERATION = MAX_VELOCITY*2;
        public static final double MAX_JERK = MAX_ACCELERATION*4;
        public static final double ALLOWABLE_ERROR = 0.5;
        public static enum PivotPosition {
            UP(90),
            DOWN(30);

            private final double angle;

            PivotPosition(double angle) {
                this.angle = angle;
            }

            public double getAngle() {
                return angle;
            }
        }

        // Current Limiting Constants
        public static final int PIVOT_CURRENT_LIMIT = 10;
        public static final int CONVEYOR_CURRENT_LIMIT = 10;




    }
}
