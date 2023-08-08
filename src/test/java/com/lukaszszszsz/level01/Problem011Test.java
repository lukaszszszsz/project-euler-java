package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Problem011Test {
    String GRID_INPUT = "08 02 22\n" +
            "49 49 99\n" +
            "81 49 31";
    @Test
    void test_gridToArray() {

        var resArray = Problem011.gridToArray(GRID_INPUT);

        assertEquals(3,resArray.length);
        assertEquals(3,resArray[0].length);
        assertEquals(49,resArray[2][1]);

    }

    @Test
    void test_productRight() {
        var resArray = Problem011.gridToArray(GRID_INPUT);
        var resList = Problem011.productOfAdjacentCells(resArray,2, Problem011.Direction.RIGHT).collect(Collectors.toList());
        Assertions.assertTrue(resList.containsAll(List.of(16, 44, 2401, 4851, 3969, 1519)));
        Assertions.assertEquals(6,resList.size());
    }

    @Test
    void test_productDown() {
        var resArray = Problem011.gridToArray(GRID_INPUT);
        var resList = Problem011.productOfAdjacentCells(resArray,2, Problem011.Direction.DOWN).collect(Collectors.toList());
        Assertions.assertTrue(resList.containsAll(List.of(392, 98, 2178, 3969, 2401, 3069)));
        Assertions.assertEquals(6,resList.size());
    }

    @Test
    void test_productDiagonallyDown() {
        var resArray = Problem011.gridToArray(GRID_INPUT);
        var resList = Problem011.productOfAdjacentCells(resArray,2, Problem011.Direction.DIAGONALLY_DOWN).collect(Collectors.toList());
        Assertions.assertTrue(resList.containsAll(List.of(392, 198, 2401, 1519)));
        Assertions.assertEquals(4,resList.size());
    }

    @Test
    void test_productDiagonallyUp() {
        var resArray = Problem011.gridToArray(GRID_INPUT);
        var resList = Problem011.productOfAdjacentCells(resArray,2, Problem011.Direction.DIAGONALLY_UP).collect(Collectors.toList());
        Assertions.assertTrue(resList.containsAll(List.of(98, 1078, 3969, 4851)));
        Assertions.assertEquals(4,resList.size());
    }



    @Test
    void test_maxProduct() {
        var resArray = Problem011.gridToArray(GRID_INPUT);
        var res = Problem011.maxProduct(resArray,2);

        Assertions.assertEquals(4851,res);
    }
}