public enum GenreType {
    THRILLER("Will keep you on the edge of your chair"),
    MYSTERY("Who knows?"),
    FANTASY("Religious books here");


    private final String description;

    GenreType(String description){
        this.description = description;
    }

}
