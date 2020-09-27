package logic.enums;

public enum PlayerOptions {
    NONE {
        public String toString() {
            return "---------";
        }
    },
    SHOWN {
        public String toString() {
            return "Eigene Karte";
        }
    },
    SHOWN1 {
        public String toString() {
            return "1x gezeigt";
        }
    },
    SHOWN2 {
        public String toString() {
            return "2x gezeigt";
        }
    },
    SHOWN3 {
        public String toString() {
            return "3x gezeigt";
        }
    },
    SHOWNM3 {
        public String toString() {
            return ">3 gezeigt";
        }
    }
}
