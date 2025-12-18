package com.edutrack.controller;

import com.edutrack.entity.Announcement;
import com.edutrack.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcements")
@CrossOrigin(origins = "*")
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement) {
        return announcementService.save(announcement);
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements() {
        return announcementService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteAnnouncement(@PathVariable Long id) {
        announcementService.delete(id);
    }
}
