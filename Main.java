package kevserbusrayildirim.cohortsodev1;


import kevserbusrayildirim.cohortsodev1.service.HouseService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // House, villa ve summerhouse objelerinden oluşturma
        House house1 = new House("House", 180, 350000, 4, 2);
        Villa villa1 = new Villa(200, 500000, 6, 2);
        Summerhouse summerhouse1 = new Summerhouse(85, 1570000, 3, 1);
        House house2 = new House("House", 95, 280000, 3, 1);
        Villa villa2 = new Villa(550, 88900000, 10, 4);

        // Ev listesi oluşturma
        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(villa1);
        houseList.add(summerhouse1);
        houseList.add(house2);
        houseList.add(villa2);

        // HouseService oluşturma
        HouseService houseService = new HouseService(houseList);

        // Toplam fiyatlar hesabı
        System.out.println("Total price of houses: " + houseService.getTotalPriceByType("House"));
        System.out.println("Total price of villas: " + houseService.getTotalPriceByType("Villa"));
        System.out.println("Total price of summerhouses: " + houseService.getTotalPriceByType("Summerhouse"));

        // Ortalama alan hesapları
        System.out.println("Average area of houses: " + houseService.getAverageAreaByType("House"));
        System.out.println("Average area of villas: " + houseService.getAverageAreaByType("Villa"));
        System.out.println("Average area of summerhouses: " + houseService.getAverageAreaByType("Summerhouse"));

        // Oda ve salon sayısına göre filtreleme
        List<House> filteredHouses = houseService.filterByRoomAndLivingRoomCount(4, 1);
        System.out.println("Houses with 4 rooms and 1 living room:");
        for (House house : filteredHouses) {
            System.out.println("Type: " + house.getType() + ", Area: " + house.getArea() + " sqm, Price: " + house.getPrice());
        }


    }

}
