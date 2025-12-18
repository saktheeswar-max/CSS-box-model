package com.edutrack.service;

import com.edutrack.entity.Announcement;

import java.util.List;

public interface AnnouncementService {

    Announcement save(Announcement announcement);

    List<Announcement> findAll();

    void delete(Long id);
}
