package com.example.spring_thymeleaf;

import com.example.spring_thymeleaf.entities.LapTime;
import com.example.spring_thymeleaf.repo.LapTimeRepo;
import com.example.spring_thymeleaf.service.LapTimeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LapTimeServiceTest {

    LapTimeRepo lapTimeRepo = mock(LapTimeRepo.class);

    List<LapTime> allLapTimes = Arrays.asList(
            new LapTime(1),
            new LapTime(5),
            new LapTime(10),
            new LapTime(15),
            new LapTime(20));

    @Test
    public void SortLapTimesInAscendingOrder(){

        when(lapTimeRepo.findAll()).thenReturn(allLapTimes);
        LapTimeService lapTimeService = new LapTimeService(lapTimeRepo);

        System.out.println("Lap Times List: ");
        for (LapTime lapTime: allLapTimes) {
            System.out.println(lapTime.getLapTime());
        }

        List<LapTime> topLapTimes = lapTimeService.findLapTimes();

        System.out.println("5 Top Lap Times: ");
        for (LapTime lapTime: topLapTimes) {
            System.out.println(lapTime.getLapTime());
        }

        assertEquals(5, topLapTimes.size());
        for (int i= 1; i< topLapTimes.size(); i++){
            assertTrue(topLapTimes.get(i-1).getLapTime()<= topLapTimes.get(i).getLapTime());
        }
    }


}
