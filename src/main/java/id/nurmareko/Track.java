package id.nurmareko;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Track {
    private final StringProperty artistAlbum;
    private final IntegerProperty trackNumber;
    private final StringProperty title;
    private final StringProperty duration;

    public Track(String artistAlbum, int trackNumber, String title, String duration) {
        this.artistAlbum = new SimpleStringProperty(artistAlbum);
        this.trackNumber = new SimpleIntegerProperty(trackNumber);
        this.title = new SimpleStringProperty(title);
        this.duration = new SimpleStringProperty(duration);
    }

    public StringProperty artistAlbumProperty() {
        return artistAlbum;
    }

    public IntegerProperty trackNumberProperty() {
        return trackNumber;
    }

    public StringProperty titleProperty() {
        return title;
    }

    public StringProperty durationProperty() {
        return duration;
    }
}
