package main;

import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;
import model.Album;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA_2_3.portable.OutputStream;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;


@Service
public class MusicService {
    //List created to own values by default.
    List<Album> albumList = new ArrayList<Album>(Arrays.asList(
            new Album(1, "Back in black", "AC/DC", "25-04-1995"),
            new Album(2, "Nevermind", "Nirvana", "06-03-2011"),
            new Album(3, "In Utero", "Nirvana", "14-09-1993"),
            new Album(4, "YHLQMDLG", "Bad Bunny", "29-02-2020")
    ));

    private int getDiffYears;

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int id) {
        return albumList.stream().filter(t -> Objects.equals(t.getId(), id)).findFirst().get();
    }

    public void addAlbum(Album album) {
        albumList.add(album);
    }

    public void updateAlbum(Album album, int id) {
        for (int i = 0; i < albumList.size(); i++) {

            Album albumObject = albumList.get(i);

            if (Objects.equals(albumObject.getId(), id)) {
                albumList.set(i, album);
            }
        }
    }


    public void deleteAlbum(int id) {
        for (int i = 0; i < albumList.size(); i++) {

            Album albumObject = albumList.get(i);

            if (Objects.equals(albumObject.getId(), id)) {
                albumList.remove(i);
            }
        }
    }
}
