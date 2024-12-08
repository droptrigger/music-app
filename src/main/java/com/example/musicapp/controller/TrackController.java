package com.example.musicapp.controller;

import com.example.musicapp.model.Track;
import com.example.musicapp.model.Artist;
import com.example.musicapp.model.UploaderType;
import com.example.musicapp.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping
    public ResponseEntity<Track> createTrack(@RequestBody Track track) {
        Track createdTrack = trackService.createTrack(track.getTitle(), track.getAlbumId(), track.getUploaderId(), track.getUploaderType(), track.getDuration(), track.getFileUrl());
        return ResponseEntity.ok(createdTrack);
    }

    @GetMapping("/{trackId}")
    public ResponseEntity<Track> getTrack(@PathVariable UUID trackId) {
        return trackService.getTrackById(trackId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{trackId}")
    public ResponseEntity<Track> updateTrack(@PathVariable UUID trackId, @RequestBody Track track) {
        Track updatedTrack = trackService.updateTrack(trackId, track.getTitle(), track.getAlbumId(), track.getDuration());
        return ResponseEntity.ok(updatedTrack);
    }

    @DeleteMapping("/{trackId}")
    public ResponseEntity<Void> deleteTrack(@PathVariable UUID trackId) {
        trackService.deleteTrack(trackId);
        return ResponseEntity.noContent().build();
    }

//    @PostMapping("/{trackId}/artists")
//    public ResponseEntity<Void> addArtistToTrack(@PathVariable UUID trackId, @RequestBody ArtistRoleRequest request) {
//        trackService.addArtistToTrack(trackId, request.getArtistId(), request.getRole());
//        return ResponseEntity.ok().build();
//    }

    @GetMapping("/{trackId}/artists")
    public ResponseEntity<List<Artist>> getArtistsForTrack(@PathVariable UUID trackId) {
        List<Artist> artists = trackService.getArtistsByTrackId(trackId);
        return ResponseEntity.ok(artists);
    }

}
