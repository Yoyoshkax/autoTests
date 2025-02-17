package ApiTests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BookData {
    @JsonProperty("isbn")
    public String isbn;
    @JsonProperty("title")
    public String title;
    @JsonProperty("subTitle")
    public String subTitle;
    @JsonProperty("author")
    public String author;
    @JsonProperty("publish_date")
    public String publishDate;
    @JsonProperty("publisher")
    public String publisher;
    @JsonProperty("pages")
    public int pages;
    @JsonProperty("description")
    public String description;
    @JsonProperty("website")
    public String website;


    public BookData(String isbn, String title, String subTitle, String author, String publishDate, String publisher, int pages, String description, String website) {
        this.isbn = isbn;
        this.title = title;
        this.subTitle = subTitle;
        this.author = author;
        this.publishDate = publishDate;
        this.publisher = publisher;
        this.pages = pages;
        this.description = description;
        this.website = website;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public String getDescription() {
        return description;
    }

    public String getWebsite() {
        return website;
    }
}
