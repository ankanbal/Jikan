package com.schalar.jikan.request.anime;

import com.schalar.jikan.request.Request;

public class AnimeForumRequest implements Request {

    private final Integer id;

    public AnimeForumRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return String.format("/anime/%s/forum", this.id);
    }

}
