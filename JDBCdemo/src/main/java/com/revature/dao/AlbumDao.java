package com.revature.dao;

import com.revature.beans.Album;

import java.sql.SQLException;
import java.util.List;

public interface AlbumDao {
    //crud ops

    public List<Album> getAllAlbums() throws SQLException;
}
