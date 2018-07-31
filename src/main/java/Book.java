
    public class Book {
        private String bookName;
        private GenreType genre;


        public Book(String bookName, GenreType genre) {
            this.bookName = bookName;
            this.genre = genre;
        }

    public String checkGenre(){
        return this.genre.name();
    }


    }
