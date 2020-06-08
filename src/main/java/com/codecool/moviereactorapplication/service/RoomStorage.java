package com.codecool.moviereactorapplication.service;

import com.codecool.moviereactorapplication.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomStorage {
    RoomCreator roomCreator;
    List<Room> roomStorage;

    @Autowired
    public RoomStorage(RoomCreator roomCreator) {
        this.roomCreator = roomCreator;
        this.roomStorage = roomCreator.createRooms(1);
    }

    public Room getRoomById(Integer id) {
        for (Room actualRoom: roomStorage){
            if (actualRoom.getId() == id){
                return actualRoom;
            }
        }
        return null;
    }
}
