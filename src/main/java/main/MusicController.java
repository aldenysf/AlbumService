package main;

import model.Album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class MusicController {

    @Autowired
private MusicService albumService;

    @RequestMapping("/album")
public List<Album> getAllAlbums(){return albumService.getAllAlbums();}

@RequestMapping("/album/{id}")
    public Album getAlbumById(@PathVariable int id){
        return albumService.getAlbumById(id);
}

@RequestMapping (method = RequestMethod.POST, value = "/album")
    public void addAlbum(@RequestBody Album album){
        albumService.addAlbum(album);
}

@RequestMapping(method = RequestMethod.PUT, value = "/album/{id}")
public void updateAlbum(@RequestBody Album album, @PathVariable int id){
        albumService.updateAlbum(album,id);
}

@RequestMapping(method = RequestMethod.DELETE, value= "album/{id}")
public void deleteAlbum(@PathVariable int id){
        albumService.deleteAlbum(id);
}

}

