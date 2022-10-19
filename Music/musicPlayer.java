public class musicPlayer {
    public static void main(String[] args) {

    }
    public final class DoubleClass<Music> {

        private Music data;
        private DoubleClass<Music> next;
        private DoubleClass<Music> prev;
        public DoubleClass(final DoubleClass<Music> prev, final Music data, final DoubleClass<Music> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }


        public DoubleClass(final Music data) {
            this(null, data, null);
        }

        public Music getData() {
            return data;
        }

        public DoubleClass<Music> getNext() {
            return next;
        }


        public void setTheNextTrack(final DoubleClass<Music> next) {
            this.next = next;
        }

        public void setThePreviousTrack(final DoubleClass<Music> prev) {
            this.prev = prev;
        }

        public DoubleClass<Music> getPrev() {
            return prev;
        }

        public void addTracks(final Music data) {
            this.data = data;
        }

    }

}
