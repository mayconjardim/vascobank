package com.vascobank.resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Noticia;
import com.vascobank.repositories.NoticiaRepository;

@RestController
public class NoticiasResource {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @GetMapping("/noticias")
    public ResponseEntity<List<Noticia>> getNotices() {
        List<Noticia> noticias = noticiaRepository.findAllNoticiasAtivas();
        if (noticias != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(noticias);
        }else {
            return null;
        }
    }
	
}
