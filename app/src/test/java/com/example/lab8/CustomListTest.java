package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    private ArrayList<City> citylist = new ArrayList<>();


    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, citylist );
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        CustomList list = new CustomList(null, citylist );
        list.addCity(new City("Edmonton","AB"));
        assertTrue(list.hasCity(new City("Edmonton","AB")));
        assertFalse(list.hasCity(new City("Surrey","BC")));
    }


}
