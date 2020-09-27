package logic.enums;

public enum KIOptions {
    NONE {
        public String toString() {
            return "---------";
        }
    },
    SEEN {
        public String toString() {
            return "gesehen";
        }
    },
    HASNOT {
        public String toString() {
            return "Hat nicht";
        }
    },
    VERDACHTA {
        public String toString() {
            return "Verdacht A";
        }
    },
    VERDACHTB {
        public String toString() {
            return "Verdacht B";
        }
    },
    VERDACHTC {
        public String toString() {
            return "Verdacht C";
        }
    },
    VERDACHTD {
        public String toString() {
            return "Verdacht D";
        }
    },

}
