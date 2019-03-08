package assessment33.module3;

import java.util.Objects;

public class Book {

    public int pageNum;
    public String title;

    public Book()
    {
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder{
        public int pageNum;
        public String title;

        public Builder pageNum(int k){
            this.pageNum = k;
            return this;
        }

        public Builder title(String k){
            this.title=k;
            return this;
        }
        public Book build()
        {
            return new Book(this);
        }
    }

    public Book(Builder builder)
    {
        this.pageNum=builder.pageNum;
        this.title=builder.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getPageNum(),book.getPageNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPageNum());
    }
}


