package com.revature.daoimpl;

import com.revature.beans.Album;
import com.revature.dao.AlbumDao;
import com.revature.util.ConnFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlbumDaoImpl implements AlbumDao {
    public static ConnFactory cf = ConnFactory.getInstance();

    // public Album retrieveById(int albumId throws SQLException {
    //
    // }

    @Override
    public List<Album> getAllAlbums() throws SQLException{
        List<Album> albumList = new ArrayList<Album>();

        Connection conn = cf.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery("select * from \"Album\"");

        Album a;
        while(rs.next()){
            a= new Album(rs.getInt(1),rs.getString(2), rs.getInt(3));
            albumList.add(a);
        }
        return albumList;
    }
}
