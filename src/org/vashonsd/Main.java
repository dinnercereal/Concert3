package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        Performer steve = new Performer("Steve", "an incredible bassist");
        Performer john = new Performer("John", "wonderful on the drums");
        Performer lily = new Performer("Lily", "the best singer out there");
        System.out.println(steve + "" + john + "" + lily);
    }
}
