package Generics.CodeChallenge2;

public interface Shoe {
    class Running implements Shoe {
        private String color;
        private int size;

        public Running(String color, int size) {
            this.color = color;
            this.size = size;
        }
    }
    class Heels implements Shoe{
        private String color;
        private int size;

        public Heels(String color, int size) {
            this.color = color;
            this.size = size;
        }
    }
    class Boot implements Shoe{
        private String color;
        private int size;

        public Boot(String color, int size) {
            this.color = color;
            this.size = size;
        }
    }
}
