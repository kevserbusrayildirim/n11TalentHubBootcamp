package kevserbusrayildirim.cohortsodev1.service;

import kevserbusrayildirim.cohortsodev1.House;

import java.util.List;

public class HouseService {
    private final List<House> houseList;

    public HouseService(List<House> houseList) {
        this.houseList = houseList;
    }

    // Belirli bir ev türü için toplam fiyatı hesaplayan metot
    public int getTotalPriceByType(String type) {
        return houseList.stream()
                .filter(house -> house.getType().equals(type))
                .mapToInt(House::getPrice)
                .sum();
    }

    // Belirli bir ev türü için ortalama alanı hesaplayan metot
    public double getAverageAreaByType(String type) {
        return houseList.stream()
                .filter(house -> house.getType().equals(type))
                .mapToInt(House::getArea)
                .average()
                .orElse(0);
    }

    // Oda ve salon sayısına göre evleri filtreleyen metot
    public List<House> filterByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        return houseList.stream()
                .filter(house -> house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount)
                .toList();
    }
}


