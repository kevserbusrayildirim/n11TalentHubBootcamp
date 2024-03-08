package kevserbusrayildirim.cohortsodev1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Setter
@Getter
public class House {
    private String type;
    private int area;
    private int price;
    private int roomCount;
    private int livingRoomCount;

    public House(String type, int area, int price, int roomCount, int livingRoomCount) {
        this.type = type;
        this.area = area;
        this.price = price;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    // Getter methods
    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }
}

