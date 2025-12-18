package com.edutrack.service.impl;

import com.edutrack.entity.Announcement;
import com.edutrack.repository.AnnouncementRepository;
import com.edutrack.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementRepository repo;

    @Override
    public Announcement save(Announcement announcement) {
        return repo.save(announcement);
    }

    @Override
    public List<Announcement> findAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
